// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c BOTTOM_OR_RIGHT;
    public static final c CENTER;
    public static final c DEFAULT;
    public static final c TOP_OR_LEFT;

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/ui/images/d/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new c("DEFAULT", 0);
        CENTER = new c("CENTER", 1);
        TOP_OR_LEFT = new c("TOP_OR_LEFT", 2);
        BOTTOM_OR_RIGHT = new c("BOTTOM_OR_RIGHT", 3);
        $VALUES = (new c[] {
            DEFAULT, CENTER, TOP_OR_LEFT, BOTTOM_OR_RIGHT
        });
    }
}
