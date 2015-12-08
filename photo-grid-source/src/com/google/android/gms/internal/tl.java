// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class tl extends Enum
{

    public static final tl a;
    public static final tl b;
    public static final tl c;
    public static final tl d;
    private static final tl e[];

    private tl(String s, int i)
    {
        super(s, i);
    }

    public static tl valueOf(String s)
    {
        return (tl)Enum.valueOf(com/google/android/gms/internal/tl, s);
    }

    public static tl[] values()
    {
        return (tl[])e.clone();
    }

    static 
    {
        a = new tl("LOW", 0);
        b = new tl("NORMAL", 1);
        c = new tl("HIGH", 2);
        d = new tl("IMMEDIATE", 3);
        e = (new tl[] {
            a, b, c, d
        });
    }
}
