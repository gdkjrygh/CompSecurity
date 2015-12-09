// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.FetchVideosHandler;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            ProgressiveBillboardPagerAdapter, RowAdapterCallbacks

public class BillboardPagerAdapter extends ProgressiveBillboardPagerAdapter
{

    public BillboardPagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        super(servicemanager, rowadaptercallbacks, viewrecycler);
    }

    protected void fetchMoreData(int i, int j)
    {
        if (getLoMo() == null)
        {
            Log.w("BaseProgressivePagerAdapter", "billboard lomo pager - no lomo data to use for fetch request");
            return;
        }
        LoMo lomo = (LoMo)getLoMo();
        if (Log.isLoggable("BaseProgressivePagerAdapter", 2))
        {
            Log.v("BaseProgressivePagerAdapter", String.format("fetching billboard videos for: Title: %s, Type: %s, Total Vids: %d, Id: %s, start: %d, end: %d", new Object[] {
                lomo.getTitle(), lomo.getType(), Integer.valueOf(lomo.getNumVideos()), lomo.getId(), Integer.valueOf(i), Integer.valueOf(j)
            }));
        }
        getManager().fetchVideos(lomo, i, j, new FetchVideosHandler("BaseProgressivePagerAdapter", this, lomo.getTitle(), i, j));
    }
}
