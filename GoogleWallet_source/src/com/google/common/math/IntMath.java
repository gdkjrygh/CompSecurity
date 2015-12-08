// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.math;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;

// Referenced classes of package com.google.common.math:
//            MathPreconditions

public final class IntMath
{

    static int biggestBinomials[] = {
        0x7fffffff, 0x7fffffff, 0x10000, 2345, 477, 193, 110, 75, 58, 49, 
        43, 39, 37, 35, 34, 34, 33
    };
    private static final int factorials[] = {
        1, 1, 2, 6, 24, 120, 720, 5040, 40320, 0x58980, 
        0x375f00, 0x2611500, 0x1c8cfc00
    };
    static final int halfPowersOf10[] = {
        3, 31, 316, 3162, 31622, 0x4d343, 0x3040a5, 0x1e28678, 0x12d940b6, 0x7fffffff
    };
    static final byte maxLog10ForLeadingZeros[] = {
        9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 
        6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 
        3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 
        0, 0, 0
    };
    static final int powersOf10[] = {
        1, 10, 100, 1000, 10000, 0x186a0, 0xf4240, 0x989680, 0x5f5e100, 0x3b9aca00
    };

    public static int divide(int i, int j, RoundingMode roundingmode)
    {
        int k;
        int i1;
        boolean flag;
        flag = true;
        Preconditions.checkNotNull(roundingmode);
        if (j == 0)
        {
            throw new ArithmeticException("/ by zero");
        }
        k = i / j;
        i1 = i - j * k;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        int l = (i ^ j) >> 31 | 1;
        static final class _cls1
        {

            static final int $SwitchMap$java$math$RoundingMode[];

            static 
            {
                $SwitchMap$java$math$RoundingMode = new int[RoundingMode.values().length];
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.UNNECESSARY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()];
        JVM INSTR tableswitch 1 8: default 104
    //                   1 112
    //                   2 122
    //                   3 159
    //                   4 139
    //                   5 144
    //                   6 174
    //                   7 174
    //                   8 174;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L9 _L9
_L7:
        break; /* Loop/switch isn't completed */
_L3:
        throw new AssertionError();
_L4:
        if (i1 != 0)
        {
            flag = false;
        }
        MathPreconditions.checkRoundingUnnecessary(flag);
_L5:
        i = 0;
_L11:
        if (i != 0)
        {
            return k + l;
        }
        if (true) goto _L1; else goto _L10
_L10:
        i = 1;
          goto _L11
_L8:
        if (l > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L11
_L6:
        if (l < 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L11
_L9:
label0:
        {
            i = Math.abs(i1);
            i -= Math.abs(j) - i;
            if (i != 0)
            {
                break MISSING_BLOCK_LABEL_243;
            }
            if (roundingmode != RoundingMode.HALF_UP)
            {
                if (roundingmode == RoundingMode.HALF_EVEN)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if ((k & 1) != 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if ((j & i) == 0)
                {
                    break label0;
                }
            }
            i = 1;
        }
          goto _L11
        i = 0;
          goto _L11
        if (i > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L11
    }

    private static boolean isPowerOfTwo(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i - 1 & i) == 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        return i & flag;
    }

    private static int lessThanBranchFree(int i, int j)
    {
        return ~~(i - j) >>> 31;
    }

    public static int log2(int i, RoundingMode roundingmode)
    {
        MathPreconditions.checkPositive("x", i);
        int j;
        switch (_cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i));
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
            j = Integer.numberOfLeadingZeros(i);
            break;
        }
        return lessThanBranchFree(0xb504f333 >>> j, i) + (31 - j);
    }

    public static int sqrt(int i, RoundingMode roundingmode)
    {
        MathPreconditions.checkNonNegative("x", i);
        int j = sqrtFloor(i);
        switch (_cls1..SwitchMap.java.math.RoundingMode[roundingmode.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            boolean flag;
            if (j * j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            MathPreconditions.checkRoundingUnnecessary(flag);
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return j;

        case 4: // '\004'
        case 5: // '\005'
            return j + lessThanBranchFree(j * j, i);

        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return j + lessThanBranchFree(j * j + j, i);
        }
    }

    private static int sqrtFloor(int i)
    {
        return (int)Math.sqrt(i);
    }

}
