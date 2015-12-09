// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.kids.lolomo.KidsPaginatedLoMoAdapter;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BaseProgressivePagerAdapter, PaginatedLoMoAdapter, RowAdapterCallbacks, BasePaginatedAdapter

public abstract class ProgressiveLoMoPagerAdapter extends BaseProgressivePagerAdapter
{

    public ProgressiveLoMoPagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        super(servicemanager, rowadaptercallbacks, viewrecycler);
    }

    protected BasePaginatedAdapter createPaginatedAdapter(Context context)
    {
        if (getManager().getActivity().isForKids())
        {
            return new KidsPaginatedLoMoAdapter(context);
        } else
        {
            return new PaginatedLoMoAdapter(context);
        }
    }
}
