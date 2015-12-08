// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersBaseAdapter

public class StickyGridHeadersListAdapterWrapper extends BaseAdapter
    implements StickyGridHeadersBaseAdapter
{

    private DataSetObserver mDataSetObserver;
    private ListAdapter mDelegate;

    public StickyGridHeadersListAdapterWrapper(ListAdapter listadapter)
    {
        mDataSetObserver = new DataSetObserver() {

            final StickyGridHeadersListAdapterWrapper this$0;

            public void onChanged()
            {
                notifyDataSetChanged();
            }

            public void onInvalidated()
            {
                notifyDataSetInvalidated();
            }

            
            {
                this$0 = StickyGridHeadersListAdapterWrapper.this;
                super();
            }
        };
        mDelegate = listadapter;
        if (listadapter != null)
        {
            listadapter.registerDataSetObserver(mDataSetObserver);
        }
    }

    public int getCount()
    {
        if (mDelegate == null)
        {
            return 0;
        } else
        {
            return mDelegate.getCount();
        }
    }

    public int getCountForHeader(int i)
    {
        return 0;
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        return null;
    }

    public Object getItem(int i)
    {
        if (mDelegate == null)
        {
            return null;
        } else
        {
            return mDelegate.getItem(i);
        }
    }

    public long getItemId(int i)
    {
        return mDelegate.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        return mDelegate.getItemViewType(i);
    }

    public int getNumHeaders()
    {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return mDelegate.getView(i, view, viewgroup);
    }

    public int getViewTypeCount()
    {
        return mDelegate.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return mDelegate.hasStableIds();
    }
}
