// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.squareup.okhttp.OkHttpClient;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            TeamInfoProvider

public static class  extends OverlayPollingSubscriber
{

    public (OkHttpClient okhttpclient, Gson gson)
    {
        super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/TeamInfo);
    }
}
