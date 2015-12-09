// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;


public final class j extends Enum
{

    public static final j a;
    public static final j b;
    private static final j c[];

    private j(String s, int i)
    {
        super(s, i);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/a/j, s);
    }

    public static j[] values()
    {
        return (j[])c.clone();
    }

    static 
    {
        a = new j("AUTO", 0);
        b = new j("EXPLICIT_ONLY", 1);
        c = (new j[] {
            a, b
        });
    }
}
