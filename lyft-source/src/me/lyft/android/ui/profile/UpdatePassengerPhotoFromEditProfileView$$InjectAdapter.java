// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;

// Referenced classes of package me.lyft.android.ui.profile:
//            UpdatePassengerPhotoFromEditProfileView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding profilePhotoLoader;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/profile/UpdatePassengerPhotoFromEditProfileView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/profile/UpdatePassengerPhotoFromEditProfileView, getClass().getClassLoader());
        profilePhotoLoader = linker.requestBinding("me.lyft.android.infrastructure.profile.IProfilePhotoLoader", me/lyft/android/ui/profile/UpdatePassengerPhotoFromEditProfileView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(profilePhotoLoader);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((UpdatePassengerPhotoFromEditProfileView)obj);
    }

    public void injectMembers(UpdatePassengerPhotoFromEditProfileView updatepassengerphotofromeditprofileview)
    {
        updatepassengerphotofromeditprofileview.appFlow = (AppFlow)appFlow.get();
        updatepassengerphotofromeditprofileview.dialogFlow = (DialogFlow)dialogFlow.get();
        updatepassengerphotofromeditprofileview.profilePhotoLoader = (IProfilePhotoLoader)profilePhotoLoader.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.UpdatePassengerPhotoFromEditProfileView", false, me/lyft/android/ui/profile/UpdatePassengerPhotoFromEditProfileView);
    }
}
