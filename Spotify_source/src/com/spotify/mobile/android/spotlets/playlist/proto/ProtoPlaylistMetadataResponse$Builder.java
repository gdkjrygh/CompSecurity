// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistMetadataResponse, ProtoPlaylistMetadataItem

public final class owers extends gxc
{

    public Long duration;
    public Boolean loading_contents;
    public Integer num_followers;
    public ProtoPlaylistMetadataItem playlist;

    public final ProtoPlaylistMetadataResponse build()
    {
        return new ProtoPlaylistMetadataResponse(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build duration(Long long1)
    {
        duration = long1;
        return this;
    }

    public final duration loading_contents(Boolean boolean1)
    {
        loading_contents = boolean1;
        return this;
    }

    public final loading_contents num_followers(Integer integer)
    {
        num_followers = integer;
        return this;
    }

    public final num_followers playlist(ProtoPlaylistMetadataItem protoplaylistmetadataitem)
    {
        playlist = protoplaylistmetadataitem;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistMetadataResponse protoplaylistmetadataresponse)
    {
        super(protoplaylistmetadataresponse);
        if (protoplaylistmetadataresponse == null)
        {
            return;
        } else
        {
            playlist = protoplaylistmetadataresponse.playlist;
            duration = protoplaylistmetadataresponse.duration;
            loading_contents = protoplaylistmetadataresponse.loading_contents;
            num_followers = protoplaylistmetadataresponse.num_followers;
            return;
        }
    }
}
