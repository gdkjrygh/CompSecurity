// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

public final class m
{

    private static final String a[] = {
        "text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"
    };
    private static final Map b;

    public static String a(int i)
    {
        if (i < 0 || i >= a.length)
        {
            return null;
        } else
        {
            return a[i];
        }
    }

    static 
    {
        int i = 0;
        b = new HashMap(a.length);
        for (; i < a.length; i++)
        {
            b.put(a[i], Integer.valueOf(i));
        }

    }
}
