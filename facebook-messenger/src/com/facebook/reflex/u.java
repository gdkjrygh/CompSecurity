// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


public final class u extends Enum
{

    private static final u $VALUES[];
    public static final u Opaque;
    public static final u PartiallyTransparent;
    public static final u Unknown;

    private u(String s, int i)
    {
        super(s, i);
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/facebook/reflex/u, s);
    }

    public static u[] values()
    {
        return (u[])$VALUES.clone();
    }

    static 
    {
        Opaque = new u("Opaque", 0);
        PartiallyTransparent = new u("PartiallyTransparent", 1);
        Unknown = new u("Unknown", 2);
        $VALUES = (new u[] {
            Opaque, PartiallyTransparent, Unknown
        });
    }
}
