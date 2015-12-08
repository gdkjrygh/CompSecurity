// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistRootFolder, ProtoPlaylistRootPlaylist

public final class ProtoPlaylistRootItem extends Message
{

    public static final String DEFAULT_HEADER_FIELD = "";
    public final ProtoPlaylistRootFolder folder;
    public final String header_field;
    public final ProtoPlaylistRootPlaylist playlist;

    private ProtoPlaylistRootItem(Builder builder)
    {
        super(builder);
        header_field = builder.header_field;
        folder = builder.folder;
        playlist = builder.playlist;
    }

    ProtoPlaylistRootItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistRootItem))
            {
                return false;
            }
            obj = (ProtoPlaylistRootItem)obj;
            if (!a(header_field, ((ProtoPlaylistRootItem) (obj)).header_field) || !a(folder, ((ProtoPlaylistRootItem) (obj)).folder) || !a(playlist, ((ProtoPlaylistRootItem) (obj)).playlist))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (header_field != null)
            {
                i = header_field.hashCode();
            } else
            {
                i = 0;
            }
            if (folder != null)
            {
                k = folder.hashCode();
            } else
            {
                k = 0;
            }
            if (playlist != null)
            {
                l = playlist.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
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

        public final Builder folder(ProtoPlaylistRootFolder protoplaylistrootfolder)
        {
            folder = protoplaylistrootfolder;
            return this;
        }

        public final Builder header_field(String s)
        {
            header_field = s;
            return this;
        }

        public final Builder playlist(ProtoPlaylistRootPlaylist protoplaylistrootplaylist)
        {
            playlist = protoplaylistrootplaylist;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoPlaylistRootItem protoplaylistrootitem)
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

}
