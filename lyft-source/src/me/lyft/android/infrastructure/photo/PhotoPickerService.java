// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.photo;

import me.lyft.android.infrastructure.camera.ICaptureImage;
import rx.Observable;

// Referenced classes of package me.lyft.android.infrastructure.photo:
//            IPhotoPickerService

public class PhotoPickerService
    implements IPhotoPickerService
{

    private final ICaptureImage captureImage;

    public PhotoPickerService(ICaptureImage icaptureimage)
    {
        captureImage = icaptureimage;
    }

    public Observable observePhotoPickerResult()
    {
        return captureImage.observeCaptureResult();
    }
}
