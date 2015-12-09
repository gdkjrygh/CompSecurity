// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.recentlyplayed;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.spotify.mobile.android.spotlets.recentlyplayed:
//            RecentlyPlayedService

final class a extends JsonCallbackReceiver
{

    private Semaphore a;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ErrorCause errorcause)
    {
        a.release();
    }

    protected final void onResolved(Response response, Object obj)
    {
        a.release();
    }

    (Handler handler, Class class1, Semaphore semaphore)
    {
        a = semaphore;
        super(handler, class1);
    }
}
