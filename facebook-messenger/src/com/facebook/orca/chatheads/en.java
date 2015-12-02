// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;


public final class en extends Enum
{

    private static final en $VALUES[];
    public static final en DOWN;
    public static final en UP;

    private en(String s, int i)
    {
        super(s, i);
    }

    public static en valueOf(String s)
    {
        return (en)Enum.valueOf(com/facebook/orca/chatheads/en, s);
    }

    public static en[] values()
    {
        return (en[])$VALUES.clone();
    }

    static 
    {
        UP = new en("UP", 0);
        DOWN = new en("DOWN", 1);
        $VALUES = (new en[] {
            UP, DOWN
        });
    }
}
