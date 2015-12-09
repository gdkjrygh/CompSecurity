// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoEpisodeOfflineState

public final class gress extends gxc
{

    public String offline_state;
    public Integer sync_progress;

    public final ProtoEpisodeOfflineState build()
    {
        return new ProtoEpisodeOfflineState(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build offline_state(String s)
    {
        offline_state = s;
        return this;
    }

    public final offline_state sync_progress(Integer integer)
    {
        sync_progress = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoEpisodeOfflineState protoepisodeofflinestate)
    {
        super(protoepisodeofflinestate);
        if (protoepisodeofflinestate == null)
        {
            return;
        } else
        {
            offline_state = protoepisodeofflinestate.offline_state;
            sync_progress = protoepisodeofflinestate.sync_progress;
            return;
        }
    }
}
