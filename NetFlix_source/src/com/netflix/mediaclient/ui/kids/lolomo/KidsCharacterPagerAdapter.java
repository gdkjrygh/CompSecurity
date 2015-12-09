// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.Context;
import com.netflix.mediaclient.android.widget.ViewRecycler;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.lomo.BasePaginatedAdapter;
import com.netflix.mediaclient.ui.lomo.RowAdapterCallbacks;
import com.netflix.mediaclient.ui.lomo.StandardLoMoPagerAdapter;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsPaginatedCharacterAdapter

public class KidsCharacterPagerAdapter extends StandardLoMoPagerAdapter
{

    public KidsCharacterPagerAdapter(ServiceManager servicemanager, RowAdapterCallbacks rowadaptercallbacks, ViewRecycler viewrecycler)
    {
        super(servicemanager, rowadaptercallbacks, viewrecycler);
    }

    protected BasePaginatedAdapter createPaginatedAdapter(Context context)
    {
        return new KidsPaginatedCharacterAdapter(context);
    }
}
