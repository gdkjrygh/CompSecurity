// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import java.util.List;

public class zza
{

    static final int a;
    static final int b;
    private static final int c;
    private static final int d;
    private final String e;
    private final List f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    public zza(String s, List list, Integer integer, Integer integer1, Integer integer2, int k)
    {
        e = s;
        f = list;
        int l;
        if (integer != null)
        {
            l = integer.intValue();
        } else
        {
            l = a;
        }
        g = l;
        if (integer1 != null)
        {
            l = integer1.intValue();
        } else
        {
            l = b;
        }
        h = l;
        if (integer2 != null)
        {
            l = integer2.intValue();
        } else
        {
            l = 12;
        }
        i = l;
        j = k;
    }

    public int getBackgroundColor()
    {
        return g;
    }

    public String getText()
    {
        return e;
    }

    public int getTextColor()
    {
        return h;
    }

    public int getTextSize()
    {
        return i;
    }

    public List zzds()
    {
        return f;
    }

    public int zzdt()
    {
        return j;
    }

    static 
    {
        c = Color.rgb(12, 174, 206);
        int k = Color.rgb(204, 204, 204);
        d = k;
        a = k;
        b = c;
    }
}
