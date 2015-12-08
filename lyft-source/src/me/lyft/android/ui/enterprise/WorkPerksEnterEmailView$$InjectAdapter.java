// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEnterEmailView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding contactsProvider;
    private Binding lyftApi;
    private Binding progressController;
    private Binding slideMenuController;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/enterprise/WorkPerksEnterEmailView, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/enterprise/WorkPerksEnterEmailView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/enterprise/WorkPerksEnterEmailView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/enterprise/WorkPerksEnterEmailView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/enterprise/WorkPerksEnterEmailView, getClass().getClassLoader());
        contactsProvider = linker.requestBinding("me.lyft.android.providers.ContactsProvider", me/lyft/android/ui/enterprise/WorkPerksEnterEmailView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/enterprise/WorkPerksEnterEmailView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(lyftApi);
        set1.add(constantsProvider);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(contactsProvider);
        set1.add(slideMenuController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WorkPerksEnterEmailView)obj);
    }

    public void injectMembers(WorkPerksEnterEmailView workperksenteremailview)
    {
        workperksenteremailview.appFlow = (AppFlow)appFlow.get();
        workperksenteremailview.lyftApi = (ILyftApi)lyftApi.get();
        workperksenteremailview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        workperksenteremailview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        workperksenteremailview.progressController = (IProgressController)progressController.get();
        workperksenteremailview.contactsProvider = (ContactsProvider)contactsProvider.get();
        workperksenteremailview.slideMenuController = (SlideMenuController)slideMenuController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.enterprise.WorkPerksEnterEmailView", false, me/lyft/android/ui/enterprise/WorkPerksEnterEmailView);
    }
}
