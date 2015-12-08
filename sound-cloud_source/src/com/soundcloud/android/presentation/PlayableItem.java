// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.PromotedItemProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PromotedPlaylistItem;
import com.soundcloud.android.stream.StreamItem;
import com.soundcloud.android.tracks.PromotedTrackItem;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.optional.Optional;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.presentation:
//            ListItem

public abstract class PlayableItem
    implements StreamItem
{

    public final PropertySet source;

    public PlayableItem(PropertySet propertyset)
    {
        source = propertyset;
    }

    public static PlayableItem from(PropertySet propertyset)
    {
        Urn urn = (Urn)propertyset.get(EntityProperty.URN);
        boolean flag = propertyset.contains(PromotedItemProperty.AD_URN);
        if (urn.isTrack())
        {
            if (flag)
            {
                return PromotedTrackItem.from(propertyset);
            } else
            {
                return TrackItem.from(propertyset);
            }
        }
        if (urn.isPlaylist())
        {
            if (flag)
            {
                return PromotedPlaylistItem.from(propertyset);
            } else
            {
                return PlaylistItem.from(propertyset);
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown playable item: ")).append(urn).toString());
        }
    }

    public Date getCreatedAt()
    {
        return (Date)source.get(PlayableProperty.CREATED_AT);
    }

    public String getCreatorName()
    {
        return (String)source.getOrElse(PlayableProperty.CREATOR_NAME, "");
    }

    public Urn getCreatorUrn()
    {
        return (Urn)source.getOrElse(PlayableProperty.CREATOR_URN, Urn.NOT_SET);
    }

    public Urn getEntityUrn()
    {
        return (Urn)source.get(PlayableProperty.URN);
    }

    public com.soundcloud.android.stream.StreamItem.Kind getKind()
    {
        return com.soundcloud.android.stream.StreamItem.Kind.PLAYABLE;
    }

    public int getLikesCount()
    {
        return ((Integer)source.getOrElse(PlayableProperty.LIKES_COUNT, Integer.valueOf(0))).intValue();
    }

    public int getRepostCount()
    {
        return ((Integer)source.getOrElse(PlayableProperty.REPOSTS_COUNT, Integer.valueOf(0))).intValue();
    }

    public Optional getReposter()
    {
        return Optional.fromNullable(source.getOrElseNull(PostProperty.REPOSTER));
    }

    public Urn getReposterUrn()
    {
        return (Urn)source.get(PostProperty.REPOSTER_URN);
    }

    public PropertySet getSource()
    {
        return source;
    }

    public String getTitle()
    {
        return (String)source.getOrElse(PlayableProperty.TITLE, "");
    }

    public boolean isLiked()
    {
        return ((Boolean)source.getOrElse(PlayableProperty.IS_LIKED, Boolean.valueOf(false))).booleanValue();
    }

    public boolean isPrivate()
    {
        return ((Boolean)source.getOrElse(PlayableProperty.IS_PRIVATE, Boolean.valueOf(false))).booleanValue();
    }

    public boolean isRepost()
    {
        return ((Boolean)source.getOrElse(PostProperty.IS_REPOST, Boolean.valueOf(false))).booleanValue();
    }

    public boolean isReposted()
    {
        return ((Boolean)source.getOrElse(PlayableProperty.IS_REPOSTED, Boolean.valueOf(false))).booleanValue();
    }

    public volatile ListItem update(PropertySet propertyset)
    {
        return update(propertyset);
    }

    public PlayableItem update(PropertySet propertyset)
    {
        source.update(propertyset);
        return this;
    }
}
