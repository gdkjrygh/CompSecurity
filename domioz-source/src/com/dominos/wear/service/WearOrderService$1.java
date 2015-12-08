// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.service;

import com.dominos.android.sdk.common.LogUtil;

// Referenced classes of package com.dominos.wear.service:
//            WearOrderService

class this._cls0
    implements Runnable
{

    final WearOrderService this$0;

    public void run()
    {
        LogUtil.d(WearOrderService.access$000(), "Stopping remote service after inactive timeout!", new Object[0]);
        stopSelf();
    }

    ()
    {
        this$0 = WearOrderService.this;
        super();
    }
}
