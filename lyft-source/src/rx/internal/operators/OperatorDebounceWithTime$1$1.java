// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

// Referenced classes of package rx.internal.operators:
//            OperatorDebounceWithTime

class val.index
    implements Action0
{

    final lf this$1;
    final int val$index;

    public void call()
    {
        ate.emit(val$index, s, lf);
    }

    l.s()
    {
        this$1 = final_s;
        val$index = I.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorDebounceWithTime$1

/* anonymous class */
    class OperatorDebounceWithTime._cls1 extends Subscriber
    {

        final Subscriber self = this;
        final OperatorDebounceWithTime.DebounceState state = new OperatorDebounceWithTime.DebounceState();
        final OperatorDebounceWithTime this$0;
        final SerializedSubscriber val$s;
        final SerialSubscription val$ssub;
        final rx.Scheduler.Worker val$worker;

        public void onCompleted()
        {
            state.emitAndComplete(s, this);
        }

        public void onError(Throwable throwable)
        {
            s.onError(throwable);
            unsubscribe();
            state.clear();
        }

        public void onNext(Object obj)
        {
            int i = state.next(obj);
            ssub.set(worker.schedule(i. new OperatorDebounceWithTime._cls1._cls1(), timeout, unit));
        }

        public void onStart()
        {
            request(0x7fffffffffffffffL);
        }

            
            {
                this$0 = final_operatordebouncewithtime;
                ssub = serialsubscription;
                worker = rx.Scheduler.Worker.this;
                s = serializedsubscriber;
                super(final_subscriber);
            }
    }

}
