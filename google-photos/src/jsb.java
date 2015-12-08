// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsb extends Enum
{

    public static final jsb a;
    public static final jsb b;
    private static jsb c;
    private static jsb d;
    private static jsb e;
    private static jsb f;
    private static final jsb g[];

    private jsb(String s, int i)
    {
        super(s, i);
    }

    public static jsb a(String s)
    {
        if ("BATCH_BY_SESSION".equalsIgnoreCase(s))
        {
            return c;
        }
        if ("BATCH_BY_TIME".equalsIgnoreCase(s))
        {
            return d;
        }
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(s))
        {
            return e;
        }
        if ("BATCH_BY_COUNT".equalsIgnoreCase(s))
        {
            return b;
        }
        if ("BATCH_BY_SIZE".equalsIgnoreCase(s))
        {
            return f;
        } else
        {
            return a;
        }
    }

    public static jsb valueOf(String s)
    {
        return (jsb)Enum.valueOf(jsb, s);
    }

    public static jsb[] values()
    {
        return (jsb[])g.clone();
    }

    static 
    {
        a = new jsb("NONE", 0);
        c = new jsb("BATCH_BY_SESSION", 1);
        d = new jsb("BATCH_BY_TIME", 2);
        e = new jsb("BATCH_BY_BRUTE_FORCE", 3);
        b = new jsb("BATCH_BY_COUNT", 4);
        f = new jsb("BATCH_BY_SIZE", 5);
        g = (new jsb[] {
            a, c, d, e, b, f
        });
    }
}
