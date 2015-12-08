// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import com.nbcsports.liveextra.content.models.overlay.premierleague.LeagueInfo;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import rx.functions.Func2;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchScorePresenter

class this._cls0
    implements Func2
{

    final MatchScorePresenter this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((com.nbcsports.liveextra.content.models.overlay.premierleague.)obj, (LeagueInfo)obj1);
    }

    public List call(com.nbcsports.liveextra.content.models.overlay.premierleague. , LeagueInfo leagueinfo)
    {
        ArrayList arraylist = new ArrayList();
         = new ArrayList(.s());
        leagueinfo = new ArrayList(leagueinfo.getTeams());
        Iterator iterator = .iterator();
        while (iterator.hasNext()) 
        {
            final com.nbcsports.liveextra.content.models.overlay.premierleague. team = (com.nbcsports.liveextra.content.models.overlay.premierleague.s)iterator.next();
             = (com.nbcsports.liveextra.content.models.overlay.premierleague.s)CollectionUtils.find(leagueinfo, new Predicate() {

                final MatchScorePresenter._cls8 this$1;
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
                this$1 = MatchScorePresenter._cls8.this;
                team = team1;
                super();
            }
            });
            if ( != null)
            {
                 = .getName();
            } else
            {
                 = "---";
            }
            arraylist.add(new StandingsViewModel(team, ));
        }
        Collections.sort(arraylist);
        return arraylist;
    }

    _cls1.val.team()
    {
        this$0 = MatchScorePresenter.this;
        super();
    }
}
