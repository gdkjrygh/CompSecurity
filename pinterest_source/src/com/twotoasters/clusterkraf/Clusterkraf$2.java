// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;


class rClickBehavior
{

    static final int a[];
    static final int b[];
    static final int c[];
    static final int d[];

    static 
    {
        d = new int[PointInfoWindowClickBehavior.values().length];
        try
        {
            d[PointInfoWindowClickBehavior.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            d[PointInfoWindowClickBehavior.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        c = new int[rInfoWindowClickBehavior.values().length];
        try
        {
            c[rInfoWindowClickBehavior.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            c[rInfoWindowClickBehavior.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            c[rInfoWindowClickBehavior.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        b = new int[PointClickBehavior.values().length];
        try
        {
            b[PointClickBehavior.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[PointClickBehavior.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[rClickBehavior.values().length];
        try
        {
            a[rClickBehavior.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[rClickBehavior.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[rClickBehavior.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
