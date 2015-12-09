// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.widget.SeekBar;

// Referenced classes of package com.fitbit.food.ui.logging.views:
//            EstimateCaloriesView

class a
    implements android.widget.Listener
{

    final EstimateCaloriesView a;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            EstimateCaloriesView.a(a, (double)i / 100D + EstimateCaloriesView.b(a));
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (EstimateCaloriesView.a(a) != null)
        {
            EstimateCaloriesView.a(a).a(a);
        }
    }

    (EstimateCaloriesView estimatecaloriesview)
    {
        a = estimatecaloriesview;
        super();
    }
}
