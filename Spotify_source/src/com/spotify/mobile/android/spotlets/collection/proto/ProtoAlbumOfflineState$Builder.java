// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoAlbumOfflineState

public final class gress extends gxc
{

    public String inferred_offline;
    public String offline;
    public Integer sync_progress;

    public final ProtoAlbumOfflineState build()
    {
        return new ProtoAlbumOfflineState(this, (byte)0);
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

    public Y()
    {
    }

    public Y(ProtoAlbumOfflineState protoalbumofflinestate)
    {
        super(protoalbumofflinestate);
        if (protoalbumofflinestate == null)
        {
            return;
        } else
        {
            offline = protoalbumofflinestate.offline;
            inferred_offline = protoalbumofflinestate.inferred_offline;
            sync_progress = protoalbumofflinestate.sync_progress;
            return;
        }
    }
}
