// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.application.settings.ISignUrlService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.ats.ATSApi;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            WebApplicationStatusView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding atsApi;
    private Binding lyftPreferences;
    private Binding progressController;
    private Binding signUrlService;
    private Binding userSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        atsApi = linker.requestBinding("me.lyft.android.infrastructure.ats.ATSApi", me/lyft/android/ui/onboarding/WebApplicationStatusView, getClass().getClassLoader());
        signUrlService = linker.requestBinding("me.lyft.android.application.settings.ISignUrlService", me/lyft/android/ui/onboarding/WebApplicationStatusView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/onboarding/WebApplicationStatusView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/onboarding/WebApplicationStatusView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/onboarding/WebApplicationStatusView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/onboarding/WebApplicationStatusView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/onboarding/WebApplicationStatusView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(atsApi);
        set1.add(signUrlService);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(userSession);
        set1.add(appFlow);
        set1.add(lyftPreferences);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WebApplicationStatusView)obj);
    }

    public void injectMembers(WebApplicationStatusView webapplicationstatusview)
    {
        webapplicationstatusview.atsApi = (ATSApi)atsApi.get();
        webapplicationstatusview.signUrlService = (ISignUrlService)signUrlService.get();
        webapplicationstatusview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        webapplicationstatusview.progressController = (IProgressController)progressController.get();
        webapplicationstatusview.userSession = (IUserSession)userSession.get();
        webapplicationstatusview.appFlow = (AppFlow)appFlow.get();
        webapplicationstatusview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.onboarding.WebApplicationStatusView", false, me/lyft/android/ui/onboarding/WebApplicationStatusView);
    }
}
