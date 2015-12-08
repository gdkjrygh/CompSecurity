// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Lists;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadRequest, OfflineTrackContext

static class syncable
{

    private final Urn creator;
    private final long duration;
    private boolean inLikes;
    private Set playlists;
    private final boolean syncable;
    private final Urn track;
    private final String waveformUrl;

    public syncable addToLikes(boolean flag)
    {
        if (!inLikes)
        {
            inLikes = flag;
        }
        return this;
    }

    public inLikes addToPlaylist(Urn urn)
    {
        if (urn != Urn.NOT_SET)
        {
            playlists.add(urn);
        }
        return this;
    }

    public DownloadRequest build()
    {
        return DownloadRequest.create(OfflineTrackContext.create(track, creator, Lists.newArrayList(playlists), inLikes), duration, waveformUrl, syncable);
    }

    public (Urn urn, Urn urn1, long l, String s, boolean flag)
    {
        playlists = new HashSet();
        inLikes = false;
        track = urn;
        creator = urn1;
        duration = l;
        waveformUrl = s;
        syncable = flag;
    }
}
