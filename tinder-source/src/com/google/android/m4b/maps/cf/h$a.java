// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;


// Referenced classes of package com.google.android.m4b.maps.cf:
//            h

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static e g;
    private static e h;
    private static final e i[];
    final int f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/google/android/m4b/maps/cf/h$a, s);
    }

    public static f[] values()
    {
        return (f[])i.clone();
    }

    static 
    {
        a = new <init>("PICK", 0, 0);
        b = new <init>("TEXTURE0", 1, 1);
        c = new <init>("TEXTURE1", 2, 2);
        d = new <init>("SHADER", 3, 3);
        g = new <init>("STENCIL", 4, 4);
        h = new <init>("POLYGON", 5, 5);
        e = new <init>("BLEND", 6, 6);
        i = (new i[] {
            a, b, c, d, g, h, e
        });
    }

    private (String s, int j, int k)
    {
        super(s, j);
        f = k;
    }
}
