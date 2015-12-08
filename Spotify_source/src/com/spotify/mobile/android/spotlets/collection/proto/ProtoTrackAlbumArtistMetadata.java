// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoTrackAlbumArtistMetadata extends Message
{

    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public final String link;
    public final String name;

    private ProtoTrackAlbumArtistMetadata(Builder builder)
    {
        super(builder);
        link = builder.link;
        name = builder.name;
    }

    ProtoTrackAlbumArtistMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoTrackAlbumArtistMetadata))
            {
                return false;
            }
            obj = (ProtoTrackAlbumArtistMetadata)obj;
            if (!a(link, ((ProtoTrackAlbumArtistMetadata) (obj)).link) || !a(name, ((ProtoTrackAlbumArtistMetadata) (obj)).name))
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

        public final ProtoTrackAlbumArtistMetadata build()
        {
            return new ProtoTrackAlbumArtistMetadata(this, (byte)0);
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

        public Builder(ProtoTrackAlbumArtistMetadata prototrackalbumartistmetadata)
        {
            super(prototrackalbumartistmetadata);
            if (prototrackalbumartistmetadata == null)
            {
                return;
            } else
            {
                link = prototrackalbumartistmetadata.link;
                name = prototrackalbumartistmetadata.name;
                return;
            }
        }
    }

}
