// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import gxc;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowsRequestItem, ProtoShowCollectionState, ProtoShowMetadata, ProtoShowPlayState

public final class ss_index extends gxc
{

    public String header;
    public Integer headerless_index;
    public ProtoShowCollectionState show_collection_state;
    public ProtoShowMetadata show_metadata;
    public ProtoShowPlayState show_play_state;

    public final ProtoShowsRequestItem build()
    {
        return new ProtoShowsRequestItem(this, (byte)0);
    }

    public final volatile Message build()
    {
        return build();
    }

    public final build header(String s)
    {
        header = s;
        return this;
    }

    public final header headerless_index(Integer integer)
    {
        headerless_index = integer;
        return this;
    }

    public final headerless_index show_collection_state(ProtoShowCollectionState protoshowcollectionstate)
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

    public (ProtoShowsRequestItem protoshowsrequestitem)
    {
        super(protoshowsrequestitem);
        if (protoshowsrequestitem == null)
        {
            return;
        } else
        {
            header = protoshowsrequestitem.header;
            show_metadata = protoshowsrequestitem.show_metadata;
            show_collection_state = protoshowsrequestitem.show_collection_state;
            show_play_state = protoshowsrequestitem.show_play_state;
            headerless_index = protoshowsrequestitem.headerless_index;
            return;
        }
    }
}
