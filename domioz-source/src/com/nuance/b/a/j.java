// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class j extends Enum
{

    public static final j a;
    private static final j b[];

    private j(String s)
    {
        super(s, 0);
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/nuance/b/a/j, s);
    }

    public static j[] values()
    {
        return (j[])b.clone();
    }

    static 
    {
        a = new j("GENERIC");
        b = (new j[] {
            a
        });
    }
}
