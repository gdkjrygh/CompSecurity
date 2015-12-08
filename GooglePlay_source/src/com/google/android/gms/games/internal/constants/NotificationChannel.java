// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class NotificationChannel
{

    public static String fromInt(int i)
    {
        switch (i)
        {
        default:
            GamesLog.e("NotificationChannel", (new StringBuilder("Unknown channel type ")).append(i).toString());
            return "UNKNOWN_TYPE";

        case 0: // '\0'
            return "MATCHES";

        case 2: // '\002'
            return "QUESTS";

        case 1: // '\001'
            return "REQUESTS";
        }
    }

    public static int fromString(String s)
    {
        byte byte1 = 0;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1895368751: 107
    //                   389369796: 121
    //                   1558844691: 93;
           goto _L1 _L2 _L3 _L4
_L1:
        byte byte0 = -1;
_L6:
        switch (byte0)
        {
        default:
            GamesLog.e("NotificationChannel", (new StringBuilder("Unknown channel type ")).append(s).toString());
            byte1 = -1;
            // fall through

        case 0: // '\0'
            return byte1;

        case 1: // '\001'
            return 2;

        case 2: // '\002'
            return 1;
        }
_L4:
        if (!s.equals("MATCHES")) goto _L1; else goto _L5
_L5:
        byte0 = 0;
          goto _L6
_L2:
        if (!s.equals("QUESTS")) goto _L1; else goto _L7
_L7:
        byte0 = 1;
          goto _L6
_L3:
        if (!s.equals("REQUESTS")) goto _L1; else goto _L8
_L8:
        byte0 = 2;
          goto _L6
    }
}
