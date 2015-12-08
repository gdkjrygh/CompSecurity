// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            ExecutorDelivery, Request, Response

private class mRunnable
    implements Runnable
{

    private final Request mRequest;
    private final Response mResponse;
    private final Runnable mRunnable;
    final ExecutorDelivery this$0;

    public void run()
    {
        if (mRequest.isCanceled())
        {
            mRequest.finish("canceled-at-delivery");
        } else
        {
            if (mResponse.isSuccess())
            {
                mRequest.deliverResponse(mResponse.result);
            } else
            {
                mRequest.deliverError(mResponse.error);
            }
            if (mResponse.intermediate)
            {
                mRequest.addMarker("intermediate-response");
            } else
            {
                mRequest.finish("done");
            }
            if (mRunnable != null)
            {
                mRunnable.run();
                return;
            }
        }
    }

    public (Request request, Response response, Runnable runnable)
    {
        this$0 = ExecutorDelivery.this;
        super();
        mRequest = request;
        mResponse = response;
        mRunnable = runnable;
    }
}
