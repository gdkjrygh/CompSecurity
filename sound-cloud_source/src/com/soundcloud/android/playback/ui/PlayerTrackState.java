// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerItem, ViewVisibilityProvider

public class PlayerTrackState extends PlayerItem
    implements PropertySetSource
{

    static final PlayerTrackState EMPTY;
    private final boolean isCurrentTrack;
    private final boolean isForeground;
    private Optional station;
    private final ViewVisibilityProvider viewVisibilityProvider;

    PlayerTrackState(PropertySet propertyset, boolean flag, boolean flag1, ViewVisibilityProvider viewvisibilityprovider)
    {
        super(propertyset);
        station = Optional.absent();
        isCurrentTrack = flag;
        isForeground = flag1;
        viewVisibilityProvider = viewvisibilityprovider;
    }

    long getDuration()
    {
        return ((Long)source.get(PlayableProperty.DURATION)).longValue();
    }

    int getLikeCount()
    {
        return ((Integer)source.get(PlayableProperty.LIKES_COUNT)).intValue();
    }

    public String getPermalinkUrl()
    {
        return (String)source.get(PlayableProperty.PERMALINK_URL);
    }

    public PropertySet getSource()
    {
        return source;
    }

    public Optional getStation()
    {
        return station;
    }

    public String getTitle()
    {
        return (String)source.get(PlayableProperty.TITLE);
    }

    public Urn getUrn()
    {
        return (Urn)source.get(TrackProperty.URN);
    }

    public String getUserName()
    {
        return (String)source.getOrElse(PlayableProperty.CREATOR_NAME, "");
    }

    public Urn getUserUrn()
    {
        return (Urn)source.getOrElse(PlayableProperty.CREATOR_URN, Urn.NOT_SET);
    }

    public ViewVisibilityProvider getViewVisibilityProvider()
    {
        return viewVisibilityProvider;
    }

    String getWaveformUrl()
    {
        return (String)source.getOrElseNull(TrackProperty.WAVEFORM_URL);
    }

    public boolean isCurrentTrack()
    {
        return isCurrentTrack;
    }

    public boolean isForeground()
    {
        return isForeground;
    }

    public boolean isPrivate()
    {
        return ((Boolean)source.get(PlayableProperty.IS_PRIVATE)).booleanValue();
    }

    boolean isUserLike()
    {
        return ((Boolean)source.get(PlayableProperty.IS_LIKED)).booleanValue();
    }

    public boolean isUserRepost()
    {
        return ((Boolean)source.get(PlayableProperty.IS_REPOSTED)).booleanValue();
    }

    public void setStation(StationRecord stationrecord)
    {
        station = Optional.of(stationrecord);
    }

    public PropertySet toPropertySet()
    {
        return source;
    }

    static 
    {
        EMPTY = new PlayerTrackState(PropertySet.from(new PropertyBinding[] {
            TrackProperty.URN.bind(Urn.NOT_SET), TrackProperty.TITLE.bind(""), TrackProperty.CREATOR_NAME.bind(""), TrackProperty.CREATOR_URN.bind(Urn.NOT_SET), TrackProperty.DURATION.bind(Long.valueOf(0L)), TrackProperty.WAVEFORM_URL.bind(""), TrackProperty.IS_LIKED.bind(Boolean.valueOf(false)), TrackProperty.IS_REPOSTED.bind(Boolean.valueOf(false)), TrackProperty.LIKES_COUNT.bind(Integer.valueOf(0)), TrackProperty.PERMALINK_URL.bind(""), 
            TrackProperty.IS_PRIVATE.bind(Boolean.valueOf(false))
        }), false, false, ViewVisibilityProvider.EMPTY);
    }
}
