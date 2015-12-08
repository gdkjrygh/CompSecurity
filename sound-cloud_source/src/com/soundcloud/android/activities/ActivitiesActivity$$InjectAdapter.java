// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesActivity

public final class I extends b
    implements a, Provider
{

    private b actionBarHelper;
    private b baseLayoutHelper;
    private b featureFlags;
    private b navigator;
    private b playerController;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/activities/ActivitiesActivity, getClass().getClassLoader());
        actionBarHelper = l1.a("com.soundcloud.android.actionbar.ActionBarHelper", com/soundcloud/android/activities/ActivitiesActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/activities/ActivitiesActivity, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/activities/ActivitiesActivity, getClass().getClassLoader());
        featureFlags = l1.a("com.soundcloud.android.properties.FeatureFlags", com/soundcloud/android/activities/ActivitiesActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/activities/ActivitiesActivity, getClass().getClassLoader(), false);
    }

    public final ActivitiesActivity get()
    {
        ActivitiesActivity activitiesactivity = new ActivitiesActivity();
        injectMembers(activitiesactivity);
        return activitiesactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playerController);
        set1.add(actionBarHelper);
        set1.add(baseLayoutHelper);
        set1.add(navigator);
        set1.add(featureFlags);
        set1.add(supertype);
    }

    public final void injectMembers(ActivitiesActivity activitiesactivity)
    {
        activitiesactivity.playerController = (PlayerController)playerController.get();
        activitiesactivity.actionBarHelper = (ActionBarHelper)actionBarHelper.get();
        activitiesactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        activitiesactivity.navigator = (Navigator)navigator.get();
        activitiesactivity.featureFlags = (FeatureFlags)featureFlags.get();
        supertype.injectMembers(activitiesactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActivitiesActivity)obj);
    }

    public I()
    {
        super("com.soundcloud.android.activities.ActivitiesActivity", "members/com.soundcloud.android.activities.ActivitiesActivity", false, com/soundcloud/android/activities/ActivitiesActivity);
    }
}
