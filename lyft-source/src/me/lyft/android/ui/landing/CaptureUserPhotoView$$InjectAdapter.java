// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.landing:
//            CaptureUserPhotoView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/landing/CaptureUserPhotoView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/landing/CaptureUserPhotoView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(bus);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CaptureUserPhotoView)obj);
    }

    public void injectMembers(CaptureUserPhotoView captureuserphotoview)
    {
        captureuserphotoview.appFlow = (AppFlow)appFlow.get();
        captureuserphotoview.bus = (MessageBus)bus.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.landing.CaptureUserPhotoView", false, me/lyft/android/ui/landing/CaptureUserPhotoView);
    }
}
