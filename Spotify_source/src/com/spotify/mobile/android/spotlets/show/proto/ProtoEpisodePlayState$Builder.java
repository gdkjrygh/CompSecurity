// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoEpisodePlayState

public final class d extends gxc
{

    public Boolean is_playable;
    public Boolean is_played;
    public Integer time_left;

    public final ProtoEpisodePlayState build()
    {
        return new ProtoEpisodePlayState(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build is_playable(Boolean boolean1)
    {
        is_playable = boolean1;
        return this;
    }

    public final is_playable is_played(Boolean boolean1)
    {
        is_played = boolean1;
        return this;
    }

    public final is_played time_left(Integer integer)
    {
        time_left = integer;
        return this;
    }

    public ()
    {
    }

    public (ProtoEpisodePlayState protoepisodeplaystate)
    {
        super(protoepisodeplaystate);
        if (protoepisodeplaystate == null)
        {
            return;
        } else
        {
            time_left = protoepisodeplaystate.time_left;
            is_playable = protoepisodeplaystate.is_playable;
            is_played = protoepisodeplaystate.is_played;
            return;
        }
    }
}
