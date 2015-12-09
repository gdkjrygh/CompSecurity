// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.LoadingView;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.BasicLoMo;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            RowAdapter, RowAdapterCallbacks

public class LoadingViewAdapter
    implements RowAdapter
{

    private static final String TAG = "LoadingFragmentPagerAdapter";
    private final RowAdapterCallbacks callbacks;
    private final ViewRecycler viewRecycler;

    public LoadingViewAdapter(RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        callbacks = rowadaptercallbacks;
        viewRecycler = viewrecycler;
    }

    public int getCount()
    {
        return 1;
    }

    public int getRowHeightInPx()
    {
        return -2;
    }

    public View getView(int i)
    {
        View view = viewRecycler.pop(com/netflix/mediaclient/android/fragment/LoadingView);
        if (view != null)
        {
            return view;
        } else
        {
            LoadingView loadingview = new LoadingView(callbacks.getActivity());
            Log.v("LoadingFragmentPagerAdapter", (new StringBuilder()).append("Creating view: ").append(loadingview).toString());
            return loadingview;
        }
    }

    public boolean hasMoreData()
    {
        return false;
    }

    public void invalidateRequestId()
    {
    }

    public void refreshData(BasicLoMo basiclomo, int i)
    {
    }

    public void restoreFromMemento(Object obj)
    {
    }

    public Object saveToMemento()
    {
        return null;
    }

    public void trackPresentation(int i)
    {
    }
}
