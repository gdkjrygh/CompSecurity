// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.b;


public final class g extends Enum
{

    private static final g $VALUES[];
    public static final g GenericTouches;
    public static final g HorizontalPans;
    public static final g Taps;
    public static final g UnconstrainedPans;
    public static final g VerticalPans;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/reflex/view/b/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        Taps = new g("Taps", 0);
        HorizontalPans = new g("HorizontalPans", 1);
        VerticalPans = new g("VerticalPans", 2);
        UnconstrainedPans = new g("UnconstrainedPans", 3);
        GenericTouches = new g("GenericTouches", 4);
        $VALUES = (new g[] {
            Taps, HorizontalPans, VerticalPans, UnconstrainedPans, GenericTouches
        });
    }
}
