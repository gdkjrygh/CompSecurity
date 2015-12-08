// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.api.legacy.model.PlayableStats;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.playlists.PlaylistRecordHolder;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.soundcloud.android.api.model:
//            ApiUser, Sharing

public class ApiPlaylist
    implements PropertySetSource, PlaylistRecord, PlaylistRecordHolder
{
    private static class RelatedResources
    {

        private PlayableStats stats;
        private ApiUser user;

        void setStats(PlayableStats playablestats)
        {
            stats = playablestats;
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
    private Date createdAt;
    private long duration;
    private String permalinkUrl;
    private Sharing sharing;
    private PlayableStats stats;
    private List tags;
    private String title;
    private int trackCount;
    private Urn urn;
    private ApiUser user;

    public ApiPlaylist()
    {
    }

    ApiPlaylist(Urn urn1)
    {
        urn = urn1;
    }

    public boolean equals(Object obj)
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
            obj = (ApiPlaylist)obj;
            return MoreObjects.equal(urn, ((ApiPlaylist) (obj)).urn);
        }
    }

    public String getArtworkUrl()
    {
        return artworkUrl;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public long getDuration()
    {
        return duration;
    }

    public long getId()
    {
        return urn.getNumericId();
    }

    public int getLikesCount()
    {
        return stats.getLikesCount();
    }

    public String getPermalinkUrl()
    {
        return permalinkUrl;
    }

    public PlaylistRecord getPlaylistRecord()
    {
        return this;
    }

    public int getRepostsCount()
    {
        return stats.getRepostsCount();
    }

    public Sharing getSharing()
    {
        return sharing;
    }

    public PlayableStats getStats()
    {
        return stats;
    }

    public volatile Iterable getTags()
    {
        return getTags();
    }

    public List getTags()
    {
        return tags;
    }

    public String getTitle()
    {
        return title;
    }

    public int getTrackCount()
    {
        return trackCount;
    }

    public Urn getUrn()
    {
        return urn;
    }

    public ApiUser getUser()
    {
        return user;
    }

    public volatile UserRecord getUser()
    {
        return getUser();
    }

    public String getUsername()
    {
        return user.getUsername();
    }

    public int hashCode()
    {
        return urn.hashCode();
    }

    public boolean isPublic()
    {
        return sharing.isPublic();
    }

    public void setArtworkUrl(String s)
    {
        artworkUrl = s;
    }

    public void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public void setDuration(long l)
    {
        duration = l;
    }

    public void setPermalinkUrl(String s)
    {
        permalinkUrl = s;
    }

    public void setRelatedResources(RelatedResources relatedresources)
    {
        user = relatedresources.user;
        stats = relatedresources.stats;
    }

    public void setSharing(Sharing sharing1)
    {
        sharing = sharing1;
    }

    public void setStats(PlayableStats playablestats)
    {
        stats = playablestats;
    }

    public void setTags(List list)
    {
        tags = list;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setTrackCount(int i)
    {
        trackCount = i;
    }

    public void setUrn(Urn urn1)
    {
        urn = urn1;
    }

    public void setUser(ApiUser apiuser)
    {
        user = apiuser;
    }

    public PropertySet toPropertySet()
    {
        boolean flag = true;
        PropertyBinding propertybinding = PlaylistProperty.URN.bind(urn);
        PropertyBinding propertybinding1 = PlaylistProperty.TITLE.bind(title);
        PropertyBinding propertybinding2 = PlaylistProperty.CREATED_AT.bind(createdAt);
        PropertyBinding propertybinding3 = PlaylistProperty.DURATION.bind(Long.valueOf(duration));
        PropertyBinding propertybinding4 = PlaylistProperty.PERMALINK_URL.bind(permalinkUrl);
        Object obj = PlaylistProperty.IS_PRIVATE;
        PropertyBinding propertybinding5;
        PropertyBinding propertybinding6;
        PropertyBinding propertybinding7;
        PropertyBinding propertybinding8;
        PropertyBinding propertybinding9;
        Property property;
        if (isPublic())
        {
            flag = false;
        }
        propertybinding5 = ((Property) (obj)).bind(Boolean.valueOf(flag));
        propertybinding6 = PlaylistProperty.TRACK_COUNT.bind(Integer.valueOf(trackCount));
        propertybinding7 = PlaylistProperty.LIKES_COUNT.bind(Integer.valueOf(getStats().getLikesCount()));
        propertybinding8 = PlaylistProperty.REPOSTS_COUNT.bind(Integer.valueOf(getStats().getRepostsCount()));
        propertybinding9 = PlaylistProperty.CREATOR_NAME.bind(getUsername());
        property = PlaylistProperty.CREATOR_URN;
        if (getUser() != null)
        {
            obj = getUser().getUrn();
        } else
        {
            obj = Urn.NOT_SET;
        }
        return PropertySet.from(new PropertyBinding[] {
            propertybinding, propertybinding1, propertybinding2, propertybinding3, propertybinding4, propertybinding5, propertybinding6, propertybinding7, propertybinding8, propertybinding9, 
            property.bind(obj), PlaylistProperty.TAGS.bind(Optional.fromNullable(tags))
        });
    }
}
