// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class csc
{

    public static final float a[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
    };
    private static final float b[] = {
        -1F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F
    };
    private static final float c[] = {
        0.0F, 1.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F
    };
    private static final float d[] = {
        0.0F, -1F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F
    };
    private static final float e[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F
    };

    public static float a(int i, int j, int k)
    {
        b.a(i, "rotationDegress", null);
        boolean flag;
        if (i % 90 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "rotationDegrees must be a multiple of 90.");
        if (i % 180 == 90)
        {
            return (float)k / (float)j;
        } else
        {
            return (float)j / (float)k;
        }
    }

    public static int a(cnz cnz1)
    {
        if (c(cnz1))
        {
            return cnz1.b().d;
        } else
        {
            return cnz1.b().c;
        }
    }

    public static void a(float af[])
    {
        a(af, a);
    }

    private static void a(float af[], float af1[])
    {
        b.a(af.length, "destination.length", af1.length, null);
        System.arraycopy(af1, 0, af, 0, af1.length);
    }

    public static float[] a(int i)
    {
        if (i == 0 || i == -1)
        {
            return a;
        }
        if (i == 180)
        {
            return b;
        }
        if (i == 90)
        {
            return c;
        }
        if (i == 270)
        {
            return d;
        } else
        {
            throw b.a("rotationDegree must be either 0, 90, 180 or 270");
        }
    }

    public static float[] a(coi coi1)
    {
        return a(coi1.a);
    }

    public static int b(cnz cnz1)
    {
        if (c(cnz1))
        {
            return cnz1.b().c;
        } else
        {
            return cnz1.b().d;
        }
    }

    public static void b(float af[])
    {
        a(af, e);
    }

    private static boolean c(cnz cnz1)
    {
        return cnz1.b().a % 180 == 90;
    }

}
