// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.application;

import com.google.android.apps.wallet.app.modules.WalletUserModule;
import dagger.internal.ModuleAdapter;

// Referenced classes of package com.google.android.apps.wallet.application:
//            WalletHceUserModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = {
        com/google/android/apps/wallet/app/modules/WalletUserModule
    };
    private static final String INJECTS[] = {
        "members/com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor", "members/com.google.android.apps.wallet.hce.tap.WalletHceContext"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final WalletHceUserModule newModule()
    {
        return new WalletHceUserModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/google/android/apps/wallet/application/WalletHceUserModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
