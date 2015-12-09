// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.appcontrol;

import com.google.android.apps.wallet.config.clientconfig.ClientConfigurationManager;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.config.appcontrol:
//            AppControlKey

public class AppControl
{

    static final String DEFAULT_BOOLEAN = "false";
    private static final String TAG = com/google/android/apps/wallet/config/appcontrol/AppControl.getSimpleName();
    private final ClientConfigurationManager mClientConfigurationManager;

    AppControl(ClientConfigurationManager clientconfigurationmanager)
    {
        mClientConfigurationManager = (ClientConfigurationManager)Preconditions.checkNotNull(clientconfigurationmanager);
    }

    public final boolean getBoolean(AppControlKey appcontrolkey)
        throws IllegalStateException
    {
        return Boolean.parseBoolean(getString(appcontrolkey));
    }

    public final int getInt(AppControlKey appcontrolkey)
        throws IllegalStateException
    {
        return Integer.parseInt(getString(appcontrolkey));
    }

    public final long getLong(AppControlKey appcontrolkey)
        throws IllegalStateException
    {
        return Long.parseLong(getString(appcontrolkey));
    }

    public final String getString(AppControlKey appcontrolkey)
        throws IllegalStateException
    {
        return mClientConfigurationManager.getAppControlValue(appcontrolkey.getProtoKeyName(), appcontrolkey.getDefaultValue());
    }

}
