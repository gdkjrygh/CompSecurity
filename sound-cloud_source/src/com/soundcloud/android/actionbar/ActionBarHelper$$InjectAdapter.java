// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.utils.BugReporter;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.actionbar:
//            ActionBarHelper

public final class  extends b
    implements a, Provider
{

    private b applicationProperties;
    private b bugReporter;
    private b castConnectionHelper;
    private b deviceHelper;
    private b eventBus;
    private b navigator;
    private b supertype;

    public final void attach(l l1)
    {
        castConnectionHelper = l1.a("com.soundcloud.android.cast.CastConnectionHelper", com/soundcloud/android/actionbar/ActionBarHelper, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/actionbar/ActionBarHelper, getClass().getClassLoader());
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/actionbar/ActionBarHelper, getClass().getClassLoader());
        bugReporter = l1.a("com.soundcloud.android.utils.BugReporter", com/soundcloud/android/actionbar/ActionBarHelper, getClass().getClassLoader());
        navigator = l1.a("com.soundcloud.android.Navigator", com/soundcloud/android/actionbar/ActionBarHelper, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/actionbar/ActionBarHelper, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/actionbar/ActionBarHelper, getClass().getClassLoader(), false);
    }

    public final ActionBarHelper get()
    {
        ActionBarHelper actionbarhelper = new ActionBarHelper((CastConnectionHelper)castConnectionHelper.get(), (EventBus)eventBus.get(), (ApplicationProperties)applicationProperties.get(), (BugReporter)bugReporter.get(), (Navigator)navigator.get(), (DeviceHelper)deviceHelper.get());
        injectMembers(actionbarhelper);
        return actionbarhelper;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(castConnectionHelper);
        set.add(eventBus);
        set.add(applicationProperties);
        set.add(bugReporter);
        set.add(navigator);
        set.add(deviceHelper);
        set1.add(supertype);
    }

    public final void injectMembers(ActionBarHelper actionbarhelper)
    {
        supertype.injectMembers(actionbarhelper);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ActionBarHelper)obj);
    }

    public ()
    {
        super("com.soundcloud.android.actionbar.ActionBarHelper", "members/com.soundcloud.android.actionbar.ActionBarHelper", false, com/soundcloud/android/actionbar/ActionBarHelper);
    }
}
