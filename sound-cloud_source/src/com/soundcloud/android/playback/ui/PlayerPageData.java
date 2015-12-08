// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.java.collections.PropertySet;

public abstract class PlayerPageData
{
    static final class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind TRACK;
        public static final Kind VIDEO;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(com/soundcloud/android/playback/ui/PlayerPageData$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        static 
        {
            TRACK = new Kind("TRACK", 0);
            VIDEO = new Kind("VIDEO", 1);
            $VALUES = (new Kind[] {
                TRACK, VIDEO
            });
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }


    final Kind kind;
    final int positionInPlayQueue;
    final PropertySet properties;

    PlayerPageData(Kind kind1, int i, PropertySet propertyset)
    {
        kind = kind1;
        positionInPlayQueue = i;
        properties = propertyset;
    }

    public int getPositionInPlayQueue()
    {
        return positionInPlayQueue;
    }

    public PropertySet getProperties()
    {
        return properties;
    }

    boolean isAdPage()
    {
        return properties.contains(AdProperty.AD_URN);
    }

    boolean isTrackPage()
    {
        return kind == Kind.TRACK;
    }

    boolean isVideoPage()
    {
        return kind == Kind.VIDEO;
    }
}
