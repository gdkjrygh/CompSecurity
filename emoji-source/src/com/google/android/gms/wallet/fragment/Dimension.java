// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.util.DisplayMetrics;
import android.util.TypedValue;

public class Dimension
{

    public static final int MATCH_PARENT = -1;
    public static final int UNIT_DIP = 1;
    public static final int UNIT_IN = 4;
    public static final int UNIT_MM = 5;
    public static final int UNIT_PT = 3;
    public static final int UNIT_PX = 0;
    public static final int UNIT_SP = 2;
    public static final int WRAP_CONTENT = -2;

    private Dimension()
    {
    }

    public static int a(long l1, DisplayMetrics displaymetrics)
    {
        int i;
        int j;
        i = (int)(l1 >>> 32);
        j = (int)l1;
        i;
        JVM INSTR lookupswitch 8: default 84
    //                   0: 121
    //                   1: 137
    //                   2: 142
    //                   3: 147
    //                   4: 152
    //                   5: 157
    //                   128: 114
    //                   129: 111;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new IllegalStateException((new StringBuilder()).append("Unexpected unit or type: ").append(i).toString());
_L9:
        return j;
_L8:
        return TypedValue.complexToDimensionPixelSize(j, displaymetrics);
_L2:
        i = 0;
_L11:
        return Math.round(TypedValue.applyDimension(i, Float.intBitsToFloat(j), displaymetrics));
_L3:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 4;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 5;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static long a(int i, float f)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized unit: ").append(i).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return l(i, Float.floatToIntBits(f));
        }
    }

    public static long a(TypedValue typedvalue)
    {
        switch (typedvalue.type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected dimension type: ").append(typedvalue.type).toString());

        case 16: // '\020'
            return dM(typedvalue.data);

        case 5: // '\005'
            return l(128, typedvalue.data);
        }
    }

    public static long dM(int i)
    {
        if (i < 0)
        {
            if (i == -1 || i == -2)
            {
                return l(129, i);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected dimension value: ").append(i).toString());
            }
        } else
        {
            return a(0, i);
        }
    }

    private static long l(int i, int j)
    {
        return (long)i << 32 | (long)j & 0xffffffffL;
    }
}
