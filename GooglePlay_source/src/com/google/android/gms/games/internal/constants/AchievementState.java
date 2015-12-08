// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;


public final class AchievementState
{

    public static String fromInt(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown achievement state: ")).append(i).toString());

        case 2: // '\002'
            return "HIDDEN";

        case 1: // '\001'
            return "REVEALED";

        case 0: // '\0'
            return "UNLOCKED";
        }
    }

    public static int fromString(String s)
    {
        if (s.equals("HIDDEN"))
        {
            return 2;
        }
        if (s.equals("REVEALED"))
        {
            return 1;
        }
        if (s.equals("UNLOCKED"))
        {
            return 0;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown achievement state string: ")).append(s).toString());
        }
    }
}
