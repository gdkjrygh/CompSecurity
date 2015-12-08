// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class efx extends Enum
{

    public static final efx a;
    public static final efx b;
    public static final efx c;
    public static final efx d;
    public static final efx e;
    private static final efx f[];

    private efx(String s, int i)
    {
        super(s, i);
    }

    public static efx valueOf(String s)
    {
        return (efx)Enum.valueOf(efx, s);
    }

    public static efx[] values()
    {
        return (efx[])f.clone();
    }

    static 
    {
        a = new efx("UNKNOWN", 0);
        b = new efx("QUEUED", 1);
        c = new efx("IN_PROGRESS", 2);
        d = new efx("UPLOADED", 3);
        e = new efx("FAILED", 4);
        f = (new efx[] {
            a, b, c, d, e
        });
    }
}
