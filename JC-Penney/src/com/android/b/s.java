// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;


public final class s extends Enum
{

    public static final s a;
    public static final s b;
    public static final s c;
    public static final s d;
    private static final s e[];

    private s(String s1, int i)
    {
        super(s1, i);
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(com/android/b/s, s1);
    }

    public static s[] values()
    {
        return (s[])e.clone();
    }

    static 
    {
        a = new s("LOW", 0);
        b = new s("NORMAL", 1);
        c = new s("HIGH", 2);
        d = new s("IMMEDIATE", 3);
        e = (new s[] {
            a, b, c, d
        });
    }
}
