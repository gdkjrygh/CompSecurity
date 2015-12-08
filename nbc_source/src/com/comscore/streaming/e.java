// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.CSLog;
import java.util.HashMap;
import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//            StreamSense, State

class e extends TimerTask
{

    final State a;
    final HashMap b;
    final StreamSense c;

    e(StreamSense streamsense, State state, HashMap hashmap)
    {
        c = streamsense;
        a = state;
        b = hashmap;
        super();
    }

    public void run()
    {
        CSLog.d(c, "Performing delayed transition");
        StreamSense.a(c, a, b);
    }
}
