// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import com.soundcloud.android.creators.record.filter.FadeFilter;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder, PlaybackStream, AudioConfig

public class TrimPreview
{

    public static long MAX_PREVIEW_DURATION = 500L;
    public static int PREVIEW_FADE_EXP_CURVE = 10;
    public static long PREVIEW_FADE_LENGTH = 30L;
    public long duration;
    final long endPos;
    public int playbackRate;
    long startPos;
    private final PlaybackStream stream;

    public TrimPreview(PlaybackStream playbackstream, long l, long l1, long l2)
    {
        this(playbackstream, l, l1, l2, SoundRecorder.MAX_PLAYBACK_RATE);
    }

    public TrimPreview(PlaybackStream playbackstream, long l, long l1, long l2, 
            int i)
    {
label0:
        {
            super();
            stream = playbackstream;
            startPos = l;
            endPos = l1;
            duration = l2;
            playbackstream = playbackstream.getConfig();
            l = getByteRange(playbackstream);
            playbackRate = (int)((float)l * (1000F / (float)duration)) / ((AudioConfig) (playbackstream)).sampleSize;
            if (playbackRate > i)
            {
                playbackRate = i;
                duration = (long)(1000F / ((float)(playbackRate * ((AudioConfig) (playbackstream)).sampleSize) / (float)l));
            }
            if (duration > MAX_PREVIEW_DURATION)
            {
                duration = MAX_PREVIEW_DURATION;
                l = playbackstream.bytesToMs((long)((float)(playbackRate * ((AudioConfig) (playbackstream)).sampleSize) / (1000F / (float)duration)));
                if (!isReverse())
                {
                    break label0;
                }
                startPos = l + endPos;
            }
            return;
        }
        startPos = endPos - l;
    }

    public final long getByteRange(AudioConfig audioconfig)
    {
        return audioconfig.msToByte((int)Math.abs(endPos - startPos));
    }

    public FadeFilter getFadeFilter()
    {
        return new FadeFilter(2, AudioConfig.msToByte(PREVIEW_FADE_LENGTH, playbackRate, stream.getConfig().sampleSize), PREVIEW_FADE_EXP_CURVE);
    }

    public final boolean isReverse()
    {
        return startPos > endPos;
    }

    public long lowPos(AudioConfig audioconfig)
    {
        return audioconfig.validBytePosition(Math.min(startPos, endPos));
    }

    public String toString()
    {
        return (new StringBuilder("TrimPreview{stream=")).append(stream).append(", startPos=").append(startPos).append(", endPos=").append(endPos).append(", duration=").append(duration).append(", playbackRate=").append(playbackRate).append('}').toString();
    }

}
