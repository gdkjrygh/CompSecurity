// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;

import android.view.ViewPropertyAnimator;
import com.snapchat.android.camera.cameraview.CameraView;
import com.snapchat.android.camera.model.CameraModel;

// Referenced classes of package com.snapchat.android.camera:
//            CameraFragment

final class a
    implements Runnable
{

    private CameraFragment a;

    public final void run()
    {
        if (!a.i.b() && a.b != null && a.b.getAlpha() == 0.0F)
        {
            a.b.animate().alpha(1.0F).setDuration(100L).start();
        }
    }

    View(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }
}
