// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

public final class ProtoEpisodePlayState extends Message
{

    public static final Boolean DEFAULT_IS_PLAYABLE = Boolean.valueOf(false);
    public static final Boolean DEFAULT_IS_PLAYED = Boolean.valueOf(false);
    public static final Integer DEFAULT_TIME_LEFT = Integer.valueOf(0);
    public final Boolean is_playable;
    public final Boolean is_played;
    public final Integer time_left;

    private ProtoEpisodePlayState(Builder builder)
    {
        super(builder);
        time_left = builder.time_left;
        is_playable = builder.is_playable;
        is_played = builder.is_played;
    }

    ProtoEpisodePlayState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoEpisodePlayState))
            {
                return false;
            }
            obj = (ProtoEpisodePlayState)obj;
            if (!a(time_left, ((ProtoEpisodePlayState) (obj)).time_left) || !a(is_playable, ((ProtoEpisodePlayState) (obj)).is_playable) || !a(is_played, ((ProtoEpisodePlayState) (obj)).is_played))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            int k;
            if (time_left != null)
            {
                i = time_left.hashCode();
            } else
            {
                i = 0;
            }
            if (is_playable != null)
            {
                k = is_playable.hashCode();
            } else
            {
                k = 0;
            }
            if (is_played != null)
            {
                l = is_played.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Boolean is_playable;
        public Boolean is_played;
        public Integer time_left;

        public final ProtoEpisodePlayState build()
        {
            return new ProtoEpisodePlayState(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder is_playable(Boolean boolean1)
        {
            is_playable = boolean1;
            return this;
        }

        public final Builder is_played(Boolean boolean1)
        {
            is_played = boolean1;
            return this;
        }

        public final Builder time_left(Integer integer)
        {
            time_left = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoEpisodePlayState protoepisodeplaystate)
        {
            super(protoepisodeplaystate);
            if (protoepisodeplaystate == null)
            {
                return;
            } else
            {
                time_left = protoepisodeplaystate.time_left;
                is_playable = protoepisodeplaystate.is_playable;
                is_played = protoepisodeplaystate.is_played;
                return;
            }
        }
    }

}
