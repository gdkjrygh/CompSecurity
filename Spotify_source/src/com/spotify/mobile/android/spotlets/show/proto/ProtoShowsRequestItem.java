// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.show.proto:
//            ProtoShowMetadata, ProtoShowCollectionState, ProtoShowPlayState

public final class ProtoShowsRequestItem extends Message
{

    public static final String DEFAULT_HEADER = "";
    public static final Integer DEFAULT_HEADERLESS_INDEX = Integer.valueOf(0);
    public final String header;
    public final Integer headerless_index;
    public final ProtoShowCollectionState show_collection_state;
    public final ProtoShowMetadata show_metadata;
    public final ProtoShowPlayState show_play_state;

    private ProtoShowsRequestItem(Builder builder)
    {
        super(builder);
        header = builder.header;
        show_metadata = builder.show_metadata;
        show_collection_state = builder.show_collection_state;
        show_play_state = builder.show_play_state;
        headerless_index = builder.headerless_index;
    }

    ProtoShowsRequestItem(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoShowsRequestItem))
            {
                return false;
            }
            obj = (ProtoShowsRequestItem)obj;
            if (!a(header, ((ProtoShowsRequestItem) (obj)).header) || !a(show_metadata, ((ProtoShowsRequestItem) (obj)).show_metadata) || !a(show_collection_state, ((ProtoShowsRequestItem) (obj)).show_collection_state) || !a(show_play_state, ((ProtoShowsRequestItem) (obj)).show_play_state) || !a(headerless_index, ((ProtoShowsRequestItem) (obj)).headerless_index))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            if (header != null)
            {
                i = header.hashCode();
            } else
            {
                i = 0;
            }
            if (show_metadata != null)
            {
                k = show_metadata.hashCode();
            } else
            {
                k = 0;
            }
            if (show_collection_state != null)
            {
                l = show_collection_state.hashCode();
            } else
            {
                l = 0;
            }
            if (show_play_state != null)
            {
                i1 = show_play_state.hashCode();
            } else
            {
                i1 = 0;
            }
            if (headerless_index != null)
            {
                j1 = headerless_index.hashCode();
            }
            i = (i1 + (l + (k + i * 37) * 37) * 37) * 37 + j1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
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

        public final Builder header(String s)
        {
            header = s;
            return this;
        }

        public final Builder headerless_index(Integer integer)
        {
            headerless_index = integer;
            return this;
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

        public Builder(ProtoShowsRequestItem protoshowsrequestitem)
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

}
