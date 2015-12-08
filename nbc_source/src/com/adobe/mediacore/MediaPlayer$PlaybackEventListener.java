// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.TimedMetadata;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayer, MediaPlayerNotification

public static interface 
    extends 
{

    public abstract void onPlayComplete();

    public abstract void onPlayStart();

    public abstract void onPrepared();

    public abstract void onProfileChanged(long l, long l1);

    public abstract void onRatePlaying(float f);

    public abstract void onRateSelected(float f);

    public abstract void onReplaceMediaPlayerItem();

    public abstract void onSizeAvailable(long l, long l1);

    public abstract void onStateChanged( , MediaPlayerNotification mediaplayernotification);

    public abstract void onTimedMetadata(TimedMetadata timedmetadata);

    public abstract void onTimelineUpdated();

    public abstract void onUpdated();
}
