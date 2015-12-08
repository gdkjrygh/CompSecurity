// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nqx extends Enum
{

    public static final nqx a;
    public static final nqx b;
    public static final nqx c;
    private static nqx d;
    private static final nqx e[];

    private nqx(String s, int i, int j)
    {
        super(s, i);
    }

    public static nqx valueOf(String s)
    {
        return (nqx)Enum.valueOf(nqx, s);
    }

    public static nqx[] values()
    {
        return (nqx[])e.clone();
    }

    static 
    {
        d = new nqx("UNKNOWN", 0, 0);
        a = new nqx("POLL", 1, 1);
        b = new nqx("REAL_TIME", 2, 2);
        c = new nqx("USER_INITIATED", 3, 3);
        e = (new nqx[] {
            d, a, b, c
        });
        ntn.a(nqx);
    }
}
