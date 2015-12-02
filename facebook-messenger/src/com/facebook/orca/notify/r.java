// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;


final class r extends Enum
{

    private static final r $VALUES[];
    public static final r FADE_OUT;
    public static final r NONE;
    public static final r SLIDE_OUT;

    private r(String s, int i)
    {
        super(s, i);
    }

    public static r valueOf(String s)
    {
        return (r)Enum.valueOf(com/facebook/orca/notify/r, s);
    }

    public static r[] values()
    {
        return (r[])$VALUES.clone();
    }

    static 
    {
        NONE = new r("NONE", 0);
        SLIDE_OUT = new r("SLIDE_OUT", 1);
        FADE_OUT = new r("FADE_OUT", 2);
        $VALUES = (new r[] {
            NONE, SLIDE_OUT, FADE_OUT
        });
    }
}
