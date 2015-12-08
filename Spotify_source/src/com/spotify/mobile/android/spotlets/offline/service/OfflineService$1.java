// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.offline.service;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.spotify.mobile.android.spotlets.offline.service:
//            OfflineService

final class a extends com.spotify.cosmos.android.Receiver
{

    private Semaphore a;

    protected final void onError(Throwable throwable)
    {
        a.release();
    }

    protected final void onResolved(Response response)
    {
        a.release();
    }

    (Handler handler, Semaphore semaphore)
    {
        a = semaphore;
        super(handler);
    }
}
