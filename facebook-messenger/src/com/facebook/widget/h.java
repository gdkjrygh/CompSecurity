// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


public final class h extends Enum
{

    private static final h $VALUES[];
    public static final h HORIZONTAL;
    public static final h VERTICAL;

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/widget/h, s);
    }

    public static h[] values()
    {
        return (h[])$VALUES.clone();
    }

    static 
    {
        HORIZONTAL = new h("HORIZONTAL", 0);
        VERTICAL = new h("VERTICAL", 1);
        $VALUES = (new h[] {
            HORIZONTAL, VERTICAL
        });
    }
}
