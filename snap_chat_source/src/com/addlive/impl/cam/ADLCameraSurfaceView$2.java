// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.hardware.Camera;
import com.addlive.impl.Log;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCameraSurfaceView

class this._cls0
    implements 
{

    final ADLCameraSurfaceView this$0;

    public void workOnCam(Camera camera)
    {
        Log.i("AddLive_SDK_SCam", "Setting preview display");
        camera.setPreviewDisplay(ADLCameraSurfaceView.access$000(ADLCameraSurfaceView.this));
        camera.startPreview();
    }

    ()
    {
        this$0 = ADLCameraSurfaceView.this;
        super();
    }
}
