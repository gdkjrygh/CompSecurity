// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.frontinginstrument;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class FrontingInstrumentInfoManager
{

    private final KeyValueStore keyValueStore;

    FrontingInstrumentInfoManager(KeyValueStore keyvaluestore)
    {
        keyValueStore = keyvaluestore;
    }

    public final com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo getFrontingInstrumentInfo()
    {
        com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo = null;
        byte abyte0[] = keyValueStore.load("frontinginstrumentinfo");
        if (abyte0 != null)
        {
            try
            {
                frontinginstrumentinfo = (com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo(), abyte0);
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                throw new RuntimeException("Error parsing FrontingInstrumentInfo.");
            }
        }
        return frontinginstrumentinfo;
    }

    public final void saveFrontingInstrumentInfo(com.google.wallet.proto.NanoWalletEntities.FrontingInstrumentInfo frontinginstrumentinfo)
    {
        keyValueStore.store("frontinginstrumentinfo", MessageNano.toByteArray(frontinginstrumentinfo));
    }
}
