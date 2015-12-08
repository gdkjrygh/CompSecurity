// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.pinterest.api.model.MyUser;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

public class this._cls0
    implements com.google.android.gms.common.api.stener, com.google.android.gms.common.api.stener
{

    final SocialConnectActivity this$0;

    public void onConnected(Bundle bundle)
    {
        PLog.info((new StringBuilder("onConnected: ")).append(bundle).toString(), new Object[0]);
        MyUser.setGPlusAccount(Plus.AccountApi.getAccountName(_gPlusClient));
        _gPlusClient.disconnect();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        PLog.info((new StringBuilder("onConnectionFailed: ")).append(connectionresult).toString(), new Object[0]);
        mConnectionResult = connectionresult;
    }

    public void onConnectionSuspended(int i)
    {
    }

    protected ailedListener()
    {
        this$0 = SocialConnectActivity.this;
        super();
    }
}
