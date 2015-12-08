// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.rebound.ui:
//            SpringConfiguratorView, a

private final class c extends BaseAdapter
{

    final List a = new ArrayList();
    final SpringConfiguratorView b;
    private final Context c;

    public final void a(String s)
    {
        a.add(s);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = new TextView(c);
            view.setLayoutParams(new android.widget.<init>(-1, -1));
            int j = com.facebook.rebound.ui.a.a(12F, b.getResources());
            view.setPadding(j, j, j, j);
            view.setTextColor(SpringConfiguratorView.j(b));
        } else
        {
            view = (TextView)view;
        }
        view.setText((CharSequence)a.get(i));
        return view;
    }

    public (SpringConfiguratorView springconfiguratorview, Context context)
    {
        b = springconfiguratorview;
        super();
        c = context;
    }
}
