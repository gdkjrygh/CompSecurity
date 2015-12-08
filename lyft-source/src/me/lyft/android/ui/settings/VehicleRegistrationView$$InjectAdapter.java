// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.settings:
//            VehicleRegistrationView

public final class r extends Binding
    implements MembersInjector
{

    private Binding dialogFlow;
    private Binding driverDocumentsProvider;
    private Binding imageLoader;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/settings/VehicleRegistrationView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/settings/VehicleRegistrationView, getClass().getClassLoader());
        driverDocumentsProvider = linker.requestBinding("me.lyft.android.application.driverdocuments.IDriverDocumentsProvider", me/lyft/android/ui/settings/VehicleRegistrationView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(imageLoader);
        set1.add(dialogFlow);
        set1.add(driverDocumentsProvider);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((VehicleRegistrationView)obj);
    }

    public void injectMembers(VehicleRegistrationView vehicleregistrationview)
    {
        vehicleregistrationview.imageLoader = (ImageLoader)imageLoader.get();
        vehicleregistrationview.dialogFlow = (DialogFlow)dialogFlow.get();
        vehicleregistrationview.driverDocumentsProvider = (IDriverDocumentsProvider)driverDocumentsProvider.get();
    }

    public r()
    {
        super(null, "members/me.lyft.android.ui.settings.VehicleRegistrationView", false, me/lyft/android/ui/settings/VehicleRegistrationView);
    }
}
