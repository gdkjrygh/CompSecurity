// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

// Referenced classes of package rx.internal.operators:
//            OperatorDebounceWithSelector

class val.index extends Subscriber
{

    final onCompleted this$1;
    final int val$index;

    public void onCompleted()
    {
        ate.emit(val$index, s, lf);
        unsubscribe();
    }

    public void onError(Throwable throwable)
    {
        lf.onError(throwable);
    }

    public void onNext(Object obj)
    {
        onCompleted();
    }

    l.ssub()
    {
        this$1 = final_ssub;
        val$index = I.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorDebounceWithSelector$1

/* anonymous class */
    class OperatorDebounceWithSelector._cls1 extends Subscriber
    {

        final Subscriber self = this;
        final OperatorDebounceWithTime.DebounceState state = new OperatorDebounceWithTime.DebounceState();
        final OperatorDebounceWithSelector this$0;
        final SerializedSubscriber val$s;
        final SerialSubscription val$ssub;

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
            Observable observable;
            try
            {
                observable = (Observable)selector.call(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                onError(((Throwable) (obj)));
                return;
            }
            obj = state.next(obj). new OperatorDebounceWithSelector._cls1._cls1();
            ssub.set(((rx.Subscription) (obj)));
            observable.unsafeSubscribe(((Subscriber) (obj)));
        }

        public void onStart()
        {
            request(0x7fffffffffffffffL);
        }

            
            {
                this$0 = final_operatordebouncewithselector;
                s = SerializedSubscriber.this;
                ssub = serialsubscription;
                super(final_subscriber);
            }
    }

}
