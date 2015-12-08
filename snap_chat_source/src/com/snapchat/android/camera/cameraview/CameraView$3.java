// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.cameraview;

import android.view.SurfaceHolder;
import com.snapchat.android.Timber;
import qF;

// Referenced classes of package com.snapchat.android.camera.cameraview:
//            CameraView

public final class a
    implements android.view..Callback
{

    private qF a;

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        Timber.c("CameraView", "Surface Changed to [%d x %d]", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k)
        });
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        a.a(surfaceholder.getSurface());
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        Timber.c("CameraView", "Surface Destroyed", new Object[0]);
    }

    public _cls9(qF qf)
    {
        a = qf;
        super();
    }
}
