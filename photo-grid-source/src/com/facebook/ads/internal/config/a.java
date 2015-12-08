// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.config;

import com.facebook.ads.internal.e;

public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    private static final a e[];

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a a(e e1)
    {
        switch (_cls1.a[e1.ordinal()])
        {
        default:
            return a;

        case 1: // '\001'
            return d;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return b;

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return c;
        }
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/facebook/ads/internal/config/a, s);
    }

    public static a[] values()
    {
        return (a[])e.clone();
    }

    static 
    {
        a = new a("UNKNOWN", 0);
        b = new a("BANNER", 1);
        c = new a("INTERSTITIAL", 2);
        d = new a("NATIVE", 3);
        e = (new a[] {
            a, b, c, d
        });
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.facebook.ads.internal.e.values().length];
            try
            {
                a[e.j.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[e.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[e.d.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[e.b.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[e.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[e.g.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[e.h.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[e.i.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[e.f.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
