// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.comscore.streaming.StreamSense;
import com.comscore.streaming.StreamSenseEventType;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            StreamSenseAnalytics

class val.time extends Thread
{

    final StreamSenseAnalytics this$0;
    final int val$event;
    final long val$time;

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        if (StreamSenseAnalytics.access$100(StreamSenseAnalytics.this) == null) goto _L2; else goto _L1
_L1:
        int i = val$event;
        i;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 51
    //                   1 105
    //                   2 154
    //                   3 203;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        StreamSenseAnalytics.access$100(StreamSenseAnalytics.this).notify(StreamSenseEventType.BUFFER, val$time);
        Timber.d((new StringBuilder()).append("event: BUFFER | time :").append(val$time).toString(), new Object[0]);
          goto _L2
        Exception exception;
        exception;
        throw exception;
_L4:
        StreamSenseAnalytics.access$100(StreamSenseAnalytics.this).notify(StreamSenseEventType.PAUSE, val$time);
        Timber.d((new StringBuilder()).append("event: PAUSE | time :").append(val$time).toString(), new Object[0]);
          goto _L2
_L5:
        StreamSenseAnalytics.access$100(StreamSenseAnalytics.this).notify(StreamSenseEventType.PLAY, val$time);
        Timber.d((new StringBuilder()).append("event: PLAY | time :").append(val$time).toString(), new Object[0]);
          goto _L2
_L6:
        StreamSenseAnalytics.access$100(StreamSenseAnalytics.this).notify(StreamSenseEventType.END, val$time);
        Timber.d((new StringBuilder()).append("event: END | time :").append(val$time).toString(), new Object[0]);
          goto _L2
    }

    ()
    {
        this$0 = final_streamsenseanalytics;
        val$event = i;
        val$time = J.this;
        super();
    }
}
