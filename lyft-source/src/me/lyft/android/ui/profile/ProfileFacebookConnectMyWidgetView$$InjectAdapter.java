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
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileFacebookConnectMyWidgetView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding profileProvider;
    private Binding profileService;
    private Binding progressController;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/profile/ProfileFacebookConnectMyWidgetView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/profile/ProfileFacebookConnectMyWidgetView, getClass().getClassLoader());
        profileService = linker.requestBinding("me.lyft.android.application.profile.IProfileService", me/lyft/android/ui/profile/ProfileFacebookConnectMyWidgetView, getClass().getClassLoader());
        profileProvider = linker.requestBinding("me.lyft.android.application.profile.IProfileProvider", me/lyft/android/ui/profile/ProfileFacebookConnectMyWidgetView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/profile/ProfileFacebookConnectMyWidgetView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/profile/ProfileFacebookConnectMyWidgetView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(profileService);
        set1.add(profileProvider);
        set1.add(progressController);
        set1.add(viewErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ProfileFacebookConnectMyWidgetView)obj);
    }

    public void injectMembers(ProfileFacebookConnectMyWidgetView profilefacebookconnectmywidgetview)
    {
        profilefacebookconnectmywidgetview.appFlow = (AppFlow)appFlow.get();
        profilefacebookconnectmywidgetview.dialogFlow = (DialogFlow)dialogFlow.get();
        profilefacebookconnectmywidgetview.profileService = (IProfileService)profileService.get();
        profilefacebookconnectmywidgetview.profileProvider = (IProfileProvider)profileProvider.get();
        profilefacebookconnectmywidgetview.progressController = (IProgressController)progressController.get();
        profilefacebookconnectmywidgetview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.ProfileFacebookConnectMyWidgetView", false, me/lyft/android/ui/profile/ProfileFacebookConnectMyWidgetView);
    }
}
