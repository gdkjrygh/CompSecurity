// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class abt extends Enum
{

    public static final abt a;
    private static abt b;
    private static abt c;
    private static abt d;
    private static abt e;
    private static abt f;
    private static final abt g[];

    private abt(String s, int i)
    {
        super(s, i);
    }

    abt(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static abt valueOf(String s)
    {
        return (abt)Enum.valueOf(abt, s);
    }

    public static abt[] values()
    {
        return (abt[])g.clone();
    }

    public abstract adW a(aeF aef);

    static 
    {
        b = new abt("LT") {

            final adW a(aeF aef)
            {
                return adY.c(aef);
            }

        };
        c = new abt("LE") {

            final adW a(aeF aef)
            {
                return adY.f(aef);
            }

        };
        a = new abt("EQ") {

            final adW a(aeF aef)
            {
                return adY.a(aef);
            }

        };
        d = new abt("GE") {

            final adW a(aeF aef)
            {
                return adY.d(aef);
            }

        };
        e = new abt("GT") {

            final adW a(aeF aef)
            {
                return adY.e(aef);
            }

        };
        f = new abt("NE") {

            final adW a(aeF aef)
            {
                return adY.b(aef);
            }

        };
        g = (new abt[] {
            b, c, a, d, e, f
        });
    }
}
