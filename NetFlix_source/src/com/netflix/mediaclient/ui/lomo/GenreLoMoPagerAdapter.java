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
//            ProgressiveLoMoPagerAdapter, RowAdapterCallbacks

public class GenreLoMoPagerAdapter extends ProgressiveLoMoPagerAdapter
{

    public GenreLoMoPagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        super(servicemanager, rowadaptercallbacks, viewrecycler);
    }

    protected void fetchMoreData(int i, int j)
    {
        if (getLoMo() == null)
        {
            Log.w("BaseProgressivePagerAdapter", "genre lomo pager - no lomo data to use for fetch request");
            return;
        } else
        {
            LoMo lomo = (LoMo)getLoMo();
            Log.v("BaseProgressivePagerAdapter", String.format("fetching genre videos for: Title: %s, Total Vids: %d, Id: %s, start: %d, end: %d", new Object[] {
                lomo.getTitle(), Integer.valueOf(lomo.getNumVideos()), lomo.getId(), Integer.valueOf(i), Integer.valueOf(j)
            }));
            getManager().fetchGenreVideos(lomo, i, j, new FetchVideosHandler("BaseProgressivePagerAdapter", this, lomo.getTitle(), i, j));
            return;
        }
    }
}
