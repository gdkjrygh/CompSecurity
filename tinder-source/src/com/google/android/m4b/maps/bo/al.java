// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.cq.e;

public final class al
{

    public static long a(int i, int j, int k)
    {
        int j1 = k * 2;
        long l1 = 0L;
        boolean flag = false;
        int l = i;
        i = ((flag) ? 1 : 0);
        while (i < j1) 
        {
            int i1 = l & 1;
            int k1 = j & 1;
            if (i1 == 0 && k1 == 0)
            {
                l1 |= 0L << i;
            } else
            if (i1 == 0 && k1 == 1)
            {
                l1 |= 1L << i;
            } else
            if (i1 == 1 && k1 == 1)
            {
                l1 |= 2L << i;
            } else
            {
                l1 |= 3L << i;
            }
            l >>= 1;
            j >>= 1;
            i += 2;
        }
        if (l != 0 || j != 0 || j1 > 62)
        {
            throw new IllegalArgumentException(String.format("Invalid map tile proto X = %d, Y = %d, zoom = %d", new Object[] {
                Integer.valueOf(l), Integer.valueOf(j), Integer.valueOf(k)
            }));
        } else
        {
            return l1 | 1L << j1;
        }
    }

    public static a a(long l)
    {
        int k;
        int i1;
        int j1;
        int k1;
        long l1;
        k1 = 0;
        l1 = l;
        i1 = 1;
        k = 0;
        j1 = 0;
_L7:
        int i;
        int j;
        if (l1 <= 1L)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        i = j1;
        j = k1;
        (int)(3L & l1);
        JVM INSTR tableswitch 0 3: default 68
    //                   0 75
    //                   1 103
    //                   2 116
    //                   3 132;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_132;
_L3:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j = k1;
        i = j1;
_L8:
        l1 >>= 2;
        i1 <<= 1;
        k++;
        j1 = i;
        k1 = j;
        if (true) goto _L7; else goto _L6
_L6:
        i = j1 | i1;
        j = k1;
          goto _L8
_L4:
        j = k1 | i1;
        i = j1 | i1;
          goto _L8
        j = k1 | i1;
        i = j1;
          goto _L8
        if (l1 != 1L)
        {
            String s = String.valueOf(Long.toBinaryString(l));
            if (s.length() != 0)
            {
                s = "Invalid TUVW ".concat(s);
            } else
            {
                s = new String("Invalid TUVW ");
            }
            throw new IllegalArgumentException(s);
        } else
        {
            a a1 = new a(e.g);
            a1.a(2, k1);
            a1.a(3, j1);
            a1.a(4, k);
            return a1;
        }
    }
}
