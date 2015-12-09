// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.au;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    private static final a c[];

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(p/au/a, s);
    }

    public static a[] values()
    {
        return (a[])c.clone();
    }

    public String toString()
    {
        return super.toString().toLowerCase();
    }

    static 
    {
        a = new a("VIEW", 0);
        b = new a("HIDDEN", 1);
        c = (new a[] {
            a, b
        });
    }
}
