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
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.FoodLogEntry;
import com.fitbit.data.domain.MealType;
import com.fitbit.data.domain.h;
import com.fitbit.food.ui.landing.FoodLoggingLandingActivity;
import com.fitbit.food.ui.logging.views.AddedFoodLogView;
import com.fitbit.food.ui.logging.views.ChooseMealTypeView;
import com.fitbit.food.ui.logging.views.EstimateCaloriesView;
import com.fitbit.food.ui.logging.views.FoodItemDescriptionView;
import com.fitbit.food.ui.logging.views.FoodLogDateView;
import com.fitbit.food.ui.logging.views.ServingSizeView;
import com.fitbit.ui.choose.food.ChooseFoodActivity;
import com.fitbit.ui.s;
import com.fitbit.util.bh;
import com.fitbit.util.f;
import com.fitbit.util.format.e;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogFoodBaseActivity, LogFoodActivity_, d, c, 
//            FoodLogSaveModel, b

public class LogFoodActivity extends LogFoodBaseActivity
{

    protected Long a;
    protected Long b;
    protected ScrollView c;
    protected FoodItemDescriptionView d;
    protected ServingSizeView e;
    protected TextView f;
    protected FoodLogDateView g;
    protected AddedFoodLogView h;
    protected View i;
    protected View j;
    protected EstimateCaloriesView k;
    protected View l;
    protected TextView m;
    protected d n;
    protected FoodLogSaveModel o;
    protected boolean p;
    private List q;
    private int r;

    public LogFoodActivity()
    {
        a = Long.valueOf(-1L);
        b = Long.valueOf(-1L);
        r = -1;
        p = false;
    }

    public static Intent a(Activity activity, long l1, long l2, Date date)
    {
        return LogFoodActivity_.a(activity).a(LogFoodBaseActivity.Mode.a).b(Long.valueOf(l1)).c(Long.valueOf(l2)).a(date).a();
    }

    public static void a(Activity activity, FoodItem fooditem, Date date)
    {
        Long long2 = fooditem.getEntityId();
        Long long1 = long2;
        if (long2 == null)
        {
            long1 = Long.valueOf(-1L);
        }
        long2 = Long.valueOf(fooditem.getServerId());
        fooditem = long2;
        if (long2 == null)
        {
            fooditem = Long.valueOf(-1L);
        }
        LogFoodActivity_.a(activity).a(LogFoodBaseActivity.Mode.a).b(long1).a(date).c(fooditem).a(true).b();
    }

    public static void a(Activity activity, FoodLogEntry foodlogentry)
    {
        LogFoodActivity_.a(activity).a(LogFoodBaseActivity.Mode.b).a(foodlogentry.getEntityId()).a(foodlogentry.getLogDate()).b();
    }

    static void a(LogFoodActivity logfoodactivity)
    {
        logfoodactivity.t();
    }

    public static Intent b(Activity activity, FoodItem fooditem, Date date)
    {
        Long long2 = fooditem.getEntityId();
        Long long1 = long2;
        if (long2 == null)
        {
            long1 = Long.valueOf(-1L);
        }
        long2 = Long.valueOf(fooditem.getServerId());
        fooditem = long2;
        if (long2 == null)
        {
            fooditem = Long.valueOf(-1L);
        }
        return a(activity, long1.longValue(), fooditem.longValue(), date);
    }

    static void b(LogFoodActivity logfoodactivity)
    {
        logfoodactivity.u();
    }

    static void c(LogFoodActivity logfoodactivity)
    {
        logfoodactivity.v();
    }

    private void p()
    {
        if (B == null)
        {
            B = z.getMealType();
        }
    }

    private void q()
    {
        q.add(z);
        com.fitbit.data.bl.r.a().a(q);
    }

    private void r()
    {
        n = new d();
        n.a(z);
        n.a(o);
        n.a(z.getFoodItem());
    }

    private void s()
    {
        Object obj = z.getFoodItem();
        d.a(((FoodItem) (obj)));
        obj = n.b();
        if (obj != null)
        {
            e.a(((List) (obj)));
        }
        e.a(n.a(), n.c());
        C.a(B);
        t();
        u();
        if (n.j())
        {
            l.setVisibility(0);
        } else
        {
            l.setVisibility(8);
        }
        g.a(A);
    }

    private void t()
    {
        if (!F)
        {
            return;
        }
        if (n.c() == null)
        {
            f.setText("");
            return;
        } else
        {
            f.setText(bh.a(this, 0x7f0801d5, new String[] {
                com.fitbit.util.format.e.h(n.d())
            }));
            return;
        }
    }

    private void u()
    {
        while (!F || n.c() == null || !n.j()) 
        {
            return;
        }
        m.setText(bh.a(this, 0x7f080191, new String[] {
            com.fitbit.util.format.e.h(n.g()), com.fitbit.util.format.e.h(n.i())
        }));
        k.b(n.g());
        k.c(n.i());
        k.d(n.h());
        k.a(n.d());
        k.d();
    }

    private void v()
    {
        c.fullScroll(33);
        int i1 = h.a();
        c.scrollBy(0, i1);
    }

    private void w()
    {
        if (q != null && !q.isEmpty())
        {
            FoodLogEntry foodlogentry = (FoodLogEntry)q.get(q.size() - 1);
            A = foodlogentry.getLogDate();
            B = foodlogentry.getMealType();
        }
    }

