// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.widget.e.a;
import com.facebook.widget.j;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.widget.listview:
//            h, i

public class m extends BaseAdapter
{

    private final h a;
    private final i b;
    private final DataSetObserver c;

    public boolean areAllItemsEnabled()
    {
        return a.areAllItemsEnabled();
    }

    protected void finalize()
    {
        a.unregisterDataSetObserver(c);
        super.finalize();
    }

    public int getCount()
    {
        return a.getCount();
    }

    public View getDropDownView(int k, View view, ViewGroup viewgroup)
    {
        return a.getDropDownView(k, view, viewgroup);
    }

    public Object getItem(int k)
    {
        return a.getItem(k);
    }

    public long getItemId(int k)
    {
        return a.getItemId(k);
    }

    public int getItemViewType(int k)
    {
        return a.getItemViewType(k);
    }

    public View getView(int k, View view, ViewGroup viewgroup)
    {
        Integer integer = Integer.valueOf(a.getItemViewType(k));
        view = (a)view;
        Object obj = view;
        if (view == null)
        {
            obj = new a(viewgroup.getContext());
        }
        ((a) (obj)).setRecycleViewType(integer);
        ((a) (obj)).setPositionInListView(k);
        boolean flag;
        if (((a) (obj)).getChildCount() == 0 || ((a) (obj)).getChildCount() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        view = null;
        if (((a) (obj)).getChildCount() == 0)
        {
            view = b.a(a.getClass(), integer, k);
        } else
        if (((a) (obj)).getChildCount() == 1)
        {
            view = ((a) (obj)).getChildAt(0);
            ((a) (obj)).removeViewAt(0);
        }
        view = a.getView(k, view, viewgroup);
        if (view instanceof j)
        {
            ((a) (obj)).attachRecyclableViewToParent(view, 0, view.getLayoutParams());
            return ((View) (obj));
        } else
        {
            ((a) (obj)).addView(view);
            return ((View) (obj));
        }
    }

    public int getViewTypeCount()
    {
        return a.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return a.hasStableIds();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public boolean isEnabled(int k)
    {
        return a.isEnabled(k);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("[").append(a.getClass().getName()).append("]").toString();
    }
}
