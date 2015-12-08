// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoEpisodeMetadata, ProtoEpisodeCollectionState, ProtoEpisodeOfflineState, ProtoEpisodePlayState

public final class ProtoOfflinedEpisodesRequestItem extends Message
{

    public static final String DEFAULT_HEADER = "";
    public final ProtoEpisodeCollectionState episode_collection_state;
    public final ProtoEpisodeMetadata episode_metadata;
    public final ProtoEpisodeOfflineState episode_offline_state;
    public final ProtoEpisodePlayState episode_play_state;
    public final String header;

    private ProtoOfflinedEpisodesRequestItem(Builder builder)
    {
        super(builder);
        header = builder.header;
        episode_metadata = builder.episode_metadata;
        episode_collection_state = builder.episode_collection_state;
        episode_offline_state = builder.episode_offline_state;
        episode_play_state = builder.episode_play_state;
    }

    ProtoOfflinedEpisodesRequestItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoOfflinedEpisodesRequestItem))
            {
                return false;
            }
            obj = (ProtoOfflinedEpisodesRequestItem)obj;
            if (!a(header, ((ProtoOfflinedEpisodesRequestItem) (obj)).header) || !a(episode_metadata, ((ProtoOfflinedEpisodesRequestItem) (obj)).episode_metadata) || !a(episode_collection_state, ((ProtoOfflinedEpisodesRequestItem) (obj)).episode_collection_state) || !a(episode_offline_state, ((ProtoOfflinedEpisodesRequestItem) (obj)).episode_offline_state) || !a(episode_play_state, ((ProtoOfflinedEpisodesRequestItem) (obj)).episode_play_state))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            if (header != null)
            {
                i = header.hashCode();
            } else
            {
                i = 0;
            }
            if (episode_metadata != null)
            {
                k = episode_metadata.hashCode();
            } else
            {
                k = 0;
            }
            if (episode_collection_state != null)
            {
                l = episode_collection_state.hashCode();
            } else
            {
                l = 0;
            }
            if (episode_offline_state != null)
            {
                i1 = episode_offline_state.hashCode();
            } else
            {
                i1 = 0;
            }
            if (episode_play_state != null)
            {
                j1 = episode_play_state.hashCode();
            }
            i = (i1 + (l + (k + i * 37) * 37) * 37) * 37 + j1;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public ProtoEpisodeCollectionState episode_collection_state;
        public ProtoEpisodeMetadata episode_metadata;
        public ProtoEpisodeOfflineState episode_offline_state;
        public ProtoEpisodePlayState episode_play_state;
        public String header;

        public final ProtoOfflinedEpisodesRequestItem build()
        {
            return new ProtoOfflinedEpisodesRequestItem(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder episode_collection_state(ProtoEpisodeCollectionState protoepisodecollectionstate)
        {
            episode_collection_state = protoepisodecollectionstate;
            return this;
        }

        public final Builder episode_metadata(ProtoEpisodeMetadata protoepisodemetadata)
        {
            episode_metadata = protoepisodemetadata;
            return this;
        }

        public final Builder episode_offline_state(ProtoEpisodeOfflineState protoepisodeofflinestate)
        {
            episode_offline_state = protoepisodeofflinestate;
            return this;
        }

        public final Builder episode_play_state(ProtoEpisodePlayState protoepisodeplaystate)
        {
            episode_play_state = protoepisodeplaystate;
            return this;
        }

        public final Builder header(String s)
        {
            header = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoOfflinedEpisodesRequestItem protoofflinedepisodesrequestitem)
        {
            super(protoofflinedepisodesrequestitem);
            if (protoofflinedepisodesrequestitem == null)
            {
                return;
            } else
            {
                header = protoofflinedepisodesrequestitem.header;
                episode_metadata = protoofflinedepisodesrequestitem.episode_metadata;
                episode_collection_state = protoofflinedepisodesrequestitem.episode_collection_state;
                episode_offline_state = protoofflinedepisodesrequestitem.episode_offline_state;
                episode_play_state = protoofflinedepisodesrequestitem.episode_play_state;
                return;
            }
        }
    }

}
