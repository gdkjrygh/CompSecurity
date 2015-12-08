// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.application;

import com.google.android.apps.wallet.app.modules.WalletApplicationLibModule;
import dagger.internal.ModuleAdapter;

// Referenced classes of package com.google.android.apps.wallet.application:
//            WalletApplicationModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = {
        com/google/android/apps/wallet/app/modules/WalletApplicationLibModule
    };
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final WalletApplicationModule newModule()
    {
        return new WalletApplicationModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/google/android/apps/wallet/application/WalletApplicationModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
