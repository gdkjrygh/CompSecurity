// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowCollectionState

public final class llection extends gxc
{

    public Boolean is_in_collection;

    public final ProtoShowCollectionState build()
    {
        return new ProtoShowCollectionState(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build is_in_collection(Boolean boolean1)
    {
        is_in_collection = boolean1;
        return this;
    }

    public ()
    {
    }

    public (ProtoShowCollectionState protoshowcollectionstate)
    {
        super(protoshowcollectionstate);
        if (protoshowcollectionstate == null)
        {
            return;
        } else
        {
            is_in_collection = protoshowcollectionstate.is_in_collection;
            return;
        }
    }
}
