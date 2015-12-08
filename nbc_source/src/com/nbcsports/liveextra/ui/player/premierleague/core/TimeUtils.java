// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.core;


public final class TimeUtils
{

    public TimeUtils()
    {
    }

    public static String getGameTime(int i, int j)
    {
        switch (i)
        {
        default:
            return "";

        case 1: // '\001'
            if (j > 45)
            {
                return (new StringBuilder()).append("45'+").append(j - 45).append("'").toString();
            } else
            {
                return (new StringBuilder()).append(j).append("'").toString();
            }

        case 2: // '\002'
            break;
        }
        if (j > 90)
        {
            return (new StringBuilder()).append("90'+").append(j - 90).append("'").toString();
        } else
        {
            return (new StringBuilder()).append(j).append("'").toString();
        }
    }

    public static String normalizeTimestamp(String s)
    {
        if (s.contains("Z") || s.split("T")[1].contains("-") || s.split("T")[1].contains("+"))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s).append("Z").toString();
        }
    }
}
