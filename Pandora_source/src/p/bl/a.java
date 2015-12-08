// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bl;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    private static final a d[];

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(p/bl/a, s);
    }

    public static a[] values()
    {
        return (a[])d.clone();
    }

    static 
    {
        a = new a("OFF", 0);
        b = new a("TERSE", 1);
        c = new a("VERBOSE", 2);
        d = (new a[] {
            a, b, c
        });
    }
}
