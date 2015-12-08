// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.TimedMetadata;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerView, MediaPlayerNotification

class this._cls0
    implements ckEventListener
{

    final MediaPlayerView this$0;

    public void onPlayComplete()
    {
    }

    public void onPlayStart()
    {
    }

    public void onPrepared()
    {
    }

    public void onProfileChanged(long l, long l1)
    {
    }

    public void onRatePlaying(float f)
    {
    }

    public void onRateSelected(float f)
    {
    }

    public void onReplaceMediaPlayerItem()
    {
    }

    public void onSizeAvailable(long l, long l1)
    {
    }

    public void onStateChanged(State state, MediaPlayerNotification mediaplayernotification)
    {
        MediaPlayerView.access$602(MediaPlayerView.this, state);
    }

    public void onTimedMetadata(TimedMetadata timedmetadata)
    {
    }

    public void onTimelineUpdated()
    {
    }

    public void onUpdated()
    {
    }

    data()
    {
        this$0 = MediaPlayerView.this;
        super();
    }
}
