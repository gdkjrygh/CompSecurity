// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistMetadata, ProtoPlaylistOfflineState

public final class ProtoPlaylistHeader extends Message
{

    public final ProtoPlaylistMetadata playlist_metadata;
    public final ProtoPlaylistOfflineState playlist_offline_state;

    private ProtoPlaylistHeader(Builder builder)
    {
        super(builder);
        playlist_metadata = builder.playlist_metadata;
        playlist_offline_state = builder.playlist_offline_state;
    }

    ProtoPlaylistHeader(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistHeader))
            {
                return false;
            }
            obj = (ProtoPlaylistHeader)obj;
            if (!a(playlist_metadata, ((ProtoPlaylistHeader) (obj)).playlist_metadata) || !a(playlist_offline_state, ((ProtoPlaylistHeader) (obj)).playlist_offline_state))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = hashCode;
        int i = k;
        if (k == 0)
        {
            if (playlist_metadata != null)
            {
                i = playlist_metadata.hashCode();
            } else
            {
                i = 0;
            }
            if (playlist_offline_state != null)
            {
                j = playlist_offline_state.hashCode();
            }
            i = i * 37 + j;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public ProtoPlaylistMetadata playlist_metadata;
        public ProtoPlaylistOfflineState playlist_offline_state;

        public final ProtoPlaylistHeader build()
        {
            return new ProtoPlaylistHeader(this, (byte)0);
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

        public Builder()
        {
        }

        public Builder(ProtoPlaylistHeader protoplaylistheader)
        {
            super(protoplaylistheader);
            if (protoplaylistheader == null)
            {
                return;
            } else
            {
                playlist_metadata = protoplaylistheader.playlist_metadata;
                playlist_offline_state = protoplaylistheader.playlist_offline_state;
                return;
            }
        }
    }

}
