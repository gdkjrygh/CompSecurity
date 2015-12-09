// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.c;


public final class a
{

    public static final Long a = new Long(0L);
    public static final Long b = new Long(1L);
    public static final Long c = new Long(-1L);
    public static final Integer d = new Integer(0);
    public static final Integer e = new Integer(1);
    public static final Integer f = new Integer(-1);
    public static final Short g = new Short((short)0);
    public static final Short h = new Short((short)1);
    public static final Short i = new Short((short)-1);
    public static final Byte j = new Byte((byte)0);
    public static final Byte k = new Byte((byte)1);
    public static final Byte l = new Byte((byte)-1);
    public static final Double m = new Double(0.0D);
    public static final Double n = new Double(1.0D);
    public static final Double o = new Double(-1D);
    public static final Float p = new Float(0.0F);
    public static final Float q = new Float(1.0F);
    public static final Float r = new Float(-1F);

    public static int a(String s)
    {
        return c(s);
    }

    public static double b(String s)
    {
        return d(s);
    }

    private static int c(String s)
    {
        if (s == null)
        {
            return 0;
        }
        int i1;
        try
        {
            i1 = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return i1;
    }

    private static double d(String s)
    {
        if (s == null)
        {
            return 0.0D;
        }
        double d1;
        try
        {
            d1 = Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0.0D;
        }
        return d1;
    }

}
