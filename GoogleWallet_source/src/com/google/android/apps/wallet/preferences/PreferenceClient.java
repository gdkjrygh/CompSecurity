// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.preferences;

import com.google.android.apps.wallet.locale.util.Bcp47;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Preconditions;
import java.util.Locale;
import java.util.TimeZone;

public class PreferenceClient
{

    private static final String TAG = com/google/android/apps/wallet/preferences/PreferenceClient.getSimpleName();
    private final RpcCaller rpcCaller;

    PreferenceClient(RpcCaller rpccaller)
    {
        rpcCaller = (RpcCaller)Preconditions.checkNotNull(rpccaller);
    }

    public final int fetchPinTimeoutMinutesSetting()
        throws RpcException
    {
        WLog.d(TAG, "fetch PIN timeout in minutes");
        com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse fetchsettingsresponse = (com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse)rpcCaller.call("b/preferences/fetchSettings", new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsRequest(), new com.google.wallet.proto.api.NanoWalletSettings.FetchSettingsResponse());
        if (fetchsettingsresponse.settings == null || fetchsettingsresponse.settings.cloudPinTtlMinutes == null)
        {
            throw new RpcException("FetchSettingsRequest from server is missing PinTokenTtlMinutes");
        } else
        {
            return fetchsettingsresponse.settings.cloudPinTtlMinutes.intValue();
        }
    }

    public final com.google.wallet.proto.NanoWalletEntities.DisplayableP2pCommercialUses getDisplayableCommercialUses()
        throws RpcException
    {
        return ((com.google.wallet.proto.api.NanoWalletSettings.GetCommercialUseSettingsResponse)rpcCaller.call("b/preferences/getCommercialUse", new com.google.wallet.proto.api.NanoWalletSettings.GetCommercialUseSettingsRequest(), new com.google.wallet.proto.api.NanoWalletSettings.GetCommercialUseSettingsResponse())).displayableCommercialUses;
    }

    public final void updateCommercialUse(boolean flag, Integer integer)
        throws RpcException
    {
        com.google.wallet.proto.NanoWalletEntities.P2pCommercialUseSettings p2pcommercialusesettings = new com.google.wallet.proto.NanoWalletEntities.P2pCommercialUseSettings();
        p2pcommercialusesettings.p2PCommercialUseType = integer;
        p2pcommercialusesettings.recordCommercialUse = Boolean.valueOf(flag);
        integer = new com.google.wallet.proto.api.NanoWalletSettings.UpdateCommercialUseSettingsRequest();
        integer.commercialUseSettings = p2pcommercialusesettings;
        rpcCaller.call("b/preferences/updateCommercialUse", integer, new com.google.wallet.proto.api.NanoWalletSettings.UpdateCommercialUseSettingsResponse());
    }

    public final int updateDeviceInfo()
        throws RpcException
    {
        WLog.d(TAG, "update device info");
        Object obj = Bcp47.fromLocale(Locale.getDefault());
        String s = TimeZone.getDefault().getID();
        com.google.wallet.proto.api.NanoWalletSettings.UpdateDeviceInfoRequest updatedeviceinforequest = new com.google.wallet.proto.api.NanoWalletSettings.UpdateDeviceInfoRequest();
        updatedeviceinforequest.languageCode = ((String) (obj));
        updatedeviceinforequest.timeZone = s;
        obj = (com.google.wallet.proto.api.NanoWalletSettings.UpdateDeviceInfoResponse)rpcCaller.call("b/preferences/updateDeviceInfo", updatedeviceinforequest, new com.google.wallet.proto.api.NanoWalletSettings.UpdateDeviceInfoResponse());
        if (((com.google.wallet.proto.api.NanoWalletSettings.UpdateDeviceInfoResponse) (obj)).callError != null)
        {
            return Protos.valueWithDefault(((com.google.wallet.proto.api.NanoWalletSettings.UpdateDeviceInfoResponse) (obj)).callError.errorCode, 1);
        } else
        {
            return 0;
        }
    }

    public final void updatePinTimeoutMinutesSetting(int i)
        throws RpcException
    {
        WLog.d(TAG, "update PIN timeout");
        Object obj = new com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingRequest();
        obj.id = Integer.valueOf(303);
        obj.newNumberValue = Long.valueOf(i);
        obj = (com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingResponse)rpcCaller.call("b/preferences/updateSetting", ((com.google.protobuf.nano.MessageNano) (obj)), new com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingResponse());
        if (((com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingResponse) (obj)).currentSettings == null || ((com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingResponse) (obj)).currentSettings.cloudPinTtlMinutes == null)
        {
            throw new RpcException("UpdateSettingResponse from server is missing PinTokenTtlMinutes");
        }
        long l = ((com.google.wallet.proto.api.NanoWalletSettings.UpdateSettingResponse) (obj)).currentSettings.cloudPinTtlMinutes.longValue();
        if (l != (long)i)
        {
            throw new RpcException(String.format("Tried to update PIN timeout minutes to: %d, but server reports that the value is: %d", new Object[] {
                Integer.valueOf(i), Long.valueOf(l)
            }));
        } else
        {
            return;
        }
    }

}
