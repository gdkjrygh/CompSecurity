// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.social;

import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.social:
//            FacebookLoginActivity

class this._cls0
    implements ManagerStatusListener
{

    final FacebookLoginActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        FacebookLoginActivity.access$002(FacebookLoginActivity.this, servicemanager);
        FacebookLoginActivity.access$100(FacebookLoginActivity.this);
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        FacebookLoginActivity.access$002(FacebookLoginActivity.this, null);
    }

    ()
    {
        this$0 = FacebookLoginActivity.this;
        super();
    }
}
