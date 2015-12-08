// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.os.Handler;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import hff;
import hfr;
import hkr;

// Referenced classes of package com.spotify.cosmos.android:
//            Router

class this._cls1 extends this._cls1
{

    final l.subscriber this$1;

    protected void onError(Throwable throwable)
    {
        if (!subscriber.isUnsubscribed())
        {
            subscriber.onError(throwable);
        }
    }

    protected void onResolved(Response response)
    {
        if (!subscriber.isUnsubscribed())
        {
            subscriber.onNext(response);
            if (!ss._mth300(_fld0))
            {
                subscriber.onCompleted();
                return;
            }
        }
    }

    l.subscriber(Handler handler)
    {
        this$1 = this._cls1.this;
        super(handler);
    }

    // Unreferenced inner class com/spotify/cosmos/android/RxResolver$PerformRequestOperator$1

/* anonymous class */
    class RxResolver.PerformRequestOperator._cls1 extends hff
    {

        final RxResolver.PerformRequestOperator this$0;
        final hff val$subscriber;

        public void onCompleted()
        {
        }

        public void onError(Throwable throwable)
        {
            if (!subscriber.isUnsubscribed())
            {
                subscriber.onError(throwable);
            }
        }

        public void onNext(final Router router)
        {
            final int subscriptionId = RxResolver.PerformRequestOperator.access$400(RxResolver.PerformRequestOperator.this).performRequest(router, RxResolver.PerformRequestOperator.access$200(RxResolver.PerformRequestOperator.this).getAction(), RxResolver.PerformRequestOperator.access$200(RxResolver.PerformRequestOperator.this).getUri(), RxResolver.PerformRequestOperator.access$200(RxResolver.PerformRequestOperator.this).getHeaders(), RxResolver.PerformRequestOperator.access$200(RxResolver.PerformRequestOperator.this).getBody(), new RxResolver.PerformRequestOperator._cls1._cls1(null));
            subscriber.add(hkr.a(new RxResolver.PerformRequestOperator._cls1._cls2()));
        }

        public volatile void onNext(Object obj)
        {
            onNext((Router)obj);
        }

            
            {
                this$0 = final_performrequestoperator;
                subscriber = hff2;
                super(hff.this);
            }

        // Unreferenced inner class com/spotify/cosmos/android/RxResolver$PerformRequestOperator$1$2

/* anonymous class */
        class RxResolver.PerformRequestOperator._cls1._cls2
            implements hfr
        {

            final RxResolver.PerformRequestOperator._cls1 this$1;
            final Router val$router;
            final int val$subscriptionId;

            public void call()
            {
                router.unsubscribe(subscriptionId);
            }

                    
                    {
                        this$1 = RxResolver.PerformRequestOperator._cls1.this;
                        router = router1;
                        subscriptionId = i;
                        super();
                    }
        }

    }

}
