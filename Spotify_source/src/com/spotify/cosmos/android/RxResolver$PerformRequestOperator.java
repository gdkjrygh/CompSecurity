// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.os.Handler;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import hez;
import hff;
import hfr;
import hkr;

// Referenced classes of package com.spotify.cosmos.android:
//            RxResolver, Router

class mRequest
    implements hez
{

    private final Request mRequest;

    private mRequest getStrategy()
    {
        if (isSubscribeAction())
        {
            return RxResolver.access$000();
        } else
        {
            return RxResolver.access$100();
        }
    }

    private boolean isSubscribeAction()
    {
        return "SUB".equals(mRequest.getAction());
    }

    public hff call(final hff final_hff1)
    {
        return new hff(final_hff1) {

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
                int i = getStrategy().performRequest(router, mRequest.getAction(), mRequest.getUri(), mRequest.getHeaders(), mRequest.getBody(), new Resolver.CallbackReceiver(null) {

                    final _cls1 this$1;

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
                            if (!isSubscribeAction())
                            {
                                subscriber.onCompleted();
                                return;
                            }
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super(handler);
            }
                });
                subscriber.add(hkr.a(i. new hfr() {

                    final _cls1 this$1;
                    final Router val$router;
                    final int val$subscriptionId;

                    public void call()
                    {
                        router.unsubscribe(subscriptionId);
                    }

            
            {
                this$1 = final__pcls1;
                router = router1;
                subscriptionId = I.this;
                super();
            }
                }));
            }

            public volatile void onNext(Object obj)
            {
                onNext((Router)obj);
            }

            
            {
                this$0 = RxResolver.PerformRequestOperator.this;
                subscriber = hff2;
                super(final_hff1);
            }
        };
    }

    public volatile Object call(Object obj)
    {
        return call((hff)obj);
    }




    public _cls1.val.subscriber(Request request)
    {
        mRequest = request;
    }
}
