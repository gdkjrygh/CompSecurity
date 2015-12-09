// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.model.offline;

import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import drw;
import drz;
import dsa;
import ggi;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.search.model.offline:
//            OfflineSearchEntity, OfflineTrackArtist, OfflineTrackAlbum

public final class OfflineTrack extends OfflineSearchEntity
    implements drz
{

    public final OfflineTrackAlbum album;
    public final List artists;
    public final boolean isLocal;
    public final boolean isSynced;
    private String mArtistsString;

    public OfflineTrack(List list, OfflineTrackAlbum offlinetrackalbum, String s, String s1, Boolean boolean1, Boolean boolean2)
    {
        boolean flag1 = true;
        super(s, s1, null);
        artists = ggi.a(list);
        album = offlinetrackalbum;
        boolean flag;
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isLocal = flag;
        if (boolean2 != null && boolean2.booleanValue())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isSynced = flag;
    }

    public final String artists()
    {
        if (mArtistsString == null)
        {
            mArtistsString = TextUtils.join(", ", artists);
        }
        return mArtistsString;
    }

    public final String getContext()
    {
        return null;
    }

    public final dsa getEntityInfo()
    {
        return null;
    }

    public final String getGroup()
    {
        return "track-results";
    }

    public final volatile String getImageUri()
    {
        return super.getImageUri();
    }

    public final drw getLoggingData()
    {
        return null;
    }

    public final volatile String getName()
    {
        return super.getName();
    }

    public final volatile String getUri()
    {
        return super.getUri();
    }

    public final boolean isPlayable()
    {
        return true;
    }

    public final String mainArtistUri()
    {
        if (artists.isEmpty())
        {
            return null;
        } else
        {
            return ((OfflineTrackArtist)artists.get(0)).getUri();
        }
    }

    public final PlayerTrack toPlayerTrack()
    {
        Object obj = (OfflineTrackArtist)artists.get(0);
        String s2 = getUri();
        String s;
        String s1;
        String s3;
        String s4;
        if (album != null)
        {
            s = album.getUri();
        } else
        {
            s = "";
        }
        s3 = ((OfflineTrackArtist) (obj)).getUri();
        s4 = ((OfflineTrackArtist) (obj)).getName();
        if (album != null)
        {
            obj = album.getName();
        } else
        {
            obj = "";
        }
        if (album != null && album.getImageUri() != null)
        {
            s1 = album.getImageUri();
        } else
        {
            s1 = "";
        }
        return PlayerTrack.create(s2, s, s3, ImmutableMap.a("media.type", "audio", "artist_name", s4, "album_title", obj, "image_url", s1, "title", getName()));
    }
}
