// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

public final class ProtoShowsResponse extends Message
{

    public static final List DEFAULT_ITEM = Collections.emptyList();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.valueOf(false);
    public static final Integer DEFAULT_NUM_OFFLINED_EPISODES = Integer.valueOf(0);
    public static final Integer DEFAULT_UNFILTERED_LENGTH = Integer.valueOf(0);
    public static final Integer DEFAULT_UNRANGED_LENGTH = Integer.valueOf(0);
    public final List item;
    public final Boolean loading_contents;
    public final Integer num_offlined_episodes;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    private ProtoShowsResponse(Builder builder)
    {
        super(builder);
        item = e(builder.item);
        num_offlined_episodes = builder.num_offlined_episodes;
        unfiltered_length = builder.unfiltered_length;
        unranged_length = builder.unranged_length;
        loading_contents = builder.loading_contents;
    }

    ProtoShowsResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    static List a(List list)
    {
        return d(list);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoShowsResponse))
            {
                return false;
            }
            obj = (ProtoShowsResponse)obj;
            if (!a(item, ((ProtoShowsResponse) (obj)).item) || !a(num_offlined_episodes, ((ProtoShowsResponse) (obj)).num_offlined_episodes) || !a(unfiltered_length, ((ProtoShowsResponse) (obj)).unfiltered_length) || !a(unranged_length, ((ProtoShowsResponse) (obj)).unranged_length) || !a(loading_contents, ((ProtoShowsResponse) (obj)).loading_contents))
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
            if (item != null)
            {
                i = item.hashCode();
            } else
            {
                i = 1;
            }
            if (num_offlined_episodes != null)
            {
                k = num_offlined_episodes.hashCode();
            } else
            {
                k = 0;
            }
            if (unfiltered_length != null)
            {
                l = unfiltered_length.hashCode();
            } else
            {
                l = 0;
            }
            if (unranged_length != null)
            {
                i1 = unranged_length.hashCode();
            } else
            {
                i1 = 0;
            }
            if (loading_contents != null)
            {
                j1 = loading_contents.hashCode();
            }
            i = (i1 + (l + (k + i * 37) * 37) * 37) * 37 + j1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public List item;
        public Boolean loading_contents;
        public Integer num_offlined_episodes;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final ProtoShowsResponse build()
        {
            return new ProtoShowsResponse(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder item(List list)
        {
            item = checkForNulls(list);
            return this;
        }

        public final Builder loading_contents(Boolean boolean1)
        {
            loading_contents = boolean1;
            return this;
        }

        public final Builder num_offlined_episodes(Integer integer)
        {
            num_offlined_episodes = integer;
            return this;
        }

        public final Builder unfiltered_length(Integer integer)
        {
            unfiltered_length = integer;
            return this;
        }

        public final Builder unranged_length(Integer integer)
        {
            unranged_length = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoShowsResponse protoshowsresponse)
        {
            super(protoshowsresponse);
            if (protoshowsresponse == null)
            {
                return;
            } else
            {
                item = ProtoShowsResponse.a(protoshowsresponse.item);
                num_offlined_episodes = protoshowsresponse.num_offlined_episodes;
                unfiltered_length = protoshowsresponse.unfiltered_length;
                unranged_length = protoshowsresponse.unranged_length;
                loading_contents = protoshowsresponse.loading_contents;
                return;
            }
        }
    }

}
