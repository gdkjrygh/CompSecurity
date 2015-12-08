// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoUnplayedEpisodesRequestItem, ProtoEpisodeCollectionState, ProtoEpisodeMetadata, ProtoEpisodeOfflineState, 
//            ProtoEpisodePlayState

public final class play_state extends gxc
{

    public ProtoEpisodeCollectionState episode_collection_state;
    public ProtoEpisodeMetadata episode_metadata;
    public ProtoEpisodeOfflineState episode_offline_state;
    public ProtoEpisodePlayState episode_play_state;
    public String header;

    public final ProtoUnplayedEpisodesRequestItem build()
    {
        return new ProtoUnplayedEpisodesRequestItem(this, (byte)0);
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

    public final episode_play_state header(String s)
    {
        header = s;
        return this;
    }

    public ()
    {
    }

    public (ProtoUnplayedEpisodesRequestItem protounplayedepisodesrequestitem)
    {
        super(protounplayedepisodesrequestitem);
        if (protounplayedepisodesrequestitem == null)
        {
            return;
        } else
        {
            header = protounplayedepisodesrequestitem.header;
            episode_metadata = protounplayedepisodesrequestitem.episode_metadata;
            episode_collection_state = protounplayedepisodesrequestitem.episode_collection_state;
            episode_offline_state = protounplayedepisodesrequestitem.episode_offline_state;
            episode_play_state = protounplayedepisodesrequestitem.episode_play_state;
            return;
        }
    }
}
