// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

public final class ProtoEpisodeCollectionState extends Message
{

    public static final Boolean DEFAULT_IS_IN_COLLECTION = Boolean.valueOf(false);
    public static final Boolean DEFAULT_IS_NEW = Boolean.valueOf(false);
    public final Boolean is_in_collection;
    public final Boolean is_new;

    private ProtoEpisodeCollectionState(Builder builder)
    {
        super(builder);
        is_in_collection = builder.is_in_collection;
        is_new = builder.is_new;
    }

    ProtoEpisodeCollectionState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoEpisodeCollectionState))
            {
                return false;
            }
            obj = (ProtoEpisodeCollectionState)obj;
            if (!a(is_in_collection, ((ProtoEpisodeCollectionState) (obj)).is_in_collection) || !a(is_new, ((ProtoEpisodeCollectionState) (obj)).is_new))
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
            if (is_in_collection != null)
            {
                i = is_in_collection.hashCode();
            } else
            {
                i = 0;
            }
            if (is_new != null)
            {
                j = is_new.hashCode();
            }
            i = i * 37 + j;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Boolean is_in_collection;
        public Boolean is_new;

        public final ProtoEpisodeCollectionState build()
        {
            return new ProtoEpisodeCollectionState(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder is_in_collection(Boolean boolean1)
        {
            is_in_collection = boolean1;
            return this;
        }

        public final Builder is_new(Boolean boolean1)
        {
            is_new = boolean1;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoEpisodeCollectionState protoepisodecollectionstate)
        {
            super(protoepisodecollectionstate);
            if (protoepisodecollectionstate == null)
            {
                return;
            } else
            {
                is_in_collection = protoepisodecollectionstate.is_in_collection;
                is_new = protoepisodecollectionstate.is_new;
                return;
            }
        }
    }

}
