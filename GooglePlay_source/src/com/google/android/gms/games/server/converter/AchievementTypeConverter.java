// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;


public class AchievementTypeConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public AchievementTypeConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("STANDARD"))
        {
            i = 0;
        } else
        if (((String) (obj)).equals("INCREMENTAL"))
        {
            i = 1;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown achievement type string: ")).append(((String) (obj))).toString());
        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        int i = ((Integer)obj).intValue();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown achievement type: ")).append(i).toString());

        case 0: // '\0'
            return "STANDARD";

        case 1: // '\001'
            return "INCREMENTAL";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
