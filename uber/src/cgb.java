// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cgb extends Enum
{

    public static final cgb a;
    public static final cgb b;
    public static final cgb c;
    private static final cgb g[];
    final int d;
    final int e;
    final int f;

    private cgb(String s, int i, int j, int k, int l)
    {
        super(s, i);
        d = j;
        e = k;
        f = l;
    }

    public static cgb valueOf(String s)
    {
        return (cgb)Enum.valueOf(cgb, s);
    }

    public static cgb[] values()
    {
        return (cgb[])g.clone();
    }

    static 
    {
        a = new cgb("MICRO", 0, 3, 96, 96);
        b = new cgb("MINI", 1, 1, 512, 384);
        c = new cgb("FULL", 2, 2, -1, -1);
        g = (new cgb[] {
            a, b, c
        });
    }
}
