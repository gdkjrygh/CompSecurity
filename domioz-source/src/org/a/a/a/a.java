// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;


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

    public static boolean a(Object aobj[], Object obj)
    {
        boolean flag;
        flag = false;
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L5:
        if (i1 >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (aobj[i1] != null) goto _L4; else goto _L3
_L3:
        if (i1 != -1)
        {
            flag = true;
        }
        return flag;
_L4:
        i1++;
          goto _L5
_L2:
        int j1;
        if (!((Object) (aobj)).getClass().getComponentType().isInstance(obj))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        j1 = 0;
_L7:
        if (j1 >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        i1 = j1;
        if (obj.equals(aobj[j1])) goto _L3; else goto _L6
_L6:
        j1++;
          goto _L7
        i1 = -1;
          goto _L3
    }

}
