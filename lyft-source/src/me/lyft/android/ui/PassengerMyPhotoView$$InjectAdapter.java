// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;

// Referenced classes of package me.lyft.android.ui:
//            PassengerMyPhotoView

public final class vider extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding passengerRideProvider;
    private Binding photoPickerService;
    private Binding profileFlow;
    private Binding profilePhotoLoader;
    private Binding profileService;
    private Binding supertype;

    public void attach(Linker linker)
    {
        photoPickerService = linker.requestBinding("me.lyft.android.infrastructure.photo.IPhotoPickerService", me/lyft/android/ui/PassengerMyPhotoView, getClass().getClassLoader());
        profileService = linker.requestBinding("me.lyft.android.application.profile.IProfileService", me/lyft/android/ui/PassengerMyPhotoView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/PassengerMyPhotoView, getClass().getClassLoader());
        profileFlow = linker.requestBinding("me.lyft.android.flows.ProfileFlow", me/lyft/android/ui/PassengerMyPhotoView, getClass().getClassLoader());
        profilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.IProfilePhotoLoader", me/lyft/android/ui/PassengerMyPhotoView, getClass().getClassLoader());
        passengerRideProvider = linker.requestBinding("me.lyft.android.application.passenger.IPassengerRideProvider", me/lyft/android/ui/PassengerMyPhotoView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.PassengerPhotoView", me/lyft/android/ui/PassengerMyPhotoView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(photoPickerService);
        set1.add(profileService);
        set1.add(dialogFlow);
        set1.add(profileFlow);
        set1.add(profilePhotoLoader);
        set1.add(passengerRideProvider);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerMyPhotoView)obj);
    }

    public void injectMembers(PassengerMyPhotoView passengermyphotoview)
    {
        passengermyphotoview.photoPickerService = (IPhotoPickerService)photoPickerService.get();
        passengermyphotoview.profileService = (IProfileService)profileService.get();
        passengermyphotoview.dialogFlow = (DialogFlow)dialogFlow.get();
        passengermyphotoview.profileFlow = (ProfileFlow)profileFlow.get();
        passengermyphotoview.profilePhotoLoader = (IProfilePhotoLoader)profilePhotoLoader.get();
        passengermyphotoview.passengerRideProvider = (IPassengerRideProvider)passengerRideProvider.get();
        supertype.injectMembers(passengermyphotoview);
    }

    public vider()
    {
        super(null, "members/me.lyft.android.ui.PassengerMyPhotoView", false, me/lyft/android/ui/PassengerMyPhotoView);
    }
}
