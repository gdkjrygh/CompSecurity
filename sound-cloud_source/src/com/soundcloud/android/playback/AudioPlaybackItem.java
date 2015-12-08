// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.os.Parcelable;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackItem, PlaybackType, AutoParcel_AudioPlaybackItem

public abstract class AudioPlaybackItem
    implements Parcelable, PlaybackItem
{

    public AudioPlaybackItem()
    {
    }

    public static AudioPlaybackItem create(PropertySet propertyset, long l)
    {
        return create(propertyset, l, PlaybackType.DEFAULT);
    }

    public static AudioPlaybackItem create(PropertySet propertyset, long l, PlaybackType playbacktype)
    {
        return new AutoParcel_AudioPlaybackItem((Urn)propertyset.get(TrackProperty.URN), l, ((Long)propertyset.get(TrackProperty.DURATION)).longValue(), playbacktype);
    }

    public static AudioPlaybackItem forAudioAd(PropertySet propertyset)
    {
        return create(propertyset, 0L, PlaybackType.UNINTERRUPTED);
    }

    public static AudioPlaybackItem forOffline(PropertySet propertyset, long l)
    {
        return create(propertyset, l, PlaybackType.OFFLINE);
    }

    public abstract long getDuration();

    public abstract PlaybackType getPlaybackType();

    public abstract long getStartPosition();

    public abstract Urn getTrackUrn();
}
