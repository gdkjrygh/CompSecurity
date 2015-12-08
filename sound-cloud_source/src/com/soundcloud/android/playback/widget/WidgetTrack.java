// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import com.soundcloud.android.ads.AdProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;

class WidgetTrack
{

    private final PropertySet source;

    WidgetTrack(PropertySet propertyset)
    {
        source = propertyset;
    }

    String getTitle()
    {
        return (String)source.get(PlayableProperty.TITLE);
    }

    Urn getUrn()
    {
        return (Urn)source.get(TrackProperty.URN);
    }

    String getUserName()
    {
        return (String)source.get(PlayableProperty.CREATOR_NAME);
    }

    Urn getUserUrn()
    {
        return (Urn)source.get(PlayableProperty.CREATOR_URN);
    }

    boolean isAudioAd()
    {
        return source.contains(AdProperty.AD_URN) && ((String)source.get(AdProperty.AD_TYPE)).equals("audio_ad");
    }

    boolean isUserLike()
    {
        return ((Boolean)source.get(PlayableProperty.IS_LIKED)).booleanValue();
    }
}
