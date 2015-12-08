// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.os.Handler;

// Referenced classes of package com.accuweather.android.services:
//            WearablesService

class this._cls0
    implements eerConnectedListener
{

    final WearablesService this$0;

    public void onPeerConnected()
    {
        Handler handler = getHandler();
        if (handler != null && WearablesService.access$000(WearablesService.this))
        {
            handler.removeCallbacks(mRunnableRefresh);
            handler.postDelayed(mRunnableRefresh, 2000L);
        }
    }

    eerConnectedListener()
    {
        this$0 = WearablesService.this;
        super();
    }
}
