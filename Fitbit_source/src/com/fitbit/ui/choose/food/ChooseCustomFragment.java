// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.choose.food;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.commonsware.cwac.a.a;
import com.fitbit.data.domain.Brand;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.FoodItem;
import com.fitbit.data.domain.Meal;
import com.fitbit.data.domain.MealItem;
import com.fitbit.food.ui.CustomFoodActivity;
import com.fitbit.food.ui.logging.LogFoodActivity;
import com.fitbit.food.ui.logging.LogMealActivity;
import com.fitbit.ui.choose.activity.ChooseFragment;
import com.fitbit.util.ab;
import com.fitbit.util.format.f;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseCustomFragment_, a, b

public class ChooseCustomFragment extends ChooseFragment
{
    private static class a extends com.fitbit.ui.a.b
    {

        private Context a;

        protected CharSequence a(b b1)
        {
            return b1.a(a);
        }

        protected volatile CharSequence a(Object obj)
        {
            return a((b)obj);
        }

        protected CharSequence b(b b1)
        {
            return b1.b(a);
        }

        protected volatile CharSequence b(Object obj)
        {
            return b((b)obj);
        }

        protected boolean c(b b1)
        {
            return b1.b();
        }

        protected volatile boolean c(Object obj)
        {
            return c((b)obj);
        }

        public a(Context context, List list)
        {
            a = context;
            addAll(list);
        }
    }

    public static class b
    {

        private Entity a;

        public Entity a()
        {
            return a;
        }

        public String a(Context context)
        {
            if (a instanceof Meal)
            {
                return com.fitbit.ui.choose.food.ChooseCustomFragment.a((Meal)a);
            }
            if (a instanceof FoodItem)
            {
                return com.fitbit.ui.choose.food.ChooseCustomFragment.a((FoodItem)a);
            } else
            {
                return "";
            }
        }

        public String b(Context context)
        {
            if (a instanceof Meal)
            {
                return com.fitbit.ui.choose.food.ChooseCustomFragment.a(context, (Meal)a);
            }
            if (a instanceof FoodItem)
            {
                return com.fitbit.ui.choose.food.ChooseCustomFragment.a(context, (FoodItem)a);
            } else
            {
                return "";
            }
        }

        public boolean b()
        {
            return false;
        }

        public b(Entity entity)
        {
            a = entity;
        }
    }


    private static final String c = "ChooseCustomFragment";

    public ChooseCustomFragment()
    {
    }

    static String a(Context context, FoodItem fooditem)
    {
        return b(context, fooditem);
    }

    static String a(Context context, Meal meal)
    {
        return b(context, meal);
    }

    static String a(FoodItem fooditem)
    {
        return b(fooditem);
    }

    static String a(Meal meal)
    {
        return b(meal);
    }

    public static ChooseCustomFragment b(Date date)
    {
        return ChooseCustomFragment_.e().a(date).a();
    }

    private static String b(Context context, FoodItem fooditem)
    {
        String s = fooditem.a().a();
        String s1 = ab.a(context, fooditem);
        context = f.b(context, fooditem.c().doubleValue());
        fooditem = new StringBuilder();
        if (s != null && !s.isEmpty())
        {
            fooditem.append(s);
            fooditem.append(", ");
        }
        if (s1 != null && !s1.isEmpty())
        {
            fooditem.append(s1);
            fooditem.append(", ");
        }
        fooditem.append(context);
        return fooditem.toString();
    }

    private static String b(Context context, Meal meal)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = meal.c().iterator(); iterator.hasNext(); stringbuilder.append(", "))
        {
            stringbuilder.append(((MealItem)iterator.next()).getName());
        }

        stringbuilder.append(f.b(context, meal.d()));
        return stringbuilder.toString();
    }

    private static String b(FoodItem fooditem)
    {
        return fooditem.f();
    }

    private static String b(Meal meal)
    {
        return meal.a();
    }

    public void a(Loader loader, com.fitbit.ui.choose.food.a a1)
    {
        loader = new com.commonsware.cwac.a.a();
        if (a1.a())
        {
            getView().findViewById(0x7f1100a0).setVisibility(0);
        } else
        {
            View view = getLayoutInflater(getArguments()).inflate(0x7f0401c9, null);
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final ChooseCustomFragment a;

                public void onClick(View view1)
                {
                    a.d();
                }

            
            {
                a = ChooseCustomFragment.this;
                super();
            }
            });
            loader.a(view);
            loader.a(new a(getActivity(), a1.b()));
        }
        setListAdapter(loader);
    }

    public int b()
    {
        return 0x7f0800ee;
    }

    public int c()
    {
        return 303;
    }

    protected void d()
    {
        getActivity().startActivityForResult(CustomFoodActivity.a(getActivity()), 778);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new com.fitbit.ui.choose.food.b(getActivity()) {

            final ChooseCustomFragment b;

            protected void b()
            {
                b.setListShown(false);
            }

            protected void d()
            {
                b.setListShown(true);
            }

            
            {
                b = ChooseCustomFragment.this;
                super(context);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        ((TextView)layoutinflater.findViewById(0x1020014)).setText(0x7f0800f5);
        return layoutinflater;
    }

    public void onListItemClick(ListView listview, View view, int i, long l)
    {
        listview = ((ListView) (getListAdapter().getItem(i)));
        if (listview instanceof b)
        {
            listview = ((b)listview).a();
            if (listview instanceof FoodItem)
            {
                getActivity().startActivityForResult(LogFoodActivity.b(getActivity(), (FoodItem)listview, b), 777);
            } else
            if (listview instanceof Meal)
            {
                getActivity().startActivityForResult(LogMealActivity.b(getActivity(), (Meal)listview, b), 777);
                return;
            }
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (com.fitbit.ui.choose.food.a)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
