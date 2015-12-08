// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import dagger.internal.ModuleAdapter;

// Referenced classes of package com.google.android.apps.wallet.app.modules:
//            ApplicationScopeSingletonsModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/com.google.android.apps.wallet.analytics.AnalyticsUtil", "members/com.google.android.apps.wallet.analytics.AppStartTimeLogger", "members/com.google.android.apps.wallet.analytics.ClientTimingReportingConfiguration", "members/com.google.android.apps.wallet.config.cloudconfig.WalletCloudConfigurationManager", "members/com.google.android.apps.wallet.analytics.CsiManager", "members/com.google.android.apps.wallet.geofencing.service.GeofencingInMemoryState", "members/com.google.android.apps.wallet.http.HttpUrlConnectionFactory", "members/com.google.android.apps.wallet.imageio.ImageResizer", "members/com.google.android.apps.wallet.api.UriRegistry"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final ApplicationScopeSingletonsModule newModule()
    {
        return new ApplicationScopeSingletonsModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/google/android/apps/wallet/app/modules/ApplicationScopeSingletonsModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
