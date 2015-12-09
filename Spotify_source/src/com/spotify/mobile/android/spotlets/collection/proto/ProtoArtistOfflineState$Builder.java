// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoArtistOfflineState

public final class gress extends gxc
{

    public String inferred_offline;
    public String offline;
    public Integer sync_progress;

    public final ProtoArtistOfflineState build()
    {
        return new ProtoArtistOfflineState(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build inferred_offline(String s)
    {
        inferred_offline = s;
        return this;
    }

    public final inferred_offline offline(String s)
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

    public (ProtoArtistOfflineState protoartistofflinestate)
    {
        super(protoartistofflinestate);
        if (protoartistofflinestate == null)
        {
            return;
        } else
        {
            offline = protoartistofflinestate.offline;
            inferred_offline = protoartistofflinestate.inferred_offline;
            sync_progress = protoartistofflinestate.sync_progress;
            return;
        }
    }
}
