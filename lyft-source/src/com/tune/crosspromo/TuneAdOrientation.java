// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import java.util.Locale;

public final class TuneAdOrientation extends Enum
{

    public static final TuneAdOrientation a;
    public static final TuneAdOrientation b;
    public static final TuneAdOrientation c;
    private static final TuneAdOrientation d[];

    private TuneAdOrientation(String s, int i)
    {
        super(s, i);
    }

    public static TuneAdOrientation a(String s)
    {
        return valueOf(s.toUpperCase(Locale.ENGLISH));
    }

    public static TuneAdOrientation valueOf(String s)
    {
        return (TuneAdOrientation)Enum.valueOf(com/tune/crosspromo/TuneAdOrientation, s);
    }

    public static TuneAdOrientation[] values()
    {
        return (TuneAdOrientation[])d.clone();
    }

    public String a()
    {
        return name();
    }

    static 
    {
        a = new TuneAdOrientation("ALL", 0);
        b = new TuneAdOrientation("PORTRAIT_ONLY", 1);
        c = new TuneAdOrientation("LANDSCAPE_ONLY", 2);
        d = (new TuneAdOrientation[] {
            a, b, c
        });
    }
}
