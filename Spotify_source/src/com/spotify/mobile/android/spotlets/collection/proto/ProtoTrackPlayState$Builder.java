// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackPlayState

public final class ble extends gxc
{

    public Boolean is_playable;

    public final ProtoTrackPlayState build()
    {
        return new ProtoTrackPlayState(this, (byte)0);
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

    public ()
    {
    }

    public (ProtoTrackPlayState prototrackplaystate)
    {
        super(prototrackplaystate);
        if (prototrackplaystate == null)
        {
            return;
        } else
        {
            is_playable = prototrackplaystate.is_playable;
            return;
        }
    }
}
