// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoEpisodeCollectionState

public final class is_new extends gxc
{

    public Boolean is_in_collection;
    public Boolean is_new;

    public final ProtoEpisodeCollectionState build()
    {
        return new ProtoEpisodeCollectionState(this, (byte)0);
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

    public final is_in_collection is_new(Boolean boolean1)
    {
        is_new = boolean1;
        return this;
    }

    public ()
    {
    }

    public (ProtoEpisodeCollectionState protoepisodecollectionstate)
    {
        super(protoepisodecollectionstate);
        if (protoepisodecollectionstate == null)
        {
            return;
        } else
        {
            is_in_collection = protoepisodecollectionstate.is_in_collection;
            is_new = protoepisodecollectionstate.is_new;
            return;
        }
    }
}
