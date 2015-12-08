// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

public final class OperatorDebounceWithSelector
    implements rx.Observable.Operator
{

    final Func1 selector;

    public OperatorDebounceWithSelector(Func1 func1)
    {
        selector = func1;
    }

    public volatile Object call(Object obj)
    {
        return call((Subscriber)obj);
    }

    public Subscriber call(final Subscriber final_subscriber)
    {
        final SerializedSubscriber s = new SerializedSubscriber(final_subscriber);
        SerialSubscription serialsubscription = new SerialSubscription();
        final_subscriber.add(serialsubscription);
        return new Subscriber(serialsubscription) {

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
                obj = state.next(obj). new Subscriber() {

                    final _cls1 this$1;
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

                    public void onNext(Object obj)
                    {
                        onCompleted();
                    }

            
            {
                this$1 = final__pcls1;
                index = I.this;
                super();
            }
                };
                ssub.set(((rx.Subscription) (obj)));
                observable.unsafeSubscribe(((Subscriber) (obj)));
            }

            public void onStart()
            {
                request(0x7fffffffffffffffL);
            }

            
            {
                this$0 = OperatorDebounceWithSelector.this;
                s = serializedsubscriber;
                ssub = serialsubscription;
                super(final_subscriber);
            }
        };
    }
}
