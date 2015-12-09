// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.b;

import com.fitbit.water.Water;

public class a
{

    public static final double a = 29.573529564111873D;
    public static final double b = 236.58823637296001D;

    public a()
    {
    }

    public static Water a(Water water, com.fitbit.data.domain.WaterLogEntry.WaterUnits waterunits)
    {
        double d = 1.0D;
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.WaterLogEntry.WaterUnits.values().length];
                try
                {
                    a[com.fitbit.data.domain.WaterLogEntry.WaterUnits.CUP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.WaterLogEntry.WaterUnits.OZ.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((com.fitbit.data.domain.WaterLogEntry.WaterUnits)water.a()).ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 63
    //                   2 119
    //                   3 173;
           goto _L1 _L2 _L3 _L4
_L1:
        Water water1 = new Water(d * water.b(), waterunits);
_L6:
        return water1;
_L2:
        water1 = water;
        switch (_cls1.a[waterunits.ordinal()])
        {
        default:
            d = 1.0D;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            d = 236.58823637296001D;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            d = 7.9999999952682357D;
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            break;
        }
        if (true) goto _L6; else goto _L5
_L5:
_L3:
        water1 = water;
        switch (_cls1.a[waterunits.ordinal()])
        {
        default:
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            d = 0.0042267528399999995D;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            d = 0.033814022700000002D;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
_L4:
        water1 = water;
        switch (_cls1.a[waterunits.ordinal()])
        {
        default:
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            d = 0.1250000000739338D;
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            d = 29.573529564111873D;
            continue; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        if (true) goto _L6; else goto _L8
_L8:
        if (true) goto _L1; else goto _L9
_L9:
    }
}
