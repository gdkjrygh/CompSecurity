// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.league;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.squareup.okhttp.OkHttpClient;
import rx.Observable;

public class LeagueInfoProvider extends PremierLeaguePollingProvider
{
    public static class LeagueInfoSubscriber extends OverlayPollingSubscriber
    {

        public LeagueInfoSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/LeagueInfo);
        }
    }


    public LeagueInfoProvider(PremierLeagueEngine premierleagueengine, LeagueInfoSubscriber leagueinfosubscriber)
    {
        super(premierleagueengine, leagueinfosubscriber, PremiereLeagueFeedName.LeagueInfo);
    }

    public Observable getLeagueInfo()
    {
        return getObservable();
    }

    public void showGoLive(boolean flag)
    {
    }
}
