// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

public final class ssion extends Binding
    implements MembersInjector
{

    private Binding activityController;
    private Binding appForegroundDetector;
    private Binding bus;
    private Binding captureImageSession;
    private Binding device;
    private Binding dialogFlow;

    public void attach(Linker linker)
    {
        device = linker.requestBinding("me.lyft.android.infrastructure.device.IDevice", me/lyft/android/ui/camera/CaptureView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/camera/CaptureView, getClass().getClassLoader());
        appForegroundDetector = linker.requestBinding("me.lyft.android.infrastructure.foreground.IAppForegroundDetector", me/lyft/android/ui/camera/CaptureView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/camera/CaptureView, getClass().getClassLoader());
        captureImageSession = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImageSession", me/lyft/android/ui/camera/CaptureView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/camera/CaptureView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(device);
        set1.add(activityController);
        set1.add(appForegroundDetector);
        set1.add(dialogFlow);
        set1.add(captureImageSession);
        set1.add(bus);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((CaptureView)obj);
    }

    public void injectMembers(CaptureView captureview)
    {
        captureview.device = (IDevice)device.get();
        captureview.activityController = (ActivityController)activityController.get();
        captureview.appForegroundDetector = (IAppForegroundDetector)appForegroundDetector.get();
        captureview.dialogFlow = (DialogFlow)dialogFlow.get();
        captureview.captureImageSession = (ICaptureImageSession)captureImageSession.get();
        captureview.bus = (MessageBus)bus.get();
    }

    public ssion()
    {
        super(null, "members/me.lyft.android.ui.camera.CaptureView", false, me/lyft/android/ui/camera/CaptureView);
    }
}
