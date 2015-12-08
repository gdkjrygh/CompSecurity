// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

public final class ProtoShowPlayState extends Message
{

    public static final String DEFAULT_LATEST_PLAYED_EPISODE_LINK = "";
    public final String latest_played_episode_link;

    private ProtoShowPlayState(Builder builder)
    {
        super(builder);
        latest_played_episode_link = builder.latest_played_episode_link;
    }

    ProtoShowPlayState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ProtoShowPlayState))
        {
            return false;
        } else
        {
            return a(latest_played_episode_link, ((ProtoShowPlayState)obj).latest_played_episode_link);
        }
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        if (latest_played_episode_link != null)
        {
            i = latest_played_episode_link.hashCode();
        } else
        {
            i = 0;
        }
        hashCode = i;
        return i;
    }

    private class Builder extends gxc
    {

        public String latest_played_episode_link;

        public final ProtoShowPlayState build()
        {
            return new ProtoShowPlayState(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder latest_played_episode_link(String s)
        {
            latest_played_episode_link = s;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoShowPlayState protoshowplaystate)
        {
            super(protoshowplaystate);
            if (protoshowplaystate == null)
            {
                return;
            } else
            {
                latest_played_episode_link = protoshowplaystate.latest_played_episode_link;
                return;
            }
        }
    }

}
