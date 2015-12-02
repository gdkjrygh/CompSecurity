// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import android.os.Handler;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleSource;

public class c extends MediaCodecAudioTrackRenderer
{

    protected final EventListener c;

    protected final void a(MediaFormatHolder mediaformatholder)
    {
        class EventListener
            implements com.google.android.exoplayer.MediaCodecAudioTrackRenderer.EventListener
        {

            public abstract void a(MediaFormat mediaformat);
        }

        if (mediaformatholder.a != null)
        {
            c.a(mediaformatholder.a);
        }
        super.a(mediaformatholder);
    }

    public EventListener(SampleSource samplesource, Handler handler, EventListener eventlistener)
    {
        super(samplesource, handler, eventlistener);
        c = eventlistener;
    }
}
