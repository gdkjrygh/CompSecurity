// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;


// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkService, AppLinkManager

class this._cls0
    implements Runnable
{

    final AppLinkService this$0;

    public void run()
    {
        if (!mAppLinkManager.isProxyConnected())
        {
            mAppLinkManager.deinitialize();
            AppLinkService.access$000(AppLinkService.this);
        }
    }

    ()
    {
        this$0 = AppLinkService.this;
        super();
    }
}
