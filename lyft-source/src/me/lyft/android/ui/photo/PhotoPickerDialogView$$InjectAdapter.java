// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.photo;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.camera.ICaptureImage;
import me.lyft.android.infrastructure.gallery.IGalleryService;
import me.lyft.android.rx.MessageBus;

// Referenced classes of package me.lyft.android.ui.photo:
//            PhotoPickerDialogView

public final class  extends Binding
    implements MembersInjector
{

    private Binding bus;
    private Binding captureImage;
    private Binding dialogFlow;
    private Binding galleryService;
    private Binding supertype;

    public void attach(Linker linker)
    {
        captureImage = linker.requestBinding("me.lyft.android.infrastructure.camera.ICaptureImage", me/lyft/android/ui/photo/PhotoPickerDialogView, getClass().getClassLoader());
        galleryService = linker.requestBinding("me.lyft.android.infrastructure.gallery.IGalleryService", me/lyft/android/ui/photo/PhotoPickerDialogView, getClass().getClassLoader());
        dialogFlow = linker.requestBinding("me.lyft.android.common.DialogFlow", me/lyft/android/ui/photo/PhotoPickerDialogView, getClass().getClassLoader());
        bus = linker.requestBinding("me.lyft.android.rx.MessageBus", me/lyft/android/ui/photo/PhotoPickerDialogView, getClass().getClassLoader());
        supertype = linker.requestBinding("members/me.lyft.android.ui.dialogs.DialogContainerView", me/lyft/android/ui/photo/PhotoPickerDialogView, getClass().getClassLoader(), false, true);
    }

    public void getDependencies(Set set, Set set1)
    {
        set1.add(captureImage);
        set1.add(galleryService);
        set1.add(dialogFlow);
        set1.add(bus);
        set1.add(supertype);
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PhotoPickerDialogView)obj);
    }

    public void injectMembers(PhotoPickerDialogView photopickerdialogview)
    {
        photopickerdialogview.captureImage = (ICaptureImage)captureImage.get();
        photopickerdialogview.galleryService = (IGalleryService)galleryService.get();
        photopickerdialogview.dialogFlow = (DialogFlow)dialogFlow.get();
        photopickerdialogview.bus = (MessageBus)bus.get();
        supertype.injectMembers(photopickerdialogview);
    }

    public ()
    {
        super(null, "members/me.lyft.android.ui.photo.PhotoPickerDialogView", false, me/lyft/android/ui/photo/PhotoPickerDialogView);
    }
}
