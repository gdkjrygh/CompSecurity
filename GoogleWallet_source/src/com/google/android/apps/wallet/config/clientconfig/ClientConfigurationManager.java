// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.clientconfig;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import java.util.Set;

public class ClientConfigurationManager
{
    public static interface ClientConfigurationFeatureListener
    {

        public abstract void featuresPossiblyChanged(Set set, Set set1);
    }


    private static final String TAG = com/google/android/apps/wallet/config/clientconfig/ClientConfigurationManager.getSimpleName();
    private boolean cacheClean;
    private volatile long clientConfigLoadTime;
    private Set enabledI18nFeatures;
    private Map featureFlagValues;
    private final ClientConfigurationFeatureListener featureListener;
    private final KeyValueStore keyValueStore;
    private Map overriddenAppControl;
    private com.google.wallet.proto.NanoWalletEntities.ClientConfiguration overriddenClientConfig;
    private Set overriddenI18nFeatures;
    private Map serverAppControlValues;
    private com.google.wallet.proto.NanoWalletEntities.ClientConfiguration serverClientConfiguration;
    private final SharedPreferences sharedPreferences;

    public ClientConfigurationManager(KeyValueStore keyvaluestore, SharedPreferences sharedpreferences, ClientConfigurationFeatureListener clientconfigurationfeaturelistener)
    {
        cacheClean = false;
        serverAppControlValues = Maps.newHashMap();
        overriddenAppControl = Maps.newHashMap();
        featureFlagValues = Maps.newHashMap();
        enabledI18nFeatures = Sets.newHashSet();
        overriddenI18nFeatures = null;
        sharedPreferences = sharedpreferences;
        keyValueStore = keyvaluestore;
        featureListener = clientconfigurationfeaturelistener;
    }

    private void fireFeatureListener(Set set, Set set1, Set set2, Set set3)
    {
        if (set1 == null)
        {
            if (set3 == null)
            {
                featureListener.featuresPossiblyChanged(set, set2);
                return;
            } else
            {
                featureListener.featuresPossiblyChanged(set, Sets.symmetricDifference(set2, set3));
                return;
            }
        }
        if (set3 == null)
        {
            featureListener.featuresPossiblyChanged(Sets.symmetricDifference(set, set1), set2);
            return;
        } else
        {
            featureListener.featuresPossiblyChanged(Sets.symmetricDifference(set, set1), Sets.symmetricDifference(set2, set3));
            return;
        }
    }

