// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoAlbumArtistMetadata

public final class name extends gxc
{

    public String link;
    public String name;

    public final ProtoAlbumArtistMetadata build()
    {
        return new ProtoAlbumArtistMetadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build link(String s)
    {
        link = s;
        return this;
    }

    public final link name(String s)
    {
        name = s;
        return this;
    }

    public ()
    {
    }

    public (ProtoAlbumArtistMetadata protoalbumartistmetadata)
    {
        super(protoalbumartistmetadata);
        if (protoalbumartistmetadata == null)
        {
            return;
        } else
        {
            link = protoalbumartistmetadata.link;
            name = protoalbumartistmetadata.name;
            return;
        }
    }
}
