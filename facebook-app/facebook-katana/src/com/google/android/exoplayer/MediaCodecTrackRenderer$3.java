// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            MediaCodecTrackRenderer

class c
    implements Runnable
{

    final String a;
    final long b;
    final long c;
    final MediaCodecTrackRenderer d;

    public void run()
    {
        MediaCodecTrackRenderer.a(d).a(a, b, c);
    }

    entListener(MediaCodecTrackRenderer mediacodectrackrenderer, String s, long l, long l1)
    {
        d = mediacodectrackrenderer;
        a = s;
        b = l;
        c = l1;
        super();
    }
}
