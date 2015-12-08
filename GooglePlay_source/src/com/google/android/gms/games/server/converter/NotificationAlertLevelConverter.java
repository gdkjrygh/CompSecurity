// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;

public class NotificationAlertLevelConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public NotificationAlertLevelConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        if (((String) (obj)).equals("SILENT"))
        {
            return Integer.valueOf(0);
        }
        if (((String) (obj)).equals("NOISY"))
        {
            return Integer.valueOf(1);
        } else
        {
            GamesLog.e("AlertLevelConverter", (new StringBuilder("Unknown alert level: ")).append(((String) (obj))).toString());
            return Integer.valueOf(-1);
        }
    }

    public final volatile Object convertBack(Object obj)
    {
        obj = (Integer)obj;
        switch (((Integer) (obj)).intValue())
        {
        default:
            GamesLog.e("AlertLevelConverter", (new StringBuilder("Unknown alert level: ")).append(obj).toString());
            return "UNKNOWN_ALERT_LEVEL";

        case 0: // '\0'
            return "SILENT";

        case 1: // '\001'
            return "NOISY";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
