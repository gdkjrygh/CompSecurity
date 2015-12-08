// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class o extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    private static final o f[];

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(p/bh/o, s);
    }

    public static o[] values()
    {
        return (o[])f.clone();
    }

    static 
    {
        a = new o("ICON_ONLY", 0);
        b = new o("ICON_WITH_SEARCH", 1);
        c = new o("LIST_ONLY", 2);
        d = new o("LIST_WITH_SEARCH", 3);
        e = new o("KEYBOARD", 4);
        f = (new o[] {
            a, b, c, d, e
        });
    }
}
