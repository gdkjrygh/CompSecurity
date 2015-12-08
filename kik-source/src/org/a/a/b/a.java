// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b;


public final class a
{

    public static final Object a[] = new Object[0];
    public static final Class b[] = new Class[0];
    public static final String c[] = new String[0];
    public static final long d[] = new long[0];
    public static final Long e[] = new Long[0];
    public static final int f[] = new int[0];
    public static final Integer g[] = new Integer[0];
    public static final short h[] = new short[0];
    public static final Short i[] = new Short[0];
    public static final byte j[] = new byte[0];
    public static final Byte k[] = new Byte[0];
    public static final double l[] = new double[0];
    public static final Double m[] = new Double[0];
    public static final float n[] = new float[0];
    public static final Float o[] = new Float[0];
    public static final boolean p[] = new boolean[0];
    public static final Boolean q[] = new Boolean[0];
    public static final char r[] = new char[0];
    public static final Character s[] = new Character[0];

    public static boolean a(char ac[])
    {
        return ac == null || ac.length == 0;
    }

    public static Object[] a(Object aobj[])
    {
        if (aobj == null)
        {
            return null;
        } else
        {
            return (Object[])((Object []) (aobj)).clone();
        }
    }

    public static void b(Object aobj[])
    {
        if (aobj != null)
        {
            int i1 = 0;
            int j1 = aobj.length - 1;
            while (j1 > i1) 
            {
                Object obj = aobj[j1];
                aobj[j1] = aobj[i1];
                aobj[i1] = obj;
                j1--;
                i1++;
            }
        }
    }

}
