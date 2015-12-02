// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.p;


public final class f extends Enum
{

    private static final f $VALUES[];
    public static final f SHORT;
    public static final f VERBOSE;

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/orca/p/f, s);
    }

    public static f[] values()
    {
        return (f[])$VALUES.clone();
    }

    static 
    {
        VERBOSE = new f("VERBOSE", 0);
        SHORT = new f("SHORT", 1);
        $VALUES = (new f[] {
            VERBOSE, SHORT
        });
    }
}
