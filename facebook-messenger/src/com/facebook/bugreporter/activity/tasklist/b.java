// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity.tasklist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.debug.b.a;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.bugreporter.activity.tasklist:
//            Task, i

public class b extends BaseAdapter
{

    private static final Class a = com/facebook/bugreporter/activity/tasklist/b;
    private final Context b;
    private List c;

    public b(Context context)
    {
        c = es.d();
        b = context;
    }

    public Task a(int j)
    {
        if (j < c.size())
        {
            return (Task)c.get(j);
        } else
        {
            return null;
        }
    }

    public void a(List list)
    {
        c = list;
        notifyDataSetChanged();
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int j)
    {
        return a(j);
    }

    public long getItemId(int j)
    {
        if (j < c.size())
        {
            return Long.parseLong(((Task)c.get(j)).a);
        } else
        {
            return 0x8000000000000000L;
        }
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        viewgroup = (i)view;
        boolean flag;
        if (j <= c.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.facebook.debug.b.a.b("index is a list index", flag);
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new i(b);
        }
        view.setTask(a(j));
        return view;
    }

    public boolean hasStableIds()
    {
        return true;
    }

}
