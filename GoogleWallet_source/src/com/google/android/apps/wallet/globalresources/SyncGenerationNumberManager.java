// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class SyncGenerationNumberManager
{

    private final KeyValueStore keyValueStore;

    public SyncGenerationNumberManager(KeyValueStore keyvaluestore)
    {
        keyValueStore = keyvaluestore;
    }

    private static com.google.wallet.proto.NanoWalletClient.SyncTimestampInfo getSyncGenerationNumber(long l)
    {
        com.google.wallet.proto.NanoWalletClient.SyncTimestampInfo synctimestampinfo = new com.google.wallet.proto.NanoWalletClient.SyncTimestampInfo();
        synctimestampinfo.lastSyncTimestampMicros = Long.valueOf(l);
        return synctimestampinfo;
    }

    public final long getSyncGenerationNumberForKey(String s)
    {
        byte abyte0[];
        abyte0 = keyValueStore.load(s);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        long l = Protos.valueWithDefault(((com.google.wallet.proto.NanoWalletClient.SyncTimestampInfo)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletClient.SyncTimestampInfo(), abyte0)).lastSyncTimestampMicros, -1L);
        return l;
        InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception;
        invalidprotocolbuffernanoexception;
        keyValueStore.store(s, MessageNano.toByteArray(getSyncGenerationNumber(-1L)));
        return -1L;
    }

    public final void updateSyncGenerationNumberForKey(long l, String s)
    {
        keyValueStore.store(s, MessageNano.toByteArray(getSyncGenerationNumber(l)));
    }
}
