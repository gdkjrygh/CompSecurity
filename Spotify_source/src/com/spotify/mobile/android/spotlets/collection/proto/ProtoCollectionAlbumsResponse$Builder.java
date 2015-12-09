// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoCollectionAlbumsResponse

public final class contents extends gxc
{

    public List item;
    public Boolean loading_contents;
    public Integer unfiltered_length;
    public Integer unranged_length;

    public final ProtoCollectionAlbumsResponse build()
    {
        return new ProtoCollectionAlbumsResponse(this, (byte)0);
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

    public ()
    {
    }

    public (ProtoCollectionAlbumsResponse protocollectionalbumsresponse)
    {
        super(protocollectionalbumsresponse);
        if (protocollectionalbumsresponse == null)
        {
            return;
        } else
        {
            item = ProtoCollectionAlbumsResponse.a(protocollectionalbumsresponse.item);
            unfiltered_length = protocollectionalbumsresponse.unfiltered_length;
            unranged_length = protocollectionalbumsresponse.unranged_length;
            loading_contents = protocollectionalbumsresponse.loading_contents;
            return;
        }
    }
}
