// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v4.content.AsyncTaskLoader;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.MealType;
import com.fitbit.food.ui.logging.views.ChooseMealTypeView;
import com.fitbit.food.ui.logging.views.EditCaloriesView;
import com.fitbit.ui.s;
import java.util.Date;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogFoodBaseActivity, QuickCalorieAddActivity_, b

public class QuickCalorieAddActivity extends LogFoodBaseActivity
{

    private static final String d = "Log Food - quick calories";
    private static final long e = 6000L;
    protected EditCaloriesView a;
    protected Button b;
    protected int c;

    public QuickCalorieAddActivity()
    {
        c = 0;
    }

    public static void a(Activity activity, FoodLogEntry foodlogentry)
    {
        QuickCalorieAddActivity_.a(activity).a(LogFoodBaseActivity.Mode.b).a(foodlogentry.getEntityId()).b();
    }

    public static void a(Activity activity, Date date)
    {
        QuickCalorieAddActivity_.a(activity).a(LogFoodBaseActivity.Mode.a).a(date).b();
    }

    static boolean a(QuickCalorieAddActivity quickcalorieaddactivity)
    {
        return quickcalorieaddactivity.g();
    }

    private void b(int i)
    {
        s.a(this, i, 1).a(new android.content.DialogInterface.OnClickListener() {

            final QuickCalorieAddActivity a;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                a.a.b();
            }

            
            {
                a = QuickCalorieAddActivity.this;
                super();
            }
        }).i();
    }

    private boolean g()
    {
        if (c < 1)
        {
            b(0x7f0801c9);
            return false;
        }
        if ((long)c > 6000L)
        {
            b(0x7f080124);
            return false;
        } else
        {
            a.c();
            return true;
        }
    }

    private void h()
    {
        static class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[LogFoodBaseActivity.Mode.values().length];
                try
                {
                    a[LogFoodBaseActivity.Mode.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[LogFoodBaseActivity.Mode.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5.a[x.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setTitle(0x7f0801fb);
            return;

        case 2: // '\002'
            setTitle(0x7f0801fc);
            break;
        }
    }

    protected void a(MealType mealtype)
    {
        B = mealtype;
    }

    protected void c()
    {
        super.c();
        h();
        a.b();
        a.a(new TextWatcher() {

            final QuickCalorieAddActivity a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int i1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int i1)
            {
                a.c = a.a.a();
            }

            
            {
                a = QuickCalorieAddActivity.this;
                super();
            }
        });
        a.a(new android.widget.TextView.OnEditorActionListener() {

            final QuickCalorieAddActivity a;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6 && QuickCalorieAddActivity.a(a))
                {
                    a.o();
                }
                return false;
            }

            
            {
                a = QuickCalorieAddActivity.this;
                super();
            }
        });
        if (LogFoodBaseActivity.Mode.b.equals(x) && b != null)
        {
            b.setText(0x7f08049a);
        }
        b.setOnClickListener(new android.view.View.OnClickListener() {

            final QuickCalorieAddActivity a;

            public void onClick(View view)
            {
                if (QuickCalorieAddActivity.a(a))
                {
                    a.o();
                }
            }

            
            {
                a = QuickCalorieAddActivity.this;
                super();
            }
        });
    }

    protected b d()
    {
        return new b(this, y.longValue(), x);
    }

    protected int e()
    {
        return 21;
    }

    protected void f()
    {
        B = z.getMealType();
        int i = (int)z.getCalories();
        if (B != null)
        {
            C.a(B);
        }
        if (i != 0)
        {
            c = i;
            a.a(c);
        }
    }

    protected void k()
    {
    }

    protected void l()
    {
        if (LogFoodBaseActivity.Mode.a.equals(x))
        {
            r.a().c();
            setResult(-1, null);
        }
        finish();
    }

    protected void m()
    {
        double d1 = c;
        z.setCalories(d1);
        z.setQuickCaloriesAdd(true);
        MealType mealtype = C.a();
        z.setMealType(mealtype);
        if (A != null)
        {
            z.setLogDate(A);
        }
    }

    protected AsyncTaskLoader n()
    {
        return d();
    }

    protected void onResume()
    {
        super.onResume();
        FitBitApplication.a().c().a(0x7f11000a).a("Log Food - quick calories");
    }
}
