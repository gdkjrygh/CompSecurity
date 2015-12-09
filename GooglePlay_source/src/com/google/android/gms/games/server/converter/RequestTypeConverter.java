// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.RequestType;

public final class RequestTypeConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public RequestTypeConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("GIFT"))
        {
            i = 1;
        } else
        if (((String) (obj)).equals("WISH"))
        {
            i = 2;
        } else
        {
            GamesLog.e("RequestType", (new StringBuilder("Unknown request type string: ")).append(((String) (obj))).toString());
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        return RequestType.fromInt(((Integer)obj).intValue());
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
