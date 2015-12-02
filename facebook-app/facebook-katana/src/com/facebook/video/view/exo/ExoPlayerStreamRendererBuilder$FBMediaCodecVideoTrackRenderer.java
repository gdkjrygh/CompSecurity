// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.os.Handler;
import com.google.android.exoplayer.MediaCodecVideoTrackRenderer;
import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleSource;

public class c extends MediaCodecVideoTrackRenderer
{

    protected final EventListener c;

    protected final void a(MediaFormatHolder mediaformatholder)
    {
        class EventListener
            implements com.google.android.exoplayer.MediaCodecVideoTrackRenderer.EventListener
        {

            public abstract void a(MediaFormat mediaformat);
        }

        if (mediaformatholder.a != null)
        {
            c.a(mediaformatholder.a);
        }
        super.a(mediaformatholder);
    }

    public EventListener(SampleSource samplesource, int i, long l, Handler handler, EventListener eventlistener, int j)
    {
        super(samplesource, null, true, i, l, null, handler, eventlistener, j);
        c = eventlistener;
    }
}
