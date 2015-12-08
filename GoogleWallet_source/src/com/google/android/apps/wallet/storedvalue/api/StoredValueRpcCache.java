// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue.api;

import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.eventbus.RpcCache;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.storedvalue.api:
//            StoredValueClient

public class StoredValueRpcCache
    implements RpcCache
{

    private final KeyValueStore keyValueStore;
    private final StoredValueClient storedValueClient;

    StoredValueRpcCache(StoredValueClient storedvalueclient, KeyValueStore keyvaluestore)
    {
        storedValueClient = storedvalueclient;
        keyValueStore = keyvaluestore;
    }

    private static com.google.wallet.proto.NanoWalletEntities.StoredValue getDefaultStoredValue()
    {
        com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue = new com.google.wallet.proto.NanoWalletEntities.StoredValue();
        storedvalue.balanceState = Integer.valueOf(0);
        return storedvalue;
    }

    private com.google.wallet.proto.NanoWalletEntities.StoredValue readFromCache()
    {
        com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue = null;
        byte abyte0[] = keyValueStore.load("storedvalue");
        if (abyte0 != null)
        {
            try
            {
                storedvalue = (com.google.wallet.proto.NanoWalletEntities.StoredValue)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.StoredValue(), abyte0);
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                throw new RuntimeException("StoredValue proto did not parse. Database corrupted");
            }
        }
        return storedvalue;
    }

    private com.google.wallet.proto.NanoWalletEntities.StoredValue readFromServer()
        throws Exception
    {
        Object obj = new com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueRequest();
        com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue = readFromCache();
        if (storedvalue != null && storedvalue.id != null)
        {
            obj.knownStoredValueId = storedvalue.id;
        }
        obj = storedValueClient.getStoredValue(((com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueRequest) (obj)));
        if (((com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueResponse) (obj)).callError != null)
        {
            throw new CallErrorException(((com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueResponse) (obj)).callError);
        } else
        {
            return ((com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueResponse) (obj)).storedValue;
        }
    }

    private void writeToCache(com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue)
    {
        KeyValueStore keyvaluestore = keyValueStore;
        if (storedvalue == null)
        {
            storedvalue = getDefaultStoredValue();
        }
        keyvaluestore.store("storedvalue", MessageNano.toByteArray(storedvalue));
    }

    public final volatile Object readFromCache()
    {
        return readFromCache();
    }

    public final volatile Object readFromServer()
        throws Exception
    {
        return readFromServer();
    }

    public final volatile void writeToCache(Object obj)
    {
        writeToCache((com.google.wallet.proto.NanoWalletEntities.StoredValue)obj);
    }
}
