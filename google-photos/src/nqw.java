// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nqw extends Enum
{

    public static final nqw a;
    public static final nqw b;
    public static final nqw c;
    private static final nqw d[];

    private nqw(String s, int i, int j)
    {
        super(s, i);
    }

    public static nqw valueOf(String s)
    {
        return (nqw)Enum.valueOf(nqw, s);
    }

    public static nqw[] values()
    {
        return (nqw[])d.clone();
    }

    static 
    {
        a = new nqw("SUCCESS", 0, 0);
        b = new nqw("TRANSIENT_FAILURE", 1, 1);
        c = new nqw("PERMANENT_FAILURE", 2, 2);
        d = (new nqw[] {
            a, b, c
        });
    }
}
