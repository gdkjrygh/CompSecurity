// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.content.SharedPreferences;
import com.roidapp.cloudlib.template.h;
import com.roidapp.cloudlib.template.i;

final class u
    implements h
{

    private SharedPreferences a;

    private u(SharedPreferences sharedpreferences)
    {
        a = sharedpreferences;
    }

    u(SharedPreferences sharedpreferences, byte byte0)
    {
        this(sharedpreferences);
    }

    public final void a(i j)
    {
        if (a != null && j != null && j.a > j.b)
        {
            a.edit().putBoolean("template_new", true).apply();
        }
    }
}
