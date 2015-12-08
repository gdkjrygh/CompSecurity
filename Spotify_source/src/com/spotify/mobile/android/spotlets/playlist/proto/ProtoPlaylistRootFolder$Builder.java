// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistRootFolder, ProtoFolderMetadata

public final class row_id extends gxc
{

    public ProtoFolderMetadata folder_metadata;
    public List item;
    public String row_id;

    public final ProtoPlaylistRootFolder build()
    {
        return new ProtoPlaylistRootFolder(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build folder_metadata(ProtoFolderMetadata protofoldermetadata)
    {
        folder_metadata = protofoldermetadata;
        return this;
    }

    public final folder_metadata item(List list)
    {
        item = checkForNulls(list);
        return this;
    }

    public final checkForNulls row_id(String s)
    {
        row_id = s;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistRootFolder protoplaylistrootfolder)
    {
        super(protoplaylistrootfolder);
        if (protoplaylistrootfolder == null)
        {
            return;
        } else
        {
            item = ProtoPlaylistRootFolder.a(protoplaylistrootfolder.item);
            folder_metadata = protoplaylistrootfolder.folder_metadata;
            row_id = protoplaylistrootfolder.row_id;
            return;
        }
    }
}
