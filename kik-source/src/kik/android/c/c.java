// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.c;

import android.hardware.Camera;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.kik.sdkutils.y;

// Referenced classes of package kik.android.c:
//            b, d

public class c extends b
    implements android.view.SurfaceHolder.Callback
{

    boolean e;
    private final SurfaceView f;
    private Camera g;
    private final Handler h;
    private Runnable i;

    public c(SurfaceView surfaceview, Handler handler, b.c c1)
    {
        e = false;
        i = new d(this);
        f = surfaceview;
        f.getHolder().addCallback(this);
        h = handler;
        b = c1;
    }

    static Camera a(c c1)
    {
        return c1.g;
    }

    static SurfaceView b(c c1)
    {
        return c1.f;
    }

    public final void a(Camera camera)
    {
        super.a(camera);
        g = camera;
        h.removeCallbacks(i);
        h.postDelayed(i, 100L);
    }

    public final boolean a()
    {
        return e;
    }

    public final void b()
    {
        g = null;
    }

    public final Camera c()
    {
        return g;
    }

    public final Surface d()
    {
        if (f != null && f.getHolder() != null)
        {
            return f.getHolder().getSurface();
        } else
        {
            return null;
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int j, int k, int l)
    {
        a(g);
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        e = true;
        a(g);
        if (y.a(14))
        {
            f.setOnTouchListener(a);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        e = false;
        if (b != null)
        {
            b.a();
        }
    }
}
