// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bk

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e g[];
    private String f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/tremorvideo/sdk/android/videoad/bk$c, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    public boolean a()
    {
        return ordinal() == a.ordinal() || ordinal() == b.ordinal();
    }

    public boolean b()
    {
        return ordinal() == c.ordinal() || ordinal() == d.ordinal();
    }

    public String toString()
    {
        return f;
    }

    static 
    {
        a = new <init>("Top", 0, "top");
        b = new <init>("Bottom", 1, "bottom");
        c = new <init>("Left", 2, "left");
        d = new <init>("Right", 3, "right");
        e = new <init>("Absolute", 4, "absolute");
        g = (new g[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }
}
