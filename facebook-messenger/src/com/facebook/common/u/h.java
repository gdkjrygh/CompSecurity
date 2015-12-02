// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.u;


final class h extends Enum
{

    private static final h $VALUES[];
    public static final h BOOLEAN;
    public static final h LONG;
    public static final h STRING;

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/common/u/h, s);
    }

    public static h[] values()
    {
        return (h[])$VALUES.clone();
    }

    static 
    {
        STRING = new h("STRING", 0);
        LONG = new h("LONG", 1);
        BOOLEAN = new h("BOOLEAN", 2);
        $VALUES = (new h[] {
            STRING, LONG, BOOLEAN
        });
    }
}
