// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.delegates;

import com.spotify.mobile.android.porcelain.subitem.PorcelainIcon;

// Referenced classes of package com.spotify.mobile.android.porcelain.delegates:
//            PorcelainDefaultImageDelegate

public final class adPolicy
{

    static final int a[];
    static final int b[];
    public static final int c[];
    public static final int d[];
    static final int e[];

    static 
    {
        e = new int[nImageDelegate.ImageSize.values().length];
        try
        {
            e[nImageDelegate.ImageSize.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            e[nImageDelegate.ImageSize.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            e[nImageDelegate.ImageSize.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        d = new int[nImageDelegate.IconSize.values().length];
        try
        {
            d[nImageDelegate.IconSize.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            d[nImageDelegate.IconSize.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            d[nImageDelegate.IconSize.b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            d[nImageDelegate.IconSize.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        c = new int[PorcelainIcon.values().length];
        try
        {
            c[PorcelainIcon.c.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            c[PorcelainIcon.e.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            c[PorcelainIcon.f.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            c[PorcelainIcon.m.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            c[PorcelainIcon.n.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            c[PorcelainIcon.q.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        b = new int[com.spotify.mobile.android.porcelain.subitem._cls1.b().length];
        try
        {
            b[com.spotify.mobile.android.porcelain.subitem._cls1.b.b()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[com.spotify.mobile.android.porcelain.subitem._cls1.b.b()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[com.spotify.mobile.android.porcelain.subitem._cls1.b.b()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[adPolicy.values().length];
        try
        {
            a[adPolicy.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[adPolicy.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[adPolicy.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
