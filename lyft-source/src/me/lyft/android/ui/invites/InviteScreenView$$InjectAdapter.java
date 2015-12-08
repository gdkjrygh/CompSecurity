// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.IUserSession;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.providers.ContactsProvider;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

public final class  extends Binding
    implements MembersInjector
{

    private Binding activityController;
    private Binding bus;
    private Binding constantsProvider;
    private Binding contactsProvider;
    private Binding device;
    private Binding dialogFlow;
    private Binding lyftApi;
    private Binding progressController;
    private Binding slideMenuController;
    private Binding userSession;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        contactsProvider = linker.requestBinding("me.lyft.android.providers.ContactsProvider", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        userSession = linker.requestBinding("me.lyft.android.IUserSession", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        slideMenuController = linker.requestBinding("me.lyft.android.ui.SlideMenuController", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/invites/InviteScreenView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(contactsProvider);
        set1.add(userSession);
        set1.add(constantsProvider);
        set1.add(lyftApi);
        set1.add(slideMenuController);
        set1.add(viewErrorHandler);
        set1.add(progressController);
        set1.add(device);
        set1.add(dialogFlow);
        set1.add(activityController);
        set1.add(bus);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((InviteScreenView)obj);
    }

    public void injectMembers(InviteScreenView invitescreenview)
    {
        invitescreenview.contactsProvider = (ContactsProvider)contactsProvider.get();
        invitescreenview.userSession = (IUserSession)userSession.get();
        invitescreenview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        invitescreenview.lyftApi = (ILyftApi)lyftApi.get();
        invitescreenview.slideMenuController = (SlideMenuController)slideMenuController.get();
        invitescreenview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        invitescreenview.progressController = (IProgressController)progressController.get();
        invitescreenview.device = (IDevice)device.get();
        invitescreenview.dialogFlow = (DialogFlow)dialogFlow.get();
        invitescreenview.activityController = (ActivityController)activityController.get();
        invitescreenview.bus = (MessageBus)bus.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.invites.InviteScreenView", false, me/lyft/android/ui/invites/InviteScreenView);
    }
}
