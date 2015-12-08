// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.PremiereLeagueFeedName;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore;
import com.nbcsports.liveextra.content.overlay.OverlayPollingSubscriber;
import com.nbcsports.liveextra.ui.player.premierleague.PremierLeagueEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.PremierLeaguePollingProvider;
import com.squareup.okhttp.OkHttpClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import rx.Observable;
import rx.functions.Func1;

public class TeamBoxScoreProvider extends PremierLeaguePollingProvider
{
    public static class TeamBoxScoreSubscriber extends OverlayPollingSubscriber
    {

        public TeamBoxScoreSubscriber(OkHttpClient okhttpclient, Gson gson)
        {
            super(okhttpclient, gson, com/nbcsports/liveextra/content/models/overlay/premierleague/TeamBoxScore);
        }
    }


    public TeamBoxScoreProvider(PremierLeagueEngine premierleagueengine, TeamBoxScoreSubscriber teamboxscoresubscriber)
    {
        super(premierleagueengine, teamboxscoresubscriber, PremiereLeagueFeedName.TeamBoxscore);
    }

    public Observable getFormation()
    {
        return getTeamBoxScore().map(new Func1() {

            final TeamBoxScoreProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public Map call(List list)
            {
                if (!CollectionUtils.isEmpty(list)) goto _L2; else goto _L1
_L1:
                list = null;
_L4:
                return list;
_L2:
                HashMap hashmap = new HashMap();
                Iterator iterator = list.iterator();
                do
                {
                    list = hashmap;
                    if (!iterator.hasNext())
                    {
                        continue;
                    }
                    list = (com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)iterator.next();
                    hashmap.put(list.getHa(), list.getForm());
                } while (true);
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = TeamBoxScoreProvider.this;
                super();
            }
        });
    }

    public Observable getScore()
    {
        return getTeamBoxScore().map(new Func1() {

            final TeamBoxScoreProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((List)obj);
            }

            public Map call(List list)
            {
                if (!CollectionUtils.isEmpty(list)) goto _L2; else goto _L1
_L1:
                list = null;
_L4:
                return list;
_L2:
                HashMap hashmap = new HashMap();
                Iterator iterator = list.iterator();
                do
                {
                    list = hashmap;
                    if (!iterator.hasNext())
                    {
                        continue;
                    }
                    list = (com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)iterator.next();
                    hashmap.put(list.getHa(), Integer.valueOf(list.getGoals()));
                } while (true);
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = TeamBoxScoreProvider.this;
                super();
            }
        });
    }

    public Observable getTeamBoxScore()
    {
        return getObservable().flatMap(new Func1() {

            final TeamBoxScoreProvider this$0;

            public volatile Object call(Object obj)
            {
                return call((TeamBoxScore)obj);
            }

            public Observable call(TeamBoxScore teamboxscore)
            {
                if (teamboxscore == null)
                {
                    return null;
                } else
                {
                    return Observable.just(teamboxscore.getScores());
                }
            }

            
            {
                this$0 = TeamBoxScoreProvider.this;
                super();
            }
        });
    }

    public void showGoLive(boolean flag)
    {
    }
}
