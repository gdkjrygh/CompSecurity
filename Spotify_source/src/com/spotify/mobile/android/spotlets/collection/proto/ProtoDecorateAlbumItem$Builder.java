// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoDecorateAlbumItem, ProtoAlbumMetadata, ProtoAlbumCollectionState, ProtoAlbumOfflineState

public final class state extends gxc
{

    public ProtoAlbumMetadata album_metadata;
    public ProtoAlbumCollectionState collection_state;
    public ProtoAlbumOfflineState offline_state;

    public final state album_metadata(ProtoAlbumMetadata protoalbummetadata)
    {
        album_metadata = protoalbummetadata;
        return this;
    }

    public final ProtoDecorateAlbumItem build()
    {
        return new ProtoDecorateAlbumItem(this, (byte)0);
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

    public final collection_state offline_state(ProtoAlbumOfflineState protoalbumofflinestate)
    {
        offline_state = protoalbumofflinestate;
        return this;
    }

    public Y()
    {
    }

    public Y(ProtoDecorateAlbumItem protodecoratealbumitem)
    {
        super(protodecoratealbumitem);
        if (protodecoratealbumitem == null)
        {
            return;
        } else
        {
            album_metadata = protodecoratealbumitem.album_metadata;
            collection_state = protodecoratealbumitem.collection_state;
            offline_state = protodecoratealbumitem.offline_state;
            return;
        }
    }
}
