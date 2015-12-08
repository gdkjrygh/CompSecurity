// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.widget.CompoundButton;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity

class a
    implements android.widget.kedChangeListener
{

    final CustomFoodActivity a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        CustomFoodActivity.a(a, flag);
        a.q.showMoreDetails = flag;
        CustomFoodActivity.a(a);
    }

    stomFoodModel(CustomFoodActivity customfoodactivity)
    {
        a = customfoodactivity;
        super();
    }
}
