// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoCollectionAlbumsItem, ProtoAlbumMetadata, ProtoAlbumCollectionState, ProtoAlbumOfflineState

public final class state extends gxc
{

    public Integer add_time;
    public ProtoAlbumMetadata album_metadata;
    public ProtoAlbumCollectionState collection_state;
    public String header_field;
    public Integer headerless_index;
    public ProtoAlbumOfflineState offline_state;

    public final state add_time(Integer integer)
    {
        add_time = integer;
        return this;
    }

    public final add_time album_metadata(ProtoAlbumMetadata protoalbummetadata)
    {
        album_metadata = protoalbummetadata;
        return this;
    }

    public final ProtoCollectionAlbumsItem build()
    {
        return new ProtoCollectionAlbumsItem(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build collection_state(ProtoAlbumCollectionState protoalbumcollectionstate)
    {
        collection_state = protoalbumcollectionstate;
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

    public final headerless_index offline_state(ProtoAlbumOfflineState protoalbumofflinestate)
    {
        offline_state = protoalbumofflinestate;
        return this;
    }

    public ()
    {
    }

    public (ProtoCollectionAlbumsItem protocollectionalbumsitem)
    {
        super(protocollectionalbumsitem);
        if (protocollectionalbumsitem == null)
        {
            return;
        } else
        {
            header_field = protocollectionalbumsitem.header_field;
            headerless_index = protocollectionalbumsitem.headerless_index;
            add_time = protocollectionalbumsitem.add_time;
            album_metadata = protocollectionalbumsitem.album_metadata;
            collection_state = protocollectionalbumsitem.collection_state;
            offline_state = protocollectionalbumsitem.offline_state;
            return;
        }
    }
}
