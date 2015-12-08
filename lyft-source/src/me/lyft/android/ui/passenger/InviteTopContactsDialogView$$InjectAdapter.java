// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.providers.TopContactsProvider;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.passenger:
//            InviteTopContactsDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding activityController;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding imageLoader;
    private Binding lyftApi;
    private Binding progressController;
    private Binding supertype;
    private Binding topContactsProvider;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/passenger/InviteTopContactsDialogView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/passenger/InviteTopContactsDialogView, getClass().getClassLoader());
        topContactsProvider = linker.requestBinding("me.lyft.android.providers.TopContactsProvider", me/lyft/android/ui/passenger/InviteTopContactsDialogView, getClass().getClassLoader());
        lyftApi = linker.requestBinding("me.lyft.android.infrastructure.lyft.ILyftApi", me/lyft/android/ui/passenger/InviteTopContactsDialogView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/passenger/InviteTopContactsDialogView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/passenger/InviteTopContactsDialogView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/passenger/InviteTopContactsDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/passenger/InviteTopContactsDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(imageLoader);
        set1.add(topContactsProvider);
        set1.add(lyftApi);
        set1.add(constantsProvider);
        set1.add(progressController);
        set1.add(activityController);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((InviteTopContactsDialogView)obj);
    }

    public void injectMembers(InviteTopContactsDialogView invitetopcontactsdialogview)
    {
        invitetopcontactsdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        invitetopcontactsdialogview.imageLoader = (ImageLoader)imageLoader.get();
        invitetopcontactsdialogview.topContactsProvider = (TopContactsProvider)topContactsProvider.get();
        invitetopcontactsdialogview.lyftApi = (ILyftApi)lyftApi.get();
        invitetopcontactsdialogview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        invitetopcontactsdialogview.progressController = (IProgressController)progressController.get();
        invitetopcontactsdialogview.activityController = (ActivityController)activityController.get();
        supertype.injectMembers(invitetopcontactsdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.passenger.InviteTopContactsDialogView", false, me/lyft/android/ui/passenger/InviteTopContactsDialogView);
    }
}
