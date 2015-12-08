// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class MergedListAdapter extends BaseAdapter
{
    static final class CachedAdapterInfo
    {

        ListAdapter adapter;
        int runningCount;
        int runningViewTypeCount;

        private CachedAdapterInfo()
        {
        }

    }

    static final class CachedInfo
    {

        List adapterInfo;
        int count;
        boolean hasDisabledItems;
        boolean isDirty;
        int viewTypeCount;

        private CachedInfo()
        {
            adapterInfo = Lists.newArrayList();
            count = 0;
            viewTypeCount = 1;
            hasDisabledItems = false;
            isDirty = false;
        }

    }


    private final CachedInfo mCachedInfo = new CachedInfo();
    private final DataSetObserver mDataSetObserver = new DataSetObserver() {

        final MergedListAdapter this$0;

        public final void onChanged()
        {
            notifyDataSetChanged();
        }

        public final void onInvalidated()
        {
            notifyDataSetChanged();
        }

            
            {
                this$0 = MergedListAdapter.this;
                super();
            }
    };

    public MergedListAdapter()
    {
    }

    private void ensureCache()
    {
        if (!mCachedInfo.isDirty)
        {
            return;
        }
        int j = 0;
        int i = 0;
        boolean flag = false;
        for (Iterator iterator = mCachedInfo.adapterInfo.iterator(); iterator.hasNext();)
        {
            Object obj = (CachedAdapterInfo)iterator.next();
            obj.runningCount = j;
            obj.runningViewTypeCount = i;
            j += ((CachedAdapterInfo) (obj)).adapter.getCount();
            i += ((CachedAdapterInfo) (obj)).adapter.getViewTypeCount();
            obj = ((CachedAdapterInfo) (obj)).adapter;
            if (flag || !((ListAdapter) (obj)).areAllItemsEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        mCachedInfo.count = j;
        mCachedInfo.viewTypeCount = Math.max(i, 1);
        mCachedInfo.hasDisabledItems = flag;
        mCachedInfo.isDirty = false;
    }

    private CachedAdapterInfo getInfoForPosition(int i)
    {
        if (i < 0 || i >= getCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder(37)).append("Invalid adapter position: ").append(i).toString());
        }
        ensureCache();
        int j = 0;
        for (int k = mCachedInfo.adapterInfo.size(); j < k - 1;)
        {
            int l = j + k >> 1;
            if (((CachedAdapterInfo)mCachedInfo.adapterInfo.get(l)).runningCount <= i)
            {
                j = l;
            } else
            {
                k = l;
            }
        }

        return (CachedAdapterInfo)mCachedInfo.adapterInfo.get(j);
    }

    public boolean areAllItemsEnabled()
    {
        ensureCache();
        return !mCachedInfo.hasDisabledItems;
    }

    public int getCount()
    {
        ensureCache();
        return mCachedInfo.count;
    }

    public Object getItem(int i)
    {
        CachedAdapterInfo cachedadapterinfo;
        try
        {
            cachedadapterinfo = getInfoForPosition(i);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            return null;
        }
        return cachedadapterinfo.adapter.getItem(i - cachedadapterinfo.runningCount);
    }

    public long getItemId(int i)
    {
        CachedAdapterInfo cachedadapterinfo = getInfoForPosition(i);
        return cachedadapterinfo.adapter.getItemId(i - cachedadapterinfo.runningCount);
    }

    public int getItemViewType(int i)
    {
        CachedAdapterInfo cachedadapterinfo = getInfoForPosition(i);
        i = cachedadapterinfo.adapter.getItemViewType(i - cachedadapterinfo.runningCount);
        if (i < 0)
        {
            return i;
        } else
        {
            return i + cachedadapterinfo.runningViewTypeCount;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        CachedAdapterInfo cachedadapterinfo = getInfoForPosition(i);
        return cachedadapterinfo.adapter.getView(i - cachedadapterinfo.runningCount, view, viewgroup);
    }

    public int getViewTypeCount()
    {
        ensureCache();
        return mCachedInfo.viewTypeCount;
    }

    public boolean isEnabled(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return false;
        } else
        {
            CachedAdapterInfo cachedadapterinfo = getInfoForPosition(i);
            return cachedadapterinfo.adapter.isEnabled(i - cachedadapterinfo.runningCount);
        }
    }

    public void notifyDataSetChanged()
    {
        mCachedInfo.isDirty = true;
        super.notifyDataSetChanged();
    }

    public transient void setAdapters(ListAdapter alistadapter[])
    {
        for (Iterator iterator = mCachedInfo.adapterInfo.iterator(); iterator.hasNext(); ((CachedAdapterInfo)iterator.next()).adapter.unregisterDataSetObserver(mDataSetObserver)) { }
        mCachedInfo.adapterInfo.clear();
        int j = alistadapter.length;
        for (int i = 0; i < j; i++)
        {
            ListAdapter listadapter = alistadapter[i];
            CachedAdapterInfo cachedadapterinfo = new CachedAdapterInfo();
            cachedadapterinfo.adapter = listadapter;
            listadapter.registerDataSetObserver(mDataSetObserver);
            mCachedInfo.adapterInfo.add(cachedadapterinfo);
        }

        notifyDataSetChanged();
    }
}
