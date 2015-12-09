// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings;

import com.google.android.apps.wallet.rpc.RpcCaller;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.settings:
//            UserSettingsPublisher, UserSettingsStorageManager

final class est
    implements Callable
{

    final UserSettingsPublisher this$0;
    final com.google.wallet.proto.api.eSettingRequest val$request;

    private com.google.wallet.proto.api.SettingsResponse call()
        throws Exception
    {
        com.google.wallet.proto.api.eSettingResponse esettingresponse = (com.google.wallet.proto.api.eSettingResponse)UserSettingsPublisher.access$300(UserSettingsPublisher.this).call("b/preferences/updateSetting", val$request, new com.google.wallet.proto.api.eSettingResponse());
        com.google.wallet.proto.api.SettingsResponse settingsresponse = new com.google.wallet.proto.api.SettingsResponse();
        settingsresponse.settings = esettingresponse.currentSettings;
        UserSettingsPublisher.access$100(UserSettingsPublisher.this).put(settingsresponse);
        return settingsresponse;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    est()
    {
        this$0 = final_usersettingspublisher;
        val$request = com.google.wallet.proto.api.eSettingRequest.this;
        super();
    }
}
