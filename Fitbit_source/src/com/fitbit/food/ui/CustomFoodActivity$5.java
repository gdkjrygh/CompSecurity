// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.app.Activity;
import com.fitbit.data.bl.r;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity

class a extends com.fitbit.util.._cls5
{

    final CustomFoodActivity a;

    public void a(Activity activity)
    {
        r.a().b(CustomFoodActivity.c(a), activity);
    }

    public void b(Object obj)
    {
        a((Activity)obj);
    }

    (CustomFoodActivity customfoodactivity, Activity activity)
    {
        a = customfoodactivity;
        super(activity);
    }
}
