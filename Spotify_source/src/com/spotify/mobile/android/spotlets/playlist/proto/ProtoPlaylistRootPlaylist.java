// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistMetadata, ProtoPlaylistOfflineState

public final class ProtoPlaylistRootPlaylist extends Message
{

    public static final String DEFAULT_ROW_ID = "";
    public final ProtoPlaylistMetadata playlist_metadata;
    public final ProtoPlaylistOfflineState playlist_offline_state;
    public final String row_id;

    private ProtoPlaylistRootPlaylist(Builder builder)
    {
        super(builder);
        row_id = builder.row_id;
        playlist_metadata = builder.playlist_metadata;
        playlist_offline_state = builder.playlist_offline_state;
    }

    ProtoPlaylistRootPlaylist(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistRootPlaylist))
            {
                return false;
            }
            obj = (ProtoPlaylistRootPlaylist)obj;
            if (!a(row_id, ((ProtoPlaylistRootPlaylist) (obj)).row_id) || !a(playlist_metadata, ((ProtoPlaylistRootPlaylist) (obj)).playlist_metadata) || !a(playlist_offline_state, ((ProtoPlaylistRootPlaylist) (obj)).playlist_offline_state))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (row_id != null)
            {
                i = row_id.hashCode();
            } else
            {
                i = 0;
            }
            if (playlist_metadata != null)
            {
                k = playlist_metadata.hashCode();
            } else
            {
                k = 0;
            }
            if (playlist_offline_state != null)
            {
                l = playlist_offline_state.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public ProtoPlaylistMetadata playlist_metadata;
        public ProtoPlaylistOfflineState playlist_offline_state;
        public String row_id;

        public final ProtoPlaylistRootPlaylist build()
        {
            return new ProtoPlaylistRootPlaylist(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder playlist_metadata(ProtoPlaylistMetadata protoplaylistmetadata)
        {
            playlist_metadata = protoplaylistmetadata;
            return this;
        }

        public final Builder playlist_offline_state(ProtoPlaylistOfflineState protoplaylistofflinestate)
        {
            playlist_offline_state = protoplaylistofflinestate;
            return this;
        }

        public final Builder row_id(String s)
        {
            row_id = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoPlaylistRootPlaylist protoplaylistrootplaylist)
        {
            super(protoplaylistrootplaylist);
            if (protoplaylistrootplaylist == null)
            {
                return;
            } else
            {
                row_id = protoplaylistrootplaylist.row_id;
                playlist_metadata = protoplaylistrootplaylist.playlist_metadata;
                playlist_offline_state = protoplaylistrootplaylist.playlist_offline_state;
                return;
            }
        }
    }

}
