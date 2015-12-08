// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fsg extends Enum
{

    public static final fsg a;
    public static final fsg b;
    public static final fsg c;
    public static final fsg d;
    public static final fsg e;
    public static final fsg f;
    private static fsg h;
    private static fsg i;
    private static final fsg j[];
    final int g;

    private fsg(String s, int k, int l)
    {
        super(s, k);
        g = l;
    }

    public static fsg valueOf(String s)
    {
        return (fsg)Enum.valueOf(fsg, s);
    }

    public static fsg[] values()
    {
        return (fsg[])j.clone();
    }

    static 
    {
        a = new fsg("MATRIX", 0, 0);
        b = new fsg("FIT_XY", 1, 1);
        h = new fsg("FIT_START", 2, 2);
        c = new fsg("FIT_CENTER", 3, 3);
        i = new fsg("FIT_END", 4, 4);
        d = new fsg("CENTER", 5, 5);
        e = new fsg("CENTER_CROP", 6, 6);
        f = new fsg("CENTER_INSIDE", 7, 7);
        j = (new fsg[] {
            a, b, h, c, i, d, e, f
        });
    }
}
