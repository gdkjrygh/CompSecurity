// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;


final class k extends Enum
{

    private static final k $VALUES[];
    public static final k HIDDEN;
    public static final k VISIBLE;

    private k(String s, int i)
    {
        super(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/facebook/orca/threadlist/k, s);
    }

    public static k[] values()
    {
        return (k[])$VALUES.clone();
    }

    static 
    {
        VISIBLE = new k("VISIBLE", 0);
        HIDDEN = new k("HIDDEN", 1);
        $VALUES = (new k[] {
            VISIBLE, HIDDEN
        });
    }
}
