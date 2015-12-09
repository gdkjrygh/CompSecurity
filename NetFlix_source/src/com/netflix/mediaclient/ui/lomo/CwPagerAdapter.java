// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.FetchVideosHandler;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            ProgressiveCwPagerAdapter, RowAdapterCallbacks

public class CwPagerAdapter extends ProgressiveCwPagerAdapter
{

    public static final String CW_CACHE_TAG = "CW";

    public CwPagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        super(servicemanager, rowadaptercallbacks, viewrecycler);
    }

    protected void fetchMoreData(int i, int j)
    {
        int k = j;
        if (getManager() != null)
        {
            k = j;
            if (getManager().getActivity() != null)
            {
                k = j;
                if (getManager().getActivity().isForKids())
                {
                    Log.d("BaseProgressivePagerAdapter", (new StringBuilder()).append("limiting index for Kids CW row, max: ").append(2).toString());
                    k = j;
                    if (j > 2)
                    {
                        k = 2;
                    }
                }
            }
        }
        Log.v("BaseProgressivePagerAdapter", (new StringBuilder()).append("fetching for continue watching, start: ").append(i).append(", end: ").append(k).toString());
        getManager().fetchCWVideos(i, k, new FetchVideosHandler("BaseProgressivePagerAdapter", this, "CW", i, k));
    }
}
