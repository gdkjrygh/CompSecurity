// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoDecorateShowItem, ProtoShowCollectionState, ProtoShowMetadata, ProtoShowPlayState

public final class y_state extends gxc
{

    public ProtoShowCollectionState show_collection_state;
    public ProtoShowMetadata show_metadata;
    public ProtoShowPlayState show_play_state;

    public final ProtoDecorateShowItem build()
    {
        return new ProtoDecorateShowItem(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build show_collection_state(ProtoShowCollectionState protoshowcollectionstate)
    {
        show_collection_state = protoshowcollectionstate;
        return this;
    }

    public final show_collection_state show_metadata(ProtoShowMetadata protoshowmetadata)
    {
        show_metadata = protoshowmetadata;
        return this;
    }

    public final show_metadata show_play_state(ProtoShowPlayState protoshowplaystate)
    {
        show_play_state = protoshowplaystate;
        return this;
    }

    public ()
    {
    }

    public (ProtoDecorateShowItem protodecorateshowitem)
    {
        super(protodecorateshowitem);
        if (protodecorateshowitem == null)
        {
            return;
        } else
        {
            show_metadata = protodecorateshowitem.show_metadata;
            show_collection_state = protodecorateshowitem.show_collection_state;
            show_play_state = protodecorateshowitem.show_play_state;
            return;
        }
    }
}
