// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoCollectionArtistsResponse

public final class contents extends gxc
{

    public List item;
    public Boolean loading_contents;
    public Integer unfiltered_length;
    public Integer unranged_length;

    public final ProtoCollectionArtistsResponse build()
    {
        return new ProtoCollectionArtistsResponse(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build item(List list)
    {
        item = checkForNulls(list);
        return this;
    }

    public final checkForNulls loading_contents(Boolean boolean1)
    {
        loading_contents = boolean1;
        return this;
    }

    public final loading_contents unfiltered_length(Integer integer)
    {
        unfiltered_length = integer;
        return this;
    }

    public final unfiltered_length unranged_length(Integer integer)
    {
        unranged_length = integer;
        return this;
    }

    public a()
    {
    }

    public a(ProtoCollectionArtistsResponse protocollectionartistsresponse)
    {
        super(protocollectionartistsresponse);
        if (protocollectionartistsresponse == null)
        {
            return;
        } else
        {
            item = ProtoCollectionArtistsResponse.a(protocollectionartistsresponse.item);
            unfiltered_length = protocollectionartistsresponse.unfiltered_length;
            unranged_length = protocollectionartistsresponse.unranged_length;
            loading_contents = protocollectionartistsresponse.loading_contents;
            return;
        }
    }
}
