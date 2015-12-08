// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class af extends Enum
{

    public static final af a;
    public static final af b;
    public static final af c;
    private static final af e[];
    private final String d;

    private af(String s, int i, String s1)
    {
        super(s, i);
        d = s1;
    }

    public static af valueOf(String s)
    {
        return (af)Enum.valueOf(com/nuance/b/a/af, s);
    }

    public static af[] values()
    {
        return (af[])e.clone();
    }

    public final String toString()
    {
        return d;
    }

    static 
    {
        a = new af("INLINE_ONLY", 0, "robustParsing");
        b = new af("CLOUD_ONLY", 1, "grammarImport");
        c = new af("INLINE_AND_CLOUD", 2, "grammarImport");
        e = (new af[] {
            a, b, c
        });
    }
}
