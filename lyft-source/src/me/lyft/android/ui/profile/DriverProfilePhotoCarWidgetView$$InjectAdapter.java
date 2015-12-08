// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.profile:
//            DriverProfilePhotoCarWidgetView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding imageLoader;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/profile/DriverProfilePhotoCarWidgetView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/profile/DriverProfilePhotoCarWidgetView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(imageLoader);
        set1.add(appFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverProfilePhotoCarWidgetView)obj);
    }

    public void injectMembers(DriverProfilePhotoCarWidgetView driverprofilephotocarwidgetview)
    {
        driverprofilephotocarwidgetview.imageLoader = (ImageLoader)imageLoader.get();
        driverprofilephotocarwidgetview.appFlow = (AppFlow)appFlow.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.profile.DriverProfilePhotoCarWidgetView", false, me/lyft/android/ui/profile/DriverProfilePhotoCarWidgetView);
    }
}
