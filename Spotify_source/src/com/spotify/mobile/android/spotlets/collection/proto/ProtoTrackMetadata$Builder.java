// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackMetadata, ProtoTrackAlbumMetadata

public final class  extends gxc
{

    public ProtoTrackAlbumMetadata album;
    public List artist;
    public Boolean available;
    public Integer disc_number;
    public Boolean is_explicit;
    public Boolean is_local;
    public Integer length;
    public String link;
    public String name;
    public Integer track_number;

    public final  album(ProtoTrackAlbumMetadata prototrackalbummetadata)
    {
        album = prototrackalbummetadata;
        return this;
    }

    public final album artist(List list)
    {
        artist = checkForNulls(list);
        return this;
    }

    public final checkForNulls available(Boolean boolean1)
    {
        available = boolean1;
        return this;
    }

    public final ProtoTrackMetadata build()
    {
        return new ProtoTrackMetadata(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build disc_number(Integer integer)
    {
        disc_number = integer;
        return this;
    }

    public final disc_number is_explicit(Boolean boolean1)
    {
        is_explicit = boolean1;
        return this;
    }

    public final is_explicit is_local(Boolean boolean1)
    {
        is_local = boolean1;
        return this;
    }

    public final is_local length(Integer integer)
    {
        length = integer;
        return this;
    }

    public final length link(String s)
    {
        link = s;
        return this;
    }

    public final link name(String s)
    {
        name = s;
        return this;
    }

    public final name track_number(Integer integer)
    {
        track_number = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoTrackMetadata prototrackmetadata)
    {
        super(prototrackmetadata);
        if (prototrackmetadata == null)
        {
            return;
        } else
        {
            album = prototrackmetadata.album;
            artist = ProtoTrackMetadata.a(prototrackmetadata.artist);
            link = prototrackmetadata.link;
            name = prototrackmetadata.name;
            length = prototrackmetadata.length;
            available = prototrackmetadata.available;
            disc_number = prototrackmetadata.disc_number;
            track_number = prototrackmetadata.track_number;
            is_explicit = prototrackmetadata.is_explicit;
            is_local = prototrackmetadata.is_local;
            return;
        }
    }
}
