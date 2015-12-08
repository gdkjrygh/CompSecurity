// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Zb extends Enum
{

    private static Zb a;
    private static Zb b;
    private static final Zb d[];
    private int c;

    private Zb(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    static boolean a(int i)
    {
        return (a.c & i) == 0;
    }

    static boolean b(int i)
    {
        return (b.c & i) == 0;
    }

    public static Zb valueOf(String s)
    {
        return (Zb)Enum.valueOf(Zb, s);
    }

    public static Zb[] values()
    {
        return (Zb[])d.clone();
    }

    static 
    {
        a = new Zb("NO_CACHE", 0, 1);
        b = new Zb("NO_STORE", 1, 2);
        d = (new Zb[] {
            a, b
        });
    }
}
