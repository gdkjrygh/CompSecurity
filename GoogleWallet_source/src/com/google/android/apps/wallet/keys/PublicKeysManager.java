// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.keys;

import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.common.base.Preconditions;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class PublicKeysManager
{

    private volatile com.google.wallet.proto.NanoWalletEntities.BillingKeys cachedBillingKeys;
    private volatile com.google.wallet.proto.NanoWalletEntities.TorinoKeys cachedTorinoKeys;
    private final KeyValueStore keyValueStore;

    public PublicKeysManager(KeyValueStore keyvaluestore)
    {
        keyValueStore = keyvaluestore;
    }

    private com.google.wallet.proto.NanoWalletEntities.BillingKeys getBillingKeys()
    {
        com.google.wallet.proto.NanoWalletEntities.BillingKeys billingkeys = cachedBillingKeys;
        if (billingkeys != null)
        {
            return billingkeys;
        }
        byte abyte0[] = keyValueStore.load("billingKeys");
        if (abyte0 != null)
        {
            com.google.wallet.proto.NanoWalletEntities.BillingKeys billingkeys1;
            try
            {
                billingkeys1 = (com.google.wallet.proto.NanoWalletEntities.BillingKeys)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.BillingKeys(), abyte0);
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                throw new RuntimeException("ClientConfiguration proto did not parse.  Database corrupted");
            }
            return billingkeys1;
        } else
        {
            return new com.google.wallet.proto.NanoWalletEntities.BillingKeys();
        }
    }

    private com.google.wallet.proto.NanoWalletEntities.TorinoKeys getTorinoKeys()
    {
        com.google.wallet.proto.NanoWalletEntities.TorinoKeys torinokeys = cachedTorinoKeys;
        if (torinokeys != null)
        {
            return torinokeys;
        }
        byte abyte0[] = keyValueStore.load("torinoKeys");
        if (abyte0 != null)
        {
            com.google.wallet.proto.NanoWalletEntities.TorinoKeys torinokeys1;
            try
            {
                torinokeys1 = (com.google.wallet.proto.NanoWalletEntities.TorinoKeys)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.TorinoKeys(), abyte0);
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                throw new RuntimeException("ClientConfiguration proto did not parse.  Database corrupted");
            }
            return torinokeys1;
        } else
        {
            return new com.google.wallet.proto.NanoWalletEntities.TorinoKeys();
        }
    }

    public final String getBillingDsaPrivateKey()
    {
        return getBillingKeys().signingKey;
    }

    public final String getBillingRsaPublicKey()
    {
        return getBillingKeys().publicKey;
    }

    public final String getTorinoRsaPublicKey()
    {
        return getTorinoKeys().publicKey;
    }

    public final void persistBillingKeys(com.google.wallet.proto.NanoWalletEntities.BillingKeys billingkeys)
    {
        Preconditions.checkNotNull(billingkeys);
        keyValueStore.store("billingKeys", MessageNano.toByteArray(billingkeys));
        cachedBillingKeys = billingkeys;
    }

    public final void persistTorinoKeys(com.google.wallet.proto.NanoWalletEntities.TorinoKeys torinokeys)
    {
        Preconditions.checkNotNull(torinokeys);
        keyValueStore.store("torinoKeys", MessageNano.toByteArray(torinokeys));
        cachedTorinoKeys = torinokeys;
    }
}
