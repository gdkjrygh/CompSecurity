// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;
    public static final f i;
    public static final f j;
    private static final f l[];
    final String k;

    private f(String s, int i1, String s1)
    {
        super(s, i1);
        k = s1;
    }

    public static f a(String s)
    {
        f af[] = values();
        int j1 = af.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f f1 = af[i1];
            if (f1.toString().equals(s))
            {
                return f1;
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("Unknown value ").append(s).toString());
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(p/bh/f, s);
    }

    public static f[] values()
    {
        return (f[])l.clone();
    }

    public String toString()
    {
        return k;
    }

    static 
    {
        a = new f("CID", 0, "CID");
        b = new f("TYPE2", 1, "TYPE2");
        c = new f("TYPE5", 2, "TYPE5");
        d = new f("NGN", 3, "NGN");
        e = new f("GEN2_8_DMA", 4, "GEN2_8_DMA");
        f = new f("GEN2_6_DMA", 5, "GEN2_6_DMA");
        g = new f("MFD3", 6, "MFD3");
        h = new f("MFD4", 7, "MFD4");
        i = new f("MFD5", 8, "MFD5");
        j = new f("GEN3_8_INCH", 9, "GEN3_8-INCH");
        l = (new f[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
