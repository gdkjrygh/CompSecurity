// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoAlbumOfflineState extends Message
{

    public static final String DEFAULT_INFERRED_OFFLINE = "";
    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS = Integer.valueOf(0);
    public final String inferred_offline;
    public final String offline;
    public final Integer sync_progress;

    private ProtoAlbumOfflineState(Builder builder)
    {
        super(builder);
        offline = builder.offline;
        inferred_offline = builder.inferred_offline;
        sync_progress = builder.sync_progress;
    }

    ProtoAlbumOfflineState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoAlbumOfflineState))
            {
                return false;
            }
            obj = (ProtoAlbumOfflineState)obj;
            if (!a(offline, ((ProtoAlbumOfflineState) (obj)).offline) || !a(inferred_offline, ((ProtoAlbumOfflineState) (obj)).inferred_offline) || !a(sync_progress, ((ProtoAlbumOfflineState) (obj)).sync_progress))
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

        public final ProtoAlbumOfflineState build()
        {
            return new ProtoAlbumOfflineState(this, (byte)0);
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

        public Builder(ProtoAlbumOfflineState protoalbumofflinestate)
        {
            super(protoalbumofflinestate);
            if (protoalbumofflinestate == null)
            {
                return;
            } else
            {
                offline = protoalbumofflinestate.offline;
                inferred_offline = protoalbumofflinestate.inferred_offline;
                sync_progress = protoalbumofflinestate.sync_progress;
                return;
            }
        }
    }

}
