// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import android.hardware.Camera;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture:
//            CameraManagerImpl

final class val.callback
    implements android.hardware.back
{

    final CameraManagerImpl this$0;
    final android.hardware.back val$callback;

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        if (val$callback != null)
        {
            val$callback.onAutoFocus(flag, camera);
        }
        CameraManagerImpl.access$100(CameraManagerImpl.this, false);
    }

    ()
    {
        this$0 = final_cameramanagerimpl;
        val$callback = android.hardware.back.this;
        super();
    }
}
