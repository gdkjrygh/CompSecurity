// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.playback:
//            TrackQueueItem

public abstract class PlayQueueItem
{
    private static class Empty extends PlayQueueItem
    {

        public Kind getKind()
        {
            return Kind.EMPTY;
        }

        public boolean shouldPersist()
        {
            return false;
        }

        public Empty()
        {
            setMetaData(PropertySet.create());
        }
    }

    static final class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind EMPTY;
        public static final Kind TRACK;
        public static final Kind VIDEO;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(com/soundcloud/android/playback/PlayQueueItem$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        static 
        {
            EMPTY = new Kind("EMPTY", 0);
            TRACK = new Kind("TRACK", 1);
            VIDEO = new Kind("VIDEO", 2);
            $VALUES = (new Kind[] {
                EMPTY, TRACK, VIDEO
            });
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }


    public static final PlayQueueItem EMPTY = new Empty();
    private PropertySet metaData;

    public PlayQueueItem()
    {
    }

    public abstract Kind getKind();

    public PropertySet getMetaData()
    {
        return metaData;
    }

    public Urn getUrn()
    {
        Preconditions.checkArgument(isTrack(), "Getting URN from non-track play queue item");
        return ((TrackQueueItem)this).getTrackUrn();
    }

    public Urn getUrnOrNotSet()
    {
        if (isTrack())
        {
            return getUrn();
        } else
        {
            return Urn.NOT_SET;
        }
    }

    public boolean isEmpty()
    {
        return getKind() == Kind.EMPTY;
    }

    public boolean isTrack()
    {
        return getKind() == Kind.TRACK;
    }

    public boolean isVideo()
    {
        return getKind() == Kind.VIDEO;
    }

    public void setMetaData(PropertySet propertyset)
    {
        metaData = propertyset;
    }

    public abstract boolean shouldPersist();

}
