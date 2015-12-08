// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class hp
{

    private static final String Cm[] = {
        "text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"
    };
    private static final Map Cn;

    public static String O(int i)
    {
        if (i < 0 || i >= Cm.length)
        {
            return null;
        } else
        {
            return Cm[i];
        }
    }

    public static int as(String s)
    {
        Integer integer = (Integer)Cn.get(s);
        if (integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("[").append(s).append("] is not a valid global search section name").toString());
        } else
        {
            return integer.intValue();
        }
    }

    public static int fl()
    {
        return Cm.length;
    }

    static 
    {
        int i = 0;
        Cn = new HashMap(Cm.length);
        for (; i < Cm.length; i++)
        {
            Cn.put(Cm[i], Integer.valueOf(i));
        }

    }
}
