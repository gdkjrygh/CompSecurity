// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            MediaCodecAudioTrackRenderer

class a
    implements Runnable
{

    final com.google.android.exoplayer.audio.ion a;
    final MediaCodecAudioTrackRenderer b;

    public void run()
    {
        MediaCodecAudioTrackRenderer.a(b).a(a);
    }

    Exception(MediaCodecAudioTrackRenderer mediacodecaudiotrackrenderer, com.google.android.exoplayer.audio.ion ion)
    {
        b = mediacodecaudiotrackrenderer;
        a = ion;
        super();
    }
}
