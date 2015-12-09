// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoCollectionTracksResponse

public final class gress extends gxc
{

    public List item;
    public Boolean loading_contents;
    public String offline;
    public Integer sync_progress;
    public Integer unfiltered_length;
    public Integer unranged_length;

    public final ProtoCollectionTracksResponse build()
    {
        return new ProtoCollectionTracksResponse(this, (byte)0);
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

    public final loading_contents offline(String s)
    {
        offline = s;
        return this;
    }

    public final offline sync_progress(Integer integer)
    {
        sync_progress = integer;
        return this;
    }

    public final sync_progress unfiltered_length(Integer integer)
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

    public (ProtoCollectionTracksResponse protocollectiontracksresponse)
    {
        super(protocollectiontracksresponse);
        if (protocollectiontracksresponse == null)
        {
            return;
        } else
        {
            item = ProtoCollectionTracksResponse.a(protocollectiontracksresponse.item);
            unfiltered_length = protocollectiontracksresponse.unfiltered_length;
            unranged_length = protocollectiontracksresponse.unranged_length;
            loading_contents = protocollectiontracksresponse.loading_contents;
            offline = protocollectiontracksresponse.offline;
            sync_progress = protocollectiontracksresponse.sync_progress;
            return;
        }
    }
}
