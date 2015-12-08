// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.callstatus.CallStatus;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.gservices.GservicesKey;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.device.DeviceClient;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.notifications.GcmRegistrar;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient;
import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

public class FinishSetupActivator
{

    private static final int GCM_INITIAL_INTERVAL;
    private static final int GCM_MAX_ELAPSED_TIME;
    private static final int GCM_MAX_INTERVAL;
    private static final String TAG = com/google/android/apps/wallet/usersetup/FinishSetupActivator.getSimpleName();
    private final Application application;
    private final DeviceClient deviceClient;
    private final FeatureManager featureManager;
    private final GcmRegistrar gcmRegistrar;
    private final GservicesWrapper gservicesWrapper;
    private final SetupWalletServiceClient setupWalletServiceClient;
    private final SharedPreferences sharedPrefs;
    private final System system;

    FinishSetupActivator(SetupWalletServiceClient setupwalletserviceclient, SharedPreferences sharedpreferences, System system1, GcmRegistrar gcmregistrar, FeatureManager featuremanager, Application application1, GservicesWrapper gserviceswrapper, 
            DeviceClient deviceclient)
    {
        setupWalletServiceClient = setupwalletserviceclient;
        sharedPrefs = sharedpreferences;
        system = system1;
        gcmRegistrar = gcmregistrar;
        featureManager = featuremanager;
        application = application1;
        gservicesWrapper = gserviceswrapper;
        deviceClient = deviceclient;
        gcmregistrar.setExponentialBackOff((new com.google.api.client.util.ExponentialBackOff.Builder()).setInitialIntervalMillis(GCM_INITIAL_INTERVAL).setMaxIntervalMillis(GCM_MAX_INTERVAL).setMaxElapsedTimeMillis(GCM_MAX_ELAPSED_TIME).build());
    }

    private void registerForC2dm()
        throws RpcException
    {
        Long long1 = Long.valueOf(gservicesWrapper.getLong(GservicesKey.ANDROID_ID));
        if (!((Long)GservicesKey.ANDROID_ID.getDefaultValue()).equals(long1))
        {
            Object obj = TAG;
            String s = String.valueOf(long1);
            WLog.d(((String) (obj)), (new StringBuilder(String.valueOf(s).length() + 15)).append("Android Id - (").append(s).append(")").toString());
            obj = new com.google.wallet.proto.NanoWalletEntities.C2dmRegistrationInfo();
            obj.id = new com.google.wallet.proto.NanoWalletEntities.EntityIdentifier();
            ((com.google.wallet.proto.NanoWalletEntities.C2dmRegistrationInfo) (obj)).id.localId = String.valueOf(long1);
            ((com.google.wallet.proto.NanoWalletEntities.C2dmRegistrationInfo) (obj)).id.originatorId = String.valueOf(long1);
            obj.isRegisteredWithServer = Boolean.valueOf(true);
            obj.walletPackageName = application.getPackageName();
            obj.androidId = long1;
            obj = new com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest();
            obj.registrationInfo = new com.google.wallet.proto.NanoWalletEntities.RegistrationInfo();
            ((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)).registrationInfo.type = Integer.valueOf(1);
            ((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)).registrationInfo.androidIdRegistrationInfo = new com.google.wallet.proto.NanoWalletEntities.AndroidIdRegistrationInfo();
            ((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)).registrationInfo.androidIdRegistrationInfo.androidId = long1;
            deviceClient.register(((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)));
            return;
        } else
        {
            throw new RpcException("No Android ID found");
        }
    }

    private void setupWalletAndFinish(com.google.wallet.proto.api.NanoWalletSetup.SetupWalletResponse setupwalletresponse)
    {
        WLog.d(TAG, "setupWalletAndFinish start");
        Preconditions.checkNotNull(setupwalletresponse);
        SharedPreference.SETUP_COMPLETE.put(sharedPrefs, Boolean.valueOf(true));
        setupwalletresponse = SharedPreference.SETUP_COMPLETION_TIME_MILLIS;
        SharedPreferences sharedpreferences = sharedPrefs;
        System system1 = system;
        setupwalletresponse.put(sharedpreferences, Long.valueOf(System.currentTimeMillis()));
    }

    public final CallStatus finishSetup()
    {
        Object obj;
        obj = new com.google.wallet.proto.api.NanoWalletSetup.SetupWalletRequest();
        obj.fetchNumInstruments = Boolean.valueOf(true);
        try
        {
            obj = setupWalletServiceClient.finishSetUp(((com.google.wallet.proto.api.NanoWalletSetup.SetupWalletRequest) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String s = TAG;
            String s1 = String.valueOf(obj);
            WLog.e(s, (new StringBuilder(String.valueOf(s1).length() + 49)).append("Failed to accept tos and finish setup on server: ").append(s1).toString(), ((Throwable) (obj)));
            return CallStatus.failure(com.google.android.apps.walletnfcrel.R.string.setup_failed_dialog_title, com.google.android.apps.walletnfcrel.R.string.setup_failed_dialog_text);
        }
        if (((com.google.wallet.proto.api.NanoWalletSetup.SetupWalletResponse) (obj)).callError != null)
        {
            return CallStatus.failure(((com.google.wallet.proto.api.NanoWalletSetup.SetupWalletResponse) (obj)).callError, com.google.android.apps.walletnfcrel.R.string.setup_failed_dialog_title, com.google.android.apps.walletnfcrel.R.string.setup_failed_dialog_text);
        }
        if (!featureManager.isFeatureEnabled(Feature.USE_ANDROID_GCM)) goto _L2; else goto _L1
_L1:
        boolean flag = gcmRegistrar.register();
_L3:
        RpcException rpcexception;
        if (!flag)
        {
            return CallStatus.failure(com.google.android.apps.walletnfcrel.R.string.setup_failed_dialog_title, com.google.android.apps.walletnfcrel.R.string.setup_failed_dialog_text);
        } else
        {
            setupWalletAndFinish(((com.google.wallet.proto.api.NanoWalletSetup.SetupWalletResponse) (obj)));
            return CallStatus.SUCCESS;
        }
_L2:
        registerForC2dm();
        flag = true;
          goto _L3
        rpcexception;
        WLog.e(TAG, "Failed to register for C2DM", rpcexception);
        flag = false;
          goto _L3
    }

    static 
    {
        GCM_INITIAL_INTERVAL = (int)TimeUnit.MILLISECONDS.toMillis(500L);
        GCM_MAX_INTERVAL = (int)TimeUnit.SECONDS.toMillis(5L);
        GCM_MAX_ELAPSED_TIME = (int)TimeUnit.SECONDS.toMillis(30L);
    }
}
