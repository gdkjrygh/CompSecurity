// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import java.util.List;

public class CollectionsItem
    implements ListItem
{

    static final int TYPE_COLLECTIONS_PREVIEW = 0;
    static final int TYPE_EMPTY_PLAYLISTS = 4;
    static final int TYPE_ONBOARDING = 5;
    static final int TYPE_PLAYLIST_HEADER = 1;
    static final int TYPE_PLAYLIST_ITEM = 2;
    static final int TYPE_REMOVE_FILTER = 3;
    private final List likes;
    private final PlaylistItem playlistItem;
    private final List stations;
    private final int type;

    private CollectionsItem(int i, List list, List list1, PlaylistItem playlistitem)
    {
        type = i;
        likes = list;
        stations = list1;
        playlistItem = playlistitem;
    }

    public static CollectionsItem fromCollectionsPreview(List list, List list1)
    {
        return new CollectionsItem(0, list, list1, null);
    }

    public static CollectionsItem fromEmptyPlaylists()
    {
        return new CollectionsItem(4, null, null, null);
    }

    public static CollectionsItem fromKillFilter()
    {
        return new CollectionsItem(3, null, null, null);
    }

    public static CollectionsItem fromOnboarding()
    {
        return new CollectionsItem(5, null, null, null);
    }

    public static CollectionsItem fromPlaylistHeader()
    {
        return new CollectionsItem(1, null, null, null);
    }

    public static CollectionsItem fromPlaylistItem(PlaylistItem playlistitem)
    {
        return new CollectionsItem(2, null, null, playlistitem);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof CollectionsItem))
            {
                return false;
            }
            obj = (CollectionsItem)obj;
            if (!MoreObjects.equal(Integer.valueOf(type), Integer.valueOf(((CollectionsItem) (obj)).type)) || !MoreObjects.equal(likes, ((CollectionsItem) (obj)).likes) || !MoreObjects.equal(playlistItem, ((CollectionsItem) (obj)).playlistItem))
            {
                return false;
            }
        }
        return true;
    }

    public Urn getEntityUrn()
    {
        if (type == 2)
        {
            return playlistItem.getEntityUrn();
        } else
        {
            return Urn.NOT_SET;
        }
    }

    public List getLikes()
    {
        return likes;
    }

    public PlaylistItem getPlaylistItem()
    {
        return playlistItem;
    }

    public List getStations()
    {
        return stations;
    }

    public int getType()
    {
        return type;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            Integer.valueOf(type), likes, playlistItem
        });
    }

    public boolean isPlaylistItem()
    {
        return type == 2;
    }

    public ListItem update(PropertySet propertyset)
    {
        if (type == 2)
        {
            playlistItem.update(propertyset);
        }
        return this;
    }
}
