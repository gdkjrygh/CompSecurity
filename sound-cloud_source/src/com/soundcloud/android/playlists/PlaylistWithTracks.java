// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineProperty;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistProperty

public class PlaylistWithTracks
{

    private final PropertySet sourceSet;
    private final List tracks;

    PlaylistWithTracks(PropertySet propertyset, List list)
    {
        sourceSet = propertyset;
        tracks = list;
    }

    private long getCombinedTrackDurations()
    {
        Iterator iterator = tracks.iterator();
        long l;
        for (l = 0L; iterator.hasNext(); l = ((TrackItem)iterator.next()).getDuration() + l) { }
        return l;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaylistWithTracks))
            {
                return false;
            }
            obj = (PlaylistWithTracks)obj;
            if (!sourceSet.equals(((PlaylistWithTracks) (obj)).sourceSet) || !tracks.equals(((PlaylistWithTracks) (obj)).tracks))
            {
                return false;
            }
        }
        return true;
    }

    public String getCreatorName()
    {
        return (String)sourceSet.getOrElse(PlaylistProperty.CREATOR_NAME, "");
    }

    public Urn getCreatorUrn()
    {
        return (Urn)sourceSet.get(PlaylistProperty.CREATOR_URN);
    }

    OfflineState getDownloadState()
    {
        return (OfflineState)sourceSet.getOrElse(OfflineProperty.OFFLINE_STATE, OfflineState.NO_OFFLINE);
    }

    public String getDuration()
    {
        long l;
        if (tracks.isEmpty())
        {
            l = ((Long)sourceSet.get(PlaylistProperty.DURATION)).longValue();
        } else
        {
            l = getCombinedTrackDurations();
        }
        return ScTextUtils.formatTimestamp(l, TimeUnit.MILLISECONDS);
    }

    public int getLikesCount()
    {
        return ((Integer)sourceSet.get(PlaylistProperty.LIKES_COUNT)).intValue();
    }

    public String getPermalinkUrl()
    {
        return (String)sourceSet.get(PlaylistProperty.PERMALINK_URL);
    }

    public int getRepostsCount()
    {
        return ((Integer)sourceSet.get(PlaylistProperty.REPOSTS_COUNT)).intValue();
    }

    public PropertySet getSourceSet()
    {
        return sourceSet;
    }

    public String getTitle()
    {
        return (String)sourceSet.get(PlaylistProperty.TITLE);
    }

    public int getTrackCount()
    {
        if (tracks.isEmpty())
        {
            return ((Integer)sourceSet.get(PlaylistProperty.TRACK_COUNT)).intValue();
        } else
        {
            return tracks.size();
        }
    }

    public List getTracks()
    {
        return tracks;
    }

    public Urn getUrn()
    {
        return (Urn)sourceSet.get(PlaylistProperty.URN);
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            sourceSet, tracks
        });
    }

    public boolean isLikedByUser()
    {
        return ((Boolean)sourceSet.get(PlaylistProperty.IS_LIKED)).booleanValue();
    }

    public boolean isLocalPlaylist()
    {
        return sourceSet.contains(PlaylistProperty.URN) && ((Urn)sourceSet.get(PlaylistProperty.URN)).getNumericId() < 0L;
    }

    public boolean isMissingMetaData()
    {
        return sourceSet.size() == 0;
    }

    public boolean isOfflineAvailable()
    {
        return ((Boolean)sourceSet.get(com.soundcloud.android.offline.OfflineProperty.Collection.IS_MARKED_FOR_OFFLINE)).booleanValue();
    }

    public boolean isOwnedBy(Urn urn)
    {
        return urn.equals(getCreatorUrn());
    }

    public boolean isPostedByUser()
    {
        return ((Boolean)sourceSet.get(PlaylistProperty.IS_POSTED)).booleanValue();
    }

    public boolean isPrivate()
    {
        return ((Boolean)sourceSet.get(PlaylistProperty.IS_PRIVATE)).booleanValue();
    }

    public boolean isPublic()
    {
        return !isPrivate();
    }

    public boolean isRepostedByUser()
    {
        return ((Boolean)sourceSet.get(PlaylistProperty.IS_REPOSTED)).booleanValue();
    }

    public boolean needsTracks()
    {
        return getTracks().isEmpty();
    }

    public void update(PropertySet propertyset)
    {
        sourceSet.update(propertyset);
    }
}
