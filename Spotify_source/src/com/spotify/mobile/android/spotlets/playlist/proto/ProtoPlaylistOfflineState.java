// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.proto;

import com.squareup.wire.Message;

public final class ProtoPlaylistOfflineState extends Message
{

    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    public final String offline;
    public final Integer sync_progress;

    private ProtoPlaylistOfflineState(Builder builder)
    {
        super(builder);
        offline = builder.offline;
        sync_progress = builder.sync_progress;
    }

    ProtoPlaylistOfflineState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoPlaylistOfflineState))
            {
                return false;
            }
            obj = (ProtoPlaylistOfflineState)obj;
            if (!a(offline, ((ProtoPlaylistOfflineState) (obj)).offline) || !a(sync_progress, ((ProtoPlaylistOfflineState) (obj)).sync_progress))
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
            if (offline != null)
            {
                i = offline.hashCode();
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

        public String offline;
        public Integer sync_progress;

        public final ProtoPlaylistOfflineState build()
        {
            return new ProtoPlaylistOfflineState(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder offline(String s)
        {
            offline = s;
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

        public Builder(ProtoPlaylistOfflineState protoplaylistofflinestate)
        {
            super(protoplaylistofflinestate);
            if (protoplaylistofflinestate == null)
            {
                return;
            } else
            {
                offline = protoplaylistofflinestate.offline;
                sync_progress = protoplaylistofflinestate.sync_progress;
                return;
            }
        }
    }

}
