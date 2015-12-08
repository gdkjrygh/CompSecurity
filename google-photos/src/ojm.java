// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ojm extends Enum
{

    public static final ojm a;
    public static final ojm b;
    public static final ojm c;
    public static final ojm d;
    private static final ojm h[];
    ojm e;
    ojm f;
    public final float g;

    private ojm(String s, int i, float f1)
    {
        super(s, i);
        g = f1;
    }

    public static ojm valueOf(String s)
    {
        return (ojm)Enum.valueOf(ojm, s);
    }

    public static ojm[] values()
    {
        return (ojm[])h.clone();
    }

    static 
    {
        a = new ojm("HIDDEN", 0, 0.0F);
        b = new ojm("COLLAPSED", 1, 25F);
        c = new ojm("EXPANDED", 2, 75F);
        d = new ojm("FULLY_EXPANDED", 3, 100F);
        h = (new ojm[] {
            a, b, c, d
        });
        a.e = a;
        a.f = a;
        b.e = b;
        b.f = c;
        c.e = b;
        c.f = d;
        d.e = c;
        d.f = d;
    }
}
