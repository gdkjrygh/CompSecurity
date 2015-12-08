// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoArtistCollectionState extends Message
{

    public static final String DEFAULT_COLLECTION_LINK = "";
    public static final Boolean DEFAULT_FOLLOWED = Boolean.valueOf(false);
    public static final Integer DEFAULT_NUM_ALBUMS_IN_COLLECTION = Integer.valueOf(0);
    public static final Integer DEFAULT_NUM_TRACKS_IN_COLLECTION = Integer.valueOf(0);
    public final String collection_link;
    public final Boolean followed;
    public final Integer num_albums_in_collection;
    public final Integer num_tracks_in_collection;

    private ProtoArtistCollectionState(Builder builder)
    {
        super(builder);
        collection_link = builder.collection_link;
        followed = builder.followed;
        num_tracks_in_collection = builder.num_tracks_in_collection;
        num_albums_in_collection = builder.num_albums_in_collection;
    }

    ProtoArtistCollectionState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoArtistCollectionState))
            {
                return false;
            }
            obj = (ProtoArtistCollectionState)obj;
            if (!a(collection_link, ((ProtoArtistCollectionState) (obj)).collection_link) || !a(followed, ((ProtoArtistCollectionState) (obj)).followed) || !a(num_tracks_in_collection, ((ProtoArtistCollectionState) (obj)).num_tracks_in_collection) || !a(num_albums_in_collection, ((ProtoArtistCollectionState) (obj)).num_albums_in_collection))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            if (collection_link != null)
            {
                i = collection_link.hashCode();
            } else
            {
                i = 0;
            }
            if (followed != null)
            {
                k = followed.hashCode();
            } else
            {
                k = 0;
            }
            if (num_tracks_in_collection != null)
            {
                l = num_tracks_in_collection.hashCode();
            } else
            {
                l = 0;
            }
            if (num_albums_in_collection != null)
            {
                i1 = num_albums_in_collection.hashCode();
            }
            i = (l + (k + i * 37) * 37) * 37 + i1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public String collection_link;
        public Boolean followed;
        public Integer num_albums_in_collection;
        public Integer num_tracks_in_collection;

        public final ProtoArtistCollectionState build()
        {
            return new ProtoArtistCollectionState(this, (byte)0);
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

        public final Builder followed(Boolean boolean1)
        {
            followed = boolean1;
            return this;
        }

        public final Builder num_albums_in_collection(Integer integer)
        {
            num_albums_in_collection = integer;
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

        public Builder(ProtoArtistCollectionState protoartistcollectionstate)
        {
            super(protoartistcollectionstate);
            if (protoartistcollectionstate == null)
            {
                return;
            } else
            {
                collection_link = protoartistcollectionstate.collection_link;
                followed = protoartistcollectionstate.followed;
                num_tracks_in_collection = protoartistcollectionstate.num_tracks_in_collection;
                num_albums_in_collection = protoartistcollectionstate.num_albums_in_collection;
                return;
            }
        }
    }

}
