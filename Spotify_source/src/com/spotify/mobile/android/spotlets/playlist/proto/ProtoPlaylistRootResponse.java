// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistRootFolder

public final class ProtoPlaylistRootResponse extends Message
{

    public final ProtoPlaylistRootFolder root;

    private ProtoPlaylistRootResponse(Builder builder)
    {
        super(builder);
        root = builder.root;
    }

    ProtoPlaylistRootResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistRootResponse))
        {
            return false;
        } else
        {
            return a(root, ((ProtoPlaylistRootResponse)obj).root);
        }
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        if (root != null)
        {
            i = root.hashCode();
        } else
        {
            i = 0;
        }
        hashCode = i;
        return i;
    }

    private class Builder extends gxc
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

        public final Builder root(ProtoPlaylistRootFolder protoplaylistrootfolder)
        {
            root = protoplaylistrootfolder;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoPlaylistRootResponse protoplaylistrootresponse)
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

}
