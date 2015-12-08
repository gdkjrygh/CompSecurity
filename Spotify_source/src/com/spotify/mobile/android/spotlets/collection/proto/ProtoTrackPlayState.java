// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoTrackPlayState extends Message
{

    public static final Boolean DEFAULT_IS_PLAYABLE = Boolean.valueOf(false);
    public final Boolean is_playable;

    private ProtoTrackPlayState(Builder builder)
    {
        super(builder);
        is_playable = builder.is_playable;
    }

    ProtoTrackPlayState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ProtoTrackPlayState))
        {
            return false;
        } else
        {
            return a(is_playable, ((ProtoTrackPlayState)obj).is_playable);
        }
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        if (is_playable != null)
        {
            i = is_playable.hashCode();
        } else
        {
            i = 0;
        }
        hashCode = i;
        return i;
    }


    private class Builder extends gxc
    {

        public Boolean is_playable;

        public final ProtoTrackPlayState build()
        {
            return new ProtoTrackPlayState(this, (byte)0);
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

        public Builder()
        {
        }

        public Builder(ProtoTrackPlayState prototrackplaystate)
        {
            super(prototrackplaystate);
            if (prototrackplaystate == null)
            {
                return;
            } else
            {
                is_playable = prototrackplaystate.is_playable;
                return;
            }
        }
    }

}
