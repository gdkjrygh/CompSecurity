// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.camera;

import android.content.Context;
import android.view.OrientationEventListener;
import me.lyft.android.infrastructure.device.IDevice;

// Referenced classes of package me.lyft.android.ui.camera:
//            CaptureView

class this._cls0 extends OrientationEventListener
{

    final CaptureView this$0;

    public void onOrientationChanged(int i)
    {
        if (i != -1)
        {
            if (CaptureView.access$1400(CaptureView.this, i, CaptureView.access$1300(CaptureView.this)))
            {
                CaptureView.access$1302(CaptureView.this, CaptureView.access$1500(i));
                CaptureView.access$1700(CaptureView.this, CaptureView.access$1600(CaptureView.this, CaptureView.access$1300(CaptureView.this)));
            }
            if (device.getDisplayRotation() != CaptureView.access$1800(CaptureView.this))
            {
                CaptureView.access$1900(CaptureView.this);
                return;
            }
        }
    }

    public (Context context)
    {
        this$0 = CaptureView.this;
        super(context);
    }
}
