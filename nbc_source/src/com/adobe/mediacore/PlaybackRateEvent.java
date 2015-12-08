// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class PlaybackRateEvent extends MediaPlayerEvent
{

    private float _rate;

    public PlaybackRateEvent(MediaPlayerEvent.Type type, float f)
    {
        super(type);
        _rate = f;
    }

    public static PlaybackRateEvent createRatePlayingEvent(float f)
    {
        return new PlaybackRateEvent(MediaPlayerEvent.Type.RATE_PLAYING, f);
    }

    public static PlaybackRateEvent createRateSelectedEvent(float f)
    {
        return new PlaybackRateEvent(MediaPlayerEvent.Type.RATE_SELECTED, f);
    }

    public float getRate()
    {
        return _rate;
    }
}
