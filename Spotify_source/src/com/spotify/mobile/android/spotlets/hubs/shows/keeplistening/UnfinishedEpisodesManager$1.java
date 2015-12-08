// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.hubs.shows.keeplistening;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.spotlets.hubs.shows.keeplistening:
//            UnfinishedEpisodesManager, UnfinishedEpisodes

final class a extends JsonHttpCallbackReceiver
{

    private UnfinishedEpisodesManager a;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.rCause rcause)
    {
        Logger.a(throwable, "Error subscribing to latest-resume-points %s", new Object[] {
            rcause
        });
    }

    protected final void onResolved(Response response, Object obj)
    {
        response = (UnfinishedEpisodes)obj;
        UnfinishedEpisodesManager.a(a, response);
    }

    (UnfinishedEpisodesManager unfinishedepisodesmanager, Handler handler, Class class1)
    {
        a = unfinishedepisodesmanager;
        super(handler, class1);
    }
}
