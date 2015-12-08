// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoArtistOfflineState extends Message
{

    public static final String DEFAULT_INFERRED_OFFLINE = "";
    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    public final String inferred_offline;
    public final String offline;
    public final Integer sync_progress;

    private ProtoArtistOfflineState(Builder builder)
    {
        super(builder);
        offline = builder.offline;
        inferred_offline = builder.inferred_offline;
        sync_progress = builder.sync_progress;
    }

    ProtoArtistOfflineState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoArtistOfflineState))
            {
                return false;
            }
            obj = (ProtoArtistOfflineState)obj;
            if (!a(offline, ((ProtoArtistOfflineState) (obj)).offline) || !a(inferred_offline, ((ProtoArtistOfflineState) (obj)).inferred_offline) || !a(sync_progress, ((ProtoArtistOfflineState) (obj)).sync_progress))
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
            if (offline != null)
            {
                i = offline.hashCode();
            } else
            {
                i = 0;
            }
            if (inferred_offline != null)
            {
                k = inferred_offline.hashCode();
            } else
            {
                k = 0;
            }
            if (sync_progress != null)
            {
                l = sync_progress.hashCode();
            }
            i = (k + i * 37) * 37 + l;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public String inferred_offline;
        public String offline;
        public Integer sync_progress;

        public final ProtoArtistOfflineState build()
        {
            return new ProtoArtistOfflineState(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder inferred_offline(String s)
        {
            inferred_offline = s;
            return this;
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

        public Builder(ProtoArtistOfflineState protoartistofflinestate)
        {
            super(protoartistofflinestate);
            if (protoartistofflinestate == null)
            {
                return;
            } else
            {
                offline = protoartistofflinestate.offline;
                inferred_offline = protoartistofflinestate.inferred_offline;
                sync_progress = protoartistofflinestate.sync_progress;
                return;
            }
        }
    }

}
