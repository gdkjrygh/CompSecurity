// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            ListItemBinder

public abstract class BaseListAdapter extends BaseAdapter
{

    public BaseListAdapter()
    {
    }

    public abstract Object getItem(int i);

    protected abstract ListItemBinder getItemBinder(int i);

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = getItemBinder(getItemViewType(i));
        Object obj = getItem(i);
        if (view == null)
        {
            view = viewgroup.createDisplay();
            viewgroup.bind(i, view, obj);
            Views.setTag(view.getView(), view);
        } else
        {
            view = (ViewHolder)Views.getFromTag(view);
            viewgroup.bind(i, view, obj);
        }
        return view.getView();
    }

    public boolean isEnabled(int i)
    {
        return getItemBinder(getItemViewType(i)).isEnabled(getItem(i));
    }
}
