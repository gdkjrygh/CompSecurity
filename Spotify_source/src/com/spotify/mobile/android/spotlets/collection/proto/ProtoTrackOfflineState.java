// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoTrackOfflineState extends Message
{

    public static final String DEFAULT_OFFLINE = "";
    public final String offline;

    private ProtoTrackOfflineState(Builder builder)
    {
        super(builder);
        offline = builder.offline;
    }

    ProtoTrackOfflineState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ProtoTrackOfflineState))
        {
            return false;
        } else
        {
            return a(offline, ((ProtoTrackOfflineState)obj).offline);
        }
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        if (offline != null)
        {
            i = offline.hashCode();
        } else
        {
            i = 0;
        }
        hashCode = i;
        return i;
    }

    private class Builder extends gxc
    {

        public String offline;

        public final ProtoTrackOfflineState build()
        {
            return new ProtoTrackOfflineState(this, (byte)0);
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

        public Builder()
        {
        }

        public Builder(ProtoTrackOfflineState prototrackofflinestate)
        {
            super(prototrackofflinestate);
            if (prototrackofflinestate == null)
            {
                return;
            } else
            {
                offline = prototrackofflinestate.offline;
                return;
            }
        }
    }

}
