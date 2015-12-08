// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import com.netflix.mediaclient.android.widget.SearchActionBar;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchActivity

class this._cls0
    implements ManagerStatusListener
{

    final SearchActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        SearchActivity.access$002(SearchActivity.this, servicemanager);
        SearchActivity.access$100(SearchActivity.this).show();
        if (SearchActivity.access$200(SearchActivity.this) != null)
        {
            SearchActivity.access$200(SearchActivity.this).run();
        }
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
    }

    Bar()
    {
        this$0 = SearchActivity.this;
        super();
    }
}
