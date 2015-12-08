// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.fitbit.food.NutritionalValue;

// Referenced classes of package com.fitbit.food.ui:
//            CustomFoodActivity, NutritionalValueEditView

class e
{

    final CustomFoodActivity a;
    private final View b;
    private NutritionalValue c;
    private NutritionalValueEditView d;
    private TextView e;

    public NutritionalValue a()
    {
        return c;
    }

    public void a(double d1)
    {
        if (d1 == 0.0D)
        {
            d.setHint(d.c(0.0D));
            return;
        } else
        {
            d.a(d1);
            return;
        }
    }

    public void a(NutritionalValue nutritionalvalue)
    {
        c = nutritionalvalue;
        e.setText(nutritionalvalue.a());
        d.b(b.getContext().getString(nutritionalvalue.b()));
    }

    public double b()
    {
        return d.b();
    }

    public View c()
    {
        return b;
    }

    public iew(CustomFoodActivity customfoodactivity, View view)
    {
        a = customfoodactivity;
        super();
        b = view;
        d = (NutritionalValueEditView)view.findViewById(0x7f1104a7);
        e = (TextView)view.findViewById(0x7f1104a6);
    }
}
