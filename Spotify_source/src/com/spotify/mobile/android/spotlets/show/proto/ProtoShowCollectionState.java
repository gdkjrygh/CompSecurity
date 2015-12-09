// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.Message;

public final class ProtoShowCollectionState extends Message
{

    public static final Boolean DEFAULT_IS_IN_COLLECTION = Boolean.valueOf(false);
    public final Boolean is_in_collection;

    private ProtoShowCollectionState(Builder builder)
    {
        super(builder);
        is_in_collection = builder.is_in_collection;
    }

    ProtoShowCollectionState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ProtoShowCollectionState))
        {
            return false;
        } else
        {
            return a(is_in_collection, ((ProtoShowCollectionState)obj).is_in_collection);
        }
    }

    public final int hashCode()
    {
        int i = hashCode;
        if (i != 0)
        {
            return i;
        }
        if (is_in_collection != null)
        {
            i = is_in_collection.hashCode();
        } else
        {
            i = 0;
        }
        hashCode = i;
        return i;
    }


    private class Builder extends gxc
    {

        public Boolean is_in_collection;

        public final ProtoShowCollectionState build()
        {
            return new ProtoShowCollectionState(this, (byte)0);
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

        public Builder()
        {
        }

        public Builder(ProtoShowCollectionState protoshowcollectionstate)
        {
            super(protoshowcollectionstate);
            if (protoshowcollectionstate == null)
            {
                return;
            } else
            {
                is_in_collection = protoshowcollectionstate.is_in_collection;
                return;
            }
        }
    }

}
