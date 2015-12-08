// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileFacebookConnectRideWidgetView

public final class  extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding profileProvider;
    private Binding profileService;
    private Binding progressController;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/profile/ProfileFacebookConnectRideWidgetView, getClass().getClassLoader());
        profileService = linker.requestBinding("me.lyft.android.application.profile.IProfileService", me/lyft/android/ui/profile/ProfileFacebookConnectRideWidgetView, getClass().getClassLoader());
        profileProvider = linker.requestBinding("me.lyft.android.application.profile.IProfileProvider", me/lyft/android/ui/profile/ProfileFacebookConnectRideWidgetView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/profile/ProfileFacebookConnectRideWidgetView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/profile/ProfileFacebookConnectRideWidgetView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(dialogFlow);
        set1.add(profileService);
        set1.add(profileProvider);
        set1.add(progressController);
        set1.add(viewErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ProfileFacebookConnectRideWidgetView)obj);
    }

    public void injectMembers(ProfileFacebookConnectRideWidgetView profilefacebookconnectridewidgetview)
    {
        profilefacebookconnectridewidgetview.dialogFlow = (DialogFlow)dialogFlow.get();
        profilefacebookconnectridewidgetview.profileService = (IProfileService)profileService.get();
        profilefacebookconnectridewidgetview.profileProvider = (IProfileProvider)profileProvider.get();
        profilefacebookconnectridewidgetview.progressController = (IProgressController)progressController.get();
        profilefacebookconnectridewidgetview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.ProfileFacebookConnectRideWidgetView", false, me/lyft/android/ui/profile/ProfileFacebookConnectRideWidgetView);
    }
}
