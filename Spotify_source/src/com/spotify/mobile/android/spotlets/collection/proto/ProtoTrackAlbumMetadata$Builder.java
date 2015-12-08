// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackAlbumMetadata, ProtoTrackAlbumArtistMetadata

public final class covers extends gxc
{

    public ProtoTrackAlbumArtistMetadata artist;
    public ProtoImageGroup covers;
    public String link;
    public String name;

    public final covers artist(ProtoTrackAlbumArtistMetadata prototrackalbumartistmetadata)
    {
        artist = prototrackalbumartistmetadata;
        return this;
    }

    public final ProtoTrackAlbumMetadata build()
    {
        return new ProtoTrackAlbumMetadata(this, (byte)0);
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

    public ()
    {
    }

    public (ProtoTrackAlbumMetadata prototrackalbummetadata)
    {
        super(prototrackalbummetadata);
        if (prototrackalbummetadata == null)
        {
            return;
        } else
        {
            artist = prototrackalbummetadata.artist;
            link = prototrackalbummetadata.link;
            name = prototrackalbummetadata.name;
            covers = prototrackalbummetadata.covers;
            return;
        }
    }
}
