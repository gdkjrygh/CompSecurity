// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;

import java.util.concurrent.TimeUnit;
import rx.Observer;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.internal.operators.NotificationLite;
import rx.schedulers.TestScheduler;

// Referenced classes of package rx.subjects:
//            Subject, SubjectSubscriptionManager

public final class TestSubject extends Subject
{

    private final rx.Scheduler.Worker innerScheduler;
    private final SubjectSubscriptionManager state;

    protected TestSubject(rx.Observable.OnSubscribe onsubscribe, SubjectSubscriptionManager subjectsubscriptionmanager, TestScheduler testscheduler)
    {
        super(onsubscribe);
        state = subjectsubscriptionmanager;
        innerScheduler = testscheduler.createWorker();
    }

    private void _onCompleted()
    {
        if (state.active)
        {
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.terminate(NotificationLite.instance().completed());
            int j = asubjectobserver.length;
            for (int i = 0; i < j; i++)
            {
                asubjectobserver[i].onCompleted();
            }

        }
    }

    private void _onError(Throwable throwable)
    {
        if (state.active)
        {
            SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.terminate(NotificationLite.instance().error(throwable));
            int j = asubjectobserver.length;
            for (int i = 0; i < j; i++)
            {
                asubjectobserver[i].onError(throwable);
            }

        }
    }

    private void _onNext(Object obj)
    {
        SubjectSubscriptionManager.SubjectObserver asubjectobserver[] = state.observers();
        int j = asubjectobserver.length;
        for (int i = 0; i < j; i++)
        {
            asubjectobserver[i].onNext(obj);
        }

    }

    public static TestSubject create(TestScheduler testscheduler)
    {
        final SubjectSubscriptionManager state = new SubjectSubscriptionManager();
        state.onAdded = new Action1() {

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
        state.onTerminated = state.onAdded;
        return new TestSubject(state, state, testscheduler);
    }

    public boolean hasObservers()
    {
        return state.observers().length > 0;
    }

    public void onCompleted()
    {
        onCompleted(0L);
    }

    public void onCompleted(long l)
    {
        innerScheduler.schedule(new Action0() {

            final TestSubject this$0;

            public void call()
            {
                _onCompleted();
            }

            
            {
                this$0 = TestSubject.this;
                super();
            }
        }, l, TimeUnit.MILLISECONDS);
    }

    public void onError(Throwable throwable)
    {
        onError(throwable, 0L);
    }

    public void onError(final Throwable e, long l)
    {
        innerScheduler.schedule(new Action0() {

            final TestSubject this$0;
            final Throwable val$e;

            public void call()
            {
                _onError(e);
            }

            
            {
                this$0 = TestSubject.this;
                e = throwable;
                super();
            }
        }, l, TimeUnit.MILLISECONDS);
    }

    public void onNext(Object obj)
    {
        onNext(obj, 0L);
    }

    public void onNext(final Object v, long l)
    {
        innerScheduler.schedule(new Action0() {

            final TestSubject this$0;
            final Object val$v;

            public void call()
            {
                _onNext(v);
            }

            
            {
                this$0 = TestSubject.this;
                v = obj;
                super();
            }
        }, l, TimeUnit.MILLISECONDS);
    }



}
