// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.analytics.AnalyticsModule;
import com.soundcloud.android.associations.AssociationsModule;
import dagger.a.r;

// Referenced classes of package com.soundcloud.android.main:
//            MainModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = {
        com/soundcloud/android/associations/AssociationsModule, com/soundcloud/android/analytics/AnalyticsModule
    };
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.main.LauncherActivity", "members/com.soundcloud.android.main.MainActivity", "members/com.soundcloud.android.main.WebViewActivity", "members/com.soundcloud.android.creators.upload.MetadataFragment", "members/com.soundcloud.android.main.DevDrawerFragment", "members/com.soundcloud.android.main.EmailOptInDialogFragment"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final MainModule newModule()
    {
        return new MainModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/main/MainModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
