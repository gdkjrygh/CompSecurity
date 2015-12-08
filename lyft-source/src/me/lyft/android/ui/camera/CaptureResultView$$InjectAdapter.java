// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureResultView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding bus;
    private Binding captureImageSession;
    private Binding imageLoader;

    public void attach(Linker linker)
    {
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/camera/CaptureResultView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/camera/CaptureResultView, getClass().getClassLoader());
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/camera/CaptureResultView, getClass().getClassLoader());
        captureImageSession = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImageSession", me/lyft/android/ui/camera/CaptureResultView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(imageLoader);
        set1.add(bus);
        set1.add(appFlow);
        set1.add(captureImageSession);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CaptureResultView)obj);
    }

    public void injectMembers(CaptureResultView captureresultview)
    {
        captureresultview.imageLoader = (ImageLoader)imageLoader.get();
        captureresultview.bus = (MessageBus)bus.get();
        captureresultview.appFlow = (AppFlow)appFlow.get();
        captureresultview.captureImageSession = (ICaptureImageSession)captureImageSession.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.camera.CaptureResultView", false, me/lyft/android/ui/camera/CaptureResultView);
    }
}
