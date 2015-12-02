// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.contacts.picker.c;
import com.facebook.h;
import com.facebook.widget.a.f;
import com.facebook.widget.a.k;

public class ae
    implements Filterable, ListAdapter, k
{

    private final c a;
    private boolean b;

    public ae(c c1)
    {
        a = c1;
    }

    private void a(ViewParent viewparent)
    {
_L3:
        if (viewparent == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (!(viewparent instanceof ListView)) goto _L2; else goto _L1
_L1:
        viewparent = (ListView)viewparent;
_L4:
        if (viewparent != null)
        {
            viewparent.setDividerHeight(0);
            viewparent.setDivider(viewparent.getResources().getDrawable(h.transparent_drawable));
        }
        return;
_L2:
        viewparent = viewparent.getParent();
          goto _L3
        viewparent = null;
          goto _L4
    }

    public boolean areAllItemsEnabled()
    {
        return a.areAllItemsEnabled();
    }

    public f c()
    {
        return a.a();
    }

    public int getCount()
    {
        return a.getCount();
    }

    public Filter getFilter()
    {
        return a.getFilter();
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
        if (!b)
        {
            a(viewgroup);
            b = true;
        }
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
}
