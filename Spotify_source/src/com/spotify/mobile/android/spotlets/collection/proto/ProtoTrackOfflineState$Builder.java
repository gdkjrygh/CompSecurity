// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackOfflineState

public final class offline extends gxc
{

    public String offline;

    public final ProtoTrackOfflineState build()
    {
        return new ProtoTrackOfflineState(this, (byte)0);
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

    public Y()
    {
    }

    public Y(ProtoTrackOfflineState prototrackofflinestate)
    {
        super(prototrackofflinestate);
        if (prototrackofflinestate == null)
        {
            return;
        } else
        {
            offline = prototrackofflinestate.offline;
            return;
        }
    }
}
