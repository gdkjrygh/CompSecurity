// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;

import java.util.List;

public class TeamInfo
{
    public class Official
    {

        String country;
        String firstName;
        String joined;
        String lastName;
        final TeamInfo this$0;
        String type;

        public String getCountry()
        {
            return country;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public String getJoined()
        {
            return joined;
        }

        public String getLastName()
        {
            return lastName;
        }

        public String getType()
        {
            return type;
        }

        public Official()
        {
            this$0 = TeamInfo.this;
            super();
        }
    }

    public class Team
    {

        String abbreviation;
        String founded;
        String ha;
        List officials;
        int points;
        int position;
        String rgb;
        int teamId;
        String teamName;
        final TeamInfo this$0;
        int vCap;
        String venueName;

        public String getAbbreviation()
        {
            return abbreviation;
        }

        public String getFounded()
        {
            return founded;
        }

        public String getHa()
        {
            return ha;
        }

        public List getOfficials()
        {
            return officials;
        }

        public int getPoints()
        {
            return points;
        }

        public int getPosition()
        {
            return position;
        }

        public String getRgb()
        {
            return rgb;
        }

        public int getTeamId()
        {
            return teamId;
        }

        public String getTeamName()
        {
            return teamName;
        }

        public int getVCap()
        {
            return vCap;
        }

        public String getVenueName()
        {
            return venueName;
        }

        public Team()
        {
            this$0 = TeamInfo.this;
            super();
        }
    }


    Team teamAway;
    Team teamHome;

    public TeamInfo()
    {
    }

    public Team getTeamAway()
    {
        return teamAway;
    }

    public Team getTeamHome()
    {
        return teamHome;
    }
}
