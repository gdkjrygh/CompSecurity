// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dc;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    private static final b d[];
    private String c;

    private b(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static b a(String s)
    {
        if (a.a().equalsIgnoreCase(s))
        {
            return a;
        } else
        {
            return b;
        }
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(p/dc/b, s);
    }

    public static b[] values()
    {
        return (b[])d.clone();
    }

    public String a()
    {
        return c;
    }

    public String toString()
    {
        return c;
    }

    static 
    {
        a = new b("MULTI_DAY_PASS", 0, "MULTI_DAY_PASS");
        b = new b("UNKNOWN", 1, null);
        d = (new b[] {
            a, b
        });
    }
}
