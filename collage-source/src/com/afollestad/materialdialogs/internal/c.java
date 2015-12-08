// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.afollestad.materialdialogs.e;

public class c
{

    private static c v;
    public boolean a;
    public int b;
    public int c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public int g;
    public int h;
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public e q;
    public e r;
    public e s;
    public e t;
    public e u;

    public c()
    {
        a = false;
        b = 0;
        c = 0;
        d = null;
        e = null;
        f = null;
        g = 0;
        h = 0;
        i = null;
        j = 0;
        k = 0;
        l = 0;
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = e.a;
        r = e.a;
        s = e.c;
        t = e.a;
        u = e.a;
    }

    public static c a()
    {
        return a(true);
    }

    public static c a(boolean flag)
    {
        if (v == null && flag)
        {
            v = new c();
        }
        return v;
    }
}
