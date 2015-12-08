// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.food.NutritionalValue;
import com.fitbit.util.an;
import com.fitbit.util.bv;
import com.fitbit.util.format.e;
import java.util.Map;

public class NutritionalFactsView extends LinearLayout
{
    private static final class UsedNutritionalValue extends Enum
    {

        public static final UsedNutritionalValue a;
        public static final UsedNutritionalValue b;
        public static final UsedNutritionalValue c;
        public static final UsedNutritionalValue d;
        public static final UsedNutritionalValue e;
        public static final UsedNutritionalValue f;
        public static final UsedNutritionalValue g;
        public static final UsedNutritionalValue h;
        public static final UsedNutritionalValue i;
        public static final UsedNutritionalValue j;
        public static final UsedNutritionalValue k;
        public static final UsedNutritionalValue l;
        public static final UsedNutritionalValue m;
        public static final UsedNutritionalValue n;
        private static final UsedNutritionalValue o[];
        private boolean isFirstPart;
        private boolean isGeneral;
        private NutritionalValue value;

        public static UsedNutritionalValue valueOf(String s)
        {
            return (UsedNutritionalValue)Enum.valueOf(com/fitbit/food/ui/logging/views/NutritionalFactsView$UsedNutritionalValue, s);
        }

        public static UsedNutritionalValue[] values()
        {
            return (UsedNutritionalValue[])o.clone();
        }

        public int a()
        {
            return value.a();
        }

        public String b()
        {
            return value.c();
        }

        public int c()
        {
            return value.b();
        }

        public boolean d()
        {
            return isGeneral;
        }

        public boolean e()
        {
            return isFirstPart;
        }

        static 
        {
            a = new UsedNutritionalValue("TOTAL_FAT", 0, NutritionalValue.c, true, true);
            b = new UsedNutritionalValue("SATURATED_FAT", 1, NutritionalValue.d, false, true);
            c = new UsedNutritionalValue("TRANS_FAT", 2, NutritionalValue.e, false, true);
            d = new UsedNutritionalValue("CHOLESTEROL", 3, NutritionalValue.f, true, true);
            e = new UsedNutritionalValue("SODIUM", 4, NutritionalValue.g, true, true);
            f = new UsedNutritionalValue("POTASSIUM", 5, NutritionalValue.h, true, true);
            g = new UsedNutritionalValue("TOTAL_CARBS", 6, NutritionalValue.i, true, true);
            h = new UsedNutritionalValue("DIETARTY_FIBER", 7, NutritionalValue.j, false, true);
            i = new UsedNutritionalValue("SUGARS", 8, NutritionalValue.k, false, true);
            j = new UsedNutritionalValue("PROTEIN", 9, NutritionalValue.l, true, true);
            k = new UsedNutritionalValue("VITAMIN_A", 10, NutritionalValue.m, true, false);
            l = new UsedNutritionalValue("VITAMIN_C", 11, NutritionalValue.p, true, false);
            m = new UsedNutritionalValue("CALCIUM", 12, NutritionalValue.y, true, false);
            n = new UsedNutritionalValue("IRON", 13, NutritionalValue.A, true, false);
            o = (new UsedNutritionalValue[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n
            });
        }

        private UsedNutritionalValue(String s, int i1, NutritionalValue nutritionalvalue, boolean flag, boolean flag1)
        {
            super(s, i1);
            value = nutritionalvalue;
            isGeneral = flag;
            isFirstPart = flag1;
        }
    }


    private LayoutInflater a;
    private LinearLayout b;
    private LinearLayout c;

    public NutritionalFactsView(Context context)
    {
        super(context);
        a();
    }

    public NutritionalFactsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public NutritionalFactsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        a = (LayoutInflater)getContext().getSystemService("layout_inflater");
        View view = a.inflate(0x7f0401dc, this);
        b = (LinearLayout)view.findViewById(0x7f1104bd);
        c = (LinearLayout)view.findViewById(0x7f1104be);
    }

    public void a(FoodItem fooditem)
    {
        fooditem = fooditem.d();
        UsedNutritionalValue ausednutritionalvalue[] = UsedNutritionalValue.values();
        int i1 = ausednutritionalvalue.length;
        int i = 0;
        while (i < i1) 
        {
            UsedNutritionalValue usednutritionalvalue = ausednutritionalvalue[i];
            Object obj = a.inflate(0x7f0401dd, null);
            View view = ((View) (obj)).findViewById(0x7f1104bf);
            TextView textview1 = (TextView)((View) (obj)).findViewById(0x7f11011f);
            TextView textview = (TextView)((View) (obj)).findViewById(0x7f1104bc);
            int l;
            if (usednutritionalvalue.e() && usednutritionalvalue.d())
            {
                l = 1;
            } else
            {
                l = 0;
            }
            textview1.setTypeface(textview1.getTypeface(), l);
            textview.setTypeface(textview.getTypeface(), l);
            if (usednutritionalvalue.d())
            {
                view.setPadding(0, 0, 0, 0);
            }
            if (usednutritionalvalue.e())
            {
                b.addView(((View) (obj)));
            } else
            {
                c.addView(((View) (obj)));
            }
            textview1.setText(bv.a(getContext().getString(usednutritionalvalue.a())));
            obj = (Double)fooditem.get(usednutritionalvalue.b());
            if (obj == null || ((Double) (obj)).isNaN() || an.a(((Double) (obj)).doubleValue(), 0) == 0.0D)
            {
                textview.setText("-");
            } else
            {
                textview.setText(e.a(getContext(), ((Double) (obj)), usednutritionalvalue.c()));
            }
            i++;
        }
        for (int j = 0; j < b.getChildCount(); j++)
        {
            if (j % 2 != 0)
            {
                b.getChildAt(j).setBackgroundColor(getResources().getColor(0x7f0f0098));
            }
        }

        for (int k = 0; k < c.getChildCount(); k++)
        {
            if (k % 2 != 0)
            {
                c.getChildAt(k).setBackgroundColor(getResources().getColor(0x7f0f0098));
            }
        }

    }
}
