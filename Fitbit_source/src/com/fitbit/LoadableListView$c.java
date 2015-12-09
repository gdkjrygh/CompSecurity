// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import se.emilsjolander.stickylistheaders.h;

// Referenced classes of package com.fitbit:
//            LoadableListView

private static class a
    implements a, h
{

    private final ListAdapter a;
    private final er b;

    public long a(int i)
    {
        return 0L;
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        return null;
    }

    public atus a()
    {
        return b.a();
    }

    public boolean areAllItemsEnabled()
    {
        return a.areAllItemsEnabled();
    }

    public atus b()
    {
        return b.b();
    }

    public int getCount()
    {
        return a.getCount();
    }

    public Object getItem(int i)
    {
        return a.getItem(i);
    }

    public long getItemId(int i)
    {
        return a.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        return a.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return a.getView(i, view, viewgroup);
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

    public boolean isEnabled(int i)
    {
        return a.isEnabled(i);
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        a.registerDataSetObserver(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        a.unregisterDataSetObserver(datasetobserver);
    }

    public er(ListAdapter listadapter)
    {
        a = listadapter;
        if (listadapter instanceof a)
        {
            b = (b)listadapter;
            return;
        } else
        {
    /* block-local class not found */
    class a {}

            b = new a(null);
            return;
        }
    }
}
