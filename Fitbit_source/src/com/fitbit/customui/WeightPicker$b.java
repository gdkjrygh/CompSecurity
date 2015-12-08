// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import com.fitbit.weight.Weight;

// Referenced classes of package com.fitbit.customui:
//            WeightPicker

public class ry.WeightUnits extends r.b
{

    final WeightPicker a;

    public ry.WeightUnits(WeightPicker weightpicker)
    {
        a = weightpicker;
        super(weightpicker);
        a(new Weight(0.0D, weightpicker.a[0][0]));
    }
}
