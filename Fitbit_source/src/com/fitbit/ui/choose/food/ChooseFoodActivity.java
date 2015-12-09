// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.r;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.MealType;
import com.fitbit.food.barcode.ui.BarcodeScannerActivity;
import com.fitbit.food.ui.CustomFoodActivity;
import com.fitbit.food.ui.logging.LogFoodActivity;
import com.fitbit.food.ui.logging.QuickCalorieAddActivity;
import com.fitbit.food.ui.logging.RelatedFoodsDialogFragment;
import com.fitbit.ui.a.a;
import com.fitbit.ui.a.b;
import com.fitbit.ui.choose.activity.ChooseActivity;
import com.fitbit.ui.choose.activity.ChooseFragment;
import com.fitbit.ui.choose.c;
import com.fitbit.util.ab;
import com.fitbit.util.ad;
import com.fitbit.util.format.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseFoodActivity_, i, ChooseFrequentFoodFragment_, ChooseRecentFoodFragment_, 
//            ChooseCustomFragment_, c, ChooseFavoriteFoodFragment_, d

public class ChooseFoodActivity extends ChooseActivity
{
    private static class a extends b
    {

        private Context a;

        protected CharSequence a(FoodItem fooditem)
        {
            return fooditem.f();
        }

        protected volatile CharSequence a(Object obj)
        {
            return a((FoodItem)obj);
        }

        protected CharSequence b(Object obj)
        {
            return c((FoodItem)obj);
        }

        protected boolean b(FoodItem fooditem)
        {
            return r.a().b(fooditem);
        }

        protected CharSequence c(FoodItem fooditem)
        {
            String s = ab.a(a, fooditem);
            int i1 = fooditem.c().intValue();
            String s1 = com.fitbit.util.format.f.a(a, i1);
            fooditem = fooditem.a().a();
            if (fooditem == null || fooditem.isEmpty())
            {
                return String.format(a.getString(0x7f0805e0), new Object[] {
                    s, s1
                });
            } else
            {
                return String.format(a.getString(0x7f080606), new Object[] {
                    fooditem, s, s1
                });
            }
        }

        protected boolean c(Object obj)
        {
            return b((FoodItem)obj);
        }

        public a(Context context)
        {
            a = context;
        }
    }


    public static final String c = "com.fitbit.ui.choose.food.ChooseFoodActivity.FOOD_ENTITY_ID_TAG";
    public static final String d = "com.fitbit.ui.choose.food.ChooseFoodActivity.FOOD_SERVER_ID_TAG";
    public static final String e = "com.fitbit.ui.choose.food.ChooseFoodActivity.MEAL_SERVER_ID_TAG";
    public static final String f = "com.fitbit.ui.choose.food.ChooseFoodActivity.MEAL_TYPE_TAG";
    public static final int g = 777;
    public static final int h = 778;
    private static final String o = "Log Food - manual";
    private static final String p = "related_food_dialog";
    protected boolean i;
    protected Bundle j;
    protected TextView k;
    com.fitbit.ui.a.a l;
    boolean m;
    android.support.v4.app.LoaderManager.LoaderCallbacks n;
    private com.fitbit.food.barcode.ui.a q;

    public ChooseFoodActivity()
    {
        i = false;
        n = new android.support.v4.app.LoaderManager.LoaderCallbacks() {

            final ChooseFoodActivity a;

            public void a(Loader loader, com.fitbit.ui.choose.food.c c1)
            {
                if (!c1.a() && !a.m)
                {
                    a.l.a(com/fitbit/ui/choose/food/ChooseFavoriteFoodFragment_);
                    int i1 = a.l.getCount();
                    com.fitbit.ui.choose.food.ChooseFoodActivity.a(a, a.l.a(i1 - 1));
                    a.m = true;
                }
            }

            public Loader onCreateLoader(int i1, Bundle bundle)
            {
                return new com.fitbit.ui.choose.food.d(this, a) {

                    final _cls1 b;

                    protected void b()
                    {
                    }

                    protected void d()
                    {
                    }

            
            {
                b = _pcls1;
                super(context);
            }
                };
            }

            public void onLoadFinished(Loader loader, Object obj)
            {
                a(loader, (com.fitbit.ui.choose.food.c)obj);
            }

            public void onLoaderReset(Loader loader)
            {
            }

            
            {
                a = ChooseFoodActivity.this;
                super();
            }
        };
    }

