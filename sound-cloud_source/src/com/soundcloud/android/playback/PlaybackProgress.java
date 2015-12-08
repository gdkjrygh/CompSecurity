// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.android.utils.SystemClockDateProvider;

public class PlaybackProgress
{

    private final long createdAt;
    private final DateProvider dateProvider;
    private long duration;
    private final long position;

    public PlaybackProgress(long l, long l1)
    {
        this(l, l1, ((DateProvider) (new SystemClockDateProvider())));
    }

    public PlaybackProgress(long l, long l1, DateProvider dateprovider)
    {
        position = l;
        duration = l1;
        dateProvider = dateprovider;
        createdAt = dateprovider.getCurrentTime();
    }

    public static PlaybackProgress empty()
    {
        return new PlaybackProgress(0L, 0L);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PlaybackProgress)obj;
            if (createdAt != ((PlaybackProgress) (obj)).createdAt || duration != ((PlaybackProgress) (obj)).duration || position != ((PlaybackProgress) (obj)).position)
            {
                return false;
            }
        }
        return true;
    }

    public long getDuration()
    {
        return duration;
    }

    public long getPosition()
    {
        return position;
    }

    public float getProgressProportion()
    {
        if (duration == 0L)
        {
            return 0.0F;
        } else
        {
            return (float)position / (float)duration;
        }
    }

    public long getTimeLeft()
    {
        return Math.max(duration - position, 0L);
    }

    public long getTimeSinceCreation()
    {
        return dateProvider.getCurrentTime() - createdAt;
    }

    public int hashCode()
    {
        return ((int)(position ^ position >>> 32) * 31 + (int)(duration ^ duration >>> 32)) * 31 + (int)(createdAt ^ createdAt >>> 32);
    }

    public boolean isDurationValid()
    {
        return duration > 0L;
    }

    public boolean isEmpty()
    {
        return position == 0L && duration == 0L;
    }

    public void setDuration(long l)
    {
        duration = l;
    }

    public String toString()
    {
        return (new StringBuilder("PlaybackProgress{position=")).append(position).append(", duration=").append(duration).append(", createdAt=").append(createdAt).append('}').toString();
    }
}
