// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.kids.lolomo.KidsPaginatedCwAdapter;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BaseProgressivePagerAdapter, PaginatedCwAdapter, RowAdapterCallbacks, BasePaginatedAdapter

public abstract class ProgressiveCwPagerAdapter extends BaseProgressivePagerAdapter
{

    public ProgressiveCwPagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        super(servicemanager, rowadaptercallbacks, viewrecycler);
    }

    protected BasePaginatedAdapter createPaginatedAdapter(Context context)
    {
        if (getManager().getActivity().isForKids())
        {
            return new KidsPaginatedCwAdapter(context);
        } else
        {
            return new PaginatedCwAdapter(context);
        }
    }
}
