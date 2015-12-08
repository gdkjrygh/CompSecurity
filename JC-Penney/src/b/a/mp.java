// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            pq

public final class mp extends Enum
    implements pq
{

    public static final mp a;
    public static final mp b;
    public static final mp c;
    public static final mp d;
    private static final mp f[];
    private final String e;

    private mp(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static mp valueOf(String s)
    {
        return (mp)Enum.valueOf(b/a/mp, s);
    }

    public static mp[] values()
    {
        return (mp[])f.clone();
    }

    public final String h_()
    {
        return e;
    }

    static 
    {
        a = new mp("RUNTIME", 0, "runtime");
        b = new mp("BUILD", 1, "build");
        c = new mp("SYSTEM", 2, "system");
        d = new mp("EMBEDDED", 3, "embedded");
        f = (new mp[] {
            a, b, c, d
        });
    }
}
