// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.sms.ISmsService;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksInviteCoworkersViaContactsView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding contactsProvider;
    private Binding lyftApi;
    private Binding progressController;
    private Binding sendSmsService;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/enterprise/WorkPerksInviteCoworkersViaContactsView, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/enterprise/WorkPerksInviteCoworkersViaContactsView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/enterprise/WorkPerksInviteCoworkersViaContactsView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/enterprise/WorkPerksInviteCoworkersViaContactsView, getClass().getClassLoader());
        contactsProvider = linker.requestBinding("me.lyft.android.providers.ContactsProvider", me/lyft/android/ui/enterprise/WorkPerksInviteCoworkersViaContactsView, getClass().getClassLoader());
        sendSmsService = linker.requestBinding("me.lyft.android.infrastructure.sms.ISmsService", me/lyft/android/ui/enterprise/WorkPerksInviteCoworkersViaContactsView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(lyftApi);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(contactsProvider);
        set1.add(sendSmsService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((WorkPerksInviteCoworkersViaContactsView)obj);
    }

    public void injectMembers(WorkPerksInviteCoworkersViaContactsView workperksinvitecoworkersviacontactsview)
    {
        workperksinvitecoworkersviacontactsview.appFlow = (AppFlow)appFlow.get();
        workperksinvitecoworkersviacontactsview.lyftApi = (ILyftApi)lyftApi.get();
        workperksinvitecoworkersviacontactsview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        workperksinvitecoworkersviacontactsview.progressController = (IProgressController)progressController.get();
        workperksinvitecoworkersviacontactsview.contactsProvider = (ContactsProvider)contactsProvider.get();
        workperksinvitecoworkersviacontactsview.sendSmsService = (ISmsService)sendSmsService.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.enterprise.WorkPerksInviteCoworkersViaContactsView", false, me/lyft/android/ui/enterprise/WorkPerksInviteCoworkersViaContactsView);
    }
}
