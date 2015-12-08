// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.lomo.PaginatedCwAdapter;
import com.netflix.mediaclient.ui.lomo.PaginatedLoMoAdapter;
import com.netflix.mediaclient.util.DeviceUtils;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            BasePaginatedLoLoMoAdapter, LoLoMoFrag

public class LoLoMoAdapter extends BasePaginatedLoLoMoAdapter
{

    public static final String LOLOMO_GENRE_ID = "lolomo";
    private long requestId;

    public LoLoMoAdapter(LoLoMoFrag lolomofrag)
    {
        super(lolomofrag, "lolomo");
    }

    private void handlePrefetchComplete()
    {
        super.refreshData();
    }

    protected boolean isGenreList()
    {
        return false;
    }

    protected void makeFetchRequest(String s, int i, int j, ManagerCallback managercallback)
    {
        getServiceManager().fetchLoMos(s, i, j, managercallback);
    }

    public void refreshData()
    {
        ServiceManager servicemanager = getServiceManager();
        if (servicemanager == null)
        {
            Log.w("BasePaginatedLoLoMoAdapter", "Service man is null");
            return;
        } else
        {
            Log.v("BasePaginatedLoLoMoAdapter", "Prefetching lolomo...");
            int i = DeviceUtils.getScreenSizeCategory(getActivity());
            requestId = System.nanoTime();
            long l = requestId;
            servicemanager.prefetchLoLoMo(0, 19, 0, PaginatedLoMoAdapter.computeNumVideosToFetchPerBatch(activity, i) - 1, 0, PaginatedCwAdapter.computeNumVideosToFetchPerBatch(activity, i) - 1, activity.isForKids(), false, new LoggingManagerCallback(l) {

                final LoLoMoAdapter this$0;
                final long val$requestIdClone;

                public void onLoLoMoPrefetched(int j)
                {
                    super.onLoLoMoPrefetched(j);
                    if (requestIdClone != requestId)
                    {
                        Log.d("BasePaginatedLoLoMoAdapter", "Request IDs do not match - skipping prefetch callback");
                        return;
                    } else
                    {
                        handlePrefetchComplete();
                        return;
                    }
                }

            
            {
                this$0 = LoLoMoAdapter.this;
                requestIdClone = l;
                super(final_s);
            }
            });
            return;
        }
    }


}
