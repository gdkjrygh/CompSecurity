// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.app.Application;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.apps.wallet.config.gservices.GservicesKey;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.rpc.RpcRequestMetadataProcessor;
import com.google.common.base.Preconditions;

public class DeviceContextFactory
    implements RpcRequestMetadataProcessor
{

    private final Application application;
    private final String deviceName;
    private final GservicesWrapper gservicesWrapper;
    private final String manufacturer;
    private final String model;
    private final NetworkInformationProvider networkInformationProvider;
    private final String product;
    private final String serial;
    private final TelephonyManager telephonyManager;

    DeviceContextFactory(Application application1, TelephonyManager telephonymanager, NetworkInformationProvider networkinformationprovider, GservicesWrapper gserviceswrapper)
    {
        serial = Build.SERIAL;
        product = Build.PRODUCT;
        model = Build.MODEL;
        manufacturer = Build.MANUFACTURER;
        deviceName = Build.DEVICE;
        application = application1;
        telephonyManager = (TelephonyManager)Preconditions.checkNotNull(telephonymanager);
        networkInformationProvider = networkinformationprovider;
        gservicesWrapper = gserviceswrapper;
    }

    public final void process(com.google.wallet.proto.NanoWalletTransport.RequestMetadata requestmetadata)
    {
        String s = telephonyManager.getDeviceId();
        String s1 = telephonyManager.getLine1Number();
        Object obj = networkInformationProvider.getStableNetworkDetails();
        com.google.wallet.proto.NanoWalletShared.DeviceContext devicecontext = new com.google.wallet.proto.NanoWalletShared.DeviceContext();
        devicecontext.stableNetworkDetails = ((com.google.wallet.proto.NanoWalletShared.StableNetworkDetails) (obj));
        long l = gservicesWrapper.getLong(GservicesKey.ANDROID_ID);
        if (l != ((Long)GservicesKey.ANDROID_ID.getDefaultValue()).longValue())
        {
            devicecontext.androidId = Long.valueOf(l);
        }
        obj = android.provider.Settings.Secure.getString(application.getContentResolver(), "android_id");
        if (obj != null)
        {
            devicecontext.secureAndroidId = ((String) (obj));
        }
        if (s != null)
        {
            devicecontext.deviceId = s;
        }
        if (s1 != null)
        {
            devicecontext.phoneNumber = s1;
        }
        if (serial != null)
        {
            devicecontext.serial = serial;
        }
        if (product != null)
        {
            devicecontext.product = product;
        }
        if (model != null)
        {
            devicecontext.model = model;
        }
        if (manufacturer != null)
        {
            devicecontext.manufacturer = manufacturer;
        }
        if (deviceName != null)
        {
            devicecontext.deviceName = deviceName;
        }
        devicecontext.hardwareType = Integer.valueOf(1);
        requestmetadata.deviceContext = devicecontext;
    }
}
