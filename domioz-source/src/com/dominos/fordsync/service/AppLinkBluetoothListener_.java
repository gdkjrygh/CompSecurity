// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkBluetoothListener, AppLinkManager_

public final class AppLinkBluetoothListener_ extends AppLinkBluetoothListener
{

    public AppLinkBluetoothListener_()
    {
    }

    private void init_(Context context)
    {
        mAppLinkManager = AppLinkManager_.getInstance_(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        init_(context);
        super.onReceive(context, intent);
    }
}
