// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.os.SystemClock;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.device.DeviceInfoManager;
import com.google.android.apps.wallet.encryption.EncryptionService;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.settings.SettingProtoManager;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import dagger.Lazy;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            UserPin, CloudPinState, AppPinToken

public class CloudPinManager
{

    private static final String TAG = com/google/android/apps/wallet/pin/CloudPinManager.getSimpleName();
    private final AppPinToken appPinToken;
    private final DeviceInfoManager deviceInfoManager;
    private final EncryptionService encryptionService;
    private final Provider rpcCaller;
    private final Lazy settingProtoManager;
    private final System system;

    CloudPinManager(DeviceInfoManager deviceinfomanager, Provider provider, System system1, Lazy lazy, AppPinToken apppintoken, EncryptionService encryptionservice)
    {
        deviceInfoManager = deviceinfomanager;
        rpcCaller = provider;
        system = system1;
        appPinToken = apppintoken;
        encryptionService = encryptionservice;
        settingProtoManager = lazy;
    }

    private com.google.wallet.proto.NanoWalletShared.ClientEncryptedData createEncryptedData(UserPin userpin)
    {
        com.google.android.apps.wallet.encryption.EncryptionService.EncryptionSession encryptionsession = encryptionService.newSession();
        com.google.wallet.proto.NanoWalletShared.ClientEncryptedData clientencrypteddata = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
        clientencrypteddata.payload = (String)encryptionsession.encrypt(userpin.toString());
        clientencrypteddata.sessionMaterial = (String)encryptionsession.getSessionMaterial();
        return clientencrypteddata;
    }

    private static CloudPinState getCloudPinState(com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo pininfo)
    {
        if (Protos.valueWithDefaultFalse(pininfo.cloudPinSet))
        {
            long l = Protos.valueWithDefault(pininfo.stateTransitionTimestamp, 0L);
            l = Math.max(SystemClock.elapsedRealtime() - l, 0L);
            l = Math.max(Protos.valueWithDefault(pininfo.stateTransitionDeltaMs, 0L) - l, 0L);
            if (pininfo.badPinAttempts.intValue() == 0 && l > 0L)
            {
                return CloudPinState.ACTIVE;
            } else
            {
                return CloudPinState.EXPIRED;
            }
        } else
        {
            return CloudPinState.UNSET;
        }
    }

    private void onPinTokenReceived(com.google.wallet.proto.NanoWalletEntities.PinToken pintoken)
    {
        changePinTimeout((int)Protos.valueWithDefault(pintoken.pinTokenTtlMinutes, 0L));
        appPinToken.set(pintoken);
    }

    public final com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse changePin(UserPin userpin, UserPin userpin1)
        throws RpcException
    {
        WLog.d(TAG, "changePin()");
        com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeRequest pinchangerequest = new com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeRequest();
        pinchangerequest.oldEncryptedPin = createEncryptedData(userpin);
        pinchangerequest.newEncryptedPin = createEncryptedData(userpin1);
        userpin = (com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse)((RpcCaller)rpcCaller.get()).call("b/cloudpin/change", pinchangerequest, new com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse());
        if (((com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse) (userpin)).callError == null)
        {
            onPinTokenReceived(((com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse) (userpin)).pinToken);
        }
        return userpin;
    }

    public final void changePinTimeout(int i)
    {
        com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo pininfo;
        long l;
        long l1;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Pin timeout setting should not be negative");
        ((SettingProtoManager)settingProtoManager.get()).setStringSetting(2, String.valueOf(i));
        l1 = SystemClock.elapsedRealtime();
        if (i == 0)
        {
            l = 0x7fffffffffffffffL;
        } else
        {
            l = TimeUnit.MINUTES.toMillis(i);
        }
        pininfo = (com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo)Protos.copy((com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo)Objects.firstNonNull(deviceInfoManager.getPinInfo(), new com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo()));
        pininfo.badPinAttempts = Integer.valueOf(0);
        pininfo.stateTransitionTimestamp = Long.valueOf(l1);
        pininfo.stateTransitionDeltaMs = Long.valueOf(l);
        deviceInfoManager.persistPinInfo(pininfo);
    }

    public final void expirePin()
    {
        com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo pininfo = (com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo)Protos.copy(deviceInfoManager.getPinInfo());
        pininfo.stateTransitionTimestamp = Long.valueOf(SystemClock.elapsedRealtime());
        pininfo.stateTransitionDeltaMs = Long.valueOf(0L);
        deviceInfoManager.persistPinInfo(pininfo);
        appPinToken.set(null);
    }

