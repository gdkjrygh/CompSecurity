// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.gl.GLCameraPreview;
import com.google.android.apps.unveil.nonstop.DebugView;
import com.google.android.apps.unveil.nonstop.f;
import com.google.android.apps.unveil.nonstop.k;
import com.google.android.apps.unveil.sensors.CameraManager;
import com.google.android.apps.unveil.sensors.l;
import com.google.android.apps.unveil.ui.CameraWrappingLayout;
import com.google.android.apps.unveil.ui.GlOverlay;
import com.google.android.apps.unveil.ui.b;
import com.google.android.apps.unveil.ui.c;

// Referenced classes of package com.google.android.apps.unveil:
//            d

public abstract class PreviewLoopingActivity extends Activity
    implements l, b
{

    private static final af a = new af();
    private CameraWrappingLayout b;
    public CameraManager c;
    public f d;
    DebugView e;
    public GLCameraPreview f;
    private GlOverlay g;
    private Size h;
    private boolean i;
    private boolean j;
    private boolean k;

    public PreviewLoopingActivity()
    {
        i = false;
    }

    private int h()
    {
        switch (getRequestedOrientation())
        {
        default:
            int i1 = getRequestedOrientation();
            throw new RuntimeException((new StringBuilder(34)).append("Unhandled orientation: ").append(i1).toString());

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 90;
        }
    }

    private void i()
    {
        a.b("onResumeInternal()", new Object[0]);
        c.b();
        if (g != null)
        {
            g.onResume();
        }
        k = true;
        b.requestLayout();
    }

    protected void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        boolean flag = d.a;
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        d.b();
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(int i1)
    {
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(i1);
        e = (DebugView)findViewById(d.nonstop_debug_view);
        e.setVisibility(8);
        c = (CameraManager)findViewById(d.camera_preview);
        c.a(this);
        f = (GLCameraPreview)findViewById(d.gl_camera_preview_overlay);
        b = (CameraWrappingLayout)findViewById(d.camera_wrapper_layout);
        b.setCameraManager(c);
        b.setCameraLayoutHandler(this);
        b.setRotation(h());
        b.setMirrored(c.getMirrored());
        g = (GlOverlay)findViewById(d.gl_overlay);
        if (g != null)
        {
            g.setZOrderMediaOverlay(true);
        }
        j = true;
    }

    protected void a(Matrix matrix)
    {
        if (d != null)
        {
            return;
        } else
        {
            a.b("Initializing PreviewLooper.", new Object[0]);
            d = new f(c, h(), 2, matrix);
            d.a(new k(c, e, g), 0);
            a(d);
            e.setCallback(d);
            return;
        }
    }

    public final void a(Size size, Matrix matrix)
    {
        if (k)
        {
            h = size;
            if (j)
            {
                c.c();
                a(matrix);
                b();
                j = false;
                return;
            }
        }
    }

    protected abstract void a(f f1);

    public final void a(c c1)
    {
        if (g != null)
        {
            g.a(c1);
        }
    }

    public final void a(String s)
    {
        af af1 = a;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Failed to acquire camera: ".concat(s);
        } else
        {
            s = new String("Failed to acquire camera: ");
        }
        af1.e(s, new Object[0]);
    }

    protected void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        boolean flag = d.a;
        if (!flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        d.a(h);
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        a.b("Camera connected, requesting final layout before starting preview.", new Object[0]);
        b.requestLayout();
    }

    public final void d()
    {
        a.e("Failed to apply camera flash setting.", new Object[0]);
    }

    public final void e()
    {
        a.e("Failed to apply camera quality settings.", new Object[0]);
    }

    public final void f()
    {
        this;
        JVM INSTR monitorenter ;
        a.b("Camera preview size changed to %s", new Object[] {
            c.getPreviewSize()
        });
        b.requestLayout();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void g()
    {
        a.b("Camera is measured successfully", new Object[0]);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        a.b("onDestroy", new Object[0]);
        if (d != null)
        {
            a.b("Shutting down preview frame processing.", new Object[0]);
            d.c();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        return super.onKeyUp(i1, keyevent);
    }

    protected void onPause()
    {
        k = false;
        if (g != null)
        {
            g.onPause();
        }
        a();
        if (c.h)
        {
            j = true;
        }
        c.e();
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (!hasWindowFocus())
        {
            a.b("onResume. onResumePending=true", new Object[0]);
            i = true;
            return;
        } else
        {
            a.b("onResume. onResumePending=false", new Object[0]);
            i();
            i = false;
            return;
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        a.b("onWindowFocusChanged.hasFocus=%B, .onResumePending=%B", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(i)
        });
        if (flag && i)
        {
            i();
            i = false;
        }
    }

}
