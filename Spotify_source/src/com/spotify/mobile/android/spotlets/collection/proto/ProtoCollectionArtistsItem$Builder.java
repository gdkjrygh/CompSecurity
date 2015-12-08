// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoCollectionArtistsItem, ProtoArtistMetadata, ProtoArtistCollectionState, ProtoArtistOfflineState

public final class state extends gxc
{

    public Integer add_time;
    public ProtoArtistMetadata artist_metadata;
    public ProtoArtistCollectionState collection_state;
    public String header_field;
    public Integer headerless_index;
    public ProtoArtistOfflineState offline_state;

    public final state add_time(Integer integer)
    {
        add_time = integer;
        return this;
    }

    public final add_time artist_metadata(ProtoArtistMetadata protoartistmetadata)
    {
        artist_metadata = protoartistmetadata;
        return this;
    }

    public final ProtoCollectionArtistsItem build()
    {
        return new ProtoCollectionArtistsItem(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build collection_state(ProtoArtistCollectionState protoartistcollectionstate)
    {
        collection_state = protoartistcollectionstate;
        return this;
    }

    public final collection_state header_field(String s)
    {
        header_field = s;
        return this;
    }

    public final header_field headerless_index(Integer integer)
    {
        headerless_index = integer;
        return this;
    }

    public final headerless_index offline_state(ProtoArtistOfflineState protoartistofflinestate)
    {
        offline_state = protoartistofflinestate;
        return this;
    }

    public ()
    {
    }

    public (ProtoCollectionArtistsItem protocollectionartistsitem)
    {
        super(protocollectionartistsitem);
        if (protocollectionartistsitem == null)
        {
            return;
        } else
        {
            header_field = protocollectionartistsitem.header_field;
            headerless_index = protocollectionartistsitem.headerless_index;
            add_time = protocollectionartistsitem.add_time;
            artist_metadata = protocollectionartistsitem.artist_metadata;
            collection_state = protocollectionartistsitem.collection_state;
            offline_state = protocollectionartistsitem.offline_state;
            return;
        }
    }
}
