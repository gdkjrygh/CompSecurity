// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.service:
//            AnnotateServiceHelperImpl

final class b extends JsonCallbackReceiver
{

    private aylist a;
    private Semaphore b;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.rCause rcause)
    {
        Logger.b(throwable, "createPlaylist().onError()", new Object[0]);
        b.release();
    }

    protected final void onResolved(Response response, Object obj)
    {
        response = (aylist)obj;
        a.uri = ((aylist) (response)).uri;
        response = a.uri;
        b.release();
    }

    aylist(Handler handler, Class class1, aylist aylist, Semaphore semaphore)
    {
        a = aylist;
        b = semaphore;
        super(handler, class1);
    }
}
