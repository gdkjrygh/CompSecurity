// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.aviary.android.feather.library.a.a;
import it.sephiroth.android.library.widget.HListView;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.sdk:
//            FeatherActivity

class f extends ArrayAdapter
{

    Object a;
    LayoutInflater b;
    List c;
    int d;
    int e;
    boolean f;
    final FeatherActivity g;

    public a a(int i)
    {
        return (a)c.get(i);
    }

    public int getCount()
    {
        if (f)
        {
            return c.size();
        } else
        {
            return c.size() + 1;
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        while (f || i != getCount() - 1) 
        {
            return 0;
        }
        return 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = getItemViewType(i);
        Object obj = view;
        if (view == null)
        {
            if (j == 0)
            {
                view = b.inflate(ol_layout, viewgroup, false);
                viewgroup = view.getLayoutParams();
                if (e == -1)
                {
                    obj = FeatherActivity.c(g).c(view);
                    double d1 = Math.floor((double)d / (double)obj[0]);
                    e = (int)((double)d / (d1 + 0.5D));
                }
                obj = view;
                if (viewgroup != null)
                {
                    viewgroup.width = e;
                    view.setLayoutParams(viewgroup);
                    obj = view;
                }
            } else
            {
                obj = b.inflate(ol_feedback_layout, viewgroup, false);
            }
        }
        if (j == 0)
        {
            ((View) (obj)).setTag(a(i));
        }
        return ((View) (obj));
    }

    public int getViewTypeCount()
    {
        return !f ? 2 : 1;
    }

    public (FeatherActivity featheractivity, Context context, List list, boolean flag)
    {
        g = featheractivity;
        super(context, -1);
        a = new Object();
        d = context.getResources().getDisplayMetrics().widthPixels;
        e = -1;
        b = LayoutInflater.from(context);
        c = list;
        f = flag;
    }
}
