// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gda extends Enum
{

    public static final gda a;
    public static final gda b;
    public static final gda c;
    public static final gda d;
    public static final gda e;
    private static final gda f[];

    private gda(String s, int i)
    {
        super(s, i);
    }

    public static gda valueOf(String s)
    {
        return (gda)Enum.valueOf(gda, s);
    }

    public static gda[] values()
    {
        return (gda[])f.clone();
    }

    static 
    {
        a = new gda("INITIAL_HIT_LIMIT", 0);
        b = new gda("INITIAL_COMPLETE", 1);
        c = new gda("DELTA_COMPLETE", 2);
        d = new gda("CANCELLED", 3);
        e = new gda("SKIPPED", 4);
        f = (new gda[] {
            a, b, c, d, e
        });
    }
}
