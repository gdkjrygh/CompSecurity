// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.as;

import java.util.Locale;

public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    private static final d g[];

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(p/as/d, s);
    }

    public static d[] values()
    {
        return (d[])g.clone();
    }

    public String toString()
    {
        if (this == f)
        {
            return "keep-alive";
        } else
        {
            return super.toString().toLowerCase(new Locale("en", "US"));
        }
    }

    static 
    {
        a = new d("START", 0);
        b = new d("VIEW", 1);
        c = new d("CLOSE", 2);
        d = new d("AGGREGATE", 3);
        e = new d("HIDDEN", 4);
        f = new d("KEEPALIVE", 5);
        g = (new d[] {
            a, b, c, d, e, f
        });
    }
}
