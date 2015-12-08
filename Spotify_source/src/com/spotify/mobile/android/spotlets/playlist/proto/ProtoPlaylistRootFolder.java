// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoFolderMetadata

public final class ProtoPlaylistRootFolder extends Message
{

    public static final List DEFAULT_ITEM = Collections.emptyList();
    public static final String DEFAULT_ROW_ID = "";
    public final ProtoFolderMetadata folder_metadata;
    public final List item;
    public final String row_id;

    private ProtoPlaylistRootFolder(Builder builder)
    {
        super(builder);
        item = e(builder.item);
        folder_metadata = builder.folder_metadata;
        row_id = builder.row_id;
    }

    ProtoPlaylistRootFolder(Builder builder, byte byte0)
    {
        this(builder);
    }

    static List a(List list)
    {
        return d(list);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistRootFolder))
            {
                return false;
            }
            obj = (ProtoPlaylistRootFolder)obj;
            if (!a(item, ((ProtoPlaylistRootFolder) (obj)).item) || !a(folder_metadata, ((ProtoPlaylistRootFolder) (obj)).folder_metadata) || !a(row_id, ((ProtoPlaylistRootFolder) (obj)).row_id))
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
            if (item != null)
            {
                i = item.hashCode();
            } else
            {
                i = 1;
            }
            if (folder_metadata != null)
            {
                k = folder_metadata.hashCode();
            } else
            {
                k = 0;
            }
            if (row_id != null)
            {
                l = row_id.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
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

        public final Builder folder_metadata(ProtoFolderMetadata protofoldermetadata)
        {
            folder_metadata = protofoldermetadata;
            return this;
        }

        public final Builder item(List list)
        {
            item = checkForNulls(list);
            return this;
        }

        public final Builder row_id(String s)
        {
            row_id = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoPlaylistRootFolder protoplaylistrootfolder)
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

}
