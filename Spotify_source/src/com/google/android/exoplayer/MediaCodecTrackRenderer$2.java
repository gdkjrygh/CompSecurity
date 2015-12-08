// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import azb;

// Referenced classes of package com.google.android.exoplayer:
//            MediaCodecTrackRenderer

final class a
    implements Runnable
{

    private android.media. a;
    private MediaCodecTrackRenderer b;

    public final void run()
    {
        b.b.a(a);
    }

    (MediaCodecTrackRenderer mediacodectrackrenderer, android.media. )
    {
        b = mediacodectrackrenderer;
        a = ;
        super();
    }
}
