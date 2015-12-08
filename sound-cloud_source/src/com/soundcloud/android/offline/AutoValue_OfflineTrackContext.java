// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import java.util.List;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineTrackContext

final class AutoValue_OfflineTrackContext extends OfflineTrackContext
{

    private final Urn creator;
    private final boolean liked;
    private final List playlists;
    private final Urn track;

    AutoValue_OfflineTrackContext(Urn urn, Urn urn1, List list, boolean flag)
    {
        if (urn == null)
        {
            throw new NullPointerException("Null track");
        }
        track = urn;
        if (urn1 == null)
        {
            throw new NullPointerException("Null creator");
        }
        creator = urn1;
        if (list == null)
        {
            throw new NullPointerException("Null playlists");
        } else
        {
            playlists = list;
            liked = flag;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof OfflineTrackContext)
            {
                if (!track.equals(((OfflineTrackContext) (obj = (OfflineTrackContext)obj)).getTrack()) || !creator.equals(((OfflineTrackContext) (obj)).getCreator()) || !playlists.equals(((OfflineTrackContext) (obj)).getPlaylists()) || liked != ((OfflineTrackContext) (obj)).isLiked())
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final Urn getCreator()
    {
        return creator;
    }

    public final List getPlaylists()
    {
        return playlists;
    }

    public final Urn getTrack()
    {
        return track;
    }

    public final int hashCode()
    {
        int i = track.hashCode();
        int j = creator.hashCode();
        int k = playlists.hashCode();
        char c;
        if (liked)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return c ^ (((i ^ 0xf4243) * 0xf4243 ^ j) * 0xf4243 ^ k) * 0xf4243;
    }

    public final boolean isLiked()
    {
        return liked;
    }

    public final String toString()
    {
        return (new StringBuilder("OfflineTrackContext{track=")).append(track).append(", creator=").append(creator).append(", playlists=").append(playlists).append(", liked=").append(liked).append("}").toString();
    }
}
