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
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerProfilePhotoWidgetView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding imageLoader;
    private Binding profilePhotoLoader;
    private Binding profileService;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/profile/PassengerProfilePhotoWidgetView, getClass().getClassLoader());
        profilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.IProfilePhotoLoader", me/lyft/android/ui/profile/PassengerProfilePhotoWidgetView, getClass().getClassLoader());
        profileService = linker.requestBinding("me.lyft.android.application.profile.IProfileService", me/lyft/android/ui/profile/PassengerProfilePhotoWidgetView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/profile/PassengerProfilePhotoWidgetView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(imageLoader);
        set1.add(profilePhotoLoader);
        set1.add(profileService);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PassengerProfilePhotoWidgetView)obj);
    }

    public void injectMembers(PassengerProfilePhotoWidgetView passengerprofilephotowidgetview)
    {
        passengerprofilephotowidgetview.imageLoader = (ImageLoader)imageLoader.get();
        passengerprofilephotowidgetview.profilePhotoLoader = (IProfilePhotoLoader)profilePhotoLoader.get();
        passengerprofilephotowidgetview.profileService = (IProfileService)profileService.get();
        passengerprofilephotowidgetview.appFlow = (AppFlow)appFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.PassengerProfilePhotoWidgetView", false, me/lyft/android/ui/profile/PassengerProfilePhotoWidgetView);
    }
}
