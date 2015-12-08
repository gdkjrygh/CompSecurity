// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchQueryDetailsActivity

class this._cls0
    implements ManagerStatusListener
{

    final SearchQueryDetailsActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        SearchQueryDetailsActivity.access$002(SearchQueryDetailsActivity.this, servicemanager);
        SearchQueryDetailsActivity.access$100(SearchQueryDetailsActivity.this);
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        SearchQueryDetailsActivity.access$002(SearchQueryDetailsActivity.this, null);
    }

    ()
    {
        this$0 = SearchQueryDetailsActivity.this;
        super();
    }
}
