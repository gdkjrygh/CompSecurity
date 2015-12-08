// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.profile:
//            EditProfileView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding constantsProvider;
    private Binding dialogFlow;
    private Binding photoPickerService;
    private Binding profilePhotoLoader;
    private Binding profileProvider;
    private Binding profileService;
    private Binding progressController;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
        constantsProvider = linker.requestBinding("me.lyft.android.application.IConstantsProvider", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
        photoPickerService = linker.requestBinding("me.lyft.android.infrastructure.photo.IPhotoPickerService", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
        profileService = linker.requestBinding("me.lyft.android.application.profile.IProfileService", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
        profileProvider = linker.requestBinding("me.lyft.android.application.profile.IProfileProvider", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
        profilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.IProfilePhotoLoader", me/lyft/android/ui/profile/EditProfileView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(constantsProvider);
        set1.add(progressController);
        set1.add(photoPickerService);
        set1.add(profileService);
        set1.add(profileProvider);
        set1.add(viewErrorHandler);
        set1.add(profilePhotoLoader);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((EditProfileView)obj);
    }

    public void injectMembers(EditProfileView editprofileview)
    {
        editprofileview.appFlow = (AppFlow)appFlow.get();
        editprofileview.dialogFlow = (DialogFlow)dialogFlow.get();
        editprofileview.constantsProvider = (IConstantsProvider)constantsProvider.get();
        editprofileview.progressController = (IProgressController)progressController.get();
        editprofileview.photoPickerService = (IPhotoPickerService)photoPickerService.get();
        editprofileview.profileService = (IProfileService)profileService.get();
        editprofileview.profileProvider = (IProfileProvider)profileProvider.get();
        editprofileview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
        editprofileview.profilePhotoLoader = (IProfilePhotoLoader)profilePhotoLoader.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.EditProfileView", false, me/lyft/android/ui/profile/EditProfileView);
    }
}
