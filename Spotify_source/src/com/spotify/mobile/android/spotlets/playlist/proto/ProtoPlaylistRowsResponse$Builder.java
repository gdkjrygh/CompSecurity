// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistRowsResponse

public final class contents extends gxc
{

    public List item;
    public Boolean loading_contents;

    public final ProtoPlaylistRowsResponse build()
    {
        return new ProtoPlaylistRowsResponse(this, (byte)0);
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

    public ()
    {
    }

    public (ProtoPlaylistRowsResponse protoplaylistrowsresponse)
    {
        super(protoplaylistrowsresponse);
        if (protoplaylistrowsresponse == null)
        {
            return;
        } else
        {
            item = ProtoPlaylistRowsResponse.a(protoplaylistrowsresponse.item);
            loading_contents = protoplaylistrowsresponse.loading_contents;
            return;
        }
    }
}
