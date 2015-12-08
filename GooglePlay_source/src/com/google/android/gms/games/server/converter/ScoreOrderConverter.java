// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;


public class ScoreOrderConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public ScoreOrderConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = (String)obj;
        int i;
        if (((String) (obj)).equals("LARGER_IS_BETTER"))
        {
            i = 1;
        } else
        if (((String) (obj)).equals("SMALLER_IS_BETTER"))
        {
            i = 0;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown score order string: ")).append(((String) (obj))).toString());
        }
        return Integer.valueOf(i);
    }

    public final volatile Object convertBack(Object obj)
    {
        int i = ((Integer)obj).intValue();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown score order: ")).append(i).toString());

        case 1: // '\001'
            return "LARGER_IS_BETTER";

        case 0: // '\0'
            return "SMALLER_IS_BETTER";
        }
    }

    public final int getTypeOut()
    {
        return 0;
    }
}
