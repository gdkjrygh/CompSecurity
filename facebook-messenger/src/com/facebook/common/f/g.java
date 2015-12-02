// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.f;


public final class g extends Enum
{

    private static final g $VALUES[];
    public static final g EXTERNAL;
    public static final g INTERNAL;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/common/f/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        INTERNAL = new g("INTERNAL", 0);
        EXTERNAL = new g("EXTERNAL", 1);
        $VALUES = (new g[] {
            INTERNAL, EXTERNAL
        });
    }
}
