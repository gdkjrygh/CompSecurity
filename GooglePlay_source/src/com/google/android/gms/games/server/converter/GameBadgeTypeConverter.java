// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;

public class GameBadgeTypeConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public GameBadgeTypeConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("PLAY_GAMES"))
        {
            i = 0;
        } else
        if (((String) (obj)).equals("REALTIME_MULTIPLAYER"))
        {
            i = 1;
        } else
        if (((String) (obj)).equals("LEADERBOARDS"))
        {
            i = 2;
        } else
        if (((String) (obj)).equals("ACHIEVEMENTS"))
        {
            i = 3;
        } else
        if (((String) (obj)).equals("TURNBASED_MULTIPLAYER"))
        {
            i = 4;
        } else
        if (((String) (obj)).equals("REQUESTS"))
        {
            i = 5;
        } else
        if (((String) (obj)).equals("ANY_MULTIPLAYER"))
        {
            i = 6;
        } else
        if (((String) (obj)).equals("SNAPSHOTS"))
        {
            i = 7;
        } else
        if (((String) (obj)).equals("QUESTS"))
        {
            i = 8;
        } else
        {
            GamesLog.e("GameBadgeType", (new StringBuilder("Unknown badge type string: ")).append(((String) (obj))).toString());
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        int i = ((Integer)obj).intValue();
        switch (i)
        {
        default:
            GamesLog.e("GameBadgeType", (new StringBuilder("Unknown badge type: ")).append(i).toString());
            return "UNKNOWN_TYPE";

        case 0: // '\0'
            return "PLAY_GAMES";

        case 1: // '\001'
            return "REALTIME_MULTIPLAYER";

        case 2: // '\002'
            return "LEADERBOARDS";

        case 3: // '\003'
            return "ACHIEVEMENTS";

        case 4: // '\004'
            return "TURNBASED_MULTIPLAYER";

        case 5: // '\005'
            return "REQUESTS";

        case 6: // '\006'
            return "ANY_MULTIPLAYER";

        case 7: // '\007'
            return "SNAPSHOTS";

        case 8: // '\b'
            return "QUESTS";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
