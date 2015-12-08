// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackAlbumArtistMetadata

public final class ProtoTrackAlbumMetadata extends Message
{

    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public final ProtoTrackAlbumArtistMetadata artist;
    public final ProtoImageGroup covers;
    public final String link;
    public final String name;

    private ProtoTrackAlbumMetadata(Builder builder)
    {
        super(builder);
        artist = builder.artist;
        link = builder.link;
        name = builder.name;
        covers = builder.covers;
    }

    ProtoTrackAlbumMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoTrackAlbumMetadata))
            {
                return false;
            }
            obj = (ProtoTrackAlbumMetadata)obj;
            if (!a(artist, ((ProtoTrackAlbumMetadata) (obj)).artist) || !a(link, ((ProtoTrackAlbumMetadata) (obj)).link) || !a(name, ((ProtoTrackAlbumMetadata) (obj)).name) || !a(covers, ((ProtoTrackAlbumMetadata) (obj)).covers))
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
            if (artist != null)
            {
                i = artist.hashCode();
            } else
            {
                i = 0;
            }
            if (link != null)
            {
                k = link.hashCode();
            } else
            {
                k = 0;
            }
            if (name != null)
            {
                l = name.hashCode();
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

        public ProtoTrackAlbumArtistMetadata artist;
        public ProtoImageGroup covers;
        public String link;
        public String name;

        public final Builder artist(ProtoTrackAlbumArtistMetadata prototrackalbumartistmetadata)
        {
            artist = prototrackalbumartistmetadata;
            return this;
        }

        public final ProtoTrackAlbumMetadata build()
        {
            return new ProtoTrackAlbumMetadata(this, (byte)0);
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

        public Builder(ProtoTrackAlbumMetadata prototrackalbummetadata)
        {
            super(prototrackalbummetadata);
            if (prototrackalbummetadata == null)
            {
                return;
            } else
            {
                artist = prototrackalbummetadata.artist;
                link = prototrackalbummetadata.link;
                name = prototrackalbummetadata.name;
                covers = prototrackalbummetadata.covers;
                return;
            }
        }
    }

}
