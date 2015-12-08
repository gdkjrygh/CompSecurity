// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;


public final class LeaderboardCollection
{

    private LeaderboardCollection()
    {
    }

    public static String cm(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown leaderboard collection: ").append(i).toString());

        case 0: // '\0'
            return "PUBLIC";

        case 1: // '\001'
            return "SOCIAL";
        }
    }
}
