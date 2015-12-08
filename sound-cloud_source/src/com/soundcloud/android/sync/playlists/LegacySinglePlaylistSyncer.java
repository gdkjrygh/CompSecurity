// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import android.net.Uri;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.sync.ApiSyncResult;
import com.soundcloud.android.sync.SyncStrategy;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            SinglePlaylistSyncerFactory, SinglePlaylistSyncer

public class LegacySinglePlaylistSyncer
    implements SyncStrategy
{

    private final Urn playlistUrn;
    private final SinglePlaylistSyncerFactory singlePlaylistSyncerFactory;

    public LegacySinglePlaylistSyncer(SinglePlaylistSyncerFactory singleplaylistsyncerfactory, Urn urn)
    {
        playlistUrn = urn;
        singlePlaylistSyncerFactory = singleplaylistsyncerfactory;
    }

    public ApiSyncResult syncContent(Uri uri, String s)
        throws Exception
    {
        if (singlePlaylistSyncerFactory.create(playlistUrn).call().booleanValue())
        {
            return ApiSyncResult.fromSuccessfulChange(uri);
        } else
        {
            return ApiSyncResult.fromSuccessWithoutChange(uri);
        }
    }
}
