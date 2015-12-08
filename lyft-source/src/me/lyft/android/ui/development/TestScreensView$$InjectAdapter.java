// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.camera.ICaptureImage;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.development:
//            TestScreensView

public final class  extends Binding
    implements MembersInjector
{

    private Binding appFlow;
    private Binding captureImage;
    private Binding dialogFlow;
    private Binding imageLoader;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/development/TestScreensView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/development/TestScreensView, getClass().getClassLoader());
        captureImage = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImage", me/lyft/android/ui/development/TestScreensView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/development/TestScreensView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(dialogFlow);
        set1.add(captureImage);
        set1.add(imageLoader);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((TestScreensView)obj);
    }

    public void injectMembers(TestScreensView testscreensview)
    {
        testscreensview.appFlow = (AppFlow)appFlow.get();
        testscreensview.dialogFlow = (DialogFlow)dialogFlow.get();
        testscreensview.captureImage = (ICaptureImage)captureImage.get();
        testscreensview.imageLoader = (ImageLoader)imageLoader.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.development.TestScreensView", false, me/lyft/android/ui/development/TestScreensView);
    }
}
