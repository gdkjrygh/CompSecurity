// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import java.util.Locale;

public final class g extends Enum
{

    public static final g a;
    public static final g b;
    private static final g c[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g a(String s)
    {
        if (s == null)
        {
            return a;
        }
        try
        {
            s = (g)Enum.valueOf(com/facebook/ads/internal/adapters/g, s.toUpperCase(Locale.getDefault()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a;
        }
        return s;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/ads/internal/adapters/g, s);
    }

    public static g[] values()
    {
        return (g[])c.clone();
    }

    static 
    {
        a = new g("UNKNOWN", 0);
        b = new g("AN", 1);
        c = (new g[] {
            a, b
        });
    }
}
