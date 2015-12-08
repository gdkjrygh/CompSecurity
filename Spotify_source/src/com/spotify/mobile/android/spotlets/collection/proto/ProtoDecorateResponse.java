// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;
import java.util.Collections;
import java.util.List;

public final class ProtoDecorateResponse extends Message
{

    public static final List DEFAULT_ALBUM = Collections.emptyList();
    public static final List DEFAULT_ARTIST = Collections.emptyList();
    public static final List DEFAULT_TRACK = Collections.emptyList();
    public final List album;
    public final List artist;
    public final List track;

    private ProtoDecorateResponse(Builder builder)
    {
        super(builder);
        album = e(builder.album);
        artist = e(builder.artist);
        track = e(builder.track);
    }

    ProtoDecorateResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    static List a(List list)
    {
        return d(list);
    }

    static List b(List list)
    {
        return d(list);
    }

    static List c(List list)
    {
        return d(list);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoDecorateResponse))
            {
                return false;
            }
            obj = (ProtoDecorateResponse)obj;
            if (!a(album, ((ProtoDecorateResponse) (obj)).album) || !a(artist, ((ProtoDecorateResponse) (obj)).artist) || !a(track, ((ProtoDecorateResponse) (obj)).track))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 1;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (album != null)
            {
                i = album.hashCode();
            } else
            {
                i = 1;
            }
            if (artist != null)
            {
                k = artist.hashCode();
            } else
            {
                k = 1;
            }
            if (track != null)
            {
                l = track.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public List album;
        public List artist;
        public List track;

        public final Builder album(List list)
        {
            album = checkForNulls(list);
            return this;
        }

        public final Builder artist(List list)
        {
            artist = checkForNulls(list);
            return this;
        }

        public final ProtoDecorateResponse build()
        {
            return new ProtoDecorateResponse(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder track(List list)
        {
            track = checkForNulls(list);
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoDecorateResponse protodecorateresponse)
        {
            super(protodecorateresponse);
            if (protodecorateresponse == null)
            {
                return;
            } else
            {
                album = ProtoDecorateResponse.a(protodecorateresponse.album);
                artist = ProtoDecorateResponse.b(protodecorateresponse.artist);
                track = ProtoDecorateResponse.c(protodecorateresponse.track);
                return;
            }
        }
    }

}
