// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            RowAdapter, BasePaginatedAdapter, RowAdapterCallbacks, GenreLoMoPagerAdapter

public abstract class BaseProgressivePagerAdapter
    implements RowAdapter, com.netflix.mediaclient.servicemgr.FetchVideosHandler.FetchCallback
{
    static class Memento
    {

        final BasePaginatedAdapter.Memento adapterMemento;
        final int currDataIndex;
        final boolean hasMoreData;
        final BasicLoMo lomo;

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("lomo: ");
            String s;
            if (lomo == null)
            {
                s = "no lomo";
            } else
            {
                s = lomo.getTitle();
            }
            return stringbuilder.append(s).append(", hasMoreData: ").append(hasMoreData).append(", currDataIndex: ").append(currDataIndex).append(", adapter: ").append(adapterMemento).toString();
        }

        protected Memento(BasicLoMo basiclomo, boolean flag, int i, BasePaginatedAdapter basepaginatedadapter)
        {
            lomo = basiclomo;
            hasMoreData = flag;
            currDataIndex = i;
            adapterMemento = basepaginatedadapter.saveToMemento();
        }
    }


    protected static final String TAG = "BaseProgressivePagerAdapter";
    private final RowAdapterCallbacks adapterCallbacks;
    private int currDataIndex;
    private boolean hasMoreData;
    private BasicLoMo lomo;
    private final ServiceManager manager;
    private final BasePaginatedAdapter paginatedAdapter;
    private long requestId;
    private final ViewRecycler viewRecycler;

    public BaseProgressivePagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        adapterCallbacks = rowadaptercallbacks;
        manager = servicemanager;
        viewRecycler = viewrecycler;
        paginatedAdapter = createPaginatedAdapter(servicemanager.getActivity());
    }

    private void fetchMoreData()
    {
        requestId = System.nanoTime();
        int i = currDataIndex;
        int j = getNumVideosToFetchPerBatch();
        fetchMoreData(currDataIndex, (i + j) - 1);
    }

    protected abstract BasePaginatedAdapter createPaginatedAdapter(Context context);

    protected abstract void fetchMoreData(int i, int j);

    public int getCount()
    {
        return paginatedAdapter.getCount();
    }

    protected BasicLoMo getLoMo()
    {
        return lomo;
    }

    protected ServiceManager getManager()
    {
        return manager;
    }

    protected int getNumVideosToFetchPerBatch()
    {
        com.netflix.mediaclient.android.activity.NetflixActivity netflixactivity = manager.getActivity();
        return paginatedAdapter.computeNumVideosToFetchPerBatch(netflixactivity);
    }

    public long getRequestId()
    {
        return requestId;
    }

    public int getRowHeightInPx()
    {
        return paginatedAdapter.getRowHeightInPx();
    }

    public View getView(int i)
    {
        if (hasMoreData() && paginatedAdapter.isLastItem(i))
        {
            fetchMoreData();
        }
        return paginatedAdapter.getView(viewRecycler, lomo, i);
    }

    public boolean hasMoreData()
    {
        return hasMoreData;
    }

    public void invalidateRequestId()
    {
        requestId = -1L;
    }

    public void onErrorResponse()
    {
        hasMoreData = false;
        adapterCallbacks.notifyParentOfError();
    }

    public void onNoVideosInResponse()
    {
        hasMoreData = false;
        adapterCallbacks.notifyParentOfDataSetChange();
    }

    public final void refreshData(BasicLoMo basiclomo, int i)
    {
        if (Log.isLoggable("BaseProgressivePagerAdapter", 2))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("Refreshing data for: ");
            String s;
            if (basiclomo == null)
            {
                s = "n/a";
            } else
            {
                s = basiclomo.getTitle();
            }
            Log.v("BaseProgressivePagerAdapter", stringbuilder.append(s).append(", ").append(hashCode()).toString());
        }
        lomo = basiclomo;
        paginatedAdapter.clearData();
        paginatedAdapter.setListViewPos(i);
        currDataIndex = 0;
        hasMoreData = false;
        fetchMoreData();
    }

    public void restoreFromMemento(Object obj)
    {
        obj = (Memento)obj;
        invalidateRequestId();
        lomo = ((Memento) (obj)).lomo;
        hasMoreData = ((Memento) (obj)).hasMoreData;
        currDataIndex = ((Memento) (obj)).currDataIndex;
        paginatedAdapter.restoreFromMemento(((Memento) (obj)).adapterMemento);
    }

    public Memento saveToMemento()
    {
        return new Memento(lomo, hasMoreData, currDataIndex, paginatedAdapter);
    }

    public volatile Object saveToMemento()
    {
        return saveToMemento();
    }

    public void trackPresentation(int i)
    {
        paginatedAdapter.trackPresentation(manager, lomo, i, Boolean.valueOf(this instanceof GenreLoMoPagerAdapter));
    }

    public void updateDataSet(List list, String s, int i, int j)
    {
        currDataIndex = j + 1;
        if (Log.isLoggable("BaseProgressivePagerAdapter", 2))
        {
            Log.v("BaseProgressivePagerAdapter", (new StringBuilder()).append(s).append(": updated start index to: ").append(currDataIndex).toString());
        }
        boolean flag;
        if (list.size() == getNumVideosToFetchPerBatch())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hasMoreData = flag;
        paginatedAdapter.appendData(list, s, i, j);
        adapterCallbacks.notifyParentOfDataSetChange();
    }
}
