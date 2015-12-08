// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.activities.MainActivity;
import com.jcp.productcategories.modal.Modal;
import com.jcp.util.ai;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            bu

public class ProductCategoriesAdapter extends BaseAdapter
{

    private static final String b = com/jcp/adapters/ProductCategoriesAdapter.getName();
    protected int a;
    private List c;
    private MainActivity d;

    public ProductCategoriesAdapter(Context context, List list)
    {
        c = list;
        d = (MainActivity)context;
    }

    static MainActivity a(ProductCategoriesAdapter productcategoriesadapter)
    {
        return productcategoriesadapter.d;
    }

    static String a()
    {
        return b;
    }

    private void a(int i, int j, String s)
    {
        Modal modal = (Modal)c.get(j);
        if (j == i)
        {
            d.b(modal.getCategoryId(), s, a);
            return;
        } else
        {
            s = ai.a().b(modal.getCategoryId(), modal.getId());
            b(j);
            d.a(modal.getName(), s, a);
            return;
        }
    }

    static void a(ProductCategoriesAdapter productcategoriesadapter, int i)
    {
        productcategoriesadapter.b(i);
    }

    static void a(ProductCategoriesAdapter productcategoriesadapter, int i, int j, String s)
    {
        productcategoriesadapter.a(i, j, s);
    }

    static List b(ProductCategoriesAdapter productcategoriesadapter)
    {
        return productcategoriesadapter.c;
    }

    private void b(int i)
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < a; j++)
        {
            arraylist.add(c.get(j));
        }

        arraylist.add(c.get(i));
        c.clear();
        c.addAll(arraylist);
    }

    public void a(int i)
    {
        a = i;
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i)
    {
        return c.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(d).inflate(0x7f03005f, viewgroup, false);
            view1.setTag(new ViewHolder(view1));
        }
        ViewHolder viewholder = (ViewHolder)view1.getTag();
        viewgroup = ((Modal)c.get(i)).getName().toUpperCase();
        view = viewgroup;
        if (viewgroup.startsWith("SHOP"))
        {
            view = viewgroup.substring(5, viewgroup.length());
        }
        viewholder.title.setText(view);
        if (i == 0)
        {
            view1.setBackgroundColor(0xff444444);
            viewholder.divider.setVisibility(4);
            viewholder.title.setTextColor(-1);
            viewholder.icon.setVisibility(0);
        } else
        if (a > i)
        {
            view1.setBackgroundColor(0xff888888);
            viewholder.divider.setVisibility(4);
            viewholder.title.setTextColor(-1);
            viewholder.icon.setVisibility(4);
        } else
        if (a == i)
        {
            view1.setBackgroundResource(0x7f02011e);
            viewholder.divider.setVisibility(0);
            viewholder.title.setTextColor(0xff000000);
            viewholder.icon.setVisibility(4);
        } else
        {
            view1.setBackgroundColor(-1);
            viewholder.divider.setVisibility(4);
            viewholder.title.setTextColor(0xff000000);
            viewholder.icon.setVisibility(0);
        }
        view1.setOnClickListener(new bu(this, i, view));
        return view1;
    }


    private class ViewHolder
    {

        protected View divider;
        protected ImageView icon;
        protected TextView title;

        public ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
