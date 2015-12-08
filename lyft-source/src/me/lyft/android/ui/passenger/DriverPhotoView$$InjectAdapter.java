// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.passenger:
//            DriverPhotoView

public final class A extends Binding
    implements MembersInjector
{

    private Binding imageLoader;
    private Binding profileFlow;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/passenger/DriverPhotoView, getClass().getClassLoader());
        profileFlow = linker.requestBinding("me.lyft.android.flows.ProfileFlow", me/lyft/android/ui/passenger/DriverPhotoView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(imageLoader);
        set1.add(profileFlow);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((DriverPhotoView)obj);
    }

    public void injectMembers(DriverPhotoView driverphotoview)
    {
        driverphotoview.imageLoader = (ImageLoader)imageLoader.get();
        driverphotoview.profileFlow = (ProfileFlow)profileFlow.get();
    }

    public A()
    {
        super(null, "members/me.lyft.android.ui.passenger.DriverPhotoView", false, me/lyft/android/ui/passenger/DriverPhotoView);
    }
}
