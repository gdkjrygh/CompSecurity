// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.reconnection;

import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.reconnection:
//            ReconnectionService

class this._cls0 extends TimerTask
{

    final ReconnectionService this$0;

    public void run()
    {
        LogUtils.LOGD(ReconnectionService.access$000(), "setUpEndTimer(): stopping ReconnectionService since reached the end of allotted time");
        ReconnectionService.access$200(ReconnectionService.this);
    }

    ()
    {
        this$0 = ReconnectionService.this;
        super();
    }
}
