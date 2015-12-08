// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            VideoDecoderPipe

private class mLastBeat
{

    static final long HRATBEAT_INTERVAL = 5000L;
    private long mLastBeat;
    final VideoDecoderPipe this$0;

    void ShowHearbeat()
    {
        long l = System.currentTimeMillis();
        if (l >= mLastBeat + 5000L)
        {
            mLastBeat = l;
            if (Log.isLoggable(VideoDecoderPipe.access$200(VideoDecoderPipe.this), 3))
            {
                Log.d(VideoDecoderPipe.access$200(VideoDecoderPipe.this), (new StringBuilder()).append("render alive, rendered frame ").append(VideoDecoderPipe.access$500(VideoDecoderPipe.this)).append(",skipped frame ").append(VideoDecoderPipe.access$600(VideoDecoderPipe.this)).toString());
            }
        }
    }

    ()
    {
        this$0 = VideoDecoderPipe.this;
        super();
        mLastBeat = System.currentTimeMillis();
    }
}
