// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adG extends Enum
    implements aeX
{

    public static final adG a;
    public static final adG b;
    public static final adG c;
    private static adG d;
    private static final adG f[];
    private final String e;

    private adG(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static adG valueOf(String s)
    {
        return (adG)Enum.valueOf(adG, s);
    }

    public static adG[] values()
    {
        return (adG[])f.clone();
    }

    public final String ag_()
    {
        return e;
    }

    static 
    {
        a = new adG("RUNTIME", 0, "runtime");
        b = new adG("BUILD", 1, "build");
        c = new adG("SYSTEM", 2, "system");
        d = new adG("EMBEDDED", 3, "embedded");
        f = (new adG[] {
            a, b, c, d
        });
    }
}
