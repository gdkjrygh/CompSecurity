// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.n;

import com.google.android.m4b.maps.y.j;
import java.math.BigInteger;

public final class b
{

    private static final long a[];
    private static final int b[];
    private static final int c[];

    private static int a(long l, long l1)
    {
        l ^= 0x8000000000000000L;
        l1 = 0x8000000000000000L ^ l1;
        if (l < l1)
        {
            return -1;
        }
        return l <= l1 ? 0 : 1;
    }

    public static long a(String s)
    {
        int i;
        int k;
        long l1;
        j.a(s);
        if (s.length() == 0)
        {
            throw new NumberFormatException("empty string");
        }
        k = c[10];
        l1 = 0L;
        i = 0;
_L10:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        int l;
        l = Character.digit(s.charAt(i), 10);
        if (l == -1)
        {
            throw new NumberFormatException(s);
        }
        if (i <= k - 1) goto _L4; else goto _L3
_L3:
        if (l1 < 0L) goto _L6; else goto _L5
_L5:
        if (l1 >= a[10]) goto _L8; else goto _L7
_L7:
        boolean flag = false;
_L9:
        if (flag)
        {
            throw new NumberFormatException((new StringBuilder("Too large for unsigned long: ")).append(s).toString());
        }
        break; /* Loop/switch isn't completed */
_L8:
        if (l1 <= a[10] && l <= b[10])
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        flag = true;
        if (true) goto _L9; else goto _L4
_L4:
        l1 = l1 * 10L + (long)l;
        i++;
          goto _L10
_L2:
        return l1;
    }

    static 
    {
        BigInteger biginteger;
        int i;
        a = new long[37];
        b = new int[37];
        c = new int[37];
        biginteger = new BigInteger("10000000000000000", 16);
        i = 2;
_L8:
        long l;
        long l3;
        if (i > 36)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        long al[] = a;
        l = i;
        if (l < 0L)
        {
            if (a(-1L, l) < 0)
            {
                l = 0L;
            } else
            {
                l = 1L;
            }
        } else
        if (-1L >= 0L)
        {
            l = -1L / l;
        } else
        {
            long l1 = 0x7fffffffffffffffL / l << 1;
            int k;
            if (a(-1L - l1 * l, l) >= 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            l = (long)k + l1;
        }
        al[i] = l;
        al = b;
        l3 = i;
        if (l3 >= 0L) goto _L2; else goto _L1
_L1:
        if (a(-1L, l3) >= 0) goto _L4; else goto _L3
_L3:
        l = -1L;
_L5:
        al[i] = (int)l;
        c[i] = biginteger.toString(i).length() - 1;
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        long l2;
        l2 = -1L;
        l = l3;
_L6:
        l = l2 - l;
          goto _L5
_L2:
label0:
        {
            if (-1L < 0L)
            {
                break label0;
            }
            l = -1L % l3;
        }
          goto _L5
        long l4 = -1L - (0x7fffffffffffffffL / l3 << 1) * l3;
        l = l3;
        l2 = l4;
        if (a(l4, l3) < 0)
        {
            l = 0L;
            l2 = l4;
        }
          goto _L6
        if (true) goto _L8; else goto _L7
_L7:
    }
}
