// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import android.view.SurfaceHolder;
import android.view.SurfaceView;

// Referenced classes of package com.android.slyce.i:
//            s, r

public class q
    implements android.view.SurfaceHolder.Callback
{

    private SurfaceView a;
    private r b;
    private SurfaceHolder c;

    protected q(SurfaceView surfaceview, r r1)
    {
        a = surfaceview;
        b = r1;
        surfaceview.setVisibility(4);
        c = surfaceview.getHolder();
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            c.setType(3);
        }
    }

    protected void a()
    {
        c.addCallback(this);
        a.setVisibility(0);
    }

    protected void b()
    {
        a.setVisibility(4);
        c.removeCallback(this);
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        b.a(surfaceholder, new s(j, k));
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }
}
