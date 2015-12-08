// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistResponse, ProtoPlaylistHeader

public final class gress extends gxc
{

    public Long duration;
    public List item;
    public Boolean loading_contents;
    public String offline;
    public ProtoPlaylistHeader playlist;
    public Integer sync_progress;
    public Integer unfiltered_length;
    public Integer unranged_length;

    public final ProtoPlaylistResponse build()
    {
        return new ProtoPlaylistResponse(this, (byte)0);
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

    public final duration item(List list)
    {
        item = checkForNulls(list);
        return this;
    }

    public final checkForNulls loading_contents(Boolean boolean1)
    {
        loading_contents = boolean1;
        return this;
    }

    public final loading_contents offline(String s)
    {
        offline = s;
        return this;
    }

    public final offline playlist(ProtoPlaylistHeader protoplaylistheader)
    {
        playlist = protoplaylistheader;
        return this;
    }

    public final playlist sync_progress(Integer integer)
    {
        sync_progress = integer;
        return this;
    }

    public final sync_progress unfiltered_length(Integer integer)
    {
        unfiltered_length = integer;
        return this;
    }

    public final unfiltered_length unranged_length(Integer integer)
    {
        unranged_length = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistResponse protoplaylistresponse)
    {
        super(protoplaylistresponse);
        if (protoplaylistresponse == null)
        {
            return;
        } else
        {
            item = ProtoPlaylistResponse.a(protoplaylistresponse.item);
            playlist = protoplaylistresponse.playlist;
            unfiltered_length = protoplaylistresponse.unfiltered_length;
            unranged_length = protoplaylistresponse.unranged_length;
            duration = protoplaylistresponse.duration;
            loading_contents = protoplaylistresponse.loading_contents;
            offline = protoplaylistresponse.offline;
            sync_progress = protoplaylistresponse.sync_progress;
            return;
        }
    }
}
