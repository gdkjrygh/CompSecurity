// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.profiles;

import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.profiles:
//            ProfileSelectionActivity

class this._cls0
    implements ManagerStatusListener
{

    final ProfileSelectionActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        ProfileSelectionActivity.access$102(ProfileSelectionActivity.this, servicemanager);
        ProfileSelectionActivity.access$200(ProfileSelectionActivity.this, true);
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        ProfileSelectionActivity.access$102(ProfileSelectionActivity.this, null);
    }

    ()
    {
        this$0 = ProfileSelectionActivity.this;
        super();
    }
}
