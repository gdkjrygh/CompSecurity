// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.device.DeviceClient;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.api.client.util.ExponentialBackOff;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GcmRegistrar
{

    private static final int DEFAULT_INITIAL_INTERVAL;
    private static final int DEFAULT_MAX_ELAPSED_TIME;
    private static final int DEFAULT_MAX_INTERVAL;
    private static final String TAG = com/google/android/apps/wallet/notifications/GcmRegistrar.getSimpleName();
    private final Application application;
    private final DeviceClient deviceClient;
    private ExponentialBackOff exponentialBackOff;
    private final GoogleCloudMessaging gcm;
    private final SharedPreferences sharedPreferences;
    private final String versionName;

    public GcmRegistrar(Application application1, GoogleCloudMessaging googlecloudmessaging, SharedPreferences sharedpreferences, DeviceClient deviceclient, String s)
    {
        application = application1;
        gcm = googlecloudmessaging;
        sharedPreferences = sharedpreferences;
        deviceClient = deviceclient;
        versionName = s;
        exponentialBackOff = (new com.google.api.client.util.ExponentialBackOff.Builder()).setInitialIntervalMillis(DEFAULT_INITIAL_INTERVAL).setMaxIntervalMillis(DEFAULT_MAX_INTERVAL).setMaxElapsedTimeMillis(DEFAULT_MAX_ELAPSED_TIME).build();
    }

    public final boolean register()
    {
        if (versionName.equals(SharedPreference.LAST_REGISTERED_FOR_GCM.get(sharedPreferences)))
        {
            return true;
        }
        exponentialBackOff.reset();
_L6:
        Object obj;
        String s;
        String s1;
        WLog.d(TAG, "Attempting to register for GCM");
        s = gcm.register(new String[] {
            "365167725022"
        });
        s1 = TAG;
        obj = String.valueOf(s);
        if (((String) (obj)).length() == 0) goto _L2; else goto _L1
_L1:
        obj = "GCM Id: ".concat(((String) (obj)));
_L3:
        WLog.d(s1, ((String) (obj)));
        obj = new com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest();
        obj.registrationInfo = new com.google.wallet.proto.NanoWalletEntities.RegistrationInfo();
        ((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)).registrationInfo.type = Integer.valueOf(3);
        ((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)).registrationInfo.gcmRegistrationInfo = new com.google.wallet.proto.NanoWalletEntities.GcmRegistrationInfo();
        ((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)).registrationInfo.gcmRegistrationInfo.registrationId = s;
        ((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)).registrationInfo.gcmRegistrationInfo.packageName = application.getPackageName();
        deviceClient.register(((com.google.wallet.proto.api.NanoWalletDevice.RegisterDeviceRequest) (obj)));
        SharedPreference.LAST_REGISTERED_FOR_GCM.put(sharedPreferences, versionName);
        WLog.d(TAG, "GCM registration completed");
        return true;
        obj;
        WLog.d(TAG, "Got exception when trying to register for GCM", ((Throwable) (obj)));
_L4:
        long l;
        RpcException rpcexception;
        try
        {
            l = exponentialBackOff.nextBackOffMillis();
        }
        catch (IOException ioexception)
        {
            return false;
        }
        if (l == -1L)
        {
            WLog.d(TAG, "Exceeded maximum retries without a successful GCM registration");
            return false;
        }
        break MISSING_BLOCK_LABEL_254;
_L2:
        obj = new String("GCM Id: ");
          goto _L3
        rpcexception;
        WLog.d(TAG, "Got exception when trying to register for GCM", rpcexception);
          goto _L4
        SystemClock.sleep(l);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void setExponentialBackOff(ExponentialBackOff exponentialbackoff)
    {
        exponentialBackOff = exponentialbackoff;
    }

    static 
    {
        DEFAULT_INITIAL_INTERVAL = (int)TimeUnit.SECONDS.toMillis(4L);
        DEFAULT_MAX_INTERVAL = (int)TimeUnit.MINUTES.toMillis(10L);
        DEFAULT_MAX_ELAPSED_TIME = (int)TimeUnit.MINUTES.toMillis(30L);
    }
}
