// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.settings.IAccessibilitySettingsService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.settings:
//            AccessibilitySettingsView

public final class  extends Binding
    implements MembersInjector
{

    private Binding accessibilitySettingsService;
    private Binding appFlow;
    private Binding progressController;
    private Binding userProvider;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        userProvider = linker.requestBinding("me.lyft.android.application.IUserProvider", me/lyft/android/ui/settings/AccessibilitySettingsView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/AccessibilitySettingsView, getClass().getClassLoader());
        accessibilitySettingsService = linker.requestBinding("me.lyft.android.application.settings.IAccessibilitySettingsService", me/lyft/android/ui/settings/AccessibilitySettingsView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/settings/AccessibilitySettingsView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/settings/AccessibilitySettingsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(userProvider);
        set1.add(appFlow);
        set1.add(accessibilitySettingsService);
        set1.add(viewErrorHandler);
        set1.add(progressController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AccessibilitySettingsView)obj);
    }

    public void injectMembers(AccessibilitySettingsView accessibilitysettingsview)
    {
        accessibilitysettingsview.userProvider = (IUserProvider)userProvider.get();
        accessibilitysettingsview.appFlow = (AppFlow)appFlow.get();
        accessibilitysettingsview.accessibilitySettingsService = (IAccessibilitySettingsService)accessibilitySettingsService.get();
        accessibilitysettingsview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        accessibilitysettingsview.progressController = (IProgressController)progressController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.settings.AccessibilitySettingsView", false, me/lyft/android/ui/settings/AccessibilitySettingsView);
    }
}