    protected void a(MealType mealtype)
    {
        B = mealtype;
    }

    protected void c()
    {
        super.c();
        e.a(new com.fitbit.food.ui.logging.views.ServingSizeView.a() {

            final LogFoodActivity a;

            public void a(ServingSizeView servingsizeview)
            {
                if (a.n != null)
                {
                    a.n.a(servingsizeview.b());
                    a.n.a(servingsizeview.c());
                    a.n.a(a.z.getFoodItem());
                    LogFoodActivity.a(a);
                    LogFoodActivity.b(a);
                }
            }

            
            {
                a = LogFoodActivity.this;
                super();
            }
        });
        if (x == LogFoodBaseActivity.Mode.a)
        {
            setTitle(0x7f080040);
            g.a(this, true);
            g.a(new com.fitbit.food.ui.logging.views.FoodLogDateView.a() {

                final LogFoodActivity a;

                public void a(FoodLogDateView foodlogdateview)
                {
                    a.A = foodlogdateview.a();
                }

            
            {
                a = LogFoodActivity.this;
                super();
            }
            });
            i.setVisibility(0);
            j.setVisibility(8);
        } else
        {
            setTitle(0x7f0801e3);
            g.a(this, false);
            i.setVisibility(8);
            j.setVisibility(0);
        }
        k.a(new com.fitbit.food.ui.logging.views.EstimateCaloriesView.a() {

            final LogFoodActivity a;

            public void a(EstimateCaloriesView estimatecaloriesview)
            {
                if (a.n != null)
                {
                    a.n.b(estimatecaloriesview.c());
                    a.n.e();
                    LogFoodActivity.a(a);
                }
            }

            
            {
                a = LogFoodActivity.this;
                super();
            }
        });
        q = com.fitbit.data.bl.r.a().b();
        w();
        h.a(q);
        c.post(new Runnable() {

            final LogFoodActivity a;

            public void run()
            {
                LogFoodActivity.c(a);
            }

            
            {
                a = LogFoodActivity.this;
                super();
            }
        });
    }

    protected b d()
    {
        return new c(this, y.longValue(), a.longValue(), b.longValue(), x);
    }

    protected int e()
    {
        return 26;
    }

    protected void f()
    {
        p();
        r();
        s();
    }

    protected void g()
    {
        if (!n.f())
        {
            com.fitbit.ui.s.a(this, 0x7f0803e4, 0).i();
        } else
        if (-1 == r)
        {
            r = 0x7f110154;
            o();
            return;
        }
    }

    protected void g_(int i1)
    {
        if (3 == i1)
        {
            finish();
        }
    }

    protected void h()
    {
        if (!n.f())
        {
            com.fitbit.ui.s.a(this, 0x7f0803e4, 0).i();
        } else
        if (-1 == r)
        {
            r = 0x7f110155;
            o();
            return;
        }
    }

    protected void i()
    {
        if (-1 == r)
        {
            r = 0x7f110157;
            com.fitbit.util.f.a(new com.fitbit.util.f.a(this) {

                final LogFoodActivity a;

                public void a(Context context)
                {
                    com.fitbit.data.bl.r.a().a(Collections.singletonList(a.z), context);
                }

                public void b(Object obj)
                {
                    a((Context)obj);
                }

            
            {
                a = LogFoodActivity.this;
                super(context);
            }
            });
            finish();
        }
    }

    protected void j()
    {
        if (!n.f())
        {
            com.fitbit.ui.s.a(this, 0x7f0803e4, 0).i();
        } else
        if (-1 == r)
        {
            r = 0x7f1100e5;
            o();
            return;
        }
    }

    protected void k()
    {
        if (0x7f110154 == r)
        {
            q();
        }
    }

    protected void l()
    {
        r;
        JVM INSTR lookupswitch 4: default 48
    //                   2131820773: 147
    //                   2131820884: 49
    //                   2131820885: 116
    //                   2131820887: 48;
           goto _L1 _L2 _L3 _L4 _L1
_L1:
        return;
_L3:
        Bundle bundle = new Bundle();
        bundle.putLong("com.fitbit.ui.choose.food.ChooseFoodActivity.FOOD_ENTITY_ID_TAG", b.longValue());
        bundle.putLong("com.fitbit.ui.choose.food.ChooseFoodActivity.FOOD_SERVER_ID_TAG", a.longValue());
        bundle.putInt("com.fitbit.ui.choose.food.ChooseFoodActivity.MEAL_TYPE_TAG", z.getMealType().getCode());
        ChooseFoodActivity.a(this, bundle, A);
        finish();
        return;
_L4:
        com.fitbit.data.bl.r.a().c();
        setResult(-1, null);
        finish();
        if (p)
        {
            FoodLoggingLandingActivity.a(this, 0x4000000);
            return;
        }
          goto _L1
_L2:
        finish();
        return;
    }

    protected void m()
    {
        if (n.c() != null)
        {
            z.setUnitName(n.c().a());
            z.setUnitNamePlural(n.c().b());
            z.setCalories(n.d());
        }
        z.setAmount(n.a());
        z.setMealType(B);
        z.setLogDate(A);
    }

    protected AsyncTaskLoader n()
    {
        return d();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (n != null)
        {
            o = new FoodLogSaveModel();
            o.a(n);
        }
    }
}
