// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class emu
{

    private static final double a = Math.log(2D);

    private static double a(double d)
    {
        return ((0.017453292519943295D * d) / 3.1415926535897931D + 1.0D) * 0.5D * 256D;
    }

    public static int a(emt emt1, int i, int j)
    {
        double d2 = a(emt1.a.b);
        double d1 = a(emt1.b.b);
        double d = d1;
        if (d2 > d1)
        {
            d = d1 + 256D;
        }
        d = Math.log((double)i / (d - d2)) / a;
        d1 = Math.abs(b(emt1.b.a) - b(emt1.a.a));
        return (int)Math.floor(Math.min(d, Math.log((double)j / d1) / a) + 0.01D);
    }

    private static double b(double d)
    {
        d = Math.sin(Math.min(1.48442222974533D, Math.max(-1.48442222974533D, 0.017453292519943295D * d)));
        return ((Math.log((d + 1.0D) / (1.0D - d)) * 0.5D) / 3.1415926535897931D + 1.0D) * 0.5D * 256D;
    }

}
