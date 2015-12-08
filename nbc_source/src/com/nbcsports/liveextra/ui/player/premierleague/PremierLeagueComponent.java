// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import com.nbcsports.liveextra.ui.player.premierleague.events.EventItemView;
import com.nbcsports.liveextra.ui.player.premierleague.events.EventsView;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.GameInformationView;
import com.nbcsports.liveextra.ui.player.premierleague.gameinfo.MatchScoreView;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayByPlayView;
import com.nbcsports.liveextra.ui.player.premierleague.playbyplay.PlayItemView;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerCardsView;
import com.nbcsports.liveextra.ui.player.premierleague.player.PlayerItemView;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleItemView;
import com.nbcsports.liveextra.ui.player.premierleague.schedule.ScheduleView;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsItemView;
import com.nbcsports.liveextra.ui.player.premierleague.standings.StandingsView;
import com.nbcsports.liveextra.ui.player.premierleague.stats.StatsView;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PanelBottom, PanelSide, PanelTop, PremierLeagueEngine

public interface PremierLeagueComponent
{

    public abstract void inject(PanelBottom panelbottom);

    public abstract void inject(PanelSide panelside);

    public abstract void inject(PanelTop paneltop);

    public abstract void inject(PremierLeagueEngine premierleagueengine);

    public abstract void inject(EventItemView eventitemview);

    public abstract void inject(EventsView eventsview);

    public abstract void inject(GameInformationView gameinformationview);

    public abstract void inject(MatchScoreView matchscoreview);

    public abstract void inject(PlayByPlayView playbyplayview);

    public abstract void inject(PlayItemView playitemview);

    public abstract void inject(PlayerCardsView playercardsview);

    public abstract void inject(PlayerItemView playeritemview);

    public abstract void inject(ScheduleItemView scheduleitemview);

    public abstract void inject(ScheduleView scheduleview);

    public abstract void inject(StandingsItemView standingsitemview);

    public abstract void inject(StandingsView standingsview);

    public abstract void inject(StatsView statsview);
}
