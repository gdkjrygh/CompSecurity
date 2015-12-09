// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoEpisodeMetadata, ProtoEpisodeCollectionState, ProtoEpisodeOfflineState, ProtoEpisodePlayState

public final class ProtoDecorateEpisodeItem extends Message
{

    public final ProtoEpisodeCollectionState episode_collection_state;
    public final ProtoEpisodeMetadata episode_metadata;
    public final ProtoEpisodeOfflineState episode_offline_state;
    public final ProtoEpisodePlayState episode_play_state;

    private ProtoDecorateEpisodeItem(Builder builder)
    {
        super(builder);
        episode_metadata = builder.episode_metadata;
        episode_collection_state = builder.episode_collection_state;
        episode_offline_state = builder.episode_offline_state;
        episode_play_state = builder.episode_play_state;
    }

    ProtoDecorateEpisodeItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoDecorateEpisodeItem))
            {
                return false;
            }
            obj = (ProtoDecorateEpisodeItem)obj;
            if (!a(episode_metadata, ((ProtoDecorateEpisodeItem) (obj)).episode_metadata) || !a(episode_collection_state, ((ProtoDecorateEpisodeItem) (obj)).episode_collection_state) || !a(episode_offline_state, ((ProtoDecorateEpisodeItem) (obj)).episode_offline_state) || !a(episode_play_state, ((ProtoDecorateEpisodeItem) (obj)).episode_play_state))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            if (episode_metadata != null)
            {
                i = episode_metadata.hashCode();
            } else
            {
                i = 0;
            }
            if (episode_collection_state != null)
            {
                k = episode_collection_state.hashCode();
            } else
            {
                k = 0;
            }
            if (episode_offline_state != null)
            {
                l = episode_offline_state.hashCode();
            } else
            {
                l = 0;
            }
            if (episode_play_state != null)
            {
                i1 = episode_play_state.hashCode();
            }
            i = (l + (k + i * 37) * 37) * 37 + i1;
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

        public final ProtoDecorateEpisodeItem build()
        {
            return new ProtoDecorateEpisodeItem(this, (byte)0);
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

        public Builder()
        {
        }

        public Builder(ProtoDecorateEpisodeItem protodecorateepisodeitem)
        {
            super(protodecorateepisodeitem);
            if (protodecorateepisodeitem == null)
            {
                return;
            } else
            {
                episode_metadata = protodecorateepisodeitem.episode_metadata;
                episode_collection_state = protodecorateepisodeitem.episode_collection_state;
                episode_offline_state = protodecorateepisodeitem.episode_offline_state;
                episode_play_state = protodecorateepisodeitem.episode_play_state;
                return;
            }
        }
    }

}