    private static Map getAppControlMap(com.google.wallet.proto.NanoWalletEntities.ClientConfiguration clientconfiguration)
    {
        java.util.HashMap hashmap = Maps.newHashMap();
        if (clientconfiguration != null && clientconfiguration.appControlEntries != null)
        {
            clientconfiguration = clientconfiguration.appControlEntries;
            int j = clientconfiguration.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = clientconfiguration[i];
                hashmap.put(((com.google.wallet.proto.NanoWalletEntities.ClientConfiguration.AppControlEntry) (obj)).key, ((com.google.wallet.proto.NanoWalletEntities.ClientConfiguration.AppControlEntry) (obj)).value);
            }

        }
        return hashmap;
    }

    private com.google.wallet.proto.NanoWalletEntities.ClientConfiguration getClientConfig(String s)
    {
        s = keyValueStore.load(s);
        if (s == null)
        {
            return null;
        }
        try
        {
            s = (com.google.wallet.proto.NanoWalletEntities.ClientConfiguration)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.ClientConfiguration(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("ClientConfiguration proto did not parse. Database corrupted");
        }
        return s;
    }

    private com.google.wallet.proto.NanoWalletEntities.ClientConfiguration getClientOverriddenConfig()
    {
        return getClientConfig("overiddenClientConfiguration");
    }

    private static Set getEnabledFeatureSet(com.google.wallet.proto.NanoWalletEntities.ClientConfiguration clientconfiguration)
    {
        java.util.HashSet hashset = Sets.newHashSet();
        if (clientconfiguration != null && clientconfiguration.features != null)
        {
            clientconfiguration = clientconfiguration.features.features;
            int j = clientconfiguration.length;
            for (int i = 0; i < j; i++)
            {
                hashset.add(((com.google.wallet.proto.NanoWalletEntities.Feature) (clientconfiguration[i])).code);
            }

        }
        return hashset;
    }

    private static Map getFeatureFlagMap(com.google.wallet.proto.NanoWalletEntities.ClientConfiguration clientconfiguration)
    {
        java.util.HashMap hashmap = Maps.newHashMap();
        if (clientconfiguration != null && clientconfiguration.featureFlags != null)
        {
            clientconfiguration = clientconfiguration.featureFlags;
            int j = clientconfiguration.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = clientconfiguration[i];
                hashmap.put(((com.google.wallet.proto.NanoWalletEntities.ClientConfiguration.FeatureFlag) (obj)).flagName, ((com.google.wallet.proto.NanoWalletEntities.ClientConfiguration.FeatureFlag) (obj)).flagValue);
            }

        }
        return hashmap;
    }

    private com.google.wallet.proto.NanoWalletEntities.ClientConfiguration getServerProvidedConfig()
    {
        return getClientConfig("clientConfiguration");
    }

    private void loadConfigDataToMemory()
    {
        this;
        JVM INSTR monitorenter ;
        serverClientConfiguration = getServerProvidedConfig();
        serverAppControlValues = getAppControlMap(serverClientConfiguration);
        featureFlagValues = getFeatureFlagMap(serverClientConfiguration);
        enabledI18nFeatures = getEnabledFeatureSet(serverClientConfiguration);
        overriddenClientConfig = getClientOverriddenConfig();
        overriddenAppControl = getAppControlMap(overriddenClientConfig);
        if (overriddenClientConfig != null)
        {
            overriddenI18nFeatures = getEnabledFeatureSet(overriddenClientConfig);
        }
        clientConfigLoadTime = System.currentTimeMillis();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void persistClientConfiguration(String s, com.google.wallet.proto.NanoWalletEntities.ClientConfiguration clientconfiguration)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        Preconditions.checkNotNull(clientconfiguration);
        flag = isClientConfigurationInitialized();
        if (cacheClean || !flag)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        loadConfigDataToMemory();
        WLog.dfmt(TAG, "enabled features before persist: %s", new Object[] {
            enabledI18nFeatures
        });
        WLog.dfmt(TAG, "overridden features before persist: %s", new Object[] {
            overriddenI18nFeatures
        });
        keyValueStore.store(s, MessageNano.toByteArray(clientconfiguration));
        s = enabledI18nFeatures;
        clientconfiguration = overriddenI18nFeatures;
        loadConfigDataToMemory();
        WLog.dfmt(TAG, "enabled features after persist: %s", new Object[] {
            enabledI18nFeatures
        });
        WLog.dfmt(TAG, "overridden features after persist: %s", new Object[] {
            overriddenI18nFeatures
        });
        cacheClean = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        fireFeatureListener(s, clientconfiguration, enabledI18nFeatures, overriddenI18nFeatures);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void warmCache()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = cacheClean;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!isClientConfigurationInitialized())
        {
            throw new IllegalStateException("Cannot be called before setup is completed.");
        }
        break MISSING_BLOCK_LABEL_37;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        loadConfigDataToMemory();
        cacheClean = true;
          goto _L1
    }

    public final String getAppControlValue(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (isClientConfigurationInitialized()) goto _L2; else goto _L1
_L1:
        WLog.dfmt(TAG, "Evaluated appcontrol flag %s before pre-setup has run.", new Object[] {
            s
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        warmCache();
        if (overriddenAppControl.containsKey(s))
        {
            s1 = (String)overriddenAppControl.get(s);
            continue; /* Loop/switch isn't completed */
        }
        if (serverAppControlValues.containsKey(s))
        {
            s1 = (String)serverAppControlValues.get(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public final boolean isClientConfigurationInitialized()
    {
        this;
        JVM INSTR monitorenter ;
        if (!SharedPreference.CLIENT_CONFIGURATION_INTITIALIZED.isPresent(sharedPreferences)) goto _L2; else goto _L1
_L1:
        boolean flag = ((Boolean)SharedPreference.CLIENT_CONFIGURATION_INTITIALIZED.get(sharedPreferences)).booleanValue();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Exception exception;
        if (getServerProvidedConfig() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SharedPreference.CLIENT_CONFIGURATION_INTITIALIZED.put(sharedPreferences, Boolean.valueOf(flag));
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public final boolean isFeatureEnabled(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        warmCache();
        if (overriddenI18nFeatures == null || !overriddenI18nFeatures.contains(integer)) goto _L2; else goto _L1
_L1:
        boolean flag = enabledI18nFeatures.contains(integer);
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = enabledI18nFeatures.contains(integer);
        if (true) goto _L4; else goto _L3
_L3:
        integer;
        throw integer;
    }

    public final void persistServerProvidedClientConfiguration(com.google.wallet.proto.NanoWalletEntities.ClientConfiguration clientconfiguration)
    {
        this;
        JVM INSTR monitorenter ;
        Preconditions.checkNotNull(clientconfiguration);
        WLog.d(TAG, "persisting server provided client configuration");
        persistClientConfiguration("clientConfiguration", clientconfiguration);
        SharedPreference.CLIENT_CONFIGURATION_INTITIALIZED.put(sharedPreferences, Boolean.valueOf(true));
        this;
        JVM INSTR monitorexit ;
        return;
        clientconfiguration;
        throw clientconfiguration;
    }

}
