// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;


public final class AvailabilityCodeConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public AvailabilityCodeConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("AVAILABLE"))
        {
            i = 0;
        } else
        if (((String) (obj)).equals("UNAVAILABLE_DEVICE"))
        {
            i = 1;
        } else
        if (((String) (obj)).equals("UNAVAILABLE_COUNTRY"))
        {
            i = 2;
        } else
        if (((String) (obj)).equals("UNAVAILABLE_PERMISSIONS"))
        {
            i = 3;
        } else
        if (((String) (obj)).equals("UNAVAILABLE_UNKNOWN"))
        {
            i = 4;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown availability code string: ")).append(((String) (obj))).toString());
        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        int i = ((Integer)obj).intValue();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown availability code: ")).append(i).toString());

        case 0: // '\0'
            return "AVAILABLE";

        case 1: // '\001'
            return "UNAVAILABLE_DEVICE";

        case 2: // '\002'
            return "UNAVAILABLE_COUNTRY";

        case 3: // '\003'
            return "UNAVAILABLE_PERMISSIONS";

        case 4: // '\004'
            return "UNAVAILABLE_UNKNOWN";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
