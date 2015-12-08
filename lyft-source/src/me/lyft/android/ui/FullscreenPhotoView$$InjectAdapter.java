// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.AppFlow;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui:
//            FullscreenPhotoView

public final class  extends Binding
    implements MembersInjector
{

    private Binding activityController;
    private Binding appFlow;
    private Binding imageLoader;

    public void attach(Linker linker)
    {
        appFlow = linker.requestBinding("me.lyft.android.common.AppFlow", me/lyft/android/ui/FullscreenPhotoView, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/FullscreenPhotoView, getClass().getClassLoader());
        activityController = linker.requestBinding("me.lyft.android.common.ActivityController", me/lyft/android/ui/FullscreenPhotoView, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(appFlow);
        set1.add(imageLoader);
        set1.add(activityController);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((FullscreenPhotoView)obj);
    }

    public void injectMembers(FullscreenPhotoView fullscreenphotoview)
    {
        fullscreenphotoview.appFlow = (AppFlow)appFlow.get();
        fullscreenphotoview.imageLoader = (ImageLoader)imageLoader.get();
        fullscreenphotoview.activityController = (ActivityController)activityController.get();
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.FullscreenPhotoView", false, me/lyft/android/ui/FullscreenPhotoView);
    }
}
