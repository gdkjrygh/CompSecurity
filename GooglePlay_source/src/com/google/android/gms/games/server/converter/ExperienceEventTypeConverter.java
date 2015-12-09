// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;

public final class ExperienceEventTypeConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public ExperienceEventTypeConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("ACHIEVEMENT_UNLOCK"))
        {
            i = 0;
        } else
        if (((String) (obj)).equals("LEVEL_UP"))
        {
            i = 1;
        } else
        {
            GamesLog.e("ExperienceEventType", (new StringBuilder("Unknown experience event type string: ")).append(((String) (obj))).toString());
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
            GamesLog.e("ExperienceEventType", (new StringBuilder("Unknown experience event type: ")).append(i).toString());
            return "UNKNOWN_TYPE";

        case 0: // '\0'
            return "ACHIEVEMENT_UNLOCK";

        case 1: // '\001'
            return "LEVEL_UP";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
