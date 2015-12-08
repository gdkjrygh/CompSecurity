// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.picksinit.PicksMob;
import com.picksinit.b;

public class a
{

    private static a a = null;

    public a()
    {
    }

    public static long a(int i)
    {
        return 0x5265c00L * (long)i;
    }

    public static a a()
    {
        if (a == null)
        {
            a = new a();
        }
        return a;
    }

    public static void a(String s)
    {
        if (s == null)
        {
            return;
        } else
        {
            PicksMob.getInstance().getContext().getSharedPreferences("misc", 0).edit().putString("user-agent", s).commit();
            return;
        }
    }

    public static String b()
    {
        return PicksMob.getInstance().getContext().getSharedPreferences("misc", 0).getString("user-agent", null);
    }

}
