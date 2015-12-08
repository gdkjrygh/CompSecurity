// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.user;

import android.content.SharedPreferences;
import com.google.android.apps.wallet.datastore.KeyValueStore;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import dagger.Lazy;

public class UserInfoManager
{

    private static final String TAG = com/google/android/apps/wallet/user/UserInfoManager.getSimpleName();
    private int cachedCountryState;
    private final String currentAccountName;
    private final SharedPreferences globalPrefs;
    private final KeyValueStore keyValueStore;
    private Optional latestLegalDocumentCache;
    private final Lazy setupWalletServiceClient;

    public UserInfoManager(String s, SharedPreferences sharedpreferences, KeyValueStore keyvaluestore, Lazy lazy)
    {
        cachedCountryState = 3;
        currentAccountName = s;
        globalPrefs = sharedpreferences;
        keyValueStore = keyvaluestore;
        setupWalletServiceClient = lazy;
    }

    private void clearCache()
    {
        this;
        JVM INSTR monitorenter ;
        cachedCountryState = 3;
        latestLegalDocumentCache = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private Optional loadUserInfo()
    {
        Optional optional = Optional.fromNullable(keyValueStore.load("latestLegalDocument"));
        if (optional.isPresent())
        {
            try
            {
                optional = Optional.of(MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.UserInfo(), (byte[])optional.get()));
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
            {
                throw new RuntimeException("Failed to parse LatestLegalDocument protobuf", invalidprotocolbuffernanoexception);
            }
            return optional;
        } else
        {
            return Optional.absent();
        }
    }

    public final void deleteUserInfo()
    {
        boolean flag = keyValueStore.delete("latestLegalDocument");
        clearCache();
        if (flag)
        {
            WLog.d(TAG, "User Info has been deleted");
        }
    }

    public final void downloadAndPersistUserInfo()
        throws RpcException
    {
        com.google.wallet.proto.api.NanoWalletSetup.LoadUserInfoResponse loaduserinforesponse = ((SetupWalletServiceClient)setupWalletServiceClient.get()).loadUserInfo(new com.google.wallet.proto.api.NanoWalletSetup.LoadUserInfoRequest());
        boolean flag;
        if (loaduserinforesponse.userInfo != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Server returned empty UserInfo in loadUserInfo call!");
        persistUserInfo(loaduserinforesponse.userInfo);
    }

    public final String getAccountName(String s)
    {
        SharedPreferences sharedpreferences = globalPrefs;
        String s1 = String.valueOf("GAIA_ID_KEY_PREFIX");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return sharedpreferences.getString(s, null);
    }

    public final boolean isWalletAllowedForUserInCountry()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (cachedCountryState == 3) goto _L2; else goto _L1
_L1:
        int i = cachedCountryState;
        if (i != 1)
        {
            flag = false;
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Optional optional;
        optional = loadUserInfo();
        if (optional.isPresent())
        {
            break; /* Loop/switch isn't completed */
        }
        cachedCountryState = 1;
_L5:
        if (cachedCountryState != 1)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!Protos.valueWithDefaultTrue(((com.google.wallet.proto.NanoWalletEntities.UserInfo)optional.get()).walletAllowedInCountry))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        cachedCountryState = 1;
          goto _L5
        Exception exception;
        exception;
        throw exception;
        cachedCountryState = 2;
          goto _L5
    }

    public final Optional loadLatestLegalDocument()
    {
        this;
        JVM INSTR monitorenter ;
        if (latestLegalDocumentCache == null) goto _L2; else goto _L1
_L1:
        Optional optional = latestLegalDocumentCache;
_L3:
        this;
        JVM INSTR monitorexit ;
        return optional;
_L2:
        optional = loadUserInfo();
        if (!optional.isPresent() || ((com.google.wallet.proto.NanoWalletEntities.UserInfo)optional.get()).latestLegalDocument == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        optional = Optional.of(((com.google.wallet.proto.NanoWalletEntities.UserInfo)optional.get()).latestLegalDocument);
_L4:
        latestLegalDocumentCache = optional;
        optional = latestLegalDocumentCache;
          goto _L3
        optional = Optional.absent();
          goto _L4
        Exception exception;
        exception;
        throw exception;
    }

    public final void persistUserInfo(com.google.wallet.proto.NanoWalletEntities.UserInfo userinfo)
    {
        android.content.SharedPreferences.Editor editor = globalPrefs.edit();
        String s = String.valueOf("GAIA_ID_KEY_PREFIX");
        String s1 = String.valueOf(userinfo.obfuscatedGaiaId);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        editor.putString(s, currentAccountName).commit();
        keyValueStore.store("latestLegalDocument", MessageNano.toByteArray(userinfo));
        clearCache();
        WLog.dfmt(TAG, "User Info has been saved: %s", new Object[] {
            userinfo
        });
    }

}
