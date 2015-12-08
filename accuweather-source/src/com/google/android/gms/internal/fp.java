// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class fp
{

    private static final String xW[] = {
        "text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"
    };
    private static final Map xX;

    public static String H(int i)
    {
        if (i < 0 || i >= xW.length)
        {
            return null;
        } else
        {
            return xW[i];
        }
    }

    public static int Y(String s)
    {
        Integer integer = (Integer)xX.get(s);
        if (integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("[").append(s).append("] is not a valid global search section name").toString());
        } else
        {
            return integer.intValue();
        }
    }

    public static int dK()
    {
        return xW.length;
    }

    static 
    {
        int i = 0;
        xX = new HashMap(xW.length);
        for (; i < xW.length; i++)
        {
            xX.put(xW[i], Integer.valueOf(i));
        }

    }
}
