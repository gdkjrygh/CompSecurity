// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class s extends Enum
{

    public static final s a;
    public static final s b;
    public static final s c;
    private static final s d[];

    private s(String s1, int i)
    {
        super(s1, i);
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(com/nuance/b/a/s, s1);
    }

    public static s[] values()
    {
        return (s[])d.clone();
    }

    static 
    {
        a = new s("STRING", 0);
        b = new s("BOOLEAN", 1);
        c = new s("DICTATION", 2);
        d = (new s[] {
            a, b, c
        });
    }
}
