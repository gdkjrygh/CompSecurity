// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.os.Parcel;
import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.playback:
//            AudioPlaybackItem, PlaybackType

final class AutoParcel_AudioPlaybackItem extends AudioPlaybackItem
{

    private static final ClassLoader CL = com/soundcloud/android/playback/AutoParcel_AudioPlaybackItem.getClassLoader();
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final long duration;
    private final PlaybackType playbackType;
    private final long startPosition;
    private final Urn trackUrn;

    private AutoParcel_AudioPlaybackItem(Parcel parcel)
    {
        this((Urn)parcel.readValue(CL), ((Long)parcel.readValue(CL)).longValue(), ((Long)parcel.readValue(CL)).longValue(), (PlaybackType)parcel.readValue(CL));
    }

    AutoParcel_AudioPlaybackItem(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    AutoParcel_AudioPlaybackItem(Urn urn, long l, long l1, PlaybackType playbacktype)
    {
        if (urn == null)
        {
            throw new NullPointerException("Null trackUrn");
        }
        trackUrn = urn;
        startPosition = l;
        duration = l1;
        if (playbacktype == null)
        {
            throw new NullPointerException("Null playbackType");
        } else
        {
            playbackType = playbacktype;
            return;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof AudioPlaybackItem)
            {
                if (!trackUrn.equals(((AudioPlaybackItem) (obj = (AudioPlaybackItem)obj)).getTrackUrn()) || startPosition != ((AudioPlaybackItem) (obj)).getStartPosition() || duration != ((AudioPlaybackItem) (obj)).getDuration() || !playbackType.equals(((AudioPlaybackItem) (obj)).getPlaybackType()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final long getDuration()
    {
        return duration;
    }

    public final PlaybackType getPlaybackType()
    {
        return playbackType;
    }

    public final long getStartPosition()
    {
        return startPosition;
    }

    public final Urn getTrackUrn()
    {
        return trackUrn;
    }

    public final int hashCode()
    {
        return (int)((long)((int)((long)((trackUrn.hashCode() ^ 0xf4243) * 0xf4243) ^ (startPosition >>> 32 ^ startPosition)) * 0xf4243) ^ (duration >>> 32 ^ duration)) * 0xf4243 ^ playbackType.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("AudioPlaybackItem{trackUrn=")).append(trackUrn).append(", startPosition=").append(startPosition).append(", duration=").append(duration).append(", playbackType=").append(playbackType).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(trackUrn);
        parcel.writeValue(Long.valueOf(startPosition));
        parcel.writeValue(Long.valueOf(duration));
        parcel.writeValue(playbackType);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final AutoParcel_AudioPlaybackItem createFromParcel(Parcel parcel)
        {
            return new AutoParcel_AudioPlaybackItem(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AutoParcel_AudioPlaybackItem[] newArray(int i)
        {
            return new AutoParcel_AudioPlaybackItem[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
