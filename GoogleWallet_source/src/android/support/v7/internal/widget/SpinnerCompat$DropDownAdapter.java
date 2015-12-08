// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

static final class mListAdapter
    implements ListAdapter, SpinnerAdapter
{

    private SpinnerAdapter mAdapter;
    private ListAdapter mListAdapter;

    public final boolean areAllItemsEnabled()
    {
        ListAdapter listadapter = mListAdapter;
        if (listadapter != null)
        {
            return listadapter.areAllItemsEnabled();
        } else
        {
            return true;
        }
    }

    public final int getCount()
    {
        if (mAdapter == null)
        {
            return 0;
        } else
        {
            return mAdapter.getCount();
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (mAdapter == null)
        {
            return null;
        } else
        {
            return mAdapter.getDropDownView(i, view, viewgroup);
        }
    }

    public final Object getItem(int i)
    {
        if (mAdapter == null)
        {
            return null;
        } else
        {
            return mAdapter.getItem(i);
        }
    }

    public final long getItemId(int i)
    {
        if (mAdapter == null)
        {
            return -1L;
        } else
        {
            return mAdapter.getItemId(i);
        }
    }

    public final int getItemViewType(int i)
    {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        return getDropDownView(i, view, viewgroup);
    }

    public final int getViewTypeCount()
    {
        return 1;
    }

    public final boolean hasStableIds()
    {
        return mAdapter != null && mAdapter.hasStableIds();
    }

    public final boolean isEmpty()
    {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i)
    {
        ListAdapter listadapter = mListAdapter;
        if (listadapter != null)
        {
            return listadapter.isEnabled(i);
        } else
        {
            return true;
        }
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        if (mAdapter != null)
        {
            mAdapter.registerDataSetObserver(datasetobserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        if (mAdapter != null)
        {
            mAdapter.unregisterDataSetObserver(datasetobserver);
        }
    }

    public (SpinnerAdapter spinneradapter)
    {
        mAdapter = spinneradapter;
        if (spinneradapter instanceof ListAdapter)
        {
            mListAdapter = (ListAdapter)spinneradapter;
        }
    }
}
