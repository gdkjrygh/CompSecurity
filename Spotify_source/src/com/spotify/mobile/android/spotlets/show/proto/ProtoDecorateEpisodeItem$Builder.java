// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoDecorateEpisodeItem, ProtoEpisodeCollectionState, ProtoEpisodeMetadata, ProtoEpisodeOfflineState, 
//            ProtoEpisodePlayState

public final class play_state extends gxc
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

    public final build episode_collection_state(ProtoEpisodeCollectionState protoepisodecollectionstate)
    {
        episode_collection_state = protoepisodecollectionstate;
        return this;
    }

    public final episode_collection_state episode_metadata(ProtoEpisodeMetadata protoepisodemetadata)
    {
        episode_metadata = protoepisodemetadata;
        return this;
    }

    public final episode_metadata episode_offline_state(ProtoEpisodeOfflineState protoepisodeofflinestate)
    {
        episode_offline_state = protoepisodeofflinestate;
        return this;
    }

    public final episode_offline_state episode_play_state(ProtoEpisodePlayState protoepisodeplaystate)
    {
        episode_play_state = protoepisodeplaystate;
        return this;
    }

    public ()
    {
    }

    public (ProtoDecorateEpisodeItem protodecorateepisodeitem)
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
