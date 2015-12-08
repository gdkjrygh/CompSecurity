// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoAlbumArtistMetadata extends Message
{

    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public final String link;
    public final String name;

    private ProtoAlbumArtistMetadata(Builder builder)
    {
        super(builder);
        link = builder.link;
        name = builder.name;
    }

    ProtoAlbumArtistMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoAlbumArtistMetadata))
            {
                return false;
            }
            obj = (ProtoAlbumArtistMetadata)obj;
            if (!a(link, ((ProtoAlbumArtistMetadata) (obj)).link) || !a(name, ((ProtoAlbumArtistMetadata) (obj)).name))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = hashCode;
        int i = k;
        if (k == 0)
        {
            if (link != null)
            {
                i = link.hashCode();
            } else
            {
                i = 0;
            }
            if (name != null)
            {
                j = name.hashCode();
            }
            i = i * 37 + j;
            hashCode = i;
        }
        return i;
    }

    private class Builder extends gxc
    {

        public String link;
        public String name;

        public final ProtoAlbumArtistMetadata build()
        {
            return new ProtoAlbumArtistMetadata(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
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

        public Builder(ProtoAlbumArtistMetadata protoalbumartistmetadata)
        {
            super(protoalbumartistmetadata);
            if (protoalbumartistmetadata == null)
            {
                return;
            } else
            {
                link = protoalbumartistmetadata.link;
                name = protoalbumartistmetadata.name;
                return;
            }
        }
    }

}
