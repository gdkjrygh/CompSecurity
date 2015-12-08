// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import dagger.internal.ModuleAdapter;

// Referenced classes of package me.lyft.android.ui.camera:
//            CameraModule

public final class INCLUDES extends ModuleAdapter
{

    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = {
        "members/me.lyft.android.ui.camera.CaptureView", "members/me.lyft.android.ui.camera.CaptureResultView", "members/me.lyft.android.ui.landing.CaptureUserPhotoView", "members/me.lyft.android.ui.photo.PhotoPickerDialogView"
    };
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public volatile Object newModule()
    {
        return newModule();
    }

    public CameraModule newModule()
    {
        return new CameraModule();
    }


    public ()
    {
        super(me/lyft/android/ui/camera/CameraModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, false);
    }
}
