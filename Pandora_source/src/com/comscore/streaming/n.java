// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.utils.c;
import java.util.HashMap;
import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseVideoView

class n extends TimerTask
{

    final long a;
    final HashMap b;
    final StreamSenseVideoView c;

    n(StreamSenseVideoView streamsensevideoview, long l, HashMap hashmap)
    {
        c = streamsensevideoview;
        a = l;
        b = hashmap;
        super();
    }

    public void run()
    {
        com.comscore.utils.c.a("StreamSenseVideoView", (new StringBuilder()).append("startEventTimer -> lastPosition:").append(a).append(" currentPosition:").append(StreamSenseVideoView.a(c)).toString());
        long l = Long.parseLong((String)b.get("ns_ts"));
        long l1 = StreamSenseVideoView.a(c) - a;
        long l2 = System.currentTimeMillis();
        if (l1 >= 500L)
        {
            l1 = l2 - l - l1;
            if (l1 > 0L)
            {
                StreamSenseVideoView.a(c, l1);
                com.comscore.utils.c.a("StreamSenseVideoView", (new StringBuilder()).append("addToBufferingTotal=").append(l1).toString());
                b.put("ns_ts", String.valueOf(l + l1));
            }
            b.put("ns_st_bt", String.valueOf(StreamSenseVideoView.b(c)));
            com.comscore.streaming.StreamSenseVideoView.c(c);
            StreamSenseVideoView.a(c, b, StreamSenseVideoView.a(c));
            StreamSenseVideoView.d(c);
            return;
        } else
        {
            com.comscore.streaming.StreamSenseVideoView.c(c);
            StreamSenseVideoView.a(c, b);
            return;
        }
    }
}
