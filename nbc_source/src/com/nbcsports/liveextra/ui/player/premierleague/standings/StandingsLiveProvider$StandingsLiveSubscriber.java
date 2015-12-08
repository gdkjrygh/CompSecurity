// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.Standings;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.squareup.okhttp.OkHttpClient;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            StandingsLiveProvider

public static class  extends OverlayPollingSubscriber
{

    protected boolean shouldUseCache()
    {
        return false;
    }

    public (OkHttpClient okhttpclient, Gson gson)
    {
        super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/Standings);
    }
}
