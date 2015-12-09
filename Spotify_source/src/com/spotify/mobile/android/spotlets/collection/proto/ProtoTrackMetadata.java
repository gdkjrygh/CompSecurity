// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.proto:
//            ProtoTrackAlbumMetadata

public final class ProtoTrackMetadata extends Message
{

    public static final List DEFAULT_ARTIST = Collections.emptyList();
    public static final Boolean DEFAULT_AVAILABLE = Boolean.valueOf(false);
    public static final Integer DEFAULT_DISC_NUMBER = Integer.valueOf(0);
    public static final Boolean DEFAULT_IS_EXPLICIT = Boolean.valueOf(false);
    public static final Boolean DEFAULT_IS_LOCAL = Boolean.valueOf(false);
    public static final Integer DEFAULT_LENGTH = Integer.valueOf(0);
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_TRACK_NUMBER = Integer.valueOf(0);
    public final ProtoTrackAlbumMetadata album;
    public final List artist;
    public final Boolean available;
    public final Integer disc_number;
    public final Boolean is_explicit;
    public final Boolean is_local;
    public final Integer length;
    public final String link;
    public final String name;
    public final Integer track_number;

    private ProtoTrackMetadata(Builder builder)
    {
        super(builder);
        album = builder.album;
        artist = e(builder.artist);
        link = builder.link;
        name = builder.name;
        length = builder.length;
        available = builder.available;
        disc_number = builder.disc_number;
        track_number = builder.track_number;
        is_explicit = builder.is_explicit;
        is_local = builder.is_local;
    }

    ProtoTrackMetadata(Builder builder, byte byte0)
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
            if (!(obj instanceof ProtoTrackMetadata))
            {
                return false;
            }
            obj = (ProtoTrackMetadata)obj;
            if (!a(album, ((ProtoTrackMetadata) (obj)).album) || !a(artist, ((ProtoTrackMetadata) (obj)).artist) || !a(link, ((ProtoTrackMetadata) (obj)).link) || !a(name, ((ProtoTrackMetadata) (obj)).name) || !a(length, ((ProtoTrackMetadata) (obj)).length) || !a(available, ((ProtoTrackMetadata) (obj)).available) || !a(disc_number, ((ProtoTrackMetadata) (obj)).disc_number) || !a(track_number, ((ProtoTrackMetadata) (obj)).track_number) || !a(is_explicit, ((ProtoTrackMetadata) (obj)).is_explicit) || !a(is_local, ((ProtoTrackMetadata) (obj)).is_local))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k2 = 0;
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
            int j2;
            if (album != null)
            {
                i = album.hashCode();
            } else
            {
                i = 0;
            }
            if (artist != null)
            {
                k = artist.hashCode();
            } else
            {
                k = 1;
            }
            if (link != null)
            {
                l = link.hashCode();
            } else
            {
                l = 0;
            }
            if (name != null)
            {
                i1 = name.hashCode();
            } else
            {
                i1 = 0;
            }
            if (length != null)
            {
                j1 = length.hashCode();
            } else
            {
                j1 = 0;
            }
            if (available != null)
            {
                k1 = available.hashCode();
            } else
            {
                k1 = 0;
            }
            if (disc_number != null)
            {
                l1 = disc_number.hashCode();
            } else
            {
                l1 = 0;
            }
            if (track_number != null)
            {
                i2 = track_number.hashCode();
            } else
            {
                i2 = 0;
            }
            if (is_explicit != null)
            {
                j2 = is_explicit.hashCode();
            } else
            {
                j2 = 0;
            }
            if (is_local != null)
            {
                k2 = is_local.hashCode();
            }
            i = (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + i * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37) * 37 + k2;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public ProtoTrackAlbumMetadata album;
        public List artist;
        public Boolean available;
        public Integer disc_number;
        public Boolean is_explicit;
        public Boolean is_local;
        public Integer length;
        public String link;
        public String name;
        public Integer track_number;

        public final Builder album(ProtoTrackAlbumMetadata prototrackalbummetadata)
        {
            album = prototrackalbummetadata;
            return this;
        }

        public final Builder artist(List list)
        {
            artist = checkForNulls(list);
            return this;
        }

        public final Builder available(Boolean boolean1)
        {
            available = boolean1;
            return this;
        }

        public final ProtoTrackMetadata build()
        {
            return new ProtoTrackMetadata(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder disc_number(Integer integer)
        {
            disc_number = integer;
            return this;
        }

        public final Builder is_explicit(Boolean boolean1)
        {
            is_explicit = boolean1;
            return this;
        }

        public final Builder is_local(Boolean boolean1)
        {
            is_local = boolean1;
            return this;
        }

        public final Builder length(Integer integer)
        {
            length = integer;
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

        public final Builder track_number(Integer integer)
        {
            track_number = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoTrackMetadata prototrackmetadata)
        {
            super(prototrackmetadata);
            if (prototrackmetadata == null)
            {
                return;
            } else
            {
                album = prototrackmetadata.album;
                artist = ProtoTrackMetadata.a(prototrackmetadata.artist);
                link = prototrackmetadata.link;
                name = prototrackmetadata.name;
                length = prototrackmetadata.length;
                available = prototrackmetadata.available;
                disc_number = prototrackmetadata.disc_number;
                track_number = prototrackmetadata.track_number;
                is_explicit = prototrackmetadata.is_explicit;
                is_local = prototrackmetadata.is_local;
                return;
            }
        }
    }

}
