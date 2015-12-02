// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            MediaCodecVideoTrackRenderer

class b
    implements Runnable
{

    final int a;
    final long b;
    final MediaCodecVideoTrackRenderer c;

    public void run()
    {
        MediaCodecVideoTrackRenderer.a(c).a(a, b);
    }

    entListener(MediaCodecVideoTrackRenderer mediacodecvideotrackrenderer, int i, long l)
    {
        c = mediacodecvideotrackrenderer;
        a = i;
        b = l;
        super();
    }
}
