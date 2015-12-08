// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.help:
//            HelpView

public final class vice extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding developerTools;
    private Binding device;
    private Binding lyftPreferences;
    private Binding progressController;
    private Binding signUrlService;
    private Binding slideMenuController;
    private Binding userProvider;

    public void attach(Linker linker)
    {
        signUrlService = linker.requestBinding("me.lyft.android.application.settings.ISignUrlService", me/lyft/android/ui/help/HelpView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/help/HelpView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/help/HelpView, getClass().getClassLoader());
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/help/HelpView, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/help/HelpView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/help/HelpView, getClass().getClassLoader());
        developerTools = linker.requestBinding("me.lyft.android.development.DeveloperTools", me/lyft/android/ui/help/HelpView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/help/HelpView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(signUrlService);
        set1.add(progressController);
        set1.add(lyftPreferences);
        set1.add(userProvider);
        set1.add(device);
        set1.add(appFlow);
        set1.add(developerTools);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((HelpView)obj);
    }

    public void injectMembers(HelpView helpview)
    {
        helpview.signUrlService = (ISignUrlService)signUrlService.get();
        helpview.progressController = (IProgressController)progressController.get();
        helpview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        helpview.userProvider = (IUserProvider)userProvider.get();
        helpview.device = (IDevice)device.get();
        helpview.appFlow = (AppFlow)appFlow.get();
        helpview.developerTools = (DeveloperTools)developerTools.get();
        helpview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public vice()
    {
        super(null, "members/me.lyft.android.ui.help.HelpView", false, me/lyft/android/ui/help/HelpView);
    }
}
