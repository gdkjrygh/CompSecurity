// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.view.View;
import com.fitbit.util.bq;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity

class a
    implements android.view.tener
{

    final CustomFoodActivity a;

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            bq.a(a, a.e);
        }
    }

    (CustomFoodActivity customfoodactivity)
    {
        a = customfoodactivity;
        super();
    }
}