    public final CloudPinState getCloudPinState()
    {
        return getCloudPinState(deviceInfoManager.getPinInfo());
    }

    public final int getPinTimeout()
    {
        return Integer.parseInt(((SettingProtoManager)settingProtoManager.get()).getStringSetting(2));
    }

    public final void initializeCloudPinState()
        throws RpcException
    {
        com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo pininfo = deviceInfoManager.getPinInfo();
        WLog.d(TAG, "Attempting to fetch pin status from server");
        Object obj = new com.google.wallet.proto.api.NanoWalletCloudPin.PinExistsRequest();
        obj.usePaymentsPin = Boolean.valueOf(true);
        try
        {
            obj = (com.google.wallet.proto.api.NanoWalletCloudPin.PinExistsResponse)((RpcCaller)rpcCaller.get()).call("b/cloudpin/exists", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.NanoWalletCloudPin.PinExistsResponse());
        }
        catch (RpcException rpcexception)
        {
            if (pininfo.cloudPinSet != null)
            {
                WLog.d(TAG, "Got an exception when fetching pin status, but client has a stored pin status, ignoring", rpcexception);
                return;
            } else
            {
                throw rpcexception;
            }
        }
        pininfo.cloudPinSet = ((com.google.wallet.proto.api.NanoWalletCloudPin.PinExistsResponse) (obj)).pinExists;
        deviceInfoManager.persistPinInfo(pininfo);
    }

    public final boolean isCloudPinActive()
    {
        Object obj = deviceInfoManager.getPinInfo();
        boolean flag1 = Protos.valueWithDefaultFalse(((com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo) (obj)).cloudPinSet);
        obj = getCloudPinState(((com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo) (obj)));
        boolean flag;
        if (flag1 && obj == CloudPinState.ACTIVE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            WLog.ifmt(TAG, "isCloudPinActive(): cloudPinSet=%s, cloudPinState=%s", new Object[] {
                Boolean.valueOf(flag1), obj
            });
        }
        return flag;
    }

    public final com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse setInitialPin(UserPin userpin)
        throws RpcException
    {
        WLog.d(TAG, "setInitialPin()");
        com.google.wallet.proto.api.NanoWalletCloudPin.SetPinRequest setpinrequest = new com.google.wallet.proto.api.NanoWalletCloudPin.SetPinRequest();
        setpinrequest.encryptedPin = createEncryptedData(userpin);
        userpin = (com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse)((RpcCaller)rpcCaller.get()).call("b/cloudpin/set", setpinrequest, new com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse());
        if (((com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse) (userpin)).callError == null)
        {
            com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo pininfo = new com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo();
            pininfo.cloudPinGeneration = ((com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse) (userpin)).pinGeneration;
            pininfo.cloudPinSet = Boolean.valueOf(true);
            deviceInfoManager.persistPinInfo(pininfo);
            onPinTokenReceived(((com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse) (userpin)).pinToken);
        } else
        if (Protos.valuesEqual(((com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse) (userpin)).callError.errorCode, 2))
        {
            com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo pininfo1 = (com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo)Protos.copy(deviceInfoManager.getPinInfo());
            pininfo1.cloudPinSet = null;
            deviceInfoManager.persistPinInfo(pininfo1);
            return userpin;
        }
        return userpin;
    }

    public final com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse verifyPin(UserPin userpin)
        throws RpcException
    {
        WLog.d(TAG, "verifyPin()");
        com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyRequest pinverifyrequest = new com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyRequest();
        System system1 = system;
        pinverifyrequest.currentClientTime = Long.valueOf(System.currentTimeMillis());
        pinverifyrequest.encryptedPin = createEncryptedData(userpin);
        userpin = (com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse)((RpcCaller)rpcCaller.get()).call("b/cloudpin/verify", pinverifyrequest, new com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse());
        if (((com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse) (userpin)).callError == null)
        {
            onPinTokenReceived(((com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse) (userpin)).pinToken);
            com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo pininfo = deviceInfoManager.getPinInfo();
            long l = Protos.valueWithDefault(pininfo.cloudPinGeneration, 0L);
            long l1 = Protos.valueWithDefault(((com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse) (userpin)).pinGeneration, 0L);
            if (l < l1)
            {
                pininfo = (com.google.wallet.proto.NanoWalletClient.DeviceInfo.PinInfo)Protos.copy(pininfo);
                pininfo.cloudPinGeneration = Long.valueOf(l1);
                deviceInfoManager.persistPinInfo(pininfo);
            }
        }
        return userpin;
    }

}
