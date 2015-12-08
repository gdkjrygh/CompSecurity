// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.Meal;
import com.fitbit.data.domain.MealItem;
import com.fitbit.food.ui.CustomFoodActivity;
import com.fitbit.food.ui.logging.NutritionalFactsActivity;
import java.util.List;

public class FoodItemDescriptionView extends LinearLayout
{

    protected TextView a;
    protected TextView b;
    protected Button c;
    protected Button d;
    private long e;
    private long f;

    public FoodItemDescriptionView(Context context)
    {
        super(context);
        e = -1L;
        f = -1L;
    }

    public FoodItemDescriptionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = -1L;
        f = -1L;
    }

    public FoodItemDescriptionView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = -1L;
        f = -1L;
    }

    protected void a()
    {
        NutritionalFactsActivity.a(getContext(), e, f);
    }

    public void a(FoodItem fooditem)
    {
        a.setText(fooditem.f());
        if (fooditem.i())
        {
            b.setVisibility(0);
            b.setText(0x7f0801e6);
            c.setVisibility(8);
        } else
        {
            String s = null;
            Brand brand = fooditem.a();
            if (brand != null)
            {
                s = brand.a();
            }
            if (TextUtils.isEmpty(s))
            {
                b.setVisibility(8);
            } else
            {
                b.setVisibility(0);
                b.setText(s);
            }
            c.setVisibility(0);
            if (fooditem.getEntityId() != null)
            {
                e = fooditem.getEntityId().longValue();
            } else
            {
                e = -1L;
            }
            f = fooditem.getServerId();
        }
        if (fooditem.g())
        {
            d.setVisibility(0);
            return;
        } else
        {
            d.setVisibility(8);
            return;
        }
    }

    public void a(Meal meal)
    {
        a.setText(meal.a());
        int i;
        if (meal.b() != null && meal.b().length() > 0)
        {
            b.setText(meal.b());
            i = 0;
        } else
        if (meal.c().size() > 0)
        {
            String s = ((MealItem)meal.c().get(0)).getName();
            for (i = 1; i < meal.c().size(); i++)
            {
                s = (new StringBuilder()).append(s).append(", ").append(((MealItem)meal.c().get(i)).getName()).toString();
            }

            b.setText(s);
            i = 0;
        } else
        {
            i = 8;
        }
        b.setVisibility(i);
        c.setVisibility(8);
        d.setVisibility(8);
    }

    protected void b()
    {
        CustomFoodActivity.a(getContext(), e, f);
    }
}
