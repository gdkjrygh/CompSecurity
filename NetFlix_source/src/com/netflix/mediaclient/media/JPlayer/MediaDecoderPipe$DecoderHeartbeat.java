// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderPipe

private class mLastBeat
{

    static final long HRATBEAT_INTERVAL = 5000L;
    private long mLastBeat;
    final MediaDecoderPipe this$0;

    void ShowHearbeat(long l, long l1)
    {
        long l2 = System.currentTimeMillis();
        if (l2 >= mLastBeat + 5000L)
        {
            mLastBeat = l2;
            if (Log.isLoggable(MediaDecoderPipe.access$500(MediaDecoderPipe.this), 3))
            {
                Log.d(MediaDecoderPipe.access$500(MediaDecoderPipe.this), (new StringBuilder()).append("decoder alive, received frame ").append(l).append(",decoded frame ").append(l1).toString());
            }
        }
    }

    ()
    {
        this$0 = MediaDecoderPipe.this;
        super();
        mLastBeat = System.currentTimeMillis();
    }
}
