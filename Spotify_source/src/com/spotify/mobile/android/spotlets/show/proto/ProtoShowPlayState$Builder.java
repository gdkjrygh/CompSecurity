// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowPlayState

public final class layed_episode_link extends gxc
{

    public String latest_played_episode_link;

    public final ProtoShowPlayState build()
    {
        return new ProtoShowPlayState(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build latest_played_episode_link(String s)
    {
        latest_played_episode_link = s;
        return this;
    }

    public ()
    {
    }

    public (ProtoShowPlayState protoshowplaystate)
    {
        super(protoshowplaystate);
        if (protoshowplaystate == null)
        {
            return;
        } else
        {
            latest_played_episode_link = protoshowplaystate.latest_played_episode_link;
            return;
        }
    }
}
