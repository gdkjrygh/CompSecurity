// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.graphics.Color;
import com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo;
import rx.functions.Func1;

public class MatchInfoViewModel
{
    public static class TeamViewModel
    {

        String abbr;
        String color;
        int points;
        int position;
        private int teamId;

        public static TeamViewModel fromTeam(com.nbcsports.liveextra.content.models.overlay.premierleague.TeamInfo.Team team)
        {
            return new TeamViewModel(team.getAbbreviation(), team.getRgb(), team.getTeamId(), team.getPosition(), team.getPoints());
        }

        public String getAbbr()
        {
            return abbr;
        }

        public int getColor()
        {
            return Color.parseColor((new StringBuilder()).append("#").append(color).toString());
        }

        public String getColorString()
        {
            return color;
        }

        public String getIcon()
        {
            return String.format("http://stream.nbcsports.com/static/img/premier-league/mobile/teams2015/%s.png", new Object[] {
                Integer.toString(teamId)
            });
        }

        public int getPoints()
        {
            return points;
        }

        public int getPosition()
        {
            return position;
        }

        public int getTeamId()
        {
            return teamId;
        }

        public void setPoints(int i)
        {
            points = i;
        }

        public void setPosition(int i)
        {
            position = i;
        }

        public TeamViewModel(String s, String s1, int i, int j, int k)
        {
            abbr = s;
            color = s1;
            teamId = i;
            position = j;
            points = k;
        }
    }


    TeamViewModel away;
    TeamViewModel home;

    public MatchInfoViewModel(TeamViewModel teamviewmodel, TeamViewModel teamviewmodel1)
    {
        home = teamviewmodel;
        away = teamviewmodel1;
    }

    public static Func1 fromTeamInfo()
    {
        return new Func1() {

            public MatchInfoViewModel call(TeamInfo teaminfo)
            {
                if (teaminfo == null)
                {
                    return null;
                } else
                {
                    return new MatchInfoViewModel(TeamViewModel.fromTeam(teaminfo.getTeamHome()), TeamViewModel.fromTeam(teaminfo.getTeamAway()));
                }
            }

            public volatile Object call(Object obj)
            {
                return call((TeamInfo)obj);
            }

        };
    }

    public static Func1 toTeamViewModel(String s)
    {
        return new Func1(s) {

            final String val$key;

            public TeamViewModel call(MatchInfoViewModel matchinfoviewmodel)
            {
                if (key.equals("H"))
                {
                    return matchinfoviewmodel.getHome();
                } else
                {
                    return matchinfoviewmodel.getAway();
                }
            }

            public volatile Object call(Object obj)
            {
                return call((MatchInfoViewModel)obj);
            }

            
            {
                key = s;
                super();
            }
        };
    }

    public TeamViewModel getAway()
    {
        return away;
    }

    public TeamViewModel getHome()
    {
        return home;
    }
}
