// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.associations.AssociationsModule;
import dagger.a.r;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesModule

public final class INCLUDES extends r
{

    private static final Class INCLUDES[] = {
        com/soundcloud/android/associations/AssociationsModule
    };
    private static final String INJECTS[] = {
        "members/com.soundcloud.android.activities.ActivitiesActivity", "members/com.soundcloud.android.activities.ActivitiesFragment"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final ActivitiesModule newModule()
    {
        return new ActivitiesModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ()
    {
        super(com/soundcloud/android/activities/ActivitiesModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, true, false);
    }
}
