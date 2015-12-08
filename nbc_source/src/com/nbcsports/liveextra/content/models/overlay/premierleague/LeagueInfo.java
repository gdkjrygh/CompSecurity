// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;

import java.util.List;

public class LeagueInfo
{
    public class LeagueTeam
    {

        String name;
        String teamAbbreviation;
        int teamId;
        final LeagueInfo this$0;

        public String getName()
        {
            return name;
        }

        public String getTeamAbbreviation()
        {
            return teamAbbreviation;
        }

        public int getTeamId()
        {
            return teamId;
        }

        public LeagueTeam()
        {
            this$0 = LeagueInfo.this;
            super();
        }
    }


    List teams;

    public LeagueInfo()
    {
    }

    public List getTeams()
    {
        return teams;
    }
}
