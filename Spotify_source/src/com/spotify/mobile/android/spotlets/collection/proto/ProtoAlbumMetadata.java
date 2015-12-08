// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoAlbumArtistMetadata

public final class ProtoAlbumMetadata extends Message
{

    public static final String DEFAULT_COPYRIGHT = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM_DISCS = Integer.valueOf(0);
    public static final Integer DEFAULT_NUM_TRACKS = Integer.valueOf(0);
    public static final Boolean DEFAULT_PLAYABILITY = Boolean.valueOf(false);
    public static final Integer DEFAULT_YEAR = Integer.valueOf(0);
    public final ProtoAlbumArtistMetadata artist;
    public final String copyright;
    public final ProtoImageGroup covers;
    public final String link;
    public final String name;
    public final Integer num_discs;
    public final Integer num_tracks;
    public final Boolean playability;
    public final Integer year;

    private ProtoAlbumMetadata(Builder builder)
    {
        super(builder);
        artist = builder.artist;
        link = builder.link;
        name = builder.name;
        copyright = builder.copyright;
        covers = builder.covers;
        year = builder.year;
        num_discs = builder.num_discs;
        num_tracks = builder.num_tracks;
        playability = builder.playability;
    }

    ProtoAlbumMetadata(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoAlbumMetadata))
            {
                return false;
            }
            obj = (ProtoAlbumMetadata)obj;
            if (!a(artist, ((ProtoAlbumMetadata) (obj)).artist) || !a(link, ((ProtoAlbumMetadata) (obj)).link) || !a(name, ((ProtoAlbumMetadata) (obj)).name) || !a(copyright, ((ProtoAlbumMetadata) (obj)).copyright) || !a(covers, ((ProtoAlbumMetadata) (obj)).covers) || !a(year, ((ProtoAlbumMetadata) (obj)).year) || !a(num_discs, ((ProtoAlbumMetadata) (obj)).num_discs) || !a(num_tracks, ((ProtoAlbumMetadata) (obj)).num_tracks) || !a(playability, ((ProtoAlbumMetadata) (obj)).playability))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j2 = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
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
            if (copyright != null)
            {
                i1 = copyright.hashCode();
            } else
            {
                i1 = 0;
            }
            if (covers != null)
            {
                j1 = covers.hashCode();
            } else
            {
                j1 = 0;
            }
            if (year != null)
            {
                k1 = year.hashCode();
            } else
            {
                k1 = 0;
            }
            if (num_discs != null)
            {
                l1 = num_discs.hashCode();
            } else
            {
                l1 = 0;
            }
            if (num_tracks != null)
            {
                i2 = num_tracks.hashCode();
            } else
            {
                i2 = 0;
            }
            if (playability != null)
            {
                j2 = playability.hashCode();
            }
            i = (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37 + j2;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public ProtoAlbumArtistMetadata artist;
        public String copyright;
        public ProtoImageGroup covers;
        public String link;
        public String name;
        public Integer num_discs;
        public Integer num_tracks;
        public Boolean playability;
        public Integer year;

        public final Builder artist(ProtoAlbumArtistMetadata protoalbumartistmetadata)
        {
            artist = protoalbumartistmetadata;
            return this;
        }

        public final ProtoAlbumMetadata build()
        {
            return new ProtoAlbumMetadata(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder copyright(String s)
        {
            copyright = s;
            return this;
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

        public final Builder num_discs(Integer integer)
        {
            num_discs = integer;
            return this;
        }

        public final Builder num_tracks(Integer integer)
        {
            num_tracks = integer;
            return this;
        }

        public final Builder playability(Boolean boolean1)
        {
            playability = boolean1;
            return this;
        }

        public final Builder year(Integer integer)
        {
            year = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoAlbumMetadata protoalbummetadata)
        {
            super(protoalbummetadata);
            if (protoalbummetadata == null)
            {
                return;
            } else
            {
                artist = protoalbummetadata.artist;
                link = protoalbummetadata.link;
                name = protoalbummetadata.name;
                copyright = protoalbummetadata.copyright;
                covers = protoalbummetadata.covers;
                year = protoalbummetadata.year;
                num_discs = protoalbummetadata.num_discs;
                num_tracks = protoalbummetadata.num_tracks;
                playability = protoalbummetadata.playability;
                return;
            }
        }
    }

}
