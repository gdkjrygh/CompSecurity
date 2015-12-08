// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Log;

class Logger
{

    private int yL;

    Logger()
    {
        yL = 5;
    }

    public void e(String s)
    {
        if (yL <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void e(String s, Throwable throwable)
    {
        if (yL <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void i(String s)
    {
        if (yL <= 4)
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void v(String s)
    {
        if (yL <= 2)
        {
            Log.v("GoogleTagManager", s);
        }
    }

    public void w(String s)
    {
        if (yL <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }
}
