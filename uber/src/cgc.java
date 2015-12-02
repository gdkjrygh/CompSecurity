// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cgc extends Enum
{

    public static final cgc a;
    public static final cgc b;
    private static final cgc d[];
    final int c;

    private cgc(String s, int i, int j)
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

    public static cgc valueOf(String s)
    {
        return (cgc)Enum.valueOf(cgc, s);
    }

    public static cgc[] values()
    {
        return (cgc[])d.clone();
    }

    static 
    {
        a = new cgc("NO_CACHE", 0, 1);
        b = new cgc("NO_STORE", 1, 2);
        d = (new cgc[] {
            a, b
        });
    }
}
