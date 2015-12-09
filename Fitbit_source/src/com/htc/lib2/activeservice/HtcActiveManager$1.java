// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

// Referenced classes of package com.htc.lib2.activeservice:
//            HtcActiveManager, TransportModeRecord, Log, TransportModeListener

class this._cls0 extends Handler
{

    final HtcActiveManager this$0;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        int j = HtcActiveManager.access$000(HtcActiveManager.this).size();
        if (j != 0)
        {
            Log.d("HtcActiveManager", (new StringBuilder()).append("onTransportMode(), ").append(j).append(", ").append(((TransportModeRecord)message.obj).getTimestamp()).toString());
        }
        int i = 0;
        while (i < j) 
        {
            ((TransportModeListener)HtcActiveManager.access$000(HtcActiveManager.this).get(i)).onTransportModeChanged((TransportModeRecord)message.obj);
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    er(Looper looper)
    {
        this$0 = HtcActiveManager.this;
        super(looper);
    }
}
