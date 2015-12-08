// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hsb extends Enum
{

    public static final hsb a;
    public static final hsb b;
    public static final hsb c;
    private static final hsb h[];
    private final String d;
    private final int e;
    private final int f;
    private final int g;

    private hsb(String s, int i, String s1, int j, int k, int l)
    {
        super(s, i);
        d = s1;
        e = j;
        f = k;
        g = l;
    }

    static String a(hsb hsb1)
    {
        return hsb1.d;
    }

    public static int b(hsb hsb1)
    {
        return hsb1.e;
    }

    public static int c(hsb hsb1)
    {
        return hsb1.f;
    }

    public static int d(hsb hsb1)
    {
        return hsb1.g;
    }

    public static hsb valueOf(String s)
    {
        return (hsb)Enum.valueOf(hsb, s);
    }

    public static hsb[] values()
    {
        return (hsb[])h.clone();
    }

    static 
    {
        a = new hsb("VIDEOS", 0, "#Videos", b.xw, b.xp, b.xl);
        b = new hsb("CREATIONS", 1, "#AutoAwesome", b.xu, b.xn, b.xm);
        c = new hsb("GOOGLE_DRIVE", 2, "#GoogleDrive", b.xv, b.xo, b.xk);
        h = (new hsb[] {
            a, b, c
        });
    }
}
