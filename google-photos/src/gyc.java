// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gyc extends Enum
{

    public static final gyc a;
    public static final gyc b;
    public static final gyc c;
    public static final gyc d;
    private static final gyc h[];
    private final int e;
    private final int f;
    private final int g;

    private gyc(String s, int i, int j, int k, int l)
    {
        super(s, i);
        e = j;
        f = k;
        g = l;
    }

    public static int a(gyc gyc1)
    {
        return gyc1.f;
    }

    static int b(gyc gyc1)
    {
        return gyc1.g;
    }

    public static int c(gyc gyc1)
    {
        return gyc1.e;
    }

    public static gyc valueOf(String s)
    {
        return (gyc)Enum.valueOf(gyc, s);
    }

    public static gyc[] values()
    {
        return (gyc[])h.clone();
    }

    static 
    {
        a = new gyc("EDIT", 0, p.ad, p.aa, p.ab);
        b = new gyc("SHARE", 1, p.ai, p.ah, 0);
        c = new gyc("DETAILS", 2, p.Z, p.Y, 0);
        d = new gyc("TRASH", 3, p.af, p.aj, 0);
        h = (new gyc[] {
            a, b, c, d
        });
    }
}
