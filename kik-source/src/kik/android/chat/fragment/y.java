// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import kik.android.c.c;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class y extends c
{

    final CameraFragment f;

    y(CameraFragment camerafragment, SurfaceView surfaceview, Handler handler, kik.android.c.b.c c1)
    {
        f = camerafragment;
        super(surfaceview, handler, c1);
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        a(CameraFragment.q(f));
        super.surfaceCreated(surfaceholder);
    }
}
