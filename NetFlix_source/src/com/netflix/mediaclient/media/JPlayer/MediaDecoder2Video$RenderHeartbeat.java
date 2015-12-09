// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoder2Video

private class mLastBeat
{

    static final long HRATBEAT_INTERVAL = 5000L;
    private long mLastBeat;
    final MediaDecoder2Video this$0;

    void ShowHearbeat()
    {
        long l = System.currentTimeMillis();
        if (l >= mLastBeat + 5000L)
        {
            mLastBeat = l;
            if (Log.isLoggable("MediaDecoder2Video", 3))
            {
                Log.d("MediaDecoder2Video", (new StringBuilder()).append("render alive, rendered frame ").append(MediaDecoder2Video.access$600(MediaDecoder2Video.this)).append(",skipped frame ").append(MediaDecoder2Video.access$700(MediaDecoder2Video.this)).toString());
            }
        }
    }

    ()
    {
        this$0 = MediaDecoder2Video.this;
        super();
        mLastBeat = System.currentTimeMillis();
    }
}
