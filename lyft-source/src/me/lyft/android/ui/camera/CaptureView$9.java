// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.hardware.Camera;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

class this._cls0
    implements android.hardware.usCallback
{

    final CaptureView this$0;

    public void onAutoFocus(boolean flag, Camera camera)
    {
        if (CaptureView.access$600(CaptureView.this) == 2)
        {
            CaptureView.access$800(CaptureView.this);
        }
        CaptureView.access$602(CaptureView.this, 3);
    }

    k()
    {
        this$0 = CaptureView.this;
        super();
    }
}
