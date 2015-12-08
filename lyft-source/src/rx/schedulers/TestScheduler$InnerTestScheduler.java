// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.Queue;
import java.util.concurrent.TimeUnit;
import rx.Subscription;
import rx.functions.Action0;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.schedulers:
//            TestScheduler

final class <init> extends rx.tScheduler
{

    private final BooleanSubscription s;
    final TestScheduler this$0;

    public boolean isUnsubscribed()
    {
        return s.isUnsubscribed();
    }

    public long now()
    {
        return TestScheduler.this.now();
    }

    public Subscription schedule(final Action0 timedAction)
    {
        timedAction = new ibed(this, 0L, timedAction, null);
        TestScheduler.access$900(TestScheduler.this).add(timedAction);
        return Subscriptions.create(new Action0() {

            final TestScheduler.InnerTestScheduler this$1;
            final TestScheduler.TimedAction val$timedAction;

            public void call()
            {
                TestScheduler.access$900(this$0).remove(timedAction);
            }

            
            {
                this$1 = TestScheduler.InnerTestScheduler.this;
                timedAction = timedaction;
                super();
            }
        });
    }

    public Subscription schedule(final Action0 timedAction, long l, TimeUnit timeunit)
    {
        timedAction = new _cls2.val.timedAction(this, TestScheduler.access$700(TestScheduler.this) + timeunit.toNanos(l), timedAction, null);
        TestScheduler.access$900(TestScheduler.this).add(timedAction);
        return Subscriptions.create(new Action0() {

            final TestScheduler.InnerTestScheduler this$1;
            final TestScheduler.TimedAction val$timedAction;

            public void call()
            {
                TestScheduler.access$900(this$0).remove(timedAction);
            }

            
            {
                this$1 = TestScheduler.InnerTestScheduler.this;
                timedAction = timedaction;
                super();
            }
        });
    }

    public void unsubscribe()
    {
        s.unsubscribe();
    }

    private _cls2.val.timedAction()
    {
        this$0 = TestScheduler.this;
        super();
        s = new BooleanSubscription();
    }

    s(s s1)
    {
        this();
    }
}
