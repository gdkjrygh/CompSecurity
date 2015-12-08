// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.Message;

public final class ProtoArtistMetadata extends Message
{

    public static final Boolean DEFAULT_IS_VARIOUS_ARTISTS = Boolean.valueOf(false);
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public final ProtoImageGroup covers;
    public final Boolean is_various_artists;
    public final String link;
    public final String name;

    private ProtoArtistMetadata(Builder builder)
    {
        super(builder);
        link = builder.link;
        name = builder.name;
        is_various_artists = builder.is_various_artists;
        covers = builder.covers;
    }

    ProtoArtistMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoArtistMetadata))
            {
                return false;
            }
            obj = (ProtoArtistMetadata)obj;
            if (!a(link, ((ProtoArtistMetadata) (obj)).link) || !a(name, ((ProtoArtistMetadata) (obj)).name) || !a(is_various_artists, ((ProtoArtistMetadata) (obj)).is_various_artists) || !a(covers, ((ProtoArtistMetadata) (obj)).covers))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            if (link != null)
            {
                i = link.hashCode();
            } else
            {
                i = 0;
            }
            if (name != null)
            {
                k = name.hashCode();
            } else
            {
                k = 0;
            }
            if (is_various_artists != null)
            {
                l = is_various_artists.hashCode();
            } else
            {
                l = 0;
            }
            if (covers != null)
            {
                i1 = covers.hashCode();
            }
            i = (l + (k + i * 37) * 37) * 37 + i1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public ProtoImageGroup covers;
        public Boolean is_various_artists;
        public String link;
        public String name;

        public final ProtoArtistMetadata build()
        {
            return new ProtoArtistMetadata(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder covers(ProtoImageGroup protoimagegroup)
        {
            covers = protoimagegroup;
            return this;
        }

        public final Builder is_various_artists(Boolean boolean1)
        {
            is_various_artists = boolean1;
            return this;
        }

        public final Builder link(String s)
        {
            link = s;
            return this;
        }

        public final Builder name(String s)
        {
            name = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoArtistMetadata protoartistmetadata)
        {
            super(protoartistmetadata);
            if (protoartistmetadata == null)
            {
                return;
            } else
            {
                link = protoartistmetadata.link;
                name = protoartistmetadata.name;
                is_various_artists = protoartistmetadata.is_various_artists;
                covers = protoartistmetadata.covers;
                return;
            }
        }
    }

}
