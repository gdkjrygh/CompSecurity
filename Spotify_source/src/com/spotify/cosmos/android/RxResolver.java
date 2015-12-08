// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import dmz;
import dup;
import hew;
import hfd;
import hfw;
import java.util.Map;

// Referenced classes of package com.spotify.cosmos.android:
//            Router

public class RxResolver
{

    private static final RouterStrategy RESOLVE_STRATEGY = new RouterStrategy() {

        public final int performRequest(Router router, String s, String s1, Map map, byte abyte0[], Resolver.CallbackReceiver callbackreceiver)
        {
            return router.resolve(s, s1, map, abyte0, callbackreceiver);
        }

    };
    private static final RouterStrategy SUBSCRIBE_STRATEGY = new RouterStrategy() {

        public final int performRequest(Router router, String s, String s1, Map map, byte abyte0[], Resolver.CallbackReceiver callbackreceiver)
        {
            return router.subscribe(s, s1, map, abyte0, callbackreceiver);
        }

    };
    private final hew mRouter;

    public RxResolver(hew hew1)
    {
        mRouter = hew1;
    }

    public hew resolve(Request request)
    {
        return resolve(request, ((dup)dmz.a(dup)).a());
    }

    public hew resolve(Request request, hfd hfd)
    {
        return mRouter.a(new hfw() {

            final RxResolver this$0;

            public Boolean call(Router router)
            {
                boolean flag;
                if (router != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((Router)obj);
            }

            
            {
                this$0 = RxResolver.this;
                super();
            }
        }).b().a(hfd).a(new PerformRequestOperator(request));
    }




    private class PerformRequestOperator
        implements hez
    {

        private final Request mRequest;

        private RouterStrategy getStrategy()
        {
            if (isSubscribeAction())
            {
                return RxResolver.SUBSCRIBE_STRATEGY;
            } else
            {
                return RxResolver.RESOLVE_STRATEGY;
            }
        }

        private boolean isSubscribeAction()
        {
            return "SUB".equals(mRequest.getAction());
        }

        public hff call(final hff final_hff1)
        {
            return new hff(final_hff1) {

                final PerformRequestOperator this$0;
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
                    this$0 = PerformRequestOperator.this;
                    subscriber = hff2;
                    super(final_hff1);
                }

                private class RouterStrategy
                {

                    public abstract int performRequest(Router router, String s, String s1, Map map, byte abyte0[], Resolver.CallbackReceiver callbackreceiver);
                }

            };
        }

        public volatile Object call(Object obj)
        {
            return call((hff)obj);
        }




        public PerformRequestOperator(Request request)
        {
            mRequest = request;
        }
    }

}
