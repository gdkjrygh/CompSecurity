// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoArtistMetadata

public final class covers extends gxc
{

    public ProtoImageGroup covers;
    public Boolean is_various_artists;
    public String link;
    public String name;

    public final ProtoArtistMetadata build()
    {
        return new ProtoArtistMetadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build covers(ProtoImageGroup protoimagegroup)
    {
        covers = protoimagegroup;
        return this;
    }

    public final covers is_various_artists(Boolean boolean1)
    {
        is_various_artists = boolean1;
        return this;
    }

    public final is_various_artists link(String s)
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

    public (ProtoArtistMetadata protoartistmetadata)
    {
        super(protoartistmetadata);
        if (protoartistmetadata == null)
        {
            return;
        } else
        {
            link = protoartistmetadata.link;
            name = protoartistmetadata.name;
            is_various_artists = protoartistmetadata.is_various_artists;
            covers = protoartistmetadata.covers;
            return;
        }
    }
}
