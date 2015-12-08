// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.standings;

import com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.functions.Func2;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.standings:
//            StandingsPresenter, StandingsViewModel

class this._cls0
    implements Func2
{

    final StandingsPresenter this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((com.nbcsports.liveextra.content.models.overlay.premierleague.l)obj, (LeagueInfo)obj1);
    }

    public List call(com.nbcsports.liveextra.content.models.overlay.premierleague.l l, LeagueInfo leagueinfo)
    {
        ArrayList arraylist = new ArrayList();
        l = l.ms();
        leagueinfo = leagueinfo.getTeams();
        Iterator iterator = l.iterator();
        while (iterator.hasNext()) 
        {
            final com.nbcsports.liveextra.content.models.overlay.premierleague.l team = (com.nbcsports.liveextra.content.models.overlay.premierleague.ms)iterator.next();
            l = (com.nbcsports.liveextra.content.models.overlay.premierleague.)CollectionUtils.find(leagueinfo, new Predicate() {

                final StandingsPresenter._cls2 this$1;
                final com.nbcsports.liveextra.content.models.overlay.premierleague.Standings.Team val$team;

                public boolean evaluate(com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo.LeagueTeam leagueteam)
                {
                    return team.getTeamId() == leagueteam.getTeamId();
                }

                public volatile boolean evaluate(Object obj)
                {
                    return evaluate((com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo.LeagueTeam)obj);
                }

            
            {
                this$1 = StandingsPresenter._cls2.this;
                team = team1;
                super();
            }
            });
            if (l != null)
            {
                l = l.getName();
            } else
            {
                l = "---";
            }
            arraylist.add(new StandingsViewModel(team, l));
        }
        Collections.sort(arraylist);
        return arraylist;
    }

    _cls1.val.team()
    {
        this$0 = StandingsPresenter.this;
        super();
    }
}
