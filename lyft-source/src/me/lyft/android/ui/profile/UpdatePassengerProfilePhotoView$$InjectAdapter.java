// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.profile:
//            UpdatePassengerProfilePhotoView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding photoPickerService;
    private Binding profilePhotoLoader;
    private Binding profileService;
    private Binding progressController;
    private Binding viewErrorHandler;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/profile/UpdatePassengerProfilePhotoView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/profile/UpdatePassengerProfilePhotoView, getClass().getClassLoader());
        profilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.IProfilePhotoLoader", me/lyft/android/ui/profile/UpdatePassengerProfilePhotoView, getClass().getClassLoader());
        progressController = linker.requestBinding("me.lyft.android.ui.IProgressController", me/lyft/android/ui/profile/UpdatePassengerProfilePhotoView, getClass().getClassLoader());
        profileService = linker.requestBinding("me.lyft.android.application.profile.IProfileService", me/lyft/android/ui/profile/UpdatePassengerProfilePhotoView, getClass().getClassLoader());
        photoPickerService = linker.requestBinding("me.lyft.android.infrastructure.photo.IPhotoPickerService", me/lyft/android/ui/profile/UpdatePassengerProfilePhotoView, getClass().getClassLoader());
        viewErrorHandler = linker.requestBinding("me.lyft.android.ui.IViewErrorHandler", me/lyft/android/ui/profile/UpdatePassengerProfilePhotoView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(profilePhotoLoader);
        set1.add(progressController);
        set1.add(profileService);
        set1.add(photoPickerService);
        set1.add(viewErrorHandler);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdatePassengerProfilePhotoView)obj);
    }

    public void injectMembers(UpdatePassengerProfilePhotoView updatepassengerprofilephotoview)
    {
        updatepassengerprofilephotoview.appFlow = (AppFlow)appFlow.get();
        updatepassengerprofilephotoview.dialogFlow = (DialogFlow)dialogFlow.get();
        updatepassengerprofilephotoview.profilePhotoLoader = (IProfilePhotoLoader)profilePhotoLoader.get();
        updatepassengerprofilephotoview.progressController = (IProgressController)progressController.get();
        updatepassengerprofilephotoview.profileService = (IProfileService)profileService.get();
        updatepassengerprofilephotoview.photoPickerService = (IPhotoPickerService)photoPickerService.get();
        updatepassengerprofilephotoview.viewErrorHandler = (IViewErrorHandler)viewErrorHandler.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.UpdatePassengerProfilePhotoView", false, me/lyft/android/ui/profile/UpdatePassengerProfilePhotoView);
    }
}
