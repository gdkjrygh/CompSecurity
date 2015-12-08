// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

public final class ProtoOnlineData extends Message
{

    public static final Integer DEFAULT_NUM_FOLLOWERS = Integer.valueOf(0);
    public final Integer num_followers;

    private ProtoOnlineData(Builder builder)
    {
        super(builder);
        num_followers = builder.num_followers;
    }

    ProtoOnlineData(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ProtoOnlineData))
        {
            return false;
        } else
        {
            return a(num_followers, ((ProtoOnlineData)obj).num_followers);
        }
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        if (num_followers != null)
        {
            i = num_followers.hashCode();
        } else
        {
            i = 0;
        }
        hashCode = i;
        return i;
    }


    private class Builder extends gxc
    {

        public Integer num_followers;

        public final ProtoOnlineData build()
        {
            return new ProtoOnlineData(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder num_followers(Integer integer)
        {
            num_followers = integer;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoOnlineData protoonlinedata)
        {
            super(protoonlinedata);
            if (protoonlinedata == null)
            {
                return;
            } else
            {
                num_followers = protoonlinedata.num_followers;
                return;
            }
        }
    }

}
