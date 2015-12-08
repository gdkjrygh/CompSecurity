// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.stats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StatsItemViewModel
{
    public static class StatsItemViewModelBuilder
    {

        private int away;
        private String awayColor;
        private int home;
        private String homeColor;
        private int name;

        public StatsItemViewModelBuilder away(int i)
        {
            away = i;
            return this;
        }

        public StatsItemViewModelBuilder awayColor(String s)
        {
            awayColor = s;
            return this;
        }

        public StatsItemViewModel build()
        {
            return new StatsItemViewModel(name, home, away, homeColor, awayColor);
        }

        public StatsItemViewModelBuilder home(int i)
        {
            home = i;
            return this;
        }

        public StatsItemViewModelBuilder homeColor(String s)
        {
            homeColor = s;
            return this;
        }

        public StatsItemViewModelBuilder name(int i)
        {
            name = i;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("StatsItemViewModel.StatsItemViewModelBuilder(name=").append(name).append(", home=").append(home).append(", away=").append(away).append(", homeColor=").append(homeColor).append(", awayColor=").append(awayColor).append(")").toString();
        }

        StatsItemViewModelBuilder()
        {
        }
    }


    public int away;
    public String awayColor;
    public int home;
    public String homeColor;
    public int name;

    StatsItemViewModel(int i, int j, int k, String s, String s1)
    {
        name = i;
        home = j;
        away = k;
        homeColor = s;
        awayColor = s1;
    }

    public static StatsItemViewModelBuilder builder()
    {
        return new StatsItemViewModelBuilder();
    }

    private static StatsItemViewModel getCorners(Map map, String s, String s1)
    {
        return builder().name(0x7f070146).homeColor(s).awayColor(s1).home(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("H")).getCrn()).away(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("A")).getCrn()).build();
    }

    private static StatsItemViewModel getFouls(Map map, String s, String s1)
    {
        return builder().name(0x7f070148).homeColor(s).awayColor(s1).home(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("H")).getFoul()).away(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("A")).getFoul()).build();
    }

    private static StatsItemViewModel getOffsides(Map map, String s, String s1)
    {
        return builder().name(0x7f07014d).homeColor(s).awayColor(s1).home(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("H")).getOffsd()).away(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("A")).getOffsd()).build();
    }

    private static StatsItemViewModel getRedCards(Map map, String s, String s1)
    {
        return builder().name(0x7f070151).homeColor(s).awayColor(s1).home(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("H")).getRc()).away(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("A")).getRc()).build();
    }

    private static StatsItemViewModel getShots(Map map, String s, String s1)
    {
        return builder().name(0x7f070154).homeColor(s).awayColor(s1).home(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("H")).getSht()).away(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("A")).getSht()).build();
    }

    public static List getStats(List list, String s, String s1)
    {
        HashMap hashmap = new HashMap();
        com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score score;
        for (list = list.iterator(); list.hasNext(); hashmap.put(score.getHa(), score))
        {
            score = (com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)list.next();
        }

        list = new ArrayList();
        list.add(getShots(hashmap, s, s1));
        list.add(getCorners(hashmap, s, s1));
        list.add(getTackles(hashmap, s, s1));
        list.add(getOffsides(hashmap, s, s1));
        list.add(getFouls(hashmap, s, s1));
        list.add(getYellowCards(hashmap, s, s1));
        list.add(getRedCards(hashmap, s, s1));
        return list;
    }

    private static StatsItemViewModel getTackles(Map map, String s, String s1)
    {
        return builder().name(0x7f070158).homeColor(s).awayColor(s1).home(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("H")).getTckl()).away(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("A")).getTckl()).build();
    }

    private static StatsItemViewModel getYellowCards(Map map, String s, String s1)
    {
        return builder().name(0x7f07015c).homeColor(s).awayColor(s1).home(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("H")).getYc()).away(((com.nbcsports.liveextra.content.models.overlay.premierleague.TeamBoxScore.Score)map.get("A")).getYc()).build();
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof StatsItemViewModel;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof StatsItemViewModel))
            {
                return false;
            }
            obj = (StatsItemViewModel)obj;
            if (!((StatsItemViewModel) (obj)).canEqual(this))
            {
                return false;
            }
            if (name != ((StatsItemViewModel) (obj)).name)
            {
                return false;
            }
            if (home != ((StatsItemViewModel) (obj)).home)
            {
                return false;
            }
            if (away != ((StatsItemViewModel) (obj)).away)
            {
                return false;
            }
            String s = homeColor;
            String s1 = ((StatsItemViewModel) (obj)).homeColor;
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            s = awayColor;
            obj = ((StatsItemViewModel) (obj)).awayColor;
            if (s != null ? !s.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public int getBarLength()
    {
        if (home == 0 && away == 0)
        {
            return 2;
        } else
        {
            return home + away;
        }
    }

    public int getHomeLength()
    {
        if (home == 0 && away == 0)
        {
            return 1;
        } else
        {
            return home;
        }
    }

    public int hashCode()
    {
        int j = 0;
        int k = name;
        int l = home;
        int i1 = away;
        String s = homeColor;
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        s = awayColor;
        if (s != null)
        {
            j = s.hashCode();
        }
        return ((((k + 59) * 59 + l) * 59 + i1) * 59 + i) * 59 + j;
    }
}
