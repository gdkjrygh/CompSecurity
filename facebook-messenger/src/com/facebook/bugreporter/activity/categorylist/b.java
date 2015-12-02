// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.categorylist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.debug.b.a;
import com.google.common.a.es;

// Referenced classes of package com.facebook.bugreporter.activity.categorylist:
//            CategoryInfo, d

public class b extends BaseAdapter
{

    private final Context a;
    private es b;

    public b(Context context)
    {
        a = context;
    }

    public CategoryInfo a(int i)
    {
        if (i < b.size())
        {
            return (CategoryInfo)b.get(i);
        } else
        {
            return null;
        }
    }

    public void a(es es1)
    {
        b = es1;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        if (i < b.size())
        {
            return ((CategoryInfo)b.get(i)).b;
        } else
        {
            return -1L;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (d)view;
        boolean flag;
        if (i <= b.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.facebook.debug.b.a.b("listview index is valid", flag);
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new d(a);
        }
        view.setCategoryInfo(a(i));
        return view;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
