// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hdd
{

    private static long a[] = new long[0];
    private static Long b[] = new Long[0];
    private static int c[] = new int[0];
    private static Integer d[] = new Integer[0];
    private static double e[] = new double[0];
    private static Double f[] = new Double[0];
    private static float g[] = new float[0];
    private static Float h[] = new Float[0];
    private static boolean i[] = new boolean[0];
    private static Boolean j[] = new Boolean[0];

    public static double[] a(Double adouble[])
    {
        if (adouble == null)
        {
            return null;
        }
        if (adouble.length == 0)
        {
            return e;
        }
        double ad[] = new double[adouble.length];
        for (int k = 0; k < adouble.length; k++)
        {
            ad[k] = adouble[k].doubleValue();
        }

        return ad;
    }

    public static float[] a(Float afloat[])
    {
        if (afloat == null)
        {
            return null;
        }
        if (afloat.length == 0)
        {
            return g;
        }
        float af[] = new float[afloat.length];
        for (int k = 0; k < afloat.length; k++)
        {
            af[k] = afloat[k].floatValue();
        }

        return af;
    }

    public static int[] a(Integer ainteger[])
    {
        if (ainteger == null)
        {
            return null;
        }
        if (ainteger.length == 0)
        {
            return c;
        }
        int ai[] = new int[ainteger.length];
        for (int k = 0; k < ainteger.length; k++)
        {
            ai[k] = ainteger[k].intValue();
        }

        return ai;
    }

    public static long[] a(Long along[])
    {
        if (along == null)
        {
            return null;
        }
        if (along.length == 0)
        {
            return a;
        }
        long al[] = new long[along.length];
        for (int k = 0; k < along.length; k++)
        {
            al[k] = along[k].longValue();
        }

        return al;
    }

    public static Boolean[] a(boolean aflag[])
    {
        if (aflag == null)
        {
            return null;
        }
        if (aflag.length == 0)
        {
            return j;
        }
        Boolean aboolean[] = new Boolean[aflag.length];
        int k = 0;
        while (k < aflag.length) 
        {
            Boolean boolean1;
            if (aflag[k])
            {
                boolean1 = Boolean.TRUE;
            } else
            {
                boolean1 = Boolean.FALSE;
            }
            aboolean[k] = boolean1;
            k++;
        }
        return aboolean;
    }

    public static Double[] a(double ad[])
    {
        if (ad == null)
        {
            return null;
        }
        if (ad.length == 0)
        {
            return f;
        }
        Double adouble[] = new Double[ad.length];
        for (int k = 0; k < ad.length; k++)
        {
            adouble[k] = Double.valueOf(ad[k]);
        }

        return adouble;
    }

    public static Float[] a(float af[])
    {
        if (af == null)
        {
            return null;
        }
        if (af.length == 0)
        {
            return h;
        }
        Float afloat[] = new Float[af.length];
        for (int k = 0; k < af.length; k++)
        {
            afloat[k] = Float.valueOf(af[k]);
        }

        return afloat;
    }

    public static Integer[] a(int ai[])
    {
        if (ai == null)
        {
            return null;
        }
        if (ai.length == 0)
        {
            return d;
        }
        Integer ainteger[] = new Integer[ai.length];
        for (int k = 0; k < ai.length; k++)
        {
            ainteger[k] = Integer.valueOf(ai[k]);
        }

        return ainteger;
    }

    public static Long[] a(long al[])
    {
        if (al == null)
        {
            return null;
        }
        if (al.length == 0)
        {
            return b;
        }
        Long along[] = new Long[al.length];
        for (int k = 0; k < al.length; k++)
        {
            along[k] = Long.valueOf(al[k]);
        }

        return along;
    }

    public static boolean[] a(Boolean aboolean[])
    {
        if (aboolean == null)
        {
            return null;
        }
        if (aboolean.length == 0)
        {
            return i;
        }
        boolean aflag[] = new boolean[aboolean.length];
        for (int k = 0; k < aboolean.length; k++)
        {
            aflag[k] = aboolean[k].booleanValue();
        }

        return aflag;
    }

}
