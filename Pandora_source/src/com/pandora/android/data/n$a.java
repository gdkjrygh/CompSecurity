// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import com.pandora.android.util.p;

// Referenced classes of package com.pandora.android.data:
//            n

public static final class j extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i k[];
    p j;

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/pandora/android/data/n$a, s);
    }

    public static j[] values()
    {
        return (j[])k.clone();
    }

    public p a()
    {
        return j;
    }

    static 
    {
        a = new <init>("findPeople", 0, p.k);
        b = new <init>("pandoraONe", 1, p.s);
        c = new <init>("privacySettings", 2, p.t);
        d = new <init>("accountSettings", 3, p.u);
        e = new <init>("communicationsSettings", 4, p.v);
        f = new <init>("advancedSettings", 5, p.w);
        g = new <init>("devicesSettings", 6, p.z);
        h = new <init>("emptyFindPeople", 7, null);
        i = new <init>("fbConnect", 8, null);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int l, p p1)
    {
        super(s, l);
        j = p1;
    }
}
