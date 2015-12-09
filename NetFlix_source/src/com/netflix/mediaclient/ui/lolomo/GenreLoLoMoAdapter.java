// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.lomo.PaginatedLoMoAdapter;
import com.netflix.mediaclient.util.DeviceUtils;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            BasePaginatedLoLoMoAdapter, LoLoMoFrag

public class GenreLoLoMoAdapter extends BasePaginatedLoLoMoAdapter
{

    private static final String TAG = "GenreLoLoMoAdapter";

    public GenreLoLoMoAdapter(LoLoMoFrag lolomofrag, String s)
    {
        super(lolomofrag, s);
    }

    private void handlePrefetchComplete()
    {
        super.refreshData();
    }

    protected boolean isGenreList()
    {
        return true;
    }

    protected void makeFetchRequest(String s, int i, int j, ManagerCallback managercallback)
    {
        getServiceManager().fetchGenres(s, i, j, managercallback);
    }

    public void refreshData()
    {
        ServiceManager servicemanager = getServiceManager();
        if (servicemanager == null)
        {
            Log.w("GenreLoLoMoAdapter", "Service man is null");
            return;
        } else
        {
            int i = DeviceUtils.getScreenSizeCategory(activity);
            servicemanager.prefetchGenreLoLoMo(getGenreId(), 0, 19, 0, PaginatedLoMoAdapter.computeNumVideosToFetchPerBatch(activity, i) - 1, false, new LoggingManagerCallback("GenreLoLoMoAdapter") {

                final GenreLoLoMoAdapter this$0;

                public void onGenreLoLoMoPrefetched(int j)
                {
                    super.onGenreLoLoMoPrefetched(j);
                    handlePrefetchComplete();
                }

            
            {
                this$0 = GenreLoLoMoAdapter.this;
                super(s);
            }
            });
            return;
        }
    }

}
