// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistOfflineState

public final class gress extends gxc
{

    public String offline;
    public Integer sync_progress;

    public final ProtoPlaylistOfflineState build()
    {
        return new ProtoPlaylistOfflineState(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build offline(String s)
    {
        offline = s;
        return this;
    }

    public final offline sync_progress(Integer integer)
    {
        sync_progress = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoPlaylistOfflineState protoplaylistofflinestate)
    {
        super(protoplaylistofflinestate);
        if (protoplaylistofflinestate == null)
        {
            return;
        } else
        {
            offline = protoplaylistofflinestate.offline;
            sync_progress = protoplaylistofflinestate.sync_progress;
            return;
        }
    }
}
