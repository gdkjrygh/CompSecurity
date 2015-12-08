// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

public final class a
{

    static final int a;
    static final int b;
    private static final int c;
    private static final int d;
    private final String e;
    private final Drawable f;
    private final int g;
    private final int h;
    private final int i;

    public a(String s, Drawable drawable, Integer integer, Integer integer1, Integer integer2)
    {
        e = s;
        f = drawable;
        int j;
        if (integer != null)
        {
            j = integer.intValue();
        } else
        {
            j = a;
        }
        g = j;
        if (integer1 != null)
        {
            j = integer1.intValue();
        } else
        {
            j = b;
        }
        h = j;
        if (integer2 != null)
        {
            j = integer2.intValue();
        } else
        {
            j = 12;
        }
        i = j;
    }

    public final String a()
    {
        return e;
    }

    public final Drawable b()
    {
        return f;
    }

    public final int c()
    {
        return g;
    }

    public final int d()
    {
        return h;
    }

    public final int e()
    {
        return i;
    }

    static 
    {
        c = Color.rgb(12, 174, 206);
        int j = Color.rgb(204, 204, 204);
        d = j;
        a = j;
        b = c;
    }
}
