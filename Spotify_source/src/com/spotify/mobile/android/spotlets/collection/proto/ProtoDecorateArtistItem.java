// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoArtistMetadata, ProtoArtistCollectionState, ProtoArtistOfflineState

public final class ProtoDecorateArtistItem extends Message
{

    public final ProtoArtistMetadata artist_metadata;
    public final ProtoArtistCollectionState collection_state;
    public final ProtoArtistOfflineState offline_state;

    private ProtoDecorateArtistItem(Builder builder)
    {
        super(builder);
        artist_metadata = builder.artist_metadata;
        collection_state = builder.collection_state;
        offline_state = builder.offline_state;
    }

    ProtoDecorateArtistItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoDecorateArtistItem))
            {
                return false;
            }
            obj = (ProtoDecorateArtistItem)obj;
            if (!a(artist_metadata, ((ProtoDecorateArtistItem) (obj)).artist_metadata) || !a(collection_state, ((ProtoDecorateArtistItem) (obj)).collection_state) || !a(offline_state, ((ProtoDecorateArtistItem) (obj)).offline_state))
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
            if (artist_metadata != null)
            {
                i = artist_metadata.hashCode();
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

        public ProtoArtistMetadata artist_metadata;
        public ProtoArtistCollectionState collection_state;
        public ProtoArtistOfflineState offline_state;

        public final Builder artist_metadata(ProtoArtistMetadata protoartistmetadata)
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

        public final Builder collection_state(ProtoArtistCollectionState protoartistcollectionstate)
        {
            collection_state = protoartistcollectionstate;
            return this;
        }

        public final Builder offline_state(ProtoArtistOfflineState protoartistofflinestate)
        {
            offline_state = protoartistofflinestate;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoDecorateArtistItem protodecorateartistitem)
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

}
