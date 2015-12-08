// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;

public final class Compound
{

    private static final TypedValue sTypedValue = new TypedValue();

    public static int floatLengthToCompound$133ade()
    {
        int i = Float.floatToIntBits(0.5F);
        if (isCompoundFloat(i))
        {
            return i;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Float length 0.5")).append(" out of range or NaN").toString());
        }
    }

    public static int getCompound(TypedArray typedarray, String s, int i, boolean flag)
    {
        int j = 0;
        TypedValue typedvalue = sTypedValue;
        if (!typedarray.getValue(i, typedvalue))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(typedarray.getPositionDescription()).append(": missing ").append(s).toString());
        }
        switch (typedvalue.type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append(typedarray.getPositionDescription()).append(": unaccepted value for ").append(s).append(": ").append(typedvalue.coerceToString()).toString());

        case 4: // '\004'
            float f = typedvalue.getFloat();
            if (flag && f < 0.0F)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(typedarray.getPositionDescription()).append(": negative float length not allowed for size attribute ").append(s).toString());
            }
            if (f == 0.0F)
            {
                i = j;
            } else
            {
                i = Float.floatToIntBits(typedvalue.getFloat());
            }
            if (isCompoundFloat(i))
            {
                return i;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append(typedarray.getPositionDescription()).append(": out-of-range float length for ").append(s).toString());
            }

        case 5: // '\005'
            float f1 = typedvalue.getDimension(typedarray.getResources().getDisplayMetrics());
            if (!flag || f1 >= 1.0F)
            {
                i = Math.round(f1);
            } else
            {
                if (f1 < 0.0F)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append(typedarray.getPositionDescription()).append(": negative dimen length not allowed for size attribute ").append(s).toString());
                }
                if (f1 == 0.0F)
                {
                    i = 0;
                } else
                {
                    i = 1;
                }
            }
            if (i < 0xff000000 || i > 0xffffff)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(typedarray.getPositionDescription()).append(": out-of-range dimension length for ").append(s).toString());
            } else
            {
                return i;
            }

        case 16: // '\020'
        case 17: // '\021'
            i = typedvalue.data;
            j = i & 0xff000000;
            break;
        }
        if (j == 0x7f000000 || flag && j == 0xff000000)
        {
            return i;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append(typedarray.getPositionDescription()).append(": invalid enum value ").append(i).append(" for ").append(s).toString());
        }
    }

    public static boolean isCompoundFloat(int i)
    {
        switch (0xff000000 & i)
        {
        default:
            return true;

        case -2147483648: 
        case -16777216: 
        case 0: // '\0'
        case 2130706432: 
            return false;
        }
    }

    public static boolean isCompoundInt(int i)
    {
        return true;
    }

}
