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

class val.subscriber extends hff
{

    final onNext this$0;
    final hff val$subscriber;

    public void onCompleted()
    {
    }

    public void onError(Throwable throwable)
    {
        if (!val$subscriber.isUnsubscribed())
        {
            val$subscriber.onError(throwable);
        }
    }

    public void onNext(final Router router)
    {
        final int subscriptionId = cess._mth400(this._cls0.this).uest(router, cess._mth200(this._cls0.this).getAction(), cess._mth200(this._cls0.this).getUri(), cess._mth200(this._cls0.this).getHeaders(), cess._mth200(this._cls0.this).getBody(), new Resolver.CallbackReceiver(null) {

            final RxResolver.PerformRequestOperator._cls1 this$1;

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
                    if (!RxResolver.PerformRequestOperator.access$300(this$0))
                    {
                        subscriber.onCompleted();
                        return;
                    }
                }
            }

            
            {
                this$1 = RxResolver.PerformRequestOperator._cls1.this;
                super(handler);
            }
        });
        val$subscriber.add(hkr.a(new hfr() {

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
        }));
    }

    public volatile void onNext(Object obj)
    {
        onNext((Router)obj);
    }

    _cls2.val.subscriptionId(hff hff2)
    {
        this$0 = final_subscriptionid;
        val$subscriber = hff2;
        super(hff.this);
    }
}
