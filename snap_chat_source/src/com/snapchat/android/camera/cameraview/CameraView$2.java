// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.cameraview;

import android.widget.FrameLayout;

// Referenced classes of package com.snapchat.android.camera.cameraview:
//            CameraView

final class a
    implements Runnable
{

    private CameraView a;

    public final void run()
    {
        CameraView.b(a).removeView(a.b);
        a.b = null;
    }

    _cls9(CameraView cameraview)
    {
        a = cameraview;
        super();
    }
}
