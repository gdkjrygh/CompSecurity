// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;

// Referenced classes of package rx.subjects:
//            Subject, SubjectSubscriptionManager

public final class AsyncSubject extends Subject
{

    volatile Object lastValue;
    private final NotificationLite nl = NotificationLite.instance();
    final SubjectSubscriptionManager state;

    protected AsyncSubject(rx.Observable.OnSubscribe onsubscribe, SubjectSubscriptionManager subjectsubscriptionmanager)
    {
        super(onsubscribe);
        state = subjectsubscriptionmanager;
    }

    public static AsyncSubject create()
    {
        final SubjectSubscriptionManager state = new SubjectSubscriptionManager();
        state.onTerminated = new Action1() {

            final SubjectSubscriptionManager val$state;

            public volatile void call(Object obj)
            {
                call((SubjectSubscriptionManager.SubjectObserver)obj);
            }

            public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
            {
                Object obj = state.get();
                NotificationLite notificationlite = state.nl;
                subjectobserver.accept(obj, notificationlite);
                if (obj == null || !notificationlite.isCompleted(obj) && !notificationlite.isError(obj))
                {
                    subjectobserver.onCompleted();
                }
            }

            
            {
                state = subjectsubscriptionmanager;
                super();
            }
        };
        return new AsyncSubject(state, state);
    }

    public Throwable getThrowable()
    {
        Object obj = state.get();
        if (nl.isError(obj))
        {
            return nl.getError(obj);
        } else
        {
            return null;
        }
    }

    public Object getValue()
    {
        Object obj = lastValue;
        Object obj1 = state.get();
        if (!nl.isError(obj1) && nl.isNext(obj))
        {
            return nl.getValue(obj);
        } else
        {
            return null;
        }
    }

    public Object[] getValues(Object aobj[])
    {
        Object obj = lastValue;
        Object obj1 = state.get();
        Object aobj1[];
        if (!nl.isError(obj1) && nl.isNext(obj))
        {
            obj = nl.getValue(obj);
            if (aobj.length == 0)
            {
                aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), 1);
            }
            aobj[0] = obj;
            if (aobj.length > 1)
            {
                aobj[1] = null;
            }
            aobj1 = aobj;
        } else
        {
            aobj1 = aobj;
            if (aobj.length > 0)
            {
                aobj[0] = null;
                return aobj;
            }
        }
        return aobj1;
    }

    public boolean hasCompleted()
    {
        Object obj = state.get();
        return obj != null && !nl.isError(obj);
    }

    public boolean hasObservers()
    {
        return state.observers().length > 0;
    }

    public boolean hasThrowable()
    {
        Object obj = state.get();
        return nl.isError(obj);
    }

    public boolean hasValue()
    {
        Object obj = lastValue;
        Object obj1 = state.get();
        return !nl.isError(obj1) && nl.isNext(obj);
    }

    public void onCompleted()
    {
        if (state.active)
        {
            Object obj1 = lastValue;
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = nl.completed();
            }
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.terminate(obj);
            int j = asubjectobserver.length;
            int i = 0;
            while (i < j) 
            {
                SubjectSubscriptionManager.SubjectObserver subjectobserver = asubjectobserver[i];
                if (obj == nl.completed())
                {
                    subjectobserver.onCompleted();
                } else
                {
                    subjectobserver.onNext(nl.getValue(obj));
                    subjectobserver.onCompleted();
                }
                i++;
            }
        }
    }

    public void onError(Throwable throwable)
    {
        if (state.active)
        {
            Object obj = nl.error(throwable);
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.terminate(obj);
            int j = asubjectobserver.length;
            obj = null;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                SubjectSubscriptionManager.SubjectObserver subjectobserver = asubjectobserver[i];
                try
                {
                    subjectobserver.onError(throwable);
                }
                catch (Throwable throwable1)
                {
                    Object obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = new ArrayList();
                    }
                    ((List) (obj1)).add(throwable1);
                    obj = obj1;
                }
                i++;
            } while (true);
            Exceptions.throwIfAny(((List) (obj)));
        }
    }

    public void onNext(Object obj)
    {
        lastValue = nl.next(obj);
    }
}
