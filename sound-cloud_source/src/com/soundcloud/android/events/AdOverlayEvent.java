// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.TrackSourceInfo;
import com.soundcloud.java.collections.PropertySet;

public class AdOverlayEvent
{

    public static final int HIDDEN = 1;
    private static final AdOverlayEvent HIDDEN_EVENT;
    public static final int SHOWN = 0;
    private final PropertySet adMetaData;
    private final Urn currentPlayingUrn;
    private final int kind;
    private final TrackSourceInfo trackSourceInfo;

    public AdOverlayEvent(int i, Urn urn, PropertySet propertyset, TrackSourceInfo tracksourceinfo)
    {
        kind = i;
        currentPlayingUrn = urn;
        adMetaData = propertyset;
        trackSourceInfo = tracksourceinfo;
    }

    public static AdOverlayEvent hidden()
    {
        return HIDDEN_EVENT;
    }

    public static AdOverlayEvent shown(Urn urn, PropertySet propertyset, TrackSourceInfo tracksourceinfo)
    {
        return new AdOverlayEvent(0, urn, propertyset, tracksourceinfo);
    }

    public PropertySet getAdMetaData()
    {
        return adMetaData;
    }

    public Urn getCurrentPlayingUrn()
    {
        return currentPlayingUrn;
    }

    public int getKind()
    {
        return kind;
    }

    public TrackSourceInfo getTrackSourceInfo()
    {
        return trackSourceInfo;
    }

    public String toString()
    {
        return (new StringBuilder("AdOverlayEvent: ")).append(kind).toString();
    }

    static 
    {
        HIDDEN_EVENT = new AdOverlayEvent(1, Urn.NOT_SET, null, null);
    }
}