    public static void a(Context context, Bundle bundle, Date date)
    {
        com.fitbit.ui.choose.food.ChooseFoodActivity_.a(context).a(0x4000000).a(date).a(bundle).a(true).b();
    }

    public static void a(Context context, Date date)
    {
        com.fitbit.ui.choose.food.ChooseFoodActivity_.a(context).a(date).b();
    }

    static void a(ChooseFoodActivity choosefoodactivity, ChooseFragment choosefragment)
    {
        choosefoodactivity.a(choosefragment);
    }

    protected c a(String s)
    {
        return new i(this, s);
    }

    protected void a(int i1, Intent intent)
    {
        if (i1 == -1)
        {
            finish();
        }
    }

    protected void a(FoodItem fooditem)
    {
        startActivityForResult(LogFoodActivity.b(this, fooditem, y), 777);
    }

    protected void a(CharSequence charsequence)
    {
        super.a(charsequence);
        if (x != null && !x.isEmpty() && k != null)
        {
            k.setText(String.format(getString(0x7f0801cc), new Object[] {
                x
            }));
        }
    }

    protected void b(int i1, Intent intent)
    {
        if (i1 == -1 && intent != null)
        {
            intent = Long.valueOf(intent.getLongExtra("com.fitbit.food.ui.CustomFoodActivity.EXTRA_CREATED_FOOD_ENTITY_ID", -1L));
            if (-1L != intent.longValue())
            {
                startActivityForResult(LogFoodActivity.a(this, intent.longValue(), -1L, y), 777);
            }
        }
    }

    protected com.fitbit.ui.a.a g()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(com/fitbit/ui/choose/food/ChooseFrequentFoodFragment_);
        arraylist.add(com/fitbit/ui/choose/food/ChooseRecentFoodFragment_);
        arraylist.add(com/fitbit/ui/choose/food/ChooseCustomFragment_);
        l = new com.fitbit.ui.a.a(getSupportFragmentManager(), this, y, arraylist);
        getSupportLoaderManager().initLoader(308, null, n);
        return l;
    }

    protected void j()
    {
        BarcodeScannerActivity.a(this, y);
    }

    protected void k()
    {
        QuickCalorieAddActivity.a(this, y);
    }

    protected b l()
    {
        return new a(this);
    }

    protected void m()
    {
        startActivityForResult(CustomFoodActivity.a(this, x), 778);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        q = new com.fitbit.food.barcode.ui.a(this);
        getSupportLoaderManager().initLoader(29, null, q);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu = menu.findItem(0x7f1104de);
        if (menu != null)
        {
            ((SearchView)MenuItemCompat.getActionView(menu)).setQueryHint(getString(0x7f0804a2));
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        MenuItem menuitem = menu.findItem(0x7f1104dc);
        if (menuitem != null)
        {
            menuitem.setVisible(q.a());
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        super.onResume();
        if (!i) goto _L2; else goto _L1
_L1:
        RelatedFoodsDialogFragment relatedfoodsdialogfragment;
        MealType mealtype;
        long l1;
        long l2;
        long l3;
        relatedfoodsdialogfragment = null;
        mealtype = MealType.getByCode(j.getInt("com.fitbit.ui.choose.food.ChooseFoodActivity.MEAL_TYPE_TAG", 0));
        l1 = j.getLong("com.fitbit.ui.choose.food.ChooseFoodActivity.FOOD_ENTITY_ID_TAG", -1L);
        l2 = j.getLong("com.fitbit.ui.choose.food.ChooseFoodActivity.FOOD_SERVER_ID_TAG", -1L);
        l3 = j.getLong("com.fitbit.ui.choose.food.ChooseFoodActivity.MEAL_SERVER_ID_TAG", -1L);
        if (-1L == l1 && -1L == l2) goto _L4; else goto _L3
_L3:
        relatedfoodsdialogfragment = RelatedFoodsDialogFragment.a(this, l1, l2, mealtype, y);
_L6:
        if (relatedfoodsdialogfragment != null)
        {
            ad.a(getSupportFragmentManager(), "related_food_dialog", relatedfoodsdialogfragment);
            i = false;
        }
_L2:
        FitBitApplication.a().c().a(0x7f11000a).a("Log Food - manual");
        return;
_L4:
        if (-1L == l3)
        {
            relatedfoodsdialogfragment = RelatedFoodsDialogFragment.a(this, l3, mealtype, y);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
