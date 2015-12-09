// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    private static final e c[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e a(String s)
    {
        return valueOf(s);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(p/bh/e, s);
    }

    public static e[] values()
    {
        return (e[])c.clone();
    }

    static 
    {
        a = new e("LONG", 0);
        b = new e("SHORT", 1);
        c = (new e[] {
            a, b
        });
    }
}
