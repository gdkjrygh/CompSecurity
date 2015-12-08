// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoDecorateArtistItem, ProtoArtistMetadata, ProtoArtistCollectionState, ProtoArtistOfflineState

public final class state extends gxc
{

    public ProtoArtistMetadata artist_metadata;
    public ProtoArtistCollectionState collection_state;
    public ProtoArtistOfflineState offline_state;

    public final state artist_metadata(ProtoArtistMetadata protoartistmetadata)
    {
        artist_metadata = protoartistmetadata;
        return this;
    }

    public final ProtoDecorateArtistItem build()
    {
        return new ProtoDecorateArtistItem(this, (byte)0);
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

    public final collection_state offline_state(ProtoArtistOfflineState protoartistofflinestate)
    {
        offline_state = protoartistofflinestate;
        return this;
    }

    public ()
    {
    }

    public (ProtoDecorateArtistItem protodecorateartistitem)
    {
        super(protodecorateartistitem);
        if (protodecorateartistitem == null)
        {
            return;
        } else
        {
            artist_metadata = protodecorateartistitem.artist_metadata;
            collection_state = protodecorateartistitem.collection_state;
            offline_state = protodecorateartistitem.offline_state;
            return;
        }
    }
}
