// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import com.soundcloud.android.analytics.AnalyticsModule;
import dagger.a.r;

// Referenced classes of package com.soundcloud.android.gcm:
//            GcmModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = {
        com/soundcloud/android/analytics/AnalyticsModule
    };
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.gcm.GcmRegistrationService", "members/com.soundcloud.android.gcm.GcmMessageReceiver"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final GcmModule newModule()
    {
        return new GcmModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public _cls9()
    {
        super(com/soundcloud/android/gcm/GcmModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
