// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistRootItem, ProtoPlaylistRootFolder, ProtoPlaylistRootPlaylist

public final class  extends gxc
{

    public ProtoPlaylistRootFolder folder;
    public String header_field;
    public ProtoPlaylistRootPlaylist playlist;

    public final ProtoPlaylistRootItem build()
    {
        return new ProtoPlaylistRootItem(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build folder(ProtoPlaylistRootFolder protoplaylistrootfolder)
    {
        folder = protoplaylistrootfolder;
        return this;
    }

    public final folder header_field(String s)
    {
        header_field = s;
        return this;
    }

    public final header_field playlist(ProtoPlaylistRootPlaylist protoplaylistrootplaylist)
    {
        playlist = protoplaylistrootplaylist;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistRootItem protoplaylistrootitem)
    {
        super(protoplaylistrootitem);
        if (protoplaylistrootitem == null)
        {
            return;
        } else
        {
            header_field = protoplaylistrootitem.header_field;
            folder = protoplaylistrootitem.folder;
            playlist = protoplaylistrootitem.playlist;
            return;
        }
    }
}
