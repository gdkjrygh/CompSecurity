// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackProgress;

// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class AudioAdFailedToBufferEvent extends TrackingEvent
{

    public static final String PLAYBACK_POSITION = "playback_position";
    public static final String WAIT_PERIOD = "wait_period_secs";

    public AudioAdFailedToBufferEvent(Urn urn, PlaybackProgress playbackprogress, int i)
    {
        super("default", System.currentTimeMillis());
        put("ad_urn", urn.toString());
        put("playback_position", Long.toString(playbackprogress.getPosition()));
        put("wait_period_secs", Integer.toString(i));
    }
}
