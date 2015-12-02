// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.view.Surface;

// Referenced classes of package com.google.android.exoplayer:
//            MediaCodecVideoTrackRenderer

class a
    implements Runnable
{

    final Surface a;
    final MediaCodecVideoTrackRenderer b;

    public void run()
    {
        MediaCodecVideoTrackRenderer.a(b).a(a);
    }

    entListener(MediaCodecVideoTrackRenderer mediacodecvideotrackrenderer, Surface surface)
    {
        b = mediacodecvideotrackrenderer;
        a = surface;
        super();
    }
}
