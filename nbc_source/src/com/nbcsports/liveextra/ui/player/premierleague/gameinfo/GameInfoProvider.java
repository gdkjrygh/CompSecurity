// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.GameInfo;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.squareup.okhttp.OkHttpClient;
import rx.Observable;

public class GameInfoProvider extends PremierLeaguePollingProvider
{
    public static class GameInfoSubscriber extends OverlayPollingSubscriber
    {

        public GameInfoSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/GameInfo);
        }
    }


    public GameInfoProvider(PremierLeagueEngine premierleagueengine, GameInfoSubscriber gameinfosubscriber)
    {
        super(premierleagueengine, gameinfosubscriber, PremiereLeagueFeedName.GameInfo);
    }

    public Observable getGameInfo()
    {
        return getObservable();
    }

    public void showGoLive(boolean flag)
    {
    }
}
