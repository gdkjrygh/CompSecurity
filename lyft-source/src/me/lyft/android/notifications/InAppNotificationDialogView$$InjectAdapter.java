// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.managers.DeepLinkManager;

// Referenced classes of package me.lyft.android.notifications:
//            InAppNotificationDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding constantsProvider;
    private Binding deepLinkManager;
    private Binding dialogFlow;
    private Binding inAppNotificationService;
    private Binding supertype;

    public void attach(Linker linker)
    {
        inAppNotificationService = linker.requestBinding("me.lyft.android.infrastructure.notifications.InAppNotificationService", me/lyft/android/notifications/InAppNotificationDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/notifications/InAppNotificationDialogView, getClass().getClassLoader());
        deepLinkManager = linker.requestBinding("me.lyft.android.managers.DeepLinkManager", me/lyft/android/notifications/InAppNotificationDialogView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/notifications/InAppNotificationDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/notifications/InAppNotificationDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(inAppNotificationService);
        set1.add(dialogFlow);
        set1.add(deepLinkManager);
        set1.add(constantsProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((InAppNotificationDialogView)obj);
    }

    public void injectMembers(InAppNotificationDialogView inappnotificationdialogview)
    {
        inappnotificationdialogview.inAppNotificationService = (InAppNotificationService)inAppNotificationService.get();
        inappnotificationdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        inappnotificationdialogview.deepLinkManager = (DeepLinkManager)deepLinkManager.get();
        inappnotificationdialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        supertype.injectMembers(inappnotificationdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.notifications.InAppNotificationDialogView", false, me/lyft/android/notifications/InAppNotificationDialogView);
    }
}
