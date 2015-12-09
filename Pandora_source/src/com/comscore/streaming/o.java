// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseVideoView

class o extends TimerTask
{

    final long a;
    final StreamSenseVideoView b;

    o(StreamSenseVideoView streamsensevideoview, long l)
    {
        b = streamsensevideoview;
        a = l;
        super();
    }

    public void run()
    {
label0:
        {
            if (StreamSenseVideoView.e(b) != null)
            {
                long l = StreamSenseVideoView.a(b);
                boolean flag;
                if (a == l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!StreamSenseVideoView.f(b) || !flag || StreamSenseVideoView.g(b))
                {
                    break label0;
                }
                StreamSenseVideoView.h(b);
                StreamSenseVideoView.i(b);
            }
            return;
        }
        StreamSenseVideoView.h(b);
        StreamSenseVideoView.d(b);
    }
}
