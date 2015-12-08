// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import com.google.android.apps.common.inject.ActivityModule;
import com.google.android.apps.common.inject.FragmentActivityModule;
import dagger.internal.ModuleAdapter;

// Referenced classes of package com.google.android.apps.wallet.app.modules:
//            InitializerActivityModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = {
        com/google/android/apps/common/inject/ActivityModule, com/google/android/apps/common/inject/FragmentActivityModule
    };
    private static final String INJECTS[] = {
        "members/com.google.android.apps.wallet.init.ui.InitializerActivity"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final InitializerActivityModule newModule()
    {
        return new InitializerActivityModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public Y()
    {
        super(com/google/android/apps/wallet/app/modules/InitializerActivityModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
