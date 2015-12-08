// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistRootResponse, ProtoPlaylistRootFolder

public final class root extends gxc
{

    public ProtoPlaylistRootFolder root;

    public final ProtoPlaylistRootResponse build()
    {
        return new ProtoPlaylistRootResponse(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build root(ProtoPlaylistRootFolder protoplaylistrootfolder)
    {
        root = protoplaylistrootfolder;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistRootResponse protoplaylistrootresponse)
    {
        super(protoplaylistrootresponse);
        if (protoplaylistrootresponse == null)
        {
            return;
        } else
        {
            root = protoplaylistrootresponse.root;
            return;
        }
    }
}
