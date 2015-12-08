// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.m;

import com.google.android.m4b.maps.y.j;
import java.math.RoundingMode;

// Referenced classes of package com.google.android.m4b.maps.m:
//            d

public final class c
{

    private static byte a[] = {
        9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 
        6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 
        3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 
        0, 0, 0
    };
    private static int b[] = {
        1, 10, 100, 1000, 10000, 0x186a0, 0xf4240, 0x989680, 0x5f5e100, 0x3b9aca00
    };
    private static int c[] = {
        3, 31, 316, 3162, 31622, 0x4d343, 0x3040a5, 0x1e28678, 0x12d940b6, 0x7fffffff
    };
    private static final int d[] = {
        1, 1, 2, 6, 24, 120, 720, 5040, 40320, 0x58980, 
        0x375f00, 0x2611500, 0x1c8cfc00
    };
    private static int e[] = {
        0x7fffffff, 0x7fffffff, 0x10000, 2345, 477, 193, 110, 75, 58, 49, 
        43, 39, 37, 35, 34, 34, 33
    };

    public static int a(int i, int k, RoundingMode roundingmode)
    {
        boolean flag;
        boolean flag1;
        int l;
        int i1;
        int j1;
        boolean flag2;
        flag = true;
        flag2 = true;
        flag1 = false;
        j.a(roundingmode);
        if (k == 0)
        {
            throw new ArithmeticException("/ by zero");
        }
        l = i / k;
        j1 = i - k * l;
        if (j1 == 0)
        {
            return l;
        }
        i1 = (i ^ k) >> 31 | 1;
        i = ((flag) ? 1 : 0);
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
        JVM INSTR tableswitch 1 8: default 116
    //                   1 124
    //                   2 134
    //                   3 164
    //                   4 136
    //                   5 152
    //                   6 176
    //                   7 176
    //                   8 176;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        throw new AssertionError();
_L2:
        if (j1 != 0)
        {
            flag2 = false;
        }
        com.google.android.m4b.maps.m.d.a(flag2);
_L3:
        i = 0;
_L8:
        if (i != 0)
        {
            return l + i1;
        } else
        {
            return l;
        }
_L6:
        i = ((flag) ? 1 : 0);
        if (i1 <= 0)
        {
            i = 0;
        }
          goto _L8
_L4:
        i = ((flag) ? 1 : 0);
        if (i1 >= 0)
        {
            i = 0;
        }
          goto _L8
_L7:
        i = Math.abs(j1);
        k = i - (Math.abs(k) - i);
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        if (roundingmode == RoundingMode.HALF_UP) goto _L10; else goto _L9
_L9:
        if (roundingmode == RoundingMode.HALF_EVEN)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if ((l & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = ((flag1) ? 1 : 0);
        if ((flag & k) == 0) goto _L8; else goto _L10
_L10:
        i = 1;
          goto _L8
        i = ((flag) ? 1 : 0);
        if (k <= 0)
        {
            i = 0;
        }
          goto _L8
    }

    public static int a(int i, RoundingMode roundingmode)
    {
        boolean flag1 = true;
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("x").append(" (").append(i).append(") must be > 0").toString());
        }
        switch (_cls1.a[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((i - 1 & i) != 0)
            {
                flag1 = false;
            }
            com.google.android.m4b.maps.m.d.a(flag1 & flag);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return 31 - Integer.numberOfLeadingZeros(i);

        case 4: // '\004'
        case 5: // '\005'
            return 32 - Integer.numberOfLeadingZeros(i - 1);

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            int k = Integer.numberOfLeadingZeros(i);
            return (31 - k) + (~~((0xb504f333 >>> k) - i) >>> 31);
        }
    }

}
