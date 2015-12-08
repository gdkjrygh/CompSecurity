// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoAlbumMetadata, ProtoAlbumCollectionState, ProtoAlbumOfflineState

public final class ProtoCollectionAlbumsItem extends Message
{

    public static final Integer DEFAULT_ADD_TIME = Integer.valueOf(0);
    public static final Integer DEFAULT_HEADERLESS_INDEX = Integer.valueOf(0);
    public static final String DEFAULT_HEADER_FIELD = "";
    public final Integer add_time;
    public final ProtoAlbumMetadata album_metadata;
    public final ProtoAlbumCollectionState collection_state;
    public final String header_field;
    public final Integer headerless_index;
    public final ProtoAlbumOfflineState offline_state;

    private ProtoCollectionAlbumsItem(Builder builder)
    {
        super(builder);
        header_field = builder.header_field;
        headerless_index = builder.headerless_index;
        add_time = builder.add_time;
        album_metadata = builder.album_metadata;
        collection_state = builder.collection_state;
        offline_state = builder.offline_state;
    }

    ProtoCollectionAlbumsItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoCollectionAlbumsItem))
            {
                return false;
            }
            obj = (ProtoCollectionAlbumsItem)obj;
            if (!a(header_field, ((ProtoCollectionAlbumsItem) (obj)).header_field) || !a(headerless_index, ((ProtoCollectionAlbumsItem) (obj)).headerless_index) || !a(add_time, ((ProtoCollectionAlbumsItem) (obj)).add_time) || !a(album_metadata, ((ProtoCollectionAlbumsItem) (obj)).album_metadata) || !a(collection_state, ((ProtoCollectionAlbumsItem) (obj)).collection_state) || !a(offline_state, ((ProtoCollectionAlbumsItem) (obj)).offline_state))
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
            if (album_metadata != null)
            {
                i1 = album_metadata.hashCode();
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
        public ProtoAlbumMetadata album_metadata;
        public ProtoAlbumCollectionState collection_state;
        public String header_field;
        public Integer headerless_index;
        public ProtoAlbumOfflineState offline_state;

        public final Builder add_time(Integer integer)
        {
            add_time = integer;
            return this;
        }

        public final Builder album_metadata(ProtoAlbumMetadata protoalbummetadata)
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

        public final Builder collection_state(ProtoAlbumCollectionState protoalbumcollectionstate)
        {
            collection_state = protoalbumcollectionstate;
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

        public final Builder offline_state(ProtoAlbumOfflineState protoalbumofflinestate)
        {
            offline_state = protoalbumofflinestate;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoCollectionAlbumsItem protocollectionalbumsitem)
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

}
