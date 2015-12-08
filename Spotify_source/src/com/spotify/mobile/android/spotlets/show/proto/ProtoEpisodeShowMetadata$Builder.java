// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoEpisodeShowMetadata, ProtoImageGroup

public final class covers extends gxc
{

    public ProtoImageGroup covers;
    public String link;
    public String name;
    public String publisher;

    public final ProtoEpisodeShowMetadata build()
    {
        return new ProtoEpisodeShowMetadata(this, (byte)0);
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

    public final covers link(String s)
    {
        link = s;
        return this;
    }

    public final link name(String s)
    {
        name = s;
        return this;
    }

    public final name publisher(String s)
    {
        publisher = s;
        return this;
    }

    public ()
    {
    }

    public (ProtoEpisodeShowMetadata protoepisodeshowmetadata)
    {
        super(protoepisodeshowmetadata);
        if (protoepisodeshowmetadata == null)
        {
            return;
        } else
        {
            link = protoepisodeshowmetadata.link;
            name = protoepisodeshowmetadata.name;
            publisher = protoepisodeshowmetadata.publisher;
            covers = protoepisodeshowmetadata.covers;
            return;
        }
    }
}
