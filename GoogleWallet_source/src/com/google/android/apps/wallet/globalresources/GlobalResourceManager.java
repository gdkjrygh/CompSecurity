// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import android.os.SystemClock;
import com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager;
import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.keys.PublicKeysManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.user.UserInfoManager;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            SyncGenerationNumberManager, ExperimentsUpdater

public class GlobalResourceManager
{

    private static final String TAG = com/google/android/apps/wallet/globalresources/GlobalResourceManager.getSimpleName();
    private final ClientConfigurationManager clientConfigurationManager;
    private final ExperimentsUpdater experimentsUpdater;
    private final SyncGenerationNumberManager generationNumberManager;
    private final KeyValueStore keyValueStore;
    private final Object lock = new Object();
    private final PublicKeysManager publicKeysManager;
    private final UserInfoManager userInfoManager;

    public GlobalResourceManager(PublicKeysManager publickeysmanager, SyncGenerationNumberManager syncgenerationnumbermanager, ClientConfigurationManager clientconfigurationmanager, UserInfoManager userinfomanager, ExperimentsUpdater experimentsupdater, KeyValueStore keyvaluestore)
    {
        publicKeysManager = publickeysmanager;
        generationNumberManager = syncgenerationnumbermanager;
        clientConfigurationManager = clientconfigurationmanager;
        userInfoManager = userinfomanager;
        experimentsUpdater = experimentsupdater;
        keyValueStore = keyvaluestore;
    }

    private com.google.wallet.proto.NanoWalletEntities.GlobalResources getCachedData()
    {
        byte abyte0[] = keyValueStore.load("globalResources");
        if (abyte0 == null)
        {
            return null;
        }
        com.google.wallet.proto.NanoWalletEntities.GlobalResources globalresources;
        try
        {
            globalresources = (com.google.wallet.proto.NanoWalletEntities.GlobalResources)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.GlobalResources(), abyte0);
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            throw new RuntimeException("Could not parse locally cached GlobalResources proto.");
        }
        return globalresources;
    }

    private void persistToCache(com.google.wallet.proto.NanoWalletEntities.GlobalResources globalresources)
    {
        keyValueStore.store("globalResources", MessageNano.toByteArray(globalresources));
    }

    private void updateMetadata(com.google.wallet.proto.NanoWalletEntities.GlobalResources globalresources, long l)
    {
        long l1 = SystemClock.elapsedRealtime();
        persistToCache(globalresources);
        generationNumberManager.updateSyncGenerationNumberForKey(l, "GLOBAL_RESOURCES");
        globalresources = TAG;
        long l2 = SystemClock.elapsedRealtime();
        WLog.d(globalresources, (new StringBuilder(62)).append("Finished updating global resources in ").append(l2 - l1).append(" ms.").toString());
        WLog.d(TAG, (new StringBuilder(56)).append("Updated GlobalResources fingerprint:").append(l).toString());
    }

    private void updateResources(com.google.wallet.proto.NanoWalletEntities.GlobalResources globalresources)
    {
        boolean flag1 = true;
        boolean flag;
        if (globalresources.billingKeys != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "No billing keys in globalResources.");
        publicKeysManager.persistBillingKeys(globalresources.billingKeys);
        if (globalresources.torinoKeys != null)
        {
            com.google.wallet.proto.NanoWalletEntities.TorinoKeys torinokeys = globalresources.torinoKeys;
            if (torinokeys.publicKey != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            publicKeysManager.persistTorinoKeys(torinokeys);
        }
        if (globalresources.clientConfiguration != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "No client configuration in globalResources.");
        clientConfigurationManager.persistServerProvidedClientConfiguration(globalresources.clientConfiguration);
        experimentsUpdater.updateExperimentsFromInfo(globalresources.clientConfiguration.analyticsInfo);
        if (globalresources.userInfo != null)
        {
            globalresources = globalresources.userInfo;
            userInfoManager.persistUserInfo(globalresources);
        } else
        {
            userInfoManager.deleteUserInfo();
        }
        if (Strings.isNullOrEmpty(publicKeysManager.getBillingRsaPublicKey()))
        {
            throw new RuntimeException("No RSA public key present after update to GlobalResources");
        } else
        {
            return;
        }
    }

    public final com.google.wallet.proto.NanoWalletEntities.GlobalResources blockingGet()
    {
        ThreadPreconditions.checkOnBackgroundThread();
        return getCachedData();
    }

    public final long getCurrentFingerprint()
    {
        return generationNumberManager.getSyncGenerationNumberForKey("GLOBAL_RESOURCES");
    }

    public final boolean hasCache()
    {
        return getCachedData() != null;
    }

    public final void update(com.google.wallet.proto.NanoWalletEntities.GlobalResources globalresources, long l)
    {
        Preconditions.checkNotNull(globalresources);
        WLog.v(TAG, (new StringBuilder(62)).append("Updating GlobalResources with fingerprint:").append(l).toString());
        synchronized (lock)
        {
            updateResources(globalresources);
            updateMetadata(globalresources, l);
        }
        return;
        globalresources;
        obj;
        JVM INSTR monitorexit ;
        throw globalresources;
    }

    public final void updateFromCache()
    {
        synchronized (lock)
        {
            if (hasCache())
            {
                updateResources(getCachedData());
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
