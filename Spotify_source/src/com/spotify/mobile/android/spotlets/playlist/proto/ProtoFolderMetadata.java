// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;

public final class ProtoFolderMetadata extends Message
{

    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM_FOLDERS = Integer.valueOf(0);
    public static final Integer DEFAULT_NUM_PLAYLISTS = Integer.valueOf(0);
    public static final Integer DEFAULT_NUM_RECURSIVE_FOLDERS = Integer.valueOf(0);
    public static final Integer DEFAULT_NUM_RECURSIVE_PLAYLISTS = Integer.valueOf(0);
    public final String id;
    public final String name;
    public final Integer num_folders;
    public final Integer num_playlists;
    public final Integer num_recursive_folders;
    public final Integer num_recursive_playlists;

    private ProtoFolderMetadata(Builder builder)
    {
        super(builder);
        id = builder.id;
        name = builder.name;
        num_folders = builder.num_folders;
        num_playlists = builder.num_playlists;
        num_recursive_folders = builder.num_recursive_folders;
        num_recursive_playlists = builder.num_recursive_playlists;
    }

    ProtoFolderMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoFolderMetadata))
            {
                return false;
            }
            obj = (ProtoFolderMetadata)obj;
            if (!a(id, ((ProtoFolderMetadata) (obj)).id) || !a(name, ((ProtoFolderMetadata) (obj)).name) || !a(num_folders, ((ProtoFolderMetadata) (obj)).num_folders) || !a(num_playlists, ((ProtoFolderMetadata) (obj)).num_playlists) || !a(num_recursive_folders, ((ProtoFolderMetadata) (obj)).num_recursive_folders) || !a(num_recursive_playlists, ((ProtoFolderMetadata) (obj)).num_recursive_playlists))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            int j1;
            if (id != null)
            {
                i = id.hashCode();
            } else
            {
                i = 0;
            }
            if (name != null)
            {
                k = name.hashCode();
            } else
            {
                k = 0;
            }
            if (num_folders != null)
            {
                l = num_folders.hashCode();
            } else
            {
                l = 0;
            }
            if (num_playlists != null)
            {
                i1 = num_playlists.hashCode();
            } else
            {
                i1 = 0;
            }
            if (num_recursive_folders != null)
            {
                j1 = num_recursive_folders.hashCode();
            } else
            {
                j1 = 0;
            }
            if (num_recursive_playlists != null)
            {
                k1 = num_recursive_playlists.hashCode();
            }
            i = (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37 + k1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
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

        public final Builder id(String s)
        {
            id = s;
            return this;
        }

        public final Builder name(String s)
        {
            name = s;
            return this;
        }

        public final Builder num_folders(Integer integer)
        {
            num_folders = integer;
            return this;
        }

        public final Builder num_playlists(Integer integer)
        {
            num_playlists = integer;
            return this;
        }

        public final Builder num_recursive_folders(Integer integer)
        {
            num_recursive_folders = integer;
            return this;
        }

        public final Builder num_recursive_playlists(Integer integer)
        {
            num_recursive_playlists = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoFolderMetadata protofoldermetadata)
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

}
