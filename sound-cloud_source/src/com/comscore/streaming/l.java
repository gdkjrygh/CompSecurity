// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import java.util.TimerTask;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseMediaPlayer

class l extends TimerTask
{

    final long a;
    final StreamSenseMediaPlayer b;

    l(StreamSenseMediaPlayer streamsensemediaplayer, long l1)
    {
        b = streamsensemediaplayer;
        a = l1;
        super();
    }

    public void run()
    {
        if (StreamSenseMediaPlayer.l(b) == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        long l1 = StreamSenseMediaPlayer.i(b);
        if (a == l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!StreamSenseMediaPlayer.m(b) || b.isPlayerPausedForSeeking() || !flag || b.isPlayerPausedForBuffering()) goto _L4; else goto _L3
_L3:
        StreamSenseMediaPlayer.d(b);
_L6:
        StreamSenseMediaPlayer.n(b);
        StreamSenseMediaPlayer.k(b);
_L2:
        return;
_L4:
        if (StreamSenseMediaPlayer.m(b) && !b.isPlayerPausedForSeeking() && !flag && b.isPlayerPausedForBuffering())
        {
            StreamSenseMediaPlayer.e(b);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
