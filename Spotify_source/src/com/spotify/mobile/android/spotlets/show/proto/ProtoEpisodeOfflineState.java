// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

public final class ProtoEpisodeOfflineState extends Message
{

    public static final String DEFAULT_OFFLINE_STATE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    public final String offline_state;
    public final Integer sync_progress;

    private ProtoEpisodeOfflineState(Builder builder)
    {
        super(builder);
        offline_state = builder.offline_state;
        sync_progress = builder.sync_progress;
    }

    ProtoEpisodeOfflineState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoEpisodeOfflineState))
            {
                return false;
            }
            obj = (ProtoEpisodeOfflineState)obj;
            if (!a(offline_state, ((ProtoEpisodeOfflineState) (obj)).offline_state) || !a(sync_progress, ((ProtoEpisodeOfflineState) (obj)).sync_progress))
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
            if (offline_state != null)
            {
                i = offline_state.hashCode();
            } else
            {
                i = 0;
            }
            if (sync_progress != null)
            {
                j = sync_progress.hashCode();
            }
            i = i * 37 + j;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public String offline_state;
        public Integer sync_progress;

        public final ProtoEpisodeOfflineState build()
        {
            return new ProtoEpisodeOfflineState(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder offline_state(String s)
        {
            offline_state = s;
            return this;
        }

        public final Builder sync_progress(Integer integer)
        {
            sync_progress = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoEpisodeOfflineState protoepisodeofflinestate)
        {
            super(protoepisodeofflinestate);
            if (protoepisodeofflinestate == null)
            {
                return;
            } else
            {
                offline_state = protoepisodeofflinestate.offline_state;
                sync_progress = protoepisodeofflinestate.sync_progress;
                return;
            }
        }
    }

}
