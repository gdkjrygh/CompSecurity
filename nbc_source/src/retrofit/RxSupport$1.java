// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import rx.Subscriber;
import rx.subscriptions.Subscriptions;

// Referenced classes of package retrofit:
//            RxSupport, RequestInterceptorTape, RequestInterceptor

class t>
    implements rx.nSubscribe
{

    final RxSupport this$0;
    final voker val$invoker;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj = new RequestInterceptorTape();
        RxSupport.access$000(RxSupport.this).intercept(((ceptor.RequestFacade) (obj)));
        obj = new FutureTask(RxSupport.access$100(RxSupport.this, subscriber, val$invoker, ((RequestInterceptorTape) (obj))), null);
        subscriber.add(Subscriptions.from(((java.util.concurrent.Future) (obj))));
        RxSupport.access$200(RxSupport.this).execute(((Runnable) (obj)));
    }

    voker()
    {
        this$0 = final_rxsupport;
        val$invoker = voker.this;
        super();
    }
}
