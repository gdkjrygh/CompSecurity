// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.hardware.Camera;

// Referenced classes of package com.skype.android.media:
//            CameraView, CameraCallback

final class a
    implements android.hardware.cusCallback
{

    final CameraView a;

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        if (flag)
        {
            camera.cancelAutoFocus();
        }
        CameraView.access$402(a, false);
        if (CameraView.access$500(a) != null)
        {
            CameraView.access$500(a).onFocusEnd(flag);
        }
    }

    k(CameraView cameraview)
    {
        a = cameraview;
        super();
    }
}
