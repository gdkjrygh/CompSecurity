// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.data.domain.a;

// Referenced classes of package com.fitbit.util:
//            bh

public class at
{

    public at()
    {
    }

    public static double a(CharSequence charsequence)
    {
        if (com.fitbit.util.bh.a(charsequence))
        {
            return 0.0D;
        }
        double d;
        try
        {
            d = Double.parseDouble(charsequence.toString());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            return 0.0D;
        }
        return d;
    }

    public static long[] a(Long along[])
    {
        int j = 0;
        long al[] = new long[along.length];
        int k = along.length;
        for (int i = 0; j < k; i++)
        {
            al[i] = along[j].longValue();
            j++;
        }

        return al;
    }

    public static transient Integer[] a(a aa[])
    {
        int j = 0;
        Integer ainteger[] = new Integer[aa.length];
        int k = aa.length;
        for (int i = 0; j < k; i++)
        {
            ainteger[i] = Integer.valueOf(aa[j].getCode());
            j++;
        }

        return ainteger;
    }

    public static Long[] a(long al[])
    {
        int j = 0;
        Long along[] = new Long[al.length];
        int k = al.length;
        for (int i = 0; j < k; i++)
        {
            along[i] = Long.valueOf(al[j]);
            j++;
        }

        return along;
    }
}
