// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;


public final class LeaderboardCollection
{

    public static String fromInt(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown leaderboard collection: ")).append(i).toString());

        case 0: // '\0'
            return "PUBLIC";

        case 1: // '\001'
            return "SOCIAL";
        }
    }

    public static boolean isValid(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
            return true;
        }
    }
}
