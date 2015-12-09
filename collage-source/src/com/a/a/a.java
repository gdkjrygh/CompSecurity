// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;

// Referenced classes of package com.a.a:
//            b

public abstract class a extends BaseAdapter
    implements SectionIndexer, b
{

    protected final BaseAdapter b;
    protected AbsListView c;

    public a(BaseAdapter baseadapter)
    {
        b = baseadapter;
    }

    public AbsListView a()
    {
        return c;
    }

    public void a(AbsListView abslistview)
    {
        c = abslistview;
        if (b instanceof b)
        {
            ((b)b).a(abslistview);
        }
    }

    public boolean areAllItemsEnabled()
    {
        return b.areAllItemsEnabled();
    }

    public int getCount()
    {
        return b.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return b.getDropDownView(i, view, viewgroup);
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

    public int getPositionForSection(int i)
    {
        if (b instanceof SectionIndexer)
        {
            return ((SectionIndexer)b).getPositionForSection(i);
        } else
        {
            return 0;
        }
    }

    public int getSectionForPosition(int i)
    {
        if (b instanceof SectionIndexer)
        {
            return ((SectionIndexer)b).getSectionForPosition(i);
        } else
        {
            return 0;
        }
    }

    public Object[] getSections()
    {
        if (b instanceof SectionIndexer)
        {
            return ((SectionIndexer)b).getSections();
        } else
        {
            return null;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return b.getView(i, view, viewgroup);
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

    public void notifyDataSetChanged()
    {
        b.notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated()
    {
        b.notifyDataSetInvalidated();
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        b.registerDataSetObserver(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        b.unregisterDataSetObserver(datasetobserver);
    }
}
