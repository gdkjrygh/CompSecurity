// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackCollectionState

public final class to_collection extends gxc
{

    public Boolean can_add_to_collection;
    public Boolean is_in_collection;

    public final ProtoTrackCollectionState build()
    {
        return new ProtoTrackCollectionState(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build can_add_to_collection(Boolean boolean1)
    {
        can_add_to_collection = boolean1;
        return this;
    }

    public final can_add_to_collection is_in_collection(Boolean boolean1)
    {
        is_in_collection = boolean1;
        return this;
    }

    public ()
    {
    }

    public (ProtoTrackCollectionState prototrackcollectionstate)
    {
        super(prototrackcollectionstate);
        if (prototrackcollectionstate == null)
        {
            return;
        } else
        {
            is_in_collection = prototrackcollectionstate.is_in_collection;
            can_add_to_collection = prototrackcollectionstate.can_add_to_collection;
            return;
        }
    }
}
