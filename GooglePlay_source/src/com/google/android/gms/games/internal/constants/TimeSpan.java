// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;


public final class TimeSpan
{

    public static String fromInt(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown time span ")).append(i).toString());

        case 0: // '\0'
            return "DAILY";

        case 1: // '\001'
            return "WEEKLY";

        case 2: // '\002'
            return "ALL_TIME";
        }
    }

    public static int fromString(String s)
    {
        if (s.equals("DAILY"))
        {
            return 0;
        }
        if (s.equals("WEEKLY"))
        {
            return 1;
        }
        if (s.equals("ALL_TIME"))
        {
            return 2;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown time span string: ")).append(s).toString());
        }
    }

    public static boolean isValidTimeSpan(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }
}
