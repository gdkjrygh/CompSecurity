// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;

public class MatchUserStatusConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public MatchUserStatusConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        if (((String) (obj)).equals("USER_INVITED"))
        {
            return Integer.valueOf(0);
        }
        if (((String) (obj)).equals("USER_AWAITING_TURN"))
        {
            return Integer.valueOf(2);
        }
        if (((String) (obj)).equals("USER_TURN"))
        {
            return Integer.valueOf(1);
        }
        if (((String) (obj)).equals("USER_MATCH_COMPLETED"))
        {
            return Integer.valueOf(3);
        } else
        {
            GamesLog.e("UserStatusConverter", (new StringBuilder("Unknown match turn status: ")).append(((String) (obj))).toString());
            return Integer.valueOf(-1);
        }
    }

    public final volatile Object convertBack(Object obj)
    {
        obj = (Integer)obj;
        switch (((Integer) (obj)).intValue())
        {
        default:
            GamesLog.e("UserStatusConverter", (new StringBuilder("Unknown match turn status: ")).append(obj).toString());
            return "UNKNOWN_USER_STATUS";

        case 0: // '\0'
            return "USER_INVITED";

        case 1: // '\001'
            return "USER_TURN";

        case 2: // '\002'
            return "USER_AWAITING_TURN";

        case 3: // '\003'
            return "USER_MATCH_COMPLETED";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
