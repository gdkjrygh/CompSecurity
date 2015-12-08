// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;

// Referenced classes of package com.mobeta.android.dslv:
//            h, c, DragSortListView, d

final class g extends BaseAdapter
{

    final DragSortListView a;
    private ListAdapter b;

    public g(DragSortListView dragsortlistview, ListAdapter listadapter)
    {
        a = dragsortlistview;
        super();
        b = listadapter;
        b.registerDataSetObserver(new h(this));
    }

    public final boolean areAllItemsEnabled()
    {
        return b.areAllItemsEnabled();
    }

    public final int getCount()
    {
        return b.getCount();
    }

    public final Object getItem(int i)
    {
        return b.getItem(i);
    }

    public final long getItemId(int i)
    {
        return b.getItemId(i);
    }

    public final int getItemViewType(int i)
    {
        return b.getItemViewType(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            viewgroup = (c)view;
            View view1 = viewgroup.getChildAt(0);
            View view2 = b.getView(i, view1, a);
            view = viewgroup;
            if (view2 != view1)
            {
                if (view1 != null)
                {
                    viewgroup.removeViewAt(0);
                }
                viewgroup.addView(view2);
                view = viewgroup;
            }
        } else
        {
            viewgroup = b.getView(i, null, a);
            if (viewgroup instanceof Checkable)
            {
                view = new d(a.getContext());
            } else
            {
                view = new c(a.getContext());
            }
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            view.addView(viewgroup);
        }
        DragSortListView.a(a, a.getHeaderViewsCount() + i, view);
        return view;
    }

    public final int getViewTypeCount()
    {
        return b.getViewTypeCount();
    }

    public final boolean hasStableIds()
    {
        return b.hasStableIds();
    }

    public final boolean isEmpty()
    {
        return b.isEmpty();
    }

    public final boolean isEnabled(int i)
    {
        return b.isEnabled(i);
    }
}
