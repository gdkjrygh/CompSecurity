// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowMetadata, ProtoShowCollectionState, ProtoShowPlayState

public final class ProtoDecorateShowItem extends Message
{

    public final ProtoShowCollectionState show_collection_state;
    public final ProtoShowMetadata show_metadata;
    public final ProtoShowPlayState show_play_state;

    private ProtoDecorateShowItem(Builder builder)
    {
        super(builder);
        show_metadata = builder.show_metadata;
        show_collection_state = builder.show_collection_state;
        show_play_state = builder.show_play_state;
    }

    ProtoDecorateShowItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoDecorateShowItem))
            {
                return false;
            }
            obj = (ProtoDecorateShowItem)obj;
            if (!a(show_metadata, ((ProtoDecorateShowItem) (obj)).show_metadata) || !a(show_collection_state, ((ProtoDecorateShowItem) (obj)).show_collection_state) || !a(show_play_state, ((ProtoDecorateShowItem) (obj)).show_play_state))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (show_metadata != null)
            {
                i = show_metadata.hashCode();
            } else
            {
                i = 0;
            }
            if (show_collection_state != null)
            {
                k = show_collection_state.hashCode();
            } else
            {
                k = 0;
            }
            if (show_play_state != null)
            {
                l = show_play_state.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
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

        public final Builder show_collection_state(ProtoShowCollectionState protoshowcollectionstate)
        {
            show_collection_state = protoshowcollectionstate;
            return this;
        }

        public final Builder show_metadata(ProtoShowMetadata protoshowmetadata)
        {
            show_metadata = protoshowmetadata;
            return this;
        }

        public final Builder show_play_state(ProtoShowPlayState protoshowplaystate)
        {
            show_play_state = protoshowplaystate;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoDecorateShowItem protodecorateshowitem)
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

}
