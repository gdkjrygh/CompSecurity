// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            fj, fk, fl, fm, 
//            fn, fo, ov, nl

public abstract class fi extends Enum
{

    public static final fi a;
    public static final fi b;
    public static final fi c;
    public static final fi d;
    public static final fi e;
    public static final fi f;
    private static final fi g[];

    private fi(String s, int i)
    {
        super(s, i);
    }

    fi(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static fi valueOf(String s)
    {
        return (fi)Enum.valueOf(b/a/fi, s);
    }

    public static fi[] values()
    {
        return (fi[])g.clone();
    }

    public abstract nl a(ov ov);

    static 
    {
        a = new fj("LT");
        b = new fk("LE");
        c = new fl("EQ");
        d = new fm("GE");
        e = new fn("GT");
        f = new fo("NE");
        g = (new fi[] {
            a, b, c, d, e, f
        });
    }
}
