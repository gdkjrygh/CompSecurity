// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.b;

import com.fitbit.weight.Weight;

public class b
{

    public static double a = 1000D;
    public static double b = 453.59237000000002D;
    public static double c = 6350.2931799999997D;

    public b()
    {
    }

    public static Weight a(Weight weight, com.fitbit.data.domain.WeightLogEntry.WeightUnits weightunits)
    {
        double d = 1.0D;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.WeightLogEntry.WeightUnits.values().length];
                try
                {
                    a[com.fitbit.data.domain.WeightLogEntry.WeightUnits.GRAMS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.WeightLogEntry.WeightUnits.LBS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.WeightLogEntry.WeightUnits.STONE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((com.fitbit.data.domain.WeightLogEntry.WeightUnits)weight.a()).ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 67
    //                   2 140
    //                   3 212
    //                   4 284;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Weight weight1 = new Weight(d * weight.b(), weightunits);
_L7:
        return weight1;
_L2:
        weight1 = weight;
        switch (_cls1.a[weightunits.ordinal()])
        {
        default:
            d = 1.0D;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            d = 1.0D / a;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            d = 1.0D / b;
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            d = 1.0D / c;
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            break;
        }
        if (true) goto _L7; else goto _L6
_L6:
_L3:
        weight1 = weight;
        switch (_cls1.a[weightunits.ordinal()])
        {
        default:
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            d = a;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            d = a / b;
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            d = a / c;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
_L4:
        weight1 = weight;
        switch (_cls1.a[weightunits.ordinal()])
        {
        default:
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            d = b;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            d = b / a;
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            d = b / c;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        if (true) goto _L7; else goto _L9
_L9:
_L5:
        weight1 = weight;
        switch (_cls1.a[weightunits.ordinal()])
        {
        default:
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            d = c;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            d = c / a;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            d = c / b;
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            break;
        }
        if (true) goto _L7; else goto _L10
_L10:
        if (true) goto _L1; else goto _L11
_L11:
    }

}
