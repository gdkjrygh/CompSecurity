// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.SharedPreferences;

public final class ba
{

    public static ba a;
    public long b;
    public long c;
    public boolean d;

    public ba()
    {
        d = false;
    }

    public static ba a()
    {
        if (a == null)
        {
            a = new ba();
        }
        return a;
    }

    public final void a(Activity activity)
    {
        if (activity.getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false))
        {
            d = true;
            b = System.currentTimeMillis();
        }
    }

    public final void b()
    {
        d = false;
        c = System.currentTimeMillis();
    }
}
