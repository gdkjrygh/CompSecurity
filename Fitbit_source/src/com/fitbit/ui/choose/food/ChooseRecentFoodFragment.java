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
import com.fitbit.data.domain.FoodRelation;
import com.fitbit.food.ui.logging.LogFoodActivity;
import com.fitbit.ui.a.b;
import com.fitbit.ui.choose.activity.ChooseFragment;
import com.fitbit.util.format.f;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseRecentFoodFragment_, g, h

public class ChooseRecentFoodFragment extends ChooseFragment
{
    public class a extends b
    {

        final ChooseRecentFoodFragment a;
        private Context b;

        protected CharSequence a(FoodRelation foodrelation)
        {
            return foodrelation.getName();
        }

        protected volatile CharSequence a(Object obj)
        {
            return a((FoodRelation)obj);
        }

        protected CharSequence b(FoodRelation foodrelation)
        {
            String s = f.a(b, foodrelation.getAmount(), foodrelation.getUnitName(), foodrelation.getUnitNamePlural());
            String s1 = f.b(b, foodrelation.getCalories());
            foodrelation = foodrelation.getBrand();
            if (foodrelation == null || foodrelation.isEmpty())
            {
                return String.format(b.getString(0x7f0805e0), new Object[] {
                    s, s1
                });
            } else
            {
                return String.format(b.getString(0x7f080606), new Object[] {
                    foodrelation, s, s1
                });
            }
        }

        protected volatile CharSequence b(Object obj)
        {
            return b((FoodRelation)obj);
        }

        public a(Context context, List list)
        {
            a = ChooseRecentFoodFragment.this;
            super();
            b = context;
            addAll(list);
        }
    }


    public ChooseRecentFoodFragment()
    {
    }

    public static ChooseRecentFoodFragment b(Date date)
    {
        return ChooseRecentFoodFragment_.d().a(date).a();
    }

    public void a(Loader loader, g g1)
    {
        loader = new com.commonsware.cwac.a.a();
        if (!g1.b().isEmpty())
        {
            loader.a(new a(getActivity(), g1.b()));
        }
        setListAdapter(loader);
    }

    public int b()
    {
        return 0x7f0800f1;
    }

    public int c()
    {
        return 307;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new h(getActivity()) {

            final ChooseRecentFoodFragment b;

            protected void b()
            {
                b.setListShown(false);
            }

            protected void d()
            {
                b.setListShown(true);
            }

            
            {
                b = ChooseRecentFoodFragment.this;
                super(context);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        ((TextView)layoutinflater.findViewById(0x1020014)).setText(0x7f0800f9);
        return layoutinflater;
    }

    public void onListItemClick(ListView listview, View view, int i, long l)
    {
        listview = (FoodRelation)getListAdapter().getItem(i);
        getActivity().startActivityForResult(LogFoodActivity.b(getActivity(), listview.getFoodItem(), b), 777);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (g)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
