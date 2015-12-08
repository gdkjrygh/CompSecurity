// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            MDXControllerActivity

class this._cls0
    implements ManagerStatusListener
{

    final MDXControllerActivity this$0;

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        MDXControllerActivity.access$000(MDXControllerActivity.this);
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        cleanupAndExit();
    }

    ()
    {
        this$0 = MDXControllerActivity.this;
        super();
    }
}
