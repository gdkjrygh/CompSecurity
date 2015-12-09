// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoAlbumMetadata, ProtoAlbumCollectionState, ProtoAlbumOfflineState

public final class ProtoDecorateAlbumItem extends Message
{

    public final ProtoAlbumMetadata album_metadata;
    public final ProtoAlbumCollectionState collection_state;
    public final ProtoAlbumOfflineState offline_state;

    private ProtoDecorateAlbumItem(Builder builder)
    {
        super(builder);
        album_metadata = builder.album_metadata;
        collection_state = builder.collection_state;
        offline_state = builder.offline_state;
    }

    ProtoDecorateAlbumItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoDecorateAlbumItem))
            {
                return false;
            }
            obj = (ProtoDecorateAlbumItem)obj;
            if (!a(album_metadata, ((ProtoDecorateAlbumItem) (obj)).album_metadata) || !a(collection_state, ((ProtoDecorateAlbumItem) (obj)).collection_state) || !a(offline_state, ((ProtoDecorateAlbumItem) (obj)).offline_state))
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
            if (album_metadata != null)
            {
                i = album_metadata.hashCode();
            } else
            {
                i = 0;
            }
            if (collection_state != null)
            {
                k = collection_state.hashCode();
            } else
            {
                k = 0;
            }
            if (offline_state != null)
            {
                l = offline_state.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public ProtoAlbumMetadata album_metadata;
        public ProtoAlbumCollectionState collection_state;
        public ProtoAlbumOfflineState offline_state;

        public final Builder album_metadata(ProtoAlbumMetadata protoalbummetadata)
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

        public final Builder collection_state(ProtoAlbumCollectionState protoalbumcollectionstate)
        {
            collection_state = protoalbumcollectionstate;
            return this;
        }

        public final Builder offline_state(ProtoAlbumOfflineState protoalbumofflinestate)
        {
            offline_state = protoalbumofflinestate;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoDecorateAlbumItem protodecoratealbumitem)
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

}
