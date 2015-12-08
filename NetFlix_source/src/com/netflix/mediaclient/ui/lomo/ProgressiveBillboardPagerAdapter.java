// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BaseProgressivePagerAdapter, PaginatedBillboardAdapter, RowAdapterCallbacks, BasePaginatedAdapter

public abstract class ProgressiveBillboardPagerAdapter extends BaseProgressivePagerAdapter
{

    public ProgressiveBillboardPagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        super(servicemanager, rowadaptercallbacks, viewrecycler);
    }

    protected BasePaginatedAdapter createPaginatedAdapter(Context context)
    {
        return new PaginatedBillboardAdapter(context);
    }
}
