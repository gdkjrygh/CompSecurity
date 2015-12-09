// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.FetchVideosHandler;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            ProgressiveLoMoPagerAdapter, RowAdapterCallbacks

public class IqPagerAdapter extends ProgressiveLoMoPagerAdapter
{

    public static final String IQ_CACHE_TAG = "IQ";

    public IqPagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        super(servicemanager, rowadaptercallbacks, viewrecycler);
    }

    protected void fetchMoreData(int i, int j)
    {
        Log.v("BaseProgressivePagerAdapter", (new StringBuilder()).append("fetching for instant queue, start: ").append(i).append(", end: ").append(j).toString());
        getManager().fetchIQVideos(i, j, new FetchVideosHandler("BaseProgressivePagerAdapter", this, "IQ", i, j));
    }
}
