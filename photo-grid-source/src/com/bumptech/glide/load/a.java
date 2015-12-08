// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    private static final a e[];

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/bumptech/glide/load/a, s);
    }

    public static a[] values()
    {
        return (a[])e.clone();
    }

    static 
    {
        a = new a("ALWAYS_ARGB_8888", 0);
        b = new a("PREFER_ARGB_8888", 1);
        c = new a("PREFER_RGB_565", 2);
        e = (new a[] {
            a, b, c
        });
        d = c;
    }
}
