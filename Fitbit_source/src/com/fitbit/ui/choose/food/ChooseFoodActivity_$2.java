// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.fitbit.data.domain.FoodItem;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseFoodActivity_

class a
    implements android.widget.kListener
{

    final ChooseFoodActivity_ a;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.a((FoodItem)adapterview.getAdapter().getItem(i));
    }

    (ChooseFoodActivity_ choosefoodactivity_)
    {
        a = choosefoodactivity_;
        super();
    }
}
