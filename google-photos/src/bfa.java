// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bfa extends Enum
{

    public static final bfa a;
    public static final bfa b;
    public static final bfa c;
    public static final bfa d;
    public static final bfa e;
    private static final bfa g[];
    final int f;

    private bfa(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static bfa valueOf(String s)
    {
        return (bfa)Enum.valueOf(bfa, s);
    }

    public static bfa[] values()
    {
        return (bfa[])g.clone();
    }

    static 
    {
        a = new bfa("NONE", 0, 0);
        b = new bfa("DRAG", 1, 1);
        c = new bfa("ZOOM", 2, 2);
        d = new bfa("LONG_PRESS", 3, 3);
        e = new bfa("SINGLE_TAP", 4, 4);
        g = (new bfa[] {
            a, b, c, d, e
        });
    }
}
