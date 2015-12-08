// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

public final class ProtoPlaylistRowsResponse extends Message
{

    public static final List DEFAULT_ITEM = Collections.emptyList();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.valueOf(false);
    public final List item;
    public final Boolean loading_contents;

    private ProtoPlaylistRowsResponse(Builder builder)
    {
        super(builder);
        item = e(builder.item);
        loading_contents = builder.loading_contents;
    }

    ProtoPlaylistRowsResponse(Builder builder, byte byte0)
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
            if (!(obj instanceof ProtoPlaylistRowsResponse))
            {
                return false;
            }
            obj = (ProtoPlaylistRowsResponse)obj;
            if (!a(item, ((ProtoPlaylistRowsResponse) (obj)).item) || !a(loading_contents, ((ProtoPlaylistRowsResponse) (obj)).loading_contents))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (item != null)
            {
                i = item.hashCode();
            } else
            {
                i = 1;
            }
            if (loading_contents != null)
            {
                k = loading_contents.hashCode();
            } else
            {
                k = 0;
            }
            i = k + i * 37;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public List item;
        public Boolean loading_contents;

        public final ProtoPlaylistRowsResponse build()
        {
            return new ProtoPlaylistRowsResponse(this, (byte)0);
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

        public Builder()
        {
        }

        public Builder(ProtoPlaylistRowsResponse protoplaylistrowsresponse)
        {
            super(protoplaylistrowsresponse);
            if (protoplaylistrowsresponse == null)
            {
                return;
            } else
            {
                item = ProtoPlaylistRowsResponse.a(protoplaylistrowsresponse.item);
                loading_contents = protoplaylistrowsresponse.loading_contents;
                return;
            }
        }
    }

}
