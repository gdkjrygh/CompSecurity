// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class fo
{

    private static final String xZ[] = {
        "text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"
    };
    private static final Map ya;

    public static String H(int i)
    {
        if (i < 0 || i >= xZ.length)
        {
            return null;
        } else
        {
            return xZ[i];
        }
    }

    public static int Y(String s)
    {
        Integer integer = (Integer)ya.get(s);
        if (integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("[").append(s).append("] is not a valid global search section name").toString());
        } else
        {
            return integer.intValue();
        }
    }

    public static int dP()
    {
        return xZ.length;
    }

    static 
    {
        int i = 0;
        ya = new HashMap(xZ.length);
        for (; i < xZ.length; i++)
        {
            ya.put(xZ[i], Integer.valueOf(i));
        }

    }
}
