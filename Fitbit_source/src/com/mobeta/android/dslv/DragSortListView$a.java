// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;

// Referenced classes of package com.mobeta.android.dslv:
//            DragSortListView, d, e

private class  extends BaseAdapter
{

    final DragSortListView a;
    private ListAdapter b;

    public ListAdapter a()
    {
        return b;
    }

    public boolean areAllItemsEnabled()
    {
        return b.areAllItemsEnabled();
    }

    public int getCount()
    {
        return b.getCount();
    }

    public Object getItem(int i)
    {
        return b.getItem(i);
    }

    public long getItemId(int i)
    {
        return b.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        return b.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            viewgroup = (d)view;
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
                view = new e(a.getContext());
            } else
            {
                view = new d(a.getContext());
            }
            view.setLayoutParams(new android.widget.arams(-1, -2));
            view.addView(viewgroup);
        }
        DragSortListView.a(a, a.getHeaderViewsCount() + i, view, true);
        return view;
    }

    public int getViewTypeCount()
    {
        return b.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return b.hasStableIds();
    }

    public boolean isEmpty()
    {
        return b.isEmpty();
    }

    public boolean isEnabled(int i)
    {
        return b.isEnabled(i);
    }

    public _cls1.a(DragSortListView dragsortlistview, ListAdapter listadapter)
    {
        a = dragsortlistview;
        super();
        b = listadapter;
        b.registerDataSetObserver(new DataSetObserver(dragsortlistview) {

            final DragSortListView a;
            final DragSortListView.a b;

            public void onChanged()
            {
                b.notifyDataSetChanged();
            }

            public void onInvalidated()
            {
                b.notifyDataSetInvalidated();
            }

            
            {
                b = DragSortListView.a.this;
                a = dragsortlistview;
                super();
            }
        });
    }
}
