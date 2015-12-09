// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoArtistMetadata, ProtoArtistCollectionState, ProtoArtistOfflineState

public final class ProtoCollectionArtistsItem extends Message
{

    public static final Integer DEFAULT_ADD_TIME = Integer.valueOf(0);
    public static final Integer DEFAULT_HEADERLESS_INDEX = Integer.valueOf(0);
    public static final String DEFAULT_HEADER_FIELD = "";
    public final Integer add_time;
    public final ProtoArtistMetadata artist_metadata;
    public final ProtoArtistCollectionState collection_state;
    public final String header_field;
    public final Integer headerless_index;
    public final ProtoArtistOfflineState offline_state;

    private ProtoCollectionArtistsItem(Builder builder)
    {
        super(builder);
        header_field = builder.header_field;
        headerless_index = builder.headerless_index;
        add_time = builder.add_time;
        artist_metadata = builder.artist_metadata;
        collection_state = builder.collection_state;
        offline_state = builder.offline_state;
    }

    ProtoCollectionArtistsItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoCollectionArtistsItem))
            {
                return false;
            }
            obj = (ProtoCollectionArtistsItem)obj;
            if (!a(header_field, ((ProtoCollectionArtistsItem) (obj)).header_field) || !a(headerless_index, ((ProtoCollectionArtistsItem) (obj)).headerless_index) || !a(add_time, ((ProtoCollectionArtistsItem) (obj)).add_time) || !a(artist_metadata, ((ProtoCollectionArtistsItem) (obj)).artist_metadata) || !a(collection_state, ((ProtoCollectionArtistsItem) (obj)).collection_state) || !a(offline_state, ((ProtoCollectionArtistsItem) (obj)).offline_state))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            int j1;
            if (header_field != null)
            {
                i = header_field.hashCode();
            } else
            {
                i = 0;
            }
            if (headerless_index != null)
            {
                k = headerless_index.hashCode();
            } else
            {
                k = 0;
            }
            if (add_time != null)
            {
                l = add_time.hashCode();
            } else
            {
                l = 0;
            }
            if (artist_metadata != null)
            {
                i1 = artist_metadata.hashCode();
            } else
            {
                i1 = 0;
            }
            if (collection_state != null)
            {
                j1 = collection_state.hashCode();
            } else
            {
                j1 = 0;
            }
            if (offline_state != null)
            {
                k1 = offline_state.hashCode();
            }
            i = (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37 + k1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Integer add_time;
        public ProtoArtistMetadata artist_metadata;
        public ProtoArtistCollectionState collection_state;
        public String header_field;
        public Integer headerless_index;
        public ProtoArtistOfflineState offline_state;

        public final Builder add_time(Integer integer)
        {
            add_time = integer;
            return this;
        }

        public final Builder artist_metadata(ProtoArtistMetadata protoartistmetadata)
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

        public final Builder collection_state(ProtoArtistCollectionState protoartistcollectionstate)
        {
            collection_state = protoartistcollectionstate;
            return this;
        }

        public final Builder header_field(String s)
        {
            header_field = s;
            return this;
        }

        public final Builder headerless_index(Integer integer)
        {
            headerless_index = integer;
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

        public Builder(ProtoCollectionArtistsItem protocollectionartistsitem)
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

}
