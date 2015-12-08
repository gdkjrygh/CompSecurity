// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import com.dominos.android.sdk.common.LogUtil;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkService, AppLinkManager

class this._cls0
    implements Runnable
{

    final AppLinkService this$0;

    public void run()
    {
        Boolean boolean1 = Boolean.valueOf(true);
        if (mAppLinkManager.isProxyConnected())
        {
            boolean1 = Boolean.valueOf(false);
        }
        if (boolean1.booleanValue())
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Proxy created but connection not established, service stop requested.", new Object[0]);
            AppLinkService.access$000(AppLinkService.this);
            return;
        } else
        {
            LogUtil.d("FORDSYNC_AppLinkManager", "Proxy is connected, keep running.", new Object[0]);
            return;
        }
    }

    ()
    {
        this$0 = AppLinkService.this;
        super();
    }
}
