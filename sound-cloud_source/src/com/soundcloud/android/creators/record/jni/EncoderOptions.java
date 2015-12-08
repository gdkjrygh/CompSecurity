// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.jni;

import com.soundcloud.android.creators.record.PlaybackFilter;
import com.soundcloud.android.creators.record.SoundRecorder;

// Referenced classes of package com.soundcloud.android.creators.record.jni:
//            ProgressListener

public class EncoderOptions
{

    public static final EncoderOptions DEFAULT;
    public static final EncoderOptions HI_Q = new EncoderOptions(1.0F, 0L, -1L, null, null);
    public static final EncoderOptions LO_Q;
    public static final EncoderOptions MED_Q;
    public final long end;
    public final PlaybackFilter filter;
    public final ProgressListener listener;
    public final float quality;
    public final long start;

    public EncoderOptions(float f, long l, long l1, ProgressListener progresslistener, PlaybackFilter playbackfilter)
    {
        if (f < 0.0F || f > 1.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid quality: ")).append(f).toString());
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid start: ")).append(l).toString());
        }
        if (l1 < -1L)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid end: ")).append(l1).toString());
        } else
        {
            start = l;
            end = l1;
            filter = playbackfilter;
            quality = f;
            listener = progresslistener;
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder("EncoderOptions{start=")).append(start).append(", end=").append(end).append(", quality=").append(quality).append(", filter=").append(filter).append(", listener=").append(listener).append('}').toString();
    }

    static 
    {
        LO_Q = new EncoderOptions(0.1F, 0L, -1L, null, null);
        MED_Q = new EncoderOptions(0.5F, 0L, -1L, null, null);
        EncoderOptions encoderoptions;
        if (SoundRecorder.hasFPUSupport())
        {
            encoderoptions = MED_Q;
        } else
        {
            encoderoptions = LO_Q;
        }
        DEFAULT = encoderoptions;
    }
}
