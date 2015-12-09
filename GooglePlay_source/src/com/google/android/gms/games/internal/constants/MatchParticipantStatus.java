// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class MatchParticipantStatus
{

    public static String fromInt(int i)
    {
        switch (i)
        {
        default:
            GamesLog.e("MatchParticipantStatus", (new StringBuilder("Unknown participant status: ")).append(i).toString());
            return "UNKNOWN_STATUS";

        case 0: // '\0'
            return "PARTICIPANT_NOT_INVITED_YET";

        case 1: // '\001'
            return "PARTICIPANT_INVITED";

        case 2: // '\002'
            return "PARTICIPANT_JOINED";

        case 3: // '\003'
            return "PARTICIPANT_DECLINED";

        case 4: // '\004'
            return "PARTICIPANT_LEFT";

        case 5: // '\005'
            return "PARTICIPANT_FINISHED";

        case 6: // '\006'
            return "PARTICIPANT_UNRESPONSIVE";
        }
    }
}
