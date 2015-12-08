// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.api.model.ApiPlaylist;
import com.soundcloud.android.api.model.ApiTrackStats;
import com.soundcloud.android.api.model.Sharing;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.playlists.PlaylistRecord;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            Playable, PublicApiUser, PlayableStats, PublicApiTrack

public class PublicApiPlaylist extends Playable
    implements PlaylistRecord
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String EXTRA = "com.soundcloud.android.playlist";
    public String playlist_type;
    public boolean removed;
    private int track_count;
    public List tracks;
    public String tracks_uri;

    public PublicApiPlaylist()
    {
        tracks = new ArrayList(0);
    }

    public PublicApiPlaylist(long l)
    {
        super(l);
        tracks = new ArrayList(0);
    }

    public PublicApiPlaylist(Cursor cursor)
    {
        super(cursor);
        tracks = new ArrayList(0);
        tracks_uri = cursor.getString(cursor.getColumnIndex("tracks_uri"));
        track_count = cursor.getInt(cursor.getColumnIndex("track_count"));
    }

    public PublicApiPlaylist(Parcel parcel)
    {
        tracks = new ArrayList(0);
        parcel = parcel.readBundle(getClass().getClassLoader());
        super.readFromBundle(parcel);
        playlist_type = parcel.getString("playlist_type");
        tracks_uri = parcel.getString("tracks_uri");
        track_count = parcel.getInt("track_count");
        tracks = parcel.getParcelableArrayList("tracks");
        if (tracks == null)
        {
            tracks = new LinkedList();
        }
    }

    public PublicApiPlaylist(ApiPlaylist apiplaylist)
    {
        tracks = new ArrayList(0);
        setUrn(apiplaylist.getUrn().toString());
        setUser(new PublicApiUser(apiplaylist.getUser()));
        setTitle(apiplaylist.getTitle());
        artwork_url = apiplaylist.getArtworkUrl();
        String s;
        if (apiplaylist.getTags() == null)
        {
            s = "";
        } else
        {
            s = TextUtils.join(" ", apiplaylist.getTags());
        }
        tag_list = s;
        created_at = apiplaylist.getCreatedAt();
        duration = apiplaylist.getDuration();
        track_count = apiplaylist.getTrackCount();
        sharing = Sharing.from(apiplaylist.isPublic());
        apiplaylist = apiplaylist.getStats();
        if (apiplaylist != null)
        {
            likes_count = apiplaylist.getLikesCount();
            reposts_count = apiplaylist.getRepostsCount();
        }
    }

    public static PublicApiPlaylist newUserPlaylist(PublicApiUser publicapiuser, String s, boolean flag, List list)
    {
        PublicApiPlaylist publicapiplaylist = new PublicApiPlaylist(-System.currentTimeMillis());
        publicapiplaylist.user = publicapiuser;
        publicapiplaylist.title = s;
        if (flag)
        {
            publicapiuser = Sharing.PRIVATE;
        } else
        {
            publicapiuser = Sharing.PUBLIC;
        }
        publicapiplaylist.sharing = publicapiuser;
        publicapiplaylist.created_at = new Date();
        publicapiplaylist.tracks = list;
        publicapiplaylist.track_count = list.size();
        return publicapiplaylist;
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = super.buildContentValues();
        contentvalues.put("tracks_uri", tracks_uri);
        contentvalues.put("track_count", Integer.valueOf(track_count));
        if (!isIncomplete())
        {
            contentvalues.put("last_updated", Long.valueOf(System.currentTimeMillis()));
        }
        return contentvalues;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri getBulkInsertUri()
    {
        return Content.PLAYLISTS.uri;
    }

    public long getDuration()
    {
        return duration;
    }

    public int getLikesCount()
    {
        return likes_count;
    }

    public String getPermalinkUrl()
    {
        return permalink_url;
    }

    public Refreshable getRefreshableResource()
    {
        return this;
    }

    public int getRepostsCount()
    {
        return reposts_count;
    }

    public Iterable getTags()
    {
        return humanTags();
    }

    public int getTrackCount()
    {
        return Math.max(tracks.size(), track_count);
    }

    public List getTracks()
    {
        return tracks;
    }

    public int getTypeId()
    {
        return 1;
    }

    public volatile UserRecord getUser()
    {
        return super.getUser();
    }

    public boolean isStale()
    {
        return System.currentTimeMillis() - last_updated > com.soundcloud.android.Consts.ResourceStaleTimes.PLAYLIST;
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
        super.putDependencyValues(bulkinsertmap);
        Iterator iterator = tracks.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            PublicApiTrack publicapitrack = (PublicApiTrack)iterator.next();
            publicapitrack.putFullContentValues(bulkinsertmap);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("track_id", Long.valueOf(publicapitrack.getId()));
            contentvalues.put("position", Integer.valueOf(i));
            bulkinsertmap.add(Content.PLAYLIST_TRACKS.forQuery(String.valueOf(getId())), contentvalues);
        }

    }

    public void setId(long l)
    {
        super.setId(l);
        urn = Urn.forPlaylist(l);
    }

    public void setTrackCount(int i)
    {
        track_count = i;
    }

    public ApiPlaylist toApiMobilePlaylist()
    {
        ApiPlaylist apiplaylist = new ApiPlaylist();
        apiplaylist.setUrn(getUrn());
        apiplaylist.setCreatedAt(created_at);
        apiplaylist.setArtworkUrl(artwork_url);
        apiplaylist.setDuration(duration);
        apiplaylist.setPermalinkUrl(permalink_url);
        apiplaylist.setSharing(sharing);
        apiplaylist.setTitle(title);
        apiplaylist.setTags(humanTags());
        apiplaylist.setTrackCount(track_count);
        apiplaylist.setUser(getUser().toApiMobileUser());
        ApiTrackStats apitrackstats = new ApiTrackStats();
        apitrackstats.setLikesCount(likes_count);
        apitrackstats.setRepostsCount(reposts_count);
        apiplaylist.setStats(apitrackstats);
        return apiplaylist;
    }

    public PropertySet toPropertySet()
    {
        return super.toPropertySet().put(PlaylistProperty.TRACK_COUNT, Integer.valueOf(track_count)).put(PlayableProperty.LIKES_COUNT, Integer.valueOf(likes_count)).put(PlayableProperty.IS_LIKED, Boolean.valueOf(user_like));
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Playlist{id=")).append(getId()).append(", title='").append(title).append("', permalink_url='").append(permalink_url).append("', duration=").append(duration).append(", user=").append(user).append(", track_count=");
        int i;
        if (track_count == -1)
        {
            i = tracks.size();
        } else
        {
            i = track_count;
        }
        return stringbuilder.append(i).append(", tracks_uri='").append(tracks_uri).append('\'').append('}').toString();
    }

    public Uri toUri()
    {
        return Content.PLAYLISTS.forQuery(String.valueOf(getId()));
    }

    public PublicApiPlaylist updateFrom(PublicApiPlaylist publicapiplaylist, PublicApiResource.CacheUpdateMode cacheupdatemode)
    {
        super.updateFrom(publicapiplaylist, cacheupdatemode);
        tracks_uri = publicapiplaylist.tracks_uri;
        track_count = publicapiplaylist.track_count;
        playlist_type = publicapiplaylist.playlist_type;
        last_updated = publicapiplaylist.last_updated;
        if (cacheupdatemode == PublicApiResource.CacheUpdateMode.FULL)
        {
            tracks = publicapiplaylist.tracks;
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = super.getBundle();
        bundle.putString("playlist_type", playlist_type);
        bundle.putString("tracks_uri", tracks_uri);
        bundle.putInt("track_count", track_count);
        bundle.putParcelableArrayList("tracks", (ArrayList)tracks);
        parcel.writeBundle(bundle);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PublicApiPlaylist createFromParcel(Parcel parcel)
        {
            return new PublicApiPlaylist(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PublicApiPlaylist[] newArray(int i)
        {
            return new PublicApiPlaylist[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
