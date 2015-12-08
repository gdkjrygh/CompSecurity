// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.AsyncTaskLoader;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.Meal;
import com.fitbit.data.domain.MealItem;
import com.fitbit.data.domain.MealType;
import com.fitbit.data.domain.h;
import com.fitbit.food.ui.logging.views.AddedFoodLogView;
import com.fitbit.food.ui.logging.views.ChooseMealTypeView;
import com.fitbit.food.ui.logging.views.FoodItemDescriptionView;
import com.fitbit.food.ui.logging.views.FoodLogDateView;
import com.fitbit.food.ui.logging.views.ServingSizeView;
import com.fitbit.ui.choose.food.ChooseFoodActivity;
import com.fitbit.util.al;
import com.fitbit.util.av;
import com.fitbit.util.bf;
import com.fitbit.util.bh;
import com.fitbit.util.format.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogWithMealTypeActivity, LogMealActivity_

public class LogMealActivity extends LogWithMealTypeActivity
{
    public static class a extends av
    {

        public Meal a;

        public a()
        {
        }
    }


    protected ScrollView a;
    protected FoodLogDateView b;
    protected View c;
    protected View d;
    protected AddedFoodLogView e;
    protected FoodItemDescriptionView f;
    protected ServingSizeView g;
    protected TextView h;
    protected View i;
    protected Long j;
    private Meal k;
    private List l;
    private List m;
    private int n;

    public LogMealActivity()
    {
        m = new ArrayList();
        j = Long.valueOf(-1L);
        n = -1;
    }

    public static void a(Activity activity, Meal meal, Date date)
    {
        LogMealActivity_.a(activity).a(Long.valueOf(meal.getServerId())).a(date).b();
    }

    static void a(LogMealActivity logmealactivity)
    {
        logmealactivity.i();
    }

    public static Intent b(Activity activity, Meal meal, Date date)
    {
        return LogMealActivity_.a(activity).a(Long.valueOf(meal.getServerId())).a(date).a();
    }

    private void h()
    {
        if (B != null)
        {
            C.a(B);
        }
        h h1 = new h();
        h1.a(al.a(0x7f0b000c, 1));
        h1.b(al.a(0x7f0b000c, 2));
        h1.a(1.0D);
        ArrayList arraylist = new ArrayList();
        arraylist.add(h1);
        f.a(k);
        g.a(arraylist);
        g.a(1.0D, h1);
        h.setText(bh.a(this, 0x7f0801d5, new String[] {
            com.fitbit.util.format.e.h(k.d())
        }));
        b.a(A);
    }

    private void i()
    {
        a.fullScroll(33);
        int i1 = e.a();
        a.scrollBy(0, i1);
    }

    private void j()
    {
        l.addAll(m);
        r.a().a(l);
    }

    private void p()
    {
        if (l != null && !l.isEmpty())
        {
            FoodLogEntry foodlogentry = (FoodLogEntry)l.get(l.size() - 1);
            A = foodlogentry.getLogDate();
            B = foodlogentry.getMealType();
        }
    }

    protected void a(Activity activity)
    {
        r.a().b(m, activity);
    }

    protected void a(MealType mealtype)
    {
        B = mealtype;
    }

    protected void a(a a1)
    {
        k = a1.a;
        h();
    }

    protected volatile void a(av av)
    {
        a((a)av);
    }

    protected void c()
    {
        super.c();
        b.a(this, true);
        b.a(new com.fitbit.food.ui.logging.views.FoodLogDateView.a() {

            final LogMealActivity a;

            public void a(FoodLogDateView foodlogdateview)
            {
                a.A = foodlogdateview.a();
            }

            
            {
                a = LogMealActivity.this;
                super();
            }
        });
        c.setVisibility(0);
        d.setVisibility(8);
        l = r.a().b();
        p();
        e.a(l);
        i.setVisibility(8);
        g.setEnabled(false);
        a.post(new Runnable() {

            final LogMealActivity a;

            public void run()
            {
                LogMealActivity.a(a);
            }

            
            {
                a = LogMealActivity.this;
                super();
            }
        });
    }

    protected bf d()
    {
        return new bf(this) {

            final LogMealActivity a;

            protected a a()
            {
                a a1;
                Meal meal;
                a1 = new a();
                meal = r.a().f(a.j.longValue());
                if (meal == null)
                {
                    break MISSING_BLOCK_LABEL_169;
                }
                Object obj;
                FoodItem fooditem;
                Iterator iterator;
                MealItem mealitem;
                long l1;
                try
                {
                    obj = meal.c();
                }
                catch (ServerCommunicationException servercommunicationexception)
                {
                    a1.a(-3);
                    return a1;
                }
                catch (JSONException jsonexception)
                {
                    a1.a(-3);
                    return a1;
                }
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_156;
                }
                iterator = ((List) (obj)).iterator();
_L2:
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_156;
                }
                mealitem = (MealItem)iterator.next();
                obj = mealitem.getFoodItem();
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_137;
                }
                l1 = ((FoodItem) (obj)).getServerId();
                if (((FoodItem) (obj)).n()) goto _L2; else goto _L1
_L1:
                fooditem = dg.d().a(l1, null);
                obj = fooditem;
                if (fooditem != null)
                {
                    break MISSING_BLOCK_LABEL_119;
                }
                obj = r.a().c(l1);
                mealitem.setFoodItem(((FoodItem) (obj)));
                  goto _L2
                iterator.remove();
                  goto _L2
                a1.a = meal;
                a1.a(-1);
                return a1;
                a1.a(-2);
                return a1;
            }

            protected Object f_()
            {
                return a();
            }

            
            {
                a = LogMealActivity.this;
                super(context);
            }
        };
    }

    protected int e()
    {
        return 24;
    }

    protected void f()
    {
        if (-1 == n)
        {
            n = 0x7f110155;
            o();
        }
    }

    protected void g()
    {
        if (-1 == n)
        {
            n = 0x7f110154;
            o();
        }
    }

    protected void k()
    {
        if (0x7f110154 == n)
        {
            j();
        }
    }

    protected void l()
    {
        setResult(-1, null);
        if (0x7f110154 == n && m.size() > 0)
        {
            Bundle bundle = new Bundle();
            bundle.putLong("com.fitbit.ui.choose.food.ChooseFoodActivity.MEAL_SERVER_ID_TAG", j.longValue());
            bundle.putLong("com.fitbit.ui.choose.food.ChooseFoodActivity.MEAL_TYPE_TAG", ((FoodLogEntry)m.get(0)).getMealType().getCode());
            ChooseFoodActivity.a(this, bundle, A);
            finish();
        } else
        {
            r.a().c();
            setResult(-1, null);
        }
        finish();
    }

    protected void m()
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        for (Iterator iterator = k.c().iterator(); iterator.hasNext(); arraylist.add(obj))
        {
            obj = (MealItem)iterator.next();
            ((MealItem) (obj)).setMealType(C.a());
            obj = ((MealItem) (obj)).createFoodLogEntryBasedOnMealItem();
            ((FoodLogEntry) (obj)).setLogDate(A);
        }

        m = arraylist;
    }

    protected AsyncTaskLoader n()
    {
        return d();
    }
}
