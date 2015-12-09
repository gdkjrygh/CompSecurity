// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;

public final class RequestStatusConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public RequestStatusConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("PENDING"))
        {
            i = 0;
        } else
        if (((String) (obj)).equals("ACCEPTED"))
        {
            i = 1;
        } else
        if (((String) (obj)).equals("DELETED"))
        {
            i = 1000;
        } else
        {
            GamesLog.e("RequestStatus", (new StringBuilder("Unknown request type string: ")).append(((String) (obj))).toString());
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
            GamesLog.e("RequestStatus", (new StringBuilder("Unknown request status: ")).append(i).toString());
            return "UNKNOWN_STATUS";

        case 0: // '\0'
            return "PENDING";

        case 1: // '\001'
            return "ACCEPTED";

        case 1000: 
            return "DELETED";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
