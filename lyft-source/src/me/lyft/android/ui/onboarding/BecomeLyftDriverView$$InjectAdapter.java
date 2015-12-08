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
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.ats.ATSApi;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeLyftDriverView

public final class  extends Binding
    implements MembersInjector
{

    private Binding atsApi;
    private Binding bus;
    private Binding dialogFlow;
    private Binding lyftPreferences;
    private Binding progressController;
    private Binding signUrlService;
    private Binding userSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/onboarding/BecomeLyftDriverView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/onboarding/BecomeLyftDriverView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/onboarding/BecomeLyftDriverView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/onboarding/BecomeLyftDriverView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/onboarding/BecomeLyftDriverView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/onboarding/BecomeLyftDriverView, getClass().getClassLoader());
        atsApi = linker.requestBinding("me.lyft.android.infrastructure.ats.ATSApi", me/lyft/android/ui/onboarding/BecomeLyftDriverView, getClass().getClassLoader());
        signUrlService = linker.requestBinding("me.lyft.android.application.settings.ISignUrlService", me/lyft/android/ui/onboarding/BecomeLyftDriverView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(bus);
        set1.add(userSession);
        set1.add(dialogFlow);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(lyftPreferences);
        set1.add(atsApi);
        set1.add(signUrlService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((BecomeLyftDriverView)obj);
    }

    public void injectMembers(BecomeLyftDriverView becomelyftdriverview)
    {
        becomelyftdriverview.bus = (MessageBus)bus.get();
        becomelyftdriverview.userSession = (IUserSession)userSession.get();
        becomelyftdriverview.dialogFlow = (DialogFlow)dialogFlow.get();
        becomelyftdriverview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        becomelyftdriverview.progressController = (IProgressController)progressController.get();
        becomelyftdriverview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        becomelyftdriverview.atsApi = (ATSApi)atsApi.get();
        becomelyftdriverview.signUrlService = (ISignUrlService)signUrlService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.onboarding.BecomeLyftDriverView", false, me/lyft/android/ui/onboarding/BecomeLyftDriverView);
    }
}
