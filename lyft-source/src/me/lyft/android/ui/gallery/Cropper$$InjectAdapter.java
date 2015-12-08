// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.gallery;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.ui.gallery:
//            Cropper

public final class eSession extends Binding
    implements MembersInjector
{

    private Binding captureImageSession;
    private Binding imageLoader;

    public void attach(Linker linker)
    {
        captureImageSession = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImageSession", me/lyft/android/ui/gallery/Cropper, getClass().getClassLoader());
        imageLoader = linker.requestBinding("me.lyft.android.managers.ImageLoader", me/lyft/android/ui/gallery/Cropper, getClass().getClassLoader());
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(captureImageSession);
        set1.add(imageLoader);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((Cropper)obj);
    }

    public void injectMembers(Cropper cropper)
    {
        cropper.captureImageSession = (ICaptureImageSession)captureImageSession.get();
        cropper.imageLoader = (ImageLoader)imageLoader.get();
    }

    public eSession()
    {
        super(null, "members/me.lyft.android.ui.gallery.Cropper", false, me/lyft/android/ui/gallery/Cropper);
    }
}
