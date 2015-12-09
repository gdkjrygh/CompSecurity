// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.proto:
//            ProtoPlaylistMetadataItem

public final class ProtoPlaylistMetadataResponse extends Message
{

    public static final Long DEFAULT_DURATION = Long.valueOf(0L);
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.valueOf(false);
    public static final Integer DEFAULT_NUM_FOLLOWERS = Integer.valueOf(0);
    public final Long duration;
    public final Boolean loading_contents;
    public final Integer num_followers;
    public final ProtoPlaylistMetadataItem playlist;

    private ProtoPlaylistMetadataResponse(Builder builder)
    {
        super(builder);
        playlist = builder.playlist;
        duration = builder.duration;
        loading_contents = builder.loading_contents;
        num_followers = builder.num_followers;
    }

    ProtoPlaylistMetadataResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistMetadataResponse))
            {
                return false;
            }
            obj = (ProtoPlaylistMetadataResponse)obj;
            if (!a(playlist, ((ProtoPlaylistMetadataResponse) (obj)).playlist) || !a(duration, ((ProtoPlaylistMetadataResponse) (obj)).duration) || !a(loading_contents, ((ProtoPlaylistMetadataResponse) (obj)).loading_contents) || !a(num_followers, ((ProtoPlaylistMetadataResponse) (obj)).num_followers))
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
            if (playlist != null)
            {
                i = playlist.hashCode();
            } else
            {
                i = 0;
            }
            if (duration != null)
            {
                k = duration.hashCode();
            } else
            {
                k = 0;
            }
            if (loading_contents != null)
            {
                l = loading_contents.hashCode();
            } else
            {
                l = 0;
            }
            if (num_followers != null)
            {
                i1 = num_followers.hashCode();
            }
            i = (l + (k + i * 37) * 37) * 37 + i1;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Long duration;
        public Boolean loading_contents;
        public Integer num_followers;
        public ProtoPlaylistMetadataItem playlist;

        public final ProtoPlaylistMetadataResponse build()
        {
            return new ProtoPlaylistMetadataResponse(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder duration(Long long1)
        {
            duration = long1;
            return this;
        }

        public final Builder loading_contents(Boolean boolean1)
        {
            loading_contents = boolean1;
            return this;
        }

        public final Builder num_followers(Integer integer)
        {
            num_followers = integer;
            return this;
        }

        public final Builder playlist(ProtoPlaylistMetadataItem protoplaylistmetadataitem)
        {
            playlist = protoplaylistmetadataitem;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoPlaylistMetadataResponse protoplaylistmetadataresponse)
        {
            super(protoplaylistmetadataresponse);
            if (protoplaylistmetadataresponse == null)
            {
                return;
            } else
            {
                playlist = protoplaylistmetadataresponse.playlist;
                duration = protoplaylistmetadataresponse.duration;
                loading_contents = protoplaylistmetadataresponse.loading_contents;
                num_followers = protoplaylistmetadataresponse.num_followers;
                return;
            }
        }
    }

}
