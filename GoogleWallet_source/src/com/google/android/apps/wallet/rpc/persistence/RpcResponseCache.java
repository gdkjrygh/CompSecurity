// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpc.persistence;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public abstract class RpcResponseCache
{

    private final String key = getClass().getName();
    private final KeyValueStore keyValueStore;

    public RpcResponseCache(KeyValueStore keyvaluestore)
    {
        keyValueStore = keyvaluestore;
    }

    public final MessageNano get(MessageNano messagenano)
    {
        MessageNano messagenano1 = null;
        byte abyte0[] = keyValueStore.load(key);
        if (abyte0 != null)
        {
            try
            {
                messagenano1 = MessageNano.mergeFrom(messagenano, abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (MessageNano messagenano)
            {
                throw new RuntimeException("Proto did not parse. Database corrupted");
            }
        }
        return messagenano1;
    }

    public final void put(MessageNano messagenano)
    {
        keyValueStore.store(key, MessageNano.toByteArray(messagenano));
    }
}
