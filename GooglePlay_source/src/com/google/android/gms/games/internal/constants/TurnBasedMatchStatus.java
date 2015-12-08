// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class TurnBasedMatchStatus
{

    public static String fromInt(int i)
    {
        switch (i)
        {
        default:
            GamesLog.e("TurnBasedMatchStatus", (new StringBuilder("Unknown match turn status: ")).append(i).toString());
            return "UNKNOWN_STATUS";

        case 0: // '\0'
            return "MATCH_AUTO_MATCHING";

        case 1: // '\001'
            return "MATCH_ACTIVE";

        case 2: // '\002'
            return "MATCH_COMPLETE";

        case 3: // '\003'
            return "MATCH_EXPIRED";

        case 4: // '\004'
            return "MATCH_CANCELED";

        case 5: // '\005'
            return "MATCH_DELETED";
        }
    }
}
