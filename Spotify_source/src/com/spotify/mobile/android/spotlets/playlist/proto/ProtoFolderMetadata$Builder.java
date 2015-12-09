// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoFolderMetadata

public final class rsive_playlists extends gxc
{

    public String id;
    public String name;
    public Integer num_folders;
    public Integer num_playlists;
    public Integer num_recursive_folders;
    public Integer num_recursive_playlists;

    public final ProtoFolderMetadata build()
    {
        return new ProtoFolderMetadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build id(String s)
    {
        id = s;
        return this;
    }

    public final id name(String s)
    {
        name = s;
        return this;
    }

    public final name num_folders(Integer integer)
    {
        num_folders = integer;
        return this;
    }

    public final num_folders num_playlists(Integer integer)
    {
        num_playlists = integer;
        return this;
    }

    public final num_playlists num_recursive_folders(Integer integer)
    {
        num_recursive_folders = integer;
        return this;
    }

    public final num_recursive_folders num_recursive_playlists(Integer integer)
    {
        num_recursive_playlists = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoFolderMetadata protofoldermetadata)
    {
        super(protofoldermetadata);
        if (protofoldermetadata == null)
        {
            return;
        } else
        {
            id = protofoldermetadata.id;
            name = protofoldermetadata.name;
            num_folders = protofoldermetadata.num_folders;
            num_playlists = protofoldermetadata.num_playlists;
            num_recursive_folders = protofoldermetadata.num_recursive_folders;
            num_recursive_playlists = protofoldermetadata.num_recursive_playlists;
            return;
        }
    }
}
