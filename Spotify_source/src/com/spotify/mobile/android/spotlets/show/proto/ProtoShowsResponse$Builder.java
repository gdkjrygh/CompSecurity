// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowsResponse

public final class contents extends gxc
{

    public List item;
    public Boolean loading_contents;
    public Integer num_offlined_episodes;
    public Integer unfiltered_length;
    public Integer unranged_length;

    public final ProtoShowsResponse build()
    {
        return new ProtoShowsResponse(this, (byte)0);
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

    public final loading_contents num_offlined_episodes(Integer integer)
    {
        num_offlined_episodes = integer;
        return this;
    }

    public final num_offlined_episodes unfiltered_length(Integer integer)
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

    public (ProtoShowsResponse protoshowsresponse)
    {
        super(protoshowsresponse);
        if (protoshowsresponse == null)
        {
            return;
        } else
        {
            item = ProtoShowsResponse.a(protoshowsresponse.item);
            num_offlined_episodes = protoshowsresponse.num_offlined_episodes;
            unfiltered_length = protoshowsresponse.unfiltered_length;
            unranged_length = protoshowsresponse.unranged_length;
            loading_contents = protoshowsresponse.loading_contents;
            return;
        }
    }
}
