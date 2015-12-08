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

public final class BehaviorSubject extends Subject
{

    private final NotificationLite nl = NotificationLite.instance();
    private final SubjectSubscriptionManager state;

    protected BehaviorSubject(rx.Observable.OnSubscribe onsubscribe, SubjectSubscriptionManager subjectsubscriptionmanager)
    {
        super(onsubscribe);
        state = subjectsubscriptionmanager;
    }

    public static BehaviorSubject create()
    {
        return create(null, false);
    }

    public static BehaviorSubject create(Object obj)
    {
        return create(obj, true);
    }

    private static BehaviorSubject create(Object obj, boolean flag)
    {
        SubjectSubscriptionManager subjectsubscriptionmanager = new SubjectSubscriptionManager();
        if (flag)
        {
            subjectsubscriptionmanager.set(NotificationLite.instance().next(obj));
        }
        subjectsubscriptionmanager.onAdded = new Action1(subjectsubscriptionmanager) {

            final SubjectSubscriptionManager val$state;

            public volatile void call(Object obj1)
            {
                call((SubjectSubscriptionManager.SubjectObserver)obj1);
            }

            public void call(SubjectSubscriptionManager.SubjectObserver subjectobserver)
            {
                subjectobserver.emitFirst(state.get(), state.nl);
            }

            
            {
                state = subjectsubscriptionmanager;
                super();
            }
        };
        subjectsubscriptionmanager.onTerminated = subjectsubscriptionmanager.onAdded;
        return new BehaviorSubject(subjectsubscriptionmanager, subjectsubscriptionmanager);
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
        Object obj = state.get();
        if (nl.isNext(obj))
        {
            return nl.getValue(obj);
        } else
        {
            return null;
        }
    }

    public Object[] getValues(Object aobj[])
    {
        Object obj = state.get();
        Object aobj2[];
        if (nl.isNext(obj))
        {
            Object aobj1[] = aobj;
            if (aobj.length == 0)
            {
                aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), 1);
            }
            aobj1[0] = nl.getValue(obj);
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
        return nl.isCompleted(obj);
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
        Object obj = state.get();
        return nl.isNext(obj);
    }

    public void onCompleted()
    {
        if (state.get() == null || state.active)
        {
            Object obj = nl.completed();
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.terminate(obj);
            int j = asubjectobserver.length;
            for (int i = 0; i < j; i++)
            {
                asubjectobserver[i].emitNext(obj, state.nl);
            }

        }
    }

    public void onError(Throwable throwable)
    {
        if (state.get() == null || state.active)
        {
            Object obj1 = nl.error(throwable);
            throwable = null;
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
                    subjectobserver.emitNext(obj1, state.nl);
                }
                catch (Throwable throwable1)
                {
                    Object obj = throwable;
                    if (throwable == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(throwable1);
                    throwable = ((Throwable) (obj));
                }
                i++;
            } while (true);
            Exceptions.throwIfAny(throwable);
        }
    }

    public void onNext(Object obj)
    {
        if (state.get() == null || state.active)
        {
            obj = nl.next(obj);
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.next(obj);
            int j = asubjectobserver.length;
            for (int i = 0; i < j; i++)
            {
                asubjectobserver[i].emitNext(obj, state.nl);
            }

        }
    }

    int subscriberCount()
    {
        return state.observers().length;
    }
}
