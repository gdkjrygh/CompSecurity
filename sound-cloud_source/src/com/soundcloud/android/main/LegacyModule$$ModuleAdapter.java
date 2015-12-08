// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.associations.AssociationsModule;
import dagger.a.r;

// Referenced classes of package com.soundcloud.android.main:
//            LegacyModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = {
        com/soundcloud/android/associations/AssociationsModule
    };
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.collections.ScListFragment", "members/com.soundcloud.android.activities.LegacyActivitiesAdapter", "members/com.soundcloud.android.sync.ApiSyncer", "members/com.soundcloud.android.creators.upload.UploadService"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final LegacyModule newModule()
    {
        return new LegacyModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/main/LegacyModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
