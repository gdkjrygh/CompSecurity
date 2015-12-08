// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.hardware.Camera;

// Referenced classes of package com.skype.android.media:
//            CameraView, CameraCallback

private final class a
    implements android.hardware.eCallback
{

    k.PictureType a;
    final CameraView b;

    public final void onPictureTaken(byte abyte0[], Camera camera)
    {
        if (CameraView.access$500(b) != null)
        {
            CameraView.access$500(b).onPictureTaken(a, abyte0);
        }
        if (a == k.PictureType.c)
        {
            camera.startPreview();
        }
    }

    k.PictureType(CameraView cameraview, k.PictureType picturetype)
    {
        b = cameraview;
        super();
        a = picturetype;
    }
}
