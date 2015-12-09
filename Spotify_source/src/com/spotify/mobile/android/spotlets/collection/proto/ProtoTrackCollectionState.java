// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.Message;

public final class ProtoTrackCollectionState extends Message
{

    public static final Boolean DEFAULT_CAN_ADD_TO_COLLECTION = Boolean.valueOf(false);
    public static final Boolean DEFAULT_IS_IN_COLLECTION = Boolean.valueOf(false);
    public final Boolean can_add_to_collection;
    public final Boolean is_in_collection;

    private ProtoTrackCollectionState(Builder builder)
    {
        super(builder);
        is_in_collection = builder.is_in_collection;
        can_add_to_collection = builder.can_add_to_collection;
    }

    ProtoTrackCollectionState(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ProtoTrackCollectionState))
            {
                return false;
            }
            obj = (ProtoTrackCollectionState)obj;
            if (!a(is_in_collection, ((ProtoTrackCollectionState) (obj)).is_in_collection) || !a(can_add_to_collection, ((ProtoTrackCollectionState) (obj)).can_add_to_collection))
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
            if (can_add_to_collection != null)
            {
                j = can_add_to_collection.hashCode();
            }
            i = i * 37 + j;
            hashCode = i;
        }
        return i;
    }


    private class Builder extends gxc
    {

        public Boolean can_add_to_collection;
        public Boolean is_in_collection;

        public final ProtoTrackCollectionState build()
        {
            return new ProtoTrackCollectionState(this, (byte)0);
        }

        public final volatile Message build()
        {
            return build();
        }

        public final Builder can_add_to_collection(Boolean boolean1)
        {
            can_add_to_collection = boolean1;
            return this;
        }

        public final Builder is_in_collection(Boolean boolean1)
        {
            is_in_collection = boolean1;
            return this;
        }

        public Builder()
        {
        }

        public Builder(ProtoTrackCollectionState prototrackcollectionstate)
        {
            super(prototrackcollectionstate);
            if (prototrackcollectionstate == null)
            {
                return;
            } else
            {
                is_in_collection = prototrackcollectionstate.is_in_collection;
                can_add_to_collection = prototrackcollectionstate.can_add_to_collection;
                return;
            }
        }
    }

}
