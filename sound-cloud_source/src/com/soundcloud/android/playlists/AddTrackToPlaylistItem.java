// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;

final class AddTrackToPlaylistItem
{

    public final boolean isOffline;
    public final boolean isPrivate;
    public final boolean isTrackAdded;
    public final Urn playlistUrn;
    public final String title;
    public final int trackCount;

    public AddTrackToPlaylistItem(Urn urn, String s, int i, boolean flag, boolean flag1, boolean flag2)
    {
        playlistUrn = urn;
        title = s;
        trackCount = i;
        isPrivate = flag;
        isOffline = flag1;
        isTrackAdded = flag2;
    }

    public static AddTrackToPlaylistItem createNewPlaylistItem()
    {
        return new AddTrackToPlaylistItem(Urn.NOT_SET, null, -1, false, false, false);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AddTrackToPlaylistItem)obj;
            if (!MoreObjects.equal(playlistUrn, ((AddTrackToPlaylistItem) (obj)).playlistUrn) || !MoreObjects.equal(title, ((AddTrackToPlaylistItem) (obj)).title) || !MoreObjects.equal(Integer.valueOf(trackCount), Integer.valueOf(((AddTrackToPlaylistItem) (obj)).trackCount)) || !MoreObjects.equal(Boolean.valueOf(isPrivate), Boolean.valueOf(((AddTrackToPlaylistItem) (obj)).isPrivate)) || !MoreObjects.equal(Boolean.valueOf(isOffline), Boolean.valueOf(((AddTrackToPlaylistItem) (obj)).isOffline)) || !MoreObjects.equal(Boolean.valueOf(isTrackAdded), Boolean.valueOf(((AddTrackToPlaylistItem) (obj)).isTrackAdded)))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            playlistUrn, title, Integer.valueOf(trackCount), Boolean.valueOf(isPrivate), Boolean.valueOf(isOffline), Boolean.valueOf(isTrackAdded)
        });
    }
}
