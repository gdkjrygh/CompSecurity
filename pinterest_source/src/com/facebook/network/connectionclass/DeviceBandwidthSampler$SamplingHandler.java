// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.network.connectionclass;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;

// Referenced classes of package com.facebook.network.connectionclass:
//            QTagParser, DeviceBandwidthSampler, ConnectionClassManager

class this._cls0 extends Handler
{

    static final int MSG_START = 1;
    static final int MSG_STOP = 2;
    final DeviceBandwidthSampler this$0;

    private void addSample()
    {
        long l = QTagParser.getInstance().parseDataUsageForUidAndTag(Process.myUid());
        this;
        JVM INSTR monitorenter ;
        long l1 = SystemClock.elapsedRealtime();
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        DeviceBandwidthSampler.access$200(DeviceBandwidthSampler.this).addBandwidth(l, l1 - DeviceBandwidthSampler.access$100(DeviceBandwidthSampler.this));
        DeviceBandwidthSampler.access$102(DeviceBandwidthSampler.this, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown what=")).append(message.what).toString());

        case 1: // '\001'
            addSample();
            sendEmptyMessageDelayed(1, 1000L);
            return;

        case 2: // '\002'
            addSample();
            break;
        }
        removeMessages(1);
    }

    public Q(Looper looper)
    {
        this$0 = DeviceBandwidthSampler.this;
        super(looper);
    }
}
