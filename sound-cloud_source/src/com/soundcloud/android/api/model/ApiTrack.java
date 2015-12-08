// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.tracks.TrackRecordHolder;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.soundcloud.android.api.model:
//            Sharing, ApiTrackStats, ApiUser

public final class ApiTrack
    implements PropertySetSource, TrackRecord, TrackRecordHolder
{
    private static class RelatedResources
    {

        private ApiTrackStats stats;
        private ApiUser user;

        void setStats(ApiTrackStats apitrackstats)
        {
            stats = apitrackstats;
        }

        void setUser(ApiUser apiuser)
        {
            user = apiuser;
        }



        private RelatedResources()
        {
        }
    }


    private String artworkUrl;
    private boolean commentable;
    private Date createdAt;
    private long duration;
    private String genre;
    private boolean monetizable;
    private Optional monetizationModel;
    private String permalinkUrl;
    private String policy;
    private Sharing sharing;
    private ApiTrackStats stats;
    private String streamUrl;
    private Optional subHighTier;
    private Optional subMidTier;
    private boolean syncable;
    private String title;
    private Urn urn;
    private ApiUser user;
    private List userTags;
    private String waveformUrl;

    public ApiTrack()
    {
        duration = -1L;
        sharing = Sharing.UNDEFINED;
        monetizationModel = Optional.absent();
        subMidTier = Optional.absent();
        subHighTier = Optional.absent();
    }

    ApiTrack(Urn urn1)
    {
        duration = -1L;
        sharing = Sharing.UNDEFINED;
        monetizationModel = Optional.absent();
        subMidTier = Optional.absent();
        subHighTier = Optional.absent();
        urn = urn1;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (ApiTrack)obj;
            return MoreObjects.equal(urn, ((ApiTrack) (obj)).urn);
        }
    }

    public final String getArtworkUrl()
    {
        return artworkUrl;
    }

    public final int getCommentsCount()
    {
        return stats.getCommentsCount();
    }

    public final Date getCreatedAt()
    {
        return createdAt;
    }

    public final Optional getDescription()
    {
        return Optional.absent();
    }

    public final long getDuration()
    {
        return duration;
    }

    public final String getGenre()
    {
        return genre;
    }

    public final long getId()
    {
        return urn.getNumericId();
    }

    public final int getLikesCount()
    {
        return stats.getLikesCount();
    }

    public final Optional getMonetizationModel()
    {
        return monetizationModel;
    }

    public final String getPermalinkUrl()
    {
        return permalinkUrl;
    }

    public final int getPlaybackCount()
    {
        return stats.getPlaybackCount();
    }

    public final String getPolicy()
    {
        return policy;
    }

    public final int getRepostsCount()
    {
        return stats.getRepostsCount();
    }

    public final Sharing getSharing()
    {
        return sharing;
    }

    public final ApiTrackStats getStats()
    {
        return stats;
    }

    public final String getStreamUrl()
    {
        return streamUrl;
    }

    public final String getTitle()
    {
        return title;
    }

    public final TrackRecord getTrackRecord()
    {
        return this;
    }

    public final Urn getUrn()
    {
        return urn;
    }

    public final UserRecord getUser()
    {
        return user;
    }

    public final String getUserName()
    {
        if (user != null)
        {
            return user.getUsername();
        } else
        {
            return "";
        }
    }

    public final List getUserTags()
    {
        return userTags;
    }

    public final String getWaveformUrl()
    {
        return waveformUrl;
    }

    public final int hashCode()
    {
        return urn.hashCode();
    }

    public final boolean isCommentable()
    {
        return commentable;
    }

    public final boolean isMonetizable()
    {
        return monetizable;
    }

    public final Boolean isPrivate()
    {
        boolean flag;
        if (getSharing() != Sharing.PUBLIC)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final Optional isSubHighTier()
    {
        return subHighTier;
    }

    public final Optional isSubMidTier()
    {
        return subMidTier;
    }

    public final boolean isSyncable()
    {
        return syncable;
    }

    public final void setArtworkUrl(String s)
    {
        artworkUrl = s;
    }

    public final void setCommentable(boolean flag)
    {
        commentable = flag;
    }

    public final void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public final void setDuration(long l)
    {
        duration = l;
    }

    public final void setGenre(String s)
    {
        genre = s;
    }

    public final void setMonetizable(boolean flag)
    {
        monetizable = flag;
    }

    public final void setMonetizationModel(String s)
    {
        monetizationModel = Optional.of(s);
    }

    public final void setPermalinkUrl(String s)
    {
        permalinkUrl = s;
    }

    public final void setPolicy(String s)
    {
        policy = s;
    }

    public final void setRelatedResources(RelatedResources relatedresources)
    {
        user = relatedresources.user;
        stats = relatedresources.stats;
    }

    public final void setSharing(Sharing sharing1)
    {
        sharing = sharing1;
    }

    public final void setStats(ApiTrackStats apitrackstats)
    {
        stats = apitrackstats;
    }

    public final void setStreamUrl(String s)
    {
        streamUrl = s;
    }

    public final void setSubHighTier(boolean flag)
    {
        subHighTier = Optional.of(Boolean.valueOf(flag));
    }

    public final void setSubMidTier(boolean flag)
    {
        subMidTier = Optional.of(Boolean.valueOf(flag));
    }

    public final void setSyncable(boolean flag)
    {
        syncable = flag;
    }

    public final void setTitle(String s)
    {
        title = s;
    }

    public final void setUrn(Urn urn1)
    {
        urn = urn1;
    }

    public final void setUser(ApiUser apiuser)
    {
        user = apiuser;
    }

    public final void setUserTags(List list)
    {
        userTags = list;
    }

    public final void setWaveformUrl(String s)
    {
        waveformUrl = s;
    }

    public final PropertySet toPropertySet()
    {
        PropertyBinding propertybinding = TrackProperty.URN.bind(getUrn());
        PropertyBinding propertybinding1 = TrackProperty.TITLE.bind(getTitle());
        PropertyBinding propertybinding2 = TrackProperty.CREATED_AT.bind(getCreatedAt());
        PropertyBinding propertybinding3 = TrackProperty.DURATION.bind(Long.valueOf(getDuration()));
        PropertyBinding propertybinding4 = TrackProperty.IS_PRIVATE.bind(isPrivate());
        PropertyBinding propertybinding5 = TrackProperty.WAVEFORM_URL.bind(getWaveformUrl());
        PropertyBinding propertybinding6 = TrackProperty.PERMALINK_URL.bind(getPermalinkUrl());
        PropertyBinding propertybinding7 = TrackProperty.MONETIZABLE.bind(Boolean.valueOf(isMonetizable()));
        PropertyBinding propertybinding8 = TrackProperty.SYNCABLE.bind(Boolean.valueOf(isSyncable()));
        PropertyBinding propertybinding9 = TrackProperty.POLICY.bind(getPolicy());
        PropertyBinding propertybinding10 = TrackProperty.PLAY_COUNT.bind(Integer.valueOf(getStats().getPlaybackCount()));
        PropertyBinding propertybinding11 = TrackProperty.COMMENTS_COUNT.bind(Integer.valueOf(getStats().getCommentsCount()));
        PropertyBinding propertybinding12 = TrackProperty.LIKES_COUNT.bind(Integer.valueOf(getStats().getLikesCount()));
        PropertyBinding propertybinding13 = TrackProperty.REPOSTS_COUNT.bind(Integer.valueOf(getStats().getRepostsCount()));
        PropertyBinding propertybinding14 = TrackProperty.CREATOR_NAME.bind(getUserName());
        Property property = TrackProperty.CREATOR_URN;
        Object obj;
        if (getUser() != null)
        {
            obj = getUser().getUrn();
        } else
        {
            obj = Urn.NOT_SET;
        }
        obj = PropertySet.from(new PropertyBinding[] {
            propertybinding, propertybinding1, propertybinding2, propertybinding3, propertybinding4, propertybinding5, propertybinding6, propertybinding7, propertybinding8, propertybinding9, 
            propertybinding10, propertybinding11, propertybinding12, propertybinding13, propertybinding14, property.bind(obj), TrackProperty.GENRE.bind(Optional.fromNullable(genre))
        });
        if (isSubMidTier().isPresent())
        {
            ((PropertySet) (obj)).put(TrackProperty.SUB_MID_TIER, isSubMidTier().get());
        }
        if (getMonetizationModel().isPresent())
        {
            ((PropertySet) (obj)).put(TrackProperty.MONETIZATION_MODEL, getMonetizationModel().get());
        }
        return ((PropertySet) (obj));
    }

    public final String toString()
    {
        return MoreObjects.toStringHelper(this).add("title", title).add("genre", genre).add("user", user).add("commentable", commentable).add("duration", duration).add("streamUrl", streamUrl).add("waveformUrl", waveformUrl).add("userTags", userTags).add("createdAt", createdAt).add("artworkUrl", artworkUrl).add("permalinkUrl", permalinkUrl).add("monetizable", monetizable).add("syncable", syncable).add("policy", policy).add("sharing", sharing).add("stats", stats).toString();
    }
}
