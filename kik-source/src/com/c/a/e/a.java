// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.e;

import com.c.a.a.u;
import java.math.RoundingMode;

public final class a
{

    static final byte a[] = {
        19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 
        16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 
        13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 
        10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 
        7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 
        4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 
        1, 0, 0, 0
    };
    static final long b[] = {
        1L, 10L, 100L, 1000L, 10000L, 0x186a0L, 0xf4240L, 0x989680L, 0x5f5e100L, 0x3b9aca00L, 
        0x2540be400L, 0x174876e800L, 0xe8d4a51000L, 0x9184e72a000L, 0x5af3107a4000L, 0x38d7ea4c68000L, 0x2386f26fc10000L, 0x16345785d8a0000L, 0xde0b6b3a7640000L
    };
    static final long c[] = {
        3L, 31L, 316L, 3162L, 31622L, 0x4d343L, 0x3040a5L, 0x1e28678L, 0x12d940b6L, 0xbc7c871cL, 
        0x75cdd4719L, 0x49a0a4c700L, 0x2e0466fc608L, 0x1cc2c05dbc53L, 0x11f9b83a95b45L, 0xb3c13249d90bbL, 0x7058bf6e27a751L, 0x463777a4d8c892dL, 0x2be2aac7077d5bc3L
    };
    static final long d[] = {
        1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 0x58980L, 
        0x375f00L, 0x2611500L, 0x1c8cfc00L, 0x17328cc00L, 0x144c3b2800L, 0x13077775800L, 0x130777758000L, 0x1437eeecd8000L, 0x16beecca730000L, 0x1b02b9306890000L, 
        0x21c3677c82b40000L
    };
    static final int e[] = {
        0x7fffffff, 0x7fffffff, 0x7fffffff, 0x3a25db, 0x1dc79, 16175, 4337, 1733, 887, 534, 
        361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 
        83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 
        66, 66, 66, 66
    };
    static final int f[] = {
        0x7fffffff, 0x7fffffff, 0x7fffffff, 0x285146, 0x150eb, 11724, 3218, 1313, 684, 419, 
        287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 
        73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 
        61
    };

    public static long a(long l, RoundingMode roundingmode)
    {
        int i;
        long l1;
        long l2;
        u.a(roundingmode);
        l1 = l / 64L;
        l2 = l - 64L * l1;
        if (l2 == 0L)
        {
            return l1;
        }
        i = (int)((64L ^ l) >> 63) | 1;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[RoundingMode.values().length];
                try
                {
                    a[RoundingMode.UNNECESSARY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[RoundingMode.DOWN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[RoundingMode.FLOOR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[RoundingMode.UP.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[RoundingMode.CEILING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[RoundingMode.HALF_DOWN.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[RoundingMode.HALF_UP.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[RoundingMode.HALF_EVEN.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[roundingmode.ordinal()];
        JVM INSTR tableswitch 1 8: default 100
    //                   1 108
    //                   2 136
    //                   3 169
    //                   4 149
    //                   5 154
    //                   6 184
    //                   7 184
    //                   8 184;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L7
_L7:
        break MISSING_BLOCK_LABEL_184;
_L1:
        throw new AssertionError();
_L2:
        boolean flag;
        if (l2 == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
_L3:
        boolean flag1 = false;
_L8:
        if (flag1)
        {
            return (long)i + l1;
        } else
        {
            return l1;
        }
_L5:
        flag1 = true;
          goto _L8
_L6:
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L8
_L4:
        if (i < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L8
        l = Math.abs(l2);
        l -= Math.abs(64L) - l;
        if (l == 0L)
        {
            boolean flag2;
            boolean flag3;
            if (roundingmode == RoundingMode.HALF_UP)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (roundingmode == RoundingMode.HALF_EVEN)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if ((1L & l1) != 0L)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            flag1 |= flag3 & flag2;
        } else
        if (l > 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L8
    }

}
