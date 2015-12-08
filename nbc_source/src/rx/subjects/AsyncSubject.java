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
        SubjectSubscriptionManager subjectsubscriptionmanager = new SubjectSubscriptionManager();
        subjectsubscriptionmanager.onTerminated = new Action1(subjectsubscriptionmanager) {

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
        return new AsyncSubject(subjectsubscriptionmanager, subjectsubscriptionmanager);
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
        Object aobj2[];
        if (!nl.isError(obj1) && nl.isNext(obj))
        {
            Object obj2 = nl.getValue(obj);
            Object aobj1[] = aobj;
            if (aobj.length == 0)
            {
                aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), 1);
            }
            aobj1[0] = obj2;
            aobj2 = aobj1;
            if (aobj1.length > 1)
            {
                aobj1[1] = null;
                aobj2 = aobj1;
            }
        } else
        {
            aobj2 = aobj;
            if (aobj.length > 0)
            {
                aobj[0] = null;
                return aobj;
            }
        }
        return aobj2;
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
            Object obj1 = nl.error(throwable);
            Object obj = null;
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.terminate(obj1);
            int j = asubjectobserver.length;
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
                    Object obj2 = obj;
                    if (obj == null)
                    {
                        obj2 = new ArrayList();
                    }
                    ((List) (obj2)).add(throwable1);
                    obj = obj2;
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
