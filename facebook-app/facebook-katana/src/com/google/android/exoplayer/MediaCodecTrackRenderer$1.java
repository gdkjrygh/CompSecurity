// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            MediaCodecTrackRenderer

class a
    implements Runnable
{

    final coderInitializationException a;
    final MediaCodecTrackRenderer b;

    public void run()
    {
        MediaCodecTrackRenderer.a(b).a(a);
    }

    coderInitializationException(MediaCodecTrackRenderer mediacodectrackrenderer, coderInitializationException coderinitializationexception)
    {
        b = mediacodectrackrenderer;
        a = coderinitializationexception;
        super();
    }
}
