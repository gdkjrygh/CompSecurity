// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.TurnBasedMatchStatus;

public class MatchStatusConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public MatchStatusConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("MATCH_AUTO_MATCHING"))
        {
            i = 0;
        } else
        if (((String) (obj)).equals("MATCH_ACTIVE"))
        {
            i = 1;
        } else
        if (((String) (obj)).equals("MATCH_COMPLETE"))
        {
            i = 2;
        } else
        if (((String) (obj)).equals("MATCH_EXPIRED"))
        {
            i = 3;
        } else
        if (((String) (obj)).equals("MATCH_CANCELED"))
        {
            i = 4;
        } else
        if (((String) (obj)).equals("MATCH_DELETED"))
        {
            i = 5;
        } else
        {
            GamesLog.e("TurnBasedMatchStatus", (new StringBuilder("Unknown match turn status: ")).append(((String) (obj))).toString());
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        return TurnBasedMatchStatus.fromInt(((Integer)obj).intValue());
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
