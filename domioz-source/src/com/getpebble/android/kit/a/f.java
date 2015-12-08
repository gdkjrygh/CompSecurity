// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit.a;


final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    private static final f f[];
    public final byte e;

    private f(String s, int i, int j)
    {
        super(s, i);
        e = (byte)j;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/getpebble/android/kit/a/f, s);
    }

    public static f[] values()
    {
        return (f[])f.clone();
    }

    static 
    {
        a = new f("BYTES", 0, 0);
        b = new f("STRING", 1, 1);
        c = new f("UINT", 2, 2);
        d = new f("INT", 3, 3);
        f = (new f[] {
            a, b, c, d
        });
    }
}
