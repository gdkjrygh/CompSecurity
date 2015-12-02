// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.widgets;


final class i extends Enum
{

    private static final i $VALUES[];
    public static final i ANIMATE_IN;
    public static final i ANIMATE_OUT;
    public static final i HIDE;
    public static final i SHOW;
    public static final i WHATEVER;

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/orca/common/ui/widgets/i, s);
    }

    public static i[] values()
    {
        return (i[])$VALUES.clone();
    }

    static 
    {
        WHATEVER = new i("WHATEVER", 0);
        SHOW = new i("SHOW", 1);
        HIDE = new i("HIDE", 2);
        ANIMATE_IN = new i("ANIMATE_IN", 3);
        ANIMATE_OUT = new i("ANIMATE_OUT", 4);
        $VALUES = (new i[] {
            WHATEVER, SHOW, HIDE, ANIMATE_IN, ANIMATE_OUT
        });
    }
}
