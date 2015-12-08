// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hps extends Enum
{

    public static final hps a;
    public static final hps b;
    public static final hps c;
    private static final hps d[];

    private hps(String s, int i)
    {
        super(s, i);
    }

    public static hps valueOf(String s)
    {
        return (hps)Enum.valueOf(hps, s);
    }

    public static hps[] values()
    {
        return (hps[])d.clone();
    }

    static 
    {
        a = new hps("CONNECTION_ERROR", 0);
        b = new hps("FATAL_ERROR", 1);
        c = new hps("TRANSIENT_ERROR", 2);
        d = (new hps[] {
            a, b, c
        });
    }
}
