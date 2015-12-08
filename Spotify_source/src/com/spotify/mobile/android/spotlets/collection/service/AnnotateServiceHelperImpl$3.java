// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.service:
//            AnnotateServiceHelperImpl

final class b extends HttpCallbackReceiver
{

    private boolean a[];
    private Semaphore b;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.rCause rcause)
    {
        Logger.b(throwable, "setImageIdAndDescription().onError", new Object[0]);
        b.release();
    }

    protected final void onResolved(Response response, Object obj)
    {
        a[0] = true;
        b.release();
    }

    protected final Object parseResponse(Response response)
    {
        return response;
    }

    (Handler handler, boolean aflag[], Semaphore semaphore)
    {
        a = aflag;
        b = semaphore;
        super(handler);
    }
}
