// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.MatchParticipantStatus;

public class ParticipantStatusConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public ParticipantStatusConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("PARTICIPANT_NOT_INVITED_YET"))
        {
            i = 0;
        } else
        if (((String) (obj)).equals("PARTICIPANT_INVITED"))
        {
            i = 1;
        } else
        if (((String) (obj)).equals("PARTICIPANT_JOINED"))
        {
            i = 2;
        } else
        if (((String) (obj)).equals("PARTICIPANT_DECLINED"))
        {
            i = 3;
        } else
        if (((String) (obj)).equals("PARTICIPANT_LEFT"))
        {
            i = 4;
        } else
        if (((String) (obj)).equals("PARTICIPANT_FINISHED"))
        {
            i = 5;
        } else
        if (((String) (obj)).equals("PARTICIPANT_UNRESPONSIVE"))
        {
            i = 6;
        } else
        {
            GamesLog.e("MatchParticipantStatus", (new StringBuilder("Unknown participant status: ")).append(((String) (obj))).toString());
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        return MatchParticipantStatus.fromInt(((Integer)obj).intValue());
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
