// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.reset;

import dagger.internal.ModuleAdapter;

// Referenced classes of package com.google.android.apps.wallet.reset:
//            ResetModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.google.android.apps.wallet.reset.ResetService"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final ResetModule newModule()
    {
        return new ResetModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/google/android/apps/wallet/reset/ResetModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
