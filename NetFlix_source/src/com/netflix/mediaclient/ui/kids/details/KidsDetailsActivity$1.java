// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsDetailsActivity

class this._cls0
    implements ManagerStatusListener
{

    final KidsDetailsActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        ((ManagerStatusListener)getPrimaryFrag()).onManagerReady(servicemanager, i);
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        ((ManagerStatusListener)getPrimaryFrag()).onManagerUnavailable(servicemanager, i);
    }

    ()
    {
        this$0 = KidsDetailsActivity.this;
        super();
    }
}
