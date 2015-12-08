// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.util.ArrayList;
import java.util.List;
import rx.exceptions.Exceptions;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;

// Referenced classes of package rx.subjects:
//            Subject, SubjectSubscriptionManager

public final class PublishSubject extends Subject
{

    private final NotificationLite nl = NotificationLite.instance();
    final SubjectSubscriptionManager state;

    protected PublishSubject(rx.Observable.OnSubscribe onsubscribe, SubjectSubscriptionManager subjectsubscriptionmanager)
    {
        super(onsubscribe);
        state = subjectsubscriptionmanager;
    }

    public static PublishSubject create()
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
                subjectobserver.emitFirst(state.get(), state.nl);
            }

            
            {
                state = subjectsubscriptionmanager;
                super();
            }
        };
        return new PublishSubject(subjectsubscriptionmanager, subjectsubscriptionmanager);
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
        return null;
    }

    public Object[] getValues()
    {
        return new Object[0];
    }

    public Object[] getValues(Object aobj[])
    {
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
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
        return false;
    }

    public void onCompleted()
    {
        if (state.active)
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
        if (state.active)
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
        SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.observers();
        int j = asubjectobserver.length;
        for (int i = 0; i < j; i++)
        {
            asubjectobserver[i].onNext(obj);
        }

    }
}
