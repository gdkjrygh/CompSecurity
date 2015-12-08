// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.service:
//            AnnotateServiceHelperImpl

final class b extends JsonHttpCallbackReceiver
{

    private ymaster a;
    private Semaphore b;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.rCause rcause)
    {
        Logger.b(throwable, "getIdentityToken.onError()", new Object[0]);
        b.release();
    }

    protected final void onResolved(Response response, Object obj)
    {
        response = (ymaster)obj;
        a.accessToken = ((ymaster) (response)).accessToken;
        a.expiresIn = ((ymaster) (response)).expiresIn;
        b.release();
    }

    ymaster(Handler handler, Class class1, ymaster ymaster, Semaphore semaphore)
    {
        a = ymaster;
        b = semaphore;
        super(handler, class1);
    }
}
