// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoAlbumCollectionState

public final class  extends gxc
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

    public final build collection_link(String s)
    {
        collection_link = s;
        return this;
    }

    public final collection_link complete(Boolean boolean1)
    {
        complete = boolean1;
        return this;
    }

    public final complete num_tracks_in_collection(Integer integer)
    {
        num_tracks_in_collection = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoAlbumCollectionState protoalbumcollectionstate)
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
