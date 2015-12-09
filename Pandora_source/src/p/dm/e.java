// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dm;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static final e f[];
    private int e;

    private e(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(p/dm/e, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    public int a()
    {
        return e;
    }

    public boolean a(e e1)
    {
        return a() >= e1.a();
    }

    static 
    {
        a = new e("Production", 0, 0);
        b = new e("Debug", 1, 1);
        c = new e("Test", 2, 2);
        d = new e("Verbose", 3, 3);
        f = (new e[] {
            a, b, c, d
        });
    }
}
