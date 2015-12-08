// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.settings:
//            PersonalInsuranceView

public final class der extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding dialogFlow;
    private Binding driverDocumentsProvider;
    private Binding imageLoader;
    private Binding lyftPreferences;
    private Binding photoPickerService;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/settings/PersonalInsuranceView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/settings/PersonalInsuranceView, getClass().getClassLoader());
        lyftPreferences = linker.requestBinding("me.lyft.android.ILyftPreferences", me/lyft/android/ui/settings/PersonalInsuranceView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/settings/PersonalInsuranceView, getClass().getClassLoader());
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/settings/PersonalInsuranceView, getClass().getClassLoader());
        photoPickerService = linker.requestBinding("me.lyft.android.infrastructure.photo.IPhotoPickerService", me/lyft/android/ui/settings/PersonalInsuranceView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(lyftPreferences);
        set1.add(imageLoader);
        set1.add(driverDocumentsProvider);
        set1.add(photoPickerService);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PersonalInsuranceView)obj);
    }

    public void injectMembers(PersonalInsuranceView personalinsuranceview)
    {
        personalinsuranceview.appFlow = (AppFlow)appFlow.get();
        personalinsuranceview.dialogFlow = (DialogFlow)dialogFlow.get();
        personalinsuranceview.lyftPreferences = (ILyftPreferences)lyftPreferences.get();
        personalinsuranceview.imageLoader = (ImageLoader)imageLoader.get();
        personalinsuranceview.driverDocumentsProvider = (IDriverDocumentsProvider)driverDocumentsProvider.get();
        personalinsuranceview.photoPickerService = (IPhotoPickerService)photoPickerService.get();
    }

    public der()
    {
        super(null, "members/me.lyft.android.ui.settings.PersonalInsuranceView", false, me/lyft/android/ui/settings/PersonalInsuranceView);
    }
}
