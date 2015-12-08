// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.MealType;
import com.fitbit.util.bh;
import com.fitbit.util.format.e;
import java.util.Iterator;
import java.util.List;

public class AddedFoodLogView extends LinearLayout
{

    private static final int b = 3;
    private View a;

    public AddedFoodLogView(Context context)
    {
        super(context);
        b();
    }

    public AddedFoodLogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b();
    }

    public AddedFoodLogView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b();
    }

    private void b()
    {
        a = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0401cb, this);
    }

    public int a()
    {
        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f11049b);
        int i = linearlayout.getChildCount();
        int j = 0;
        for (; i > 0; i--)
        {
            LinearLayout linearlayout1 = (LinearLayout)linearlayout.getChildAt(i - 1);
            for (int l = linearlayout1.getChildCount(); l > 1; l--)
            {
                j++;
                if (j >= 3)
                {
                    i = linearlayout1.getChildAt(l - 1).getTop();
                    int k = linearlayout1.getTop();
                    return linearlayout.getTop() + (k + i);
                }
            }

        }

        return 0;
    }

    public void a(List list)
    {
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        a.setVisibility(8);
_L4:
        return;
_L2:
        a.setVisibility(0);
        list = list.iterator();
_L6:
        if (!list.hasNext()) goto _L4; else goto _L3
_L3:
        FoodLogEntry foodlogentry = (FoodLogEntry)list.next();
        if (foodlogentry == null) goto _L6; else goto _L5
_L5:
        TextView textview;
        textview = (TextView)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0401ca, null);
        textview.setText((new StringBuilder()).append(foodlogentry.getFoodItem().f()).append(", ").append(bh.a(getContext(), 0x7f0801d5, new String[] {
            e.a(foodlogentry.getCalories(), 0)
        })).toString());
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[MealType.values().length];
                try
                {
                    a[MealType.ANYTIME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[MealType.BREAKFAST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[MealType.LUNCH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[MealType.DINNER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[MealType.MORNINGSNACK.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[MealType.AFTERNOONSNACK.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[MealType.EVENING_SNACK.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[foodlogentry.getMealType().ordinal()];
        JVM INSTR tableswitch 1 7: default 192
    //                   1 195
    //                   2 229
    //                   3 236
    //                   4 243
    //                   5 250
    //                   6 257
    //                   7 264;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L7:
        int i = 0x7f11049c;
_L14:
        LinearLayout linearlayout = (LinearLayout)findViewById(i);
        linearlayout.addView(textview);
        if (linearlayout.getVisibility() != 0)
        {
            linearlayout.setVisibility(0);
        }
          goto _L6
_L8:
        i = 0x7f11049d;
          goto _L14
_L9:
        i = 0x7f11049e;
          goto _L14
_L10:
        i = 0x7f11049f;
          goto _L14
_L11:
        i = 0x7f1104a0;
          goto _L14
_L12:
        i = 0x7f1104a1;
          goto _L14
_L13:
        i = 0x7f1104a2;
          goto _L14
    }
}
