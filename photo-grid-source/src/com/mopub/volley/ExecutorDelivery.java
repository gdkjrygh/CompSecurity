// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.mopub.volley:
//            ResponseDelivery, b, Request, Response, 
//            c, VolleyError

public class ExecutorDelivery
    implements ResponseDelivery
{

    private final Executor a;

    public ExecutorDelivery(Handler handler)
    {
        a = new b(this, handler);
    }

    public ExecutorDelivery(Executor executor)
    {
        a = executor;
    }

    public void postError(Request request, VolleyError volleyerror)
    {
        request.addMarker("post-error");
        volleyerror = Response.error(volleyerror);
        a.execute(new c(this, request, volleyerror, null));
    }

    public void postResponse(Request request, Response response)
    {
        postResponse(request, response, null);
    }

    public void postResponse(Request request, Response response, Runnable runnable)
    {
        request.markDelivered();
        request.addMarker("post-response");
        a.execute(new c(this, request, response, runnable));
    }
}
