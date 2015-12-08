// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoAlbumCollectionState extends Message
{

    public static final String DEFAULT_COLLECTION_LINK = "";
    public static final Boolean DEFAULT_COMPLETE = Boolean.valueOf(false);
    public static final Integer DEFAULT_NUM_TRACKS_IN_COLLECTION = Integer.valueOf(0);
    public final String collection_link;
    public final Boolean complete;
    public final Integer num_tracks_in_collection;

    private ProtoAlbumCollectionState(Builder builder)
    {
        super(builder);
        collection_link = builder.collection_link;
        num_tracks_in_collection = builder.num_tracks_in_collection;
        complete = builder.complete;
    }

    ProtoAlbumCollectionState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoAlbumCollectionState))
            {
                return false;
            }
            obj = (ProtoAlbumCollectionState)obj;
            if (!a(collection_link, ((ProtoAlbumCollectionState) (obj)).collection_link) || !a(num_tracks_in_collection, ((ProtoAlbumCollectionState) (obj)).num_tracks_in_collection) || !a(complete, ((ProtoAlbumCollectionState) (obj)).complete))
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
            if (collection_link != null)
            {
                i = collection_link.hashCode();
            } else
            {
                i = 0;
            }
            if (num_tracks_in_collection != null)
            {
                k = num_tracks_in_collection.hashCode();
            } else
            {
                k = 0;
            }
            if (complete != null)
            {
                l = complete.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public String collection_link;
        public Boolean complete;
        public Integer num_tracks_in_collection;

        public final ProtoAlbumCollectionState build()
        {
            return new ProtoAlbumCollectionState(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder collection_link(String s)
        {
            collection_link = s;
            return this;
        }

        public final Builder complete(Boolean boolean1)
        {
            complete = boolean1;
            return this;
        }

        public final Builder num_tracks_in_collection(Integer integer)
        {
            num_tracks_in_collection = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoAlbumCollectionState protoalbumcollectionstate)
        {
            super(protoalbumcollectionstate);
            if (protoalbumcollectionstate == null)
            {
                return;
            } else
            {
                collection_link = protoalbumcollectionstate.collection_link;
                num_tracks_in_collection = protoalbumcollectionstate.num_tracks_in_collection;
                complete = protoalbumcollectionstate.complete;
                return;
            }
        }
    }

}
