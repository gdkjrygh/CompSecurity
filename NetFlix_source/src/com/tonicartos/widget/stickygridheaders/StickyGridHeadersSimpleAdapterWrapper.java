// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersBaseAdapter, StickyGridHeadersSimpleAdapter

public class StickyGridHeadersSimpleAdapterWrapper extends BaseAdapter
    implements StickyGridHeadersBaseAdapter
{
    private final class DataSetObserverExtension extends DataSetObserver
    {

        final StickyGridHeadersSimpleAdapterWrapper this$0;

        public void onChanged()
        {
            mHeaders = generateHeaderList(mDelegate);
            notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            mHeaders = generateHeaderList(mDelegate);
            notifyDataSetInvalidated();
        }

        private DataSetObserverExtension()
        {
            this$0 = StickyGridHeadersSimpleAdapterWrapper.this;
            super();
        }

    }

    private class HeaderData
    {

        private int mCount;
        private int mRefPosition;
        final StickyGridHeadersSimpleAdapterWrapper this$0;

        public int getCount()
        {
            return mCount;
        }

        public int getRefPosition()
        {
            return mRefPosition;
        }

        public void incrementCount()
        {
            mCount = mCount + 1;
        }

        public HeaderData(int i)
        {
            this$0 = StickyGridHeadersSimpleAdapterWrapper.this;
            super();
            mRefPosition = i;
            mCount = 0;
        }
    }


    private StickyGridHeadersSimpleAdapter mDelegate;
    private HeaderData mHeaders[];

    public StickyGridHeadersSimpleAdapterWrapper(StickyGridHeadersSimpleAdapter stickygridheaderssimpleadapter)
    {
        mDelegate = stickygridheaderssimpleadapter;
        stickygridheaderssimpleadapter.registerDataSetObserver(new DataSetObserverExtension());
        mHeaders = generateHeaderList(stickygridheaderssimpleadapter);
    }

    protected HeaderData[] generateHeaderList(StickyGridHeadersSimpleAdapter stickygridheaderssimpleadapter)
    {
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < stickygridheaderssimpleadapter.getCount(); i++)
        {
            long l = stickygridheaderssimpleadapter.getHeaderId(i);
            HeaderData headerdata1 = (HeaderData)hashmap.get(Long.valueOf(l));
            HeaderData headerdata = headerdata1;
            if (headerdata1 == null)
            {
                headerdata = new HeaderData(i);
                arraylist.add(headerdata);
            }
            headerdata.incrementCount();
            hashmap.put(Long.valueOf(l), headerdata);
        }

        return (HeaderData[])arraylist.toArray(new HeaderData[arraylist.size()]);
    }

    public int getCount()
    {
        return mDelegate.getCount();
    }

    public int getCountForHeader(int i)
    {
        return mHeaders[i].getCount();
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        return mDelegate.getHeaderView(mHeaders[i].getRefPosition(), view, viewgroup);
    }

    public Object getItem(int i)
    {
        return mDelegate.getItem(i);
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
        return mHeaders.length;
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


/*
    static HeaderData[] access$102(StickyGridHeadersSimpleAdapterWrapper stickygridheaderssimpleadapterwrapper, HeaderData aheaderdata[])
    {
        stickygridheaderssimpleadapterwrapper.mHeaders = aheaderdata;
        return aheaderdata;
    }

*/

}
