// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistMetadataItem, ProtoPlaylistMetadata, ProtoPlaylistOfflineState

public final class _offline_state extends gxc
{

    public ProtoPlaylistMetadata playlist_metadata;
    public ProtoPlaylistOfflineState playlist_offline_state;

    public final ProtoPlaylistMetadataItem build()
    {
        return new ProtoPlaylistMetadataItem(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build playlist_metadata(ProtoPlaylistMetadata protoplaylistmetadata)
    {
        playlist_metadata = protoplaylistmetadata;
        return this;
    }

    public final playlist_metadata playlist_offline_state(ProtoPlaylistOfflineState protoplaylistofflinestate)
    {
        playlist_offline_state = protoplaylistofflinestate;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistMetadataItem protoplaylistmetadataitem)
    {
        super(protoplaylistmetadataitem);
        if (protoplaylistmetadataitem == null)
        {
            return;
        } else
        {
            playlist_metadata = protoplaylistmetadataitem.playlist_metadata;
            playlist_offline_state = protoplaylistmetadataitem.playlist_offline_state;
            return;
        }
    }
}
