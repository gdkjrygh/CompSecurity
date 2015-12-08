// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.os.Handler;
import android.os.RemoteException;

// Referenced classes of package com.htc.lib2.activeservice:
//            HtcActiveManager, TransportModeRecord, Log

class ner.Stub extends ner.Stub
{

    final HtcActiveManager this$0;

    public void onTransportModeChanged(TransportModeRecord transportmoderecord)
        throws RemoteException
    {
        android.os.Message message = HtcActiveManager.access$400(HtcActiveManager.this).obtainMessage(0, transportmoderecord);
        Log.d("HtcActiveManager", (new StringBuilder()).append("Post MSG_TRANSPORT(").append(transportmoderecord.getTimestamp()).append(") to handler").toString());
        HtcActiveManager.access$400(HtcActiveManager.this).sendMessage(message);
    }

    ()
    {
        this$0 = HtcActiveManager.this;
        super();
    }
}
