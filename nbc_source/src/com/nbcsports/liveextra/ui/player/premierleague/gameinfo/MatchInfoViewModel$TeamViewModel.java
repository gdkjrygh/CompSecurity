// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import android.graphics.Color;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            MatchInfoViewModel

public static class points
{

    String abbr;
    String color;
    int points;
    int position;
    private int teamId;

    public static points fromTeam(com.nbcsports.liveextra.content.models.overlay.premierleague.ts ts)
    {
        return new <init>(ts.t>(), ts.t>(), ts.t>(), ts.t>(), ts.t>());
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

    public (String s, String s1, int i, int j, int k)
    {
        abbr = s;
        color = s1;
        teamId = i;
        position = j;
        points = k;
    }
}
