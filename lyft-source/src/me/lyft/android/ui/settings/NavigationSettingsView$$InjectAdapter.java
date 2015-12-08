// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.AppFlow;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.settings:
//            NavigationSettingsView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding lyftPreferences;
    private Binding navigator;

    public void attach(Linker linker)
    {
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/settings/NavigationSettingsView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/NavigationSettingsView, getClass().getClassLoader());
        navigator = linker.requestBinding("me.lyft.android.utils.Navigator", me/lyft/android/ui/settings/NavigationSettingsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(lyftPreferences);
        set1.add(appFlow);
        set1.add(navigator);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((NavigationSettingsView)obj);
    }

    public void injectMembers(NavigationSettingsView navigationsettingsview)
    {
        navigationsettingsview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        navigationsettingsview.appFlow = (AppFlow)appFlow.get();
        navigationsettingsview.navigator = (Navigator)navigator.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.settings.NavigationSettingsView", false, me/lyft/android/ui/settings/NavigationSettingsView);
    }
}
