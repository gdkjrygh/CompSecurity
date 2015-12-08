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

class val.ssub extends Subscriber
{

    final Subscriber self = this;
    final ceState state = new ceState();
    final OperatorDebounceWithSelector this$0;
    final SerializedSubscriber val$s;
    final SerialSubscription val$ssub;

    public void onCompleted()
    {
        state.emitAndComplete(val$s, this);
    }

    public void onError(Throwable throwable)
    {
        val$s.onError(throwable);
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
        obj = new Subscriber() {

            final OperatorDebounceWithSelector._cls1 this$1;
            final int val$index;

            public void onCompleted()
            {
                state.emit(index, s, self);
                unsubscribe();
            }

            public void onError(Throwable throwable)
            {
                self.onError(throwable);
            }

            public void onNext(Object obj1)
            {
                onCompleted();
            }

            
            {
                this$1 = OperatorDebounceWithSelector._cls1.this;
                index = i;
                super();
            }
        };
        val$ssub.set(((rx.Subscription) (obj)));
        observable.unsafeSubscribe(((Subscriber) (obj)));
    }

    public void onStart()
    {
        request(0x7fffffffffffffffL);
    }

    _cls1.val.index(SerialSubscription serialsubscription)
    {
        this$0 = final_operatordebouncewithselector;
        val$s = SerializedSubscriber.this;
        val$ssub = serialsubscription;
        super(final_subscriber);
    }
}
