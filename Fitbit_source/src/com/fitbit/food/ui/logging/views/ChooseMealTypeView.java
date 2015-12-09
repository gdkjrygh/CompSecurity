// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.fitbit.data.domain.MealType;

public class ChooseMealTypeView extends LinearLayout
{
    public static interface a
    {

        public abstract void a(ChooseMealTypeView choosemealtypeview);
    }


    private RadioGroup a;
    private RadioGroup b;
    private int c;
    private boolean d;
    private a e;

    public ChooseMealTypeView(Context context)
    {
        super(context);
        d = false;
        e();
    }

    public ChooseMealTypeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = false;
        e();
    }

    public ChooseMealTypeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = false;
        e();
    }

    static int a(ChooseMealTypeView choosemealtypeview, int i)
    {
        choosemealtypeview.c = i;
        return i;
    }

    static boolean a(ChooseMealTypeView choosemealtypeview)
    {
        return choosemealtypeview.d;
    }

    static boolean a(ChooseMealTypeView choosemealtypeview, boolean flag)
    {
        choosemealtypeview.d = flag;
        return flag;
    }

    static RadioGroup b(ChooseMealTypeView choosemealtypeview)
    {
        return choosemealtypeview.b;
    }

    static a c(ChooseMealTypeView choosemealtypeview)
    {
        return choosemealtypeview.e;
    }

    static RadioGroup d(ChooseMealTypeView choosemealtypeview)
    {
        return choosemealtypeview.a;
    }

    private void e()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0401da, this);
        a = (RadioGroup)view.findViewById(0x7f1104b3);
        b = (RadioGroup)view.findViewById(0x7f1104b8);
        a.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

            final ChooseMealTypeView a;

            public void onCheckedChanged(RadioGroup radiogroup, int i)
            {
                if (i != -1 && ChooseMealTypeView.a(a))
                {
                    ChooseMealTypeView.a(a, false);
                    ChooseMealTypeView.b(a).clearCheck();
                    ChooseMealTypeView.a(a, i);
                }
                ChooseMealTypeView.a(a, true);
                if (ChooseMealTypeView.c(a) != null)
                {
                    ChooseMealTypeView.c(a).a(a);
                }
            }

            
            {
                a = ChooseMealTypeView.this;
                super();
            }
        });
        b.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

            final ChooseMealTypeView a;

            public void onCheckedChanged(RadioGroup radiogroup, int i)
            {
                if (i != -1 && ChooseMealTypeView.a(a))
                {
                    ChooseMealTypeView.a(a, false);
                    ChooseMealTypeView.d(a).clearCheck();
                    ChooseMealTypeView.a(a, i);
                }
                ChooseMealTypeView.a(a, true);
                if (ChooseMealTypeView.c(a) != null)
                {
                    ChooseMealTypeView.c(a).a(a);
                }
            }

            
            {
                a = ChooseMealTypeView.this;
                super();
            }
        });
        b();
    }

    public MealType a()
    {
        switch (c)
        {
        case 2131821752: 
        default:
            return null;

        case 2131821751: 
            return MealType.DINNER;

        case 2131821749: 
            return MealType.BREAKFAST;

        case 2131821754: 
            return MealType.AFTERNOONSNACK;

        case 2131821750: 
            return MealType.LUNCH;

        case 2131821753: 
            return MealType.MORNINGSNACK;

        case 2131821755: 
            return MealType.EVENING_SNACK;

        case 2131821748: 
            return MealType.ANYTIME;
        }
    }

    public void a(MealType mealtype)
    {
        if (mealtype == null)
        {
            a.clearCheck();
            b.clearCheck();
            return;
        }
        static class _cls3
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
                    a[MealType.DINNER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[MealType.BREAKFAST.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[MealType.AFTERNOONSNACK.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[MealType.LUNCH.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[MealType.MORNINGSNACK.ordinal()] = 6;
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

        switch (_cls3.a[mealtype.ordinal()])
        {
        default:
            a.clearCheck();
            b.clearCheck();
            return;

        case 1: // '\001'
            a.check(0x7f1104b4);
            return;

        case 2: // '\002'
            a.check(0x7f1104b7);
            return;

        case 3: // '\003'
            a.check(0x7f1104b5);
            return;

        case 4: // '\004'
            b.check(0x7f1104ba);
            return;

        case 5: // '\005'
            a.check(0x7f1104b6);
            return;

        case 6: // '\006'
            b.check(0x7f1104b9);
            return;

        case 7: // '\007'
            b.check(0x7f1104bb);
            break;
        }
    }

    public void a(a a1)
    {
        e = a1;
    }

    public void b()
    {
        Time time = new Time(Time.getCurrentTimezone());
        time.setToNow();
        a(MealType.getByTime(time));
    }

    public a c()
    {
        return e;
    }

    public void d()
    {
        ((RadioButton)a.findViewById(0x7f1104b4)).setText(0x7f0801ce);
        ((RadioButton)a.findViewById(0x7f1104b5)).setText(0x7f0801d1);
        ((RadioButton)a.findViewById(0x7f1104b6)).setText(0x7f0801ec);
        ((RadioButton)a.findViewById(0x7f1104b7)).setText(0x7f0801e1);
        ((RadioButton)b.findViewById(0x7f1104b9)).setText(0x7f0801ef);
        ((RadioButton)b.findViewById(0x7f1104ba)).setText(0x7f0801cd);
        ((RadioButton)b.findViewById(0x7f1104bb)).setText(0x7f0801e4);
    }
}
