// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.user.User;
import com.google.common.a.es;

// Referenced classes of package com.facebook.orca.threadlist:
//            b

class a extends BaseAdapter
{

    private es a;
    private final Context b;

    public a(Context context, es es1)
    {
        a = es.d();
        b = context;
        a = es1;
    }

    public void a(es es1)
    {
        a = es1;
    }

    public int getCount()
    {
        if (a.size() > 6)
        {
            return 6;
        } else
        {
            return a.size();
        }
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (User)a.get(i);
        if (view == null)
        {
            view = new b(b);
        } else
        {
            view = (b)view;
        }
        view.a(viewgroup);
        return view;
    }
}
