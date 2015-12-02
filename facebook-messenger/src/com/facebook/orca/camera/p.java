// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;


public final class p extends Enum
{

    private static final p $VALUES[];
    public static final p ALL;
    public static final p EXTERNAL;
    public static final p INTERNAL;
    public static final p NONE;

    private p(String s, int i)
    {
        super(s, i);
    }

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(com/facebook/orca/camera/p, s);
    }

    public static p[] values()
    {
        return (p[])$VALUES.clone();
    }

    static 
    {
        NONE = new p("NONE", 0);
        INTERNAL = new p("INTERNAL", 1);
        EXTERNAL = new p("EXTERNAL", 2);
        ALL = new p("ALL", 3);
        $VALUES = (new p[] {
            NONE, INTERNAL, EXTERNAL, ALL
        });
    }
}
