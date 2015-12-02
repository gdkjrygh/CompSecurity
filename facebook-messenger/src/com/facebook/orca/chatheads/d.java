// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d CLOSE;
    public static final d NONE;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/orca/chatheads/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        NONE = new d("NONE", 0);
        CLOSE = new d("CLOSE", 1);
        $VALUES = (new d[] {
            NONE, CLOSE
        });
    }
}
