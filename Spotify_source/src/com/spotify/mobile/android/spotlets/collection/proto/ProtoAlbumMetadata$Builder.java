// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoAlbumMetadata, ProtoAlbumArtistMetadata

public final class ity extends gxc
{

    public ProtoAlbumArtistMetadata artist;
    public String copyright;
    public ProtoImageGroup covers;
    public String link;
    public String name;
    public Integer num_discs;
    public Integer num_tracks;
    public Boolean playability;
    public Integer year;

    public final ity artist(ProtoAlbumArtistMetadata protoalbumartistmetadata)
    {
        artist = protoalbumartistmetadata;
        return this;
    }

    public final ProtoAlbumMetadata build()
    {
        return new ProtoAlbumMetadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build copyright(String s)
    {
        copyright = s;
        return this;
    }

    public final copyright covers(ProtoImageGroup protoimagegroup)
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

    public final name num_discs(Integer integer)
    {
        num_discs = integer;
        return this;
    }

    public final num_discs num_tracks(Integer integer)
    {
        num_tracks = integer;
        return this;
    }

    public final num_tracks playability(Boolean boolean1)
    {
        playability = boolean1;
        return this;
    }

    public final playability year(Integer integer)
    {
        year = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoAlbumMetadata protoalbummetadata)
    {
        super(protoalbummetadata);
        if (protoalbummetadata == null)
        {
            return;
        } else
        {
            artist = protoalbummetadata.artist;
            link = protoalbummetadata.link;
            name = protoalbummetadata.name;
            copyright = protoalbummetadata.copyright;
            covers = protoalbummetadata.covers;
            year = protoalbummetadata.year;
            num_discs = protoalbummetadata.num_discs;
            num_tracks = protoalbummetadata.num_tracks;
            playability = protoalbummetadata.playability;
            return;
        }
    }
}
