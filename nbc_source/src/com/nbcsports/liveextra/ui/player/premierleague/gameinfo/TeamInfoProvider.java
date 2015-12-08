// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.squareup.okhttp.OkHttpClient;
import rx.Observable;
import rx.functions.Func1;

public class TeamInfoProvider extends PremierLeaguePollingProvider
{
    public static class TeamInfoSubscriber extends OverlayPollingSubscriber
    {

        public TeamInfoSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/TeamInfo);
        }
    }


    public TeamInfoProvider(PremierLeagueEngine premierleagueengine, TeamInfoSubscriber teaminfosubscriber)
    {
        super(premierleagueengine, teaminfosubscriber, PremiereLeagueFeedName.TeamInfo);
    }

    public Observable getTeam(final String homeAway)
    {
        return getTeamInfo().flatMap(new Func1() {

            final TeamInfoProvider this$0;
            final String val$homeAway;

            public volatile Object call(Object obj)
            {
                return call((TeamInfo)obj);
            }

            public Observable call(TeamInfo teaminfo)
            {
                if (homeAway.equals("H"))
                {
                    teaminfo = teaminfo.getTeamHome();
                } else
                {
                    teaminfo = teaminfo.getTeamAway();
                }
                return Observable.just(teaminfo);
            }

            
            {
                this$0 = TeamInfoProvider.this;
                homeAway = s;
                super();
            }
        });
    }

    public Observable getTeamInfo()
    {
        return getObservable();
    }

    public void showGoLive(boolean flag)
    {
    }
}
