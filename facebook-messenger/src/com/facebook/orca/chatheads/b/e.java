// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads.b;


public final class e extends Enum
{

    private static final e $VALUES[];
    public static final e BOTTOM;
    public static final e LEFT;
    public static final e RIGHT;

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/orca/chatheads/b/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    static 
    {
        RIGHT = new e("RIGHT", 0);
        LEFT = new e("LEFT", 1);
        BOTTOM = new e("BOTTOM", 2);
        $VALUES = (new e[] {
            RIGHT, LEFT, BOTTOM
        });
    }
}
