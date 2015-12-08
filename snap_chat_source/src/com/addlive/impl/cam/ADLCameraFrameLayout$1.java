// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCameraFrameLayout

class 
    implements Runnable
{

    int deviceOrient;
    long now;
    int orient;
    final ADLCameraFrameLayout this$0;
    WindowManager wm;

    public void run()
    {
        ADLCameraFrameLayout.access$200(ADLCameraFrameLayout.this).drawFrame(orient, deviceOrient, now);
    }

    ternalRenderer()
    {
        this$0 = ADLCameraFrameLayout.this;
        super();
        orient = ADLCameraFrameLayout.access$000(ADLCameraFrameLayout.this).getOrientation();
        now = System.currentTimeMillis();
        wm = (WindowManager)ADLCameraFrameLayout.access$100(ADLCameraFrameLayout.this).getSystemService("window");
        deviceOrient = wm.getDefaultDisplay().getRotation();
    }
}
