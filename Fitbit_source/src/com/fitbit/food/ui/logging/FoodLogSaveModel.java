// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import com.fitbit.data.domain.h;
import java.io.Serializable;

// Referenced classes of package com.fitbit.food.ui.logging:
//            d

public final class FoodLogSaveModel
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public double estimateCalories;
    public double servingSize;
    public String servingUnit;

    public FoodLogSaveModel()
    {
    }

    public void a(d d1)
    {
        servingSize = d1.a();
        servingUnit = d1.c().a();
        estimateCalories = d1.k();
    }
}
