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
import com.fitbit.data.domain.FoodItem;
import com.fitbit.food.ui.logging.LogFoodActivity;
import com.fitbit.ui.a.b;
import com.fitbit.ui.choose.activity.ChooseFragment;
import com.fitbit.util.ab;
import com.fitbit.util.format.f;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.ui.choose.food:
//            ChooseFavoriteFoodFragment_, c, d

public class ChooseFavoriteFoodFragment extends ChooseFragment
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

        protected CharSequence b(FoodItem fooditem)
        {
            String s1 = ab.a(a, fooditem);
            String s = f.b(a, fooditem.c().doubleValue());
            Object obj;
            boolean flag;
            boolean flag1;
            if (fooditem.a() != null)
            {
                obj = fooditem.a().a();
            } else
            {
                obj = "";
            }
            if (s1 != null && !s1.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (obj != null && !((String) (obj)).isEmpty())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            fooditem = s;
            if (flag1)
            {
                fooditem = String.format(a.getString(0x7f0805e0), new Object[] {
                    obj, s
                });
            }
            obj = fooditem;
            if (flag)
            {
                obj = String.format(a.getString(0x7f0805e0), new Object[] {
                    s1, fooditem
                });
            }
            return ((CharSequence) (obj));
        }

        protected volatile CharSequence b(Object obj)
        {
            return b((FoodItem)obj);
        }

        public a(Context context, List list)
        {
            addAll(list);
            a = context;
        }
    }


    public ChooseFavoriteFoodFragment()
    {
    }

    public static ChooseFavoriteFoodFragment b(Date date)
    {
        return ChooseFavoriteFoodFragment_.d().a(date).a();
    }

    public void a(Loader loader, c c1)
    {
        loader = new com.commonsware.cwac.a.a();
        if (!c1.b().isEmpty())
        {
            loader.a(new a(getActivity(), c1.b()));
        }
        setListAdapter(loader);
    }

    public int b()
    {
        return 0x7f0800ef;
    }

    public int c()
    {
        return 308;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new d(getActivity()) {

            final ChooseFavoriteFoodFragment b;

            protected void b()
            {
                b.setListShown(false);
            }

            protected void d()
            {
                b.setListShown(true);
            }

            
            {
                b = ChooseFavoriteFoodFragment.this;
                super(context);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        ((TextView)layoutinflater.findViewById(0x1020014)).setText(0x7f0800f6);
        return layoutinflater;
    }

    public void onListItemClick(ListView listview, View view, int i, long l)
    {
        listview = ((ListView) (getListAdapter().getItem(i)));
        getActivity().startActivityForResult(LogFoodActivity.b(getActivity(), (FoodItem)listview, b), 777);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (c)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }
}
