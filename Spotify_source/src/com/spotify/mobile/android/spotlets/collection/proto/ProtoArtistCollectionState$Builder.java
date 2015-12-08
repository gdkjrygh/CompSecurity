// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoArtistCollectionState

public final class ms_in_collection extends gxc
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

    public final build collection_link(String s)
    {
        collection_link = s;
        return this;
    }

    public final collection_link followed(Boolean boolean1)
    {
        followed = boolean1;
        return this;
    }

    public final followed num_albums_in_collection(Integer integer)
    {
        num_albums_in_collection = integer;
        return this;
    }

    public final num_albums_in_collection num_tracks_in_collection(Integer integer)
    {
        num_tracks_in_collection = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoArtistCollectionState protoartistcollectionstate)
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
