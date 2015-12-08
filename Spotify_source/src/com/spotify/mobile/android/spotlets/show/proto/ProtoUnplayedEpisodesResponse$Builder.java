// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoUnplayedEpisodesResponse

public final class contents extends gxc
{

    public List item;
    public Boolean loading_contents;
    public Integer unfiltered_length;
    public Integer unranged_length;

    public final ProtoUnplayedEpisodesResponse build()
    {
        return new ProtoUnplayedEpisodesResponse(this, (byte)0);
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

    public (ProtoUnplayedEpisodesResponse protounplayedepisodesresponse)
    {
        super(protounplayedepisodesresponse);
        if (protounplayedepisodesresponse == null)
        {
            return;
        } else
        {
            item = ProtoUnplayedEpisodesResponse.a(protounplayedepisodesresponse.item);
            unfiltered_length = protounplayedepisodesresponse.unfiltered_length;
            unranged_length = protounplayedepisodesresponse.unranged_length;
            loading_contents = protounplayedepisodesresponse.loading_contents;
            return;
        }
    }
}
