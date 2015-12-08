// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.fitbit.e.a;
import com.google.zxing.b;
import com.google.zxing.common.i;
import com.google.zxing.e;
import java.io.IOException;

// Referenced classes of package com.fitbit.food.barcode.a:
//            b, e, k, g, 
//            f, a

public final class d
{

    public static final int a = 1500;
    private static final String b = com/fitbit/food/barcode/a/d.getSimpleName();
    private static final int c = 240;
    private static final int d = 240;
    private static final int e = 1200;
    private static final int f = 675;
    private final com.fitbit.food.barcode.a.b g;
    private Camera h;
    private com.fitbit.food.barcode.a.a i;
    private Rect j;
    private Rect k;
    private boolean l;
    private boolean m;
    private int n;
    private Point o;
    private int p;
    private int q;
    private boolean r;
    private Handler s;

    public d(Context context)
    {
        n = -1;
        g = new com.fitbit.food.barcode.a.b(context);
        s = new Handler();
    }

    private static int a(int i1, int j1, int k1)
    {
        i1 = (i1 * 5) / 8;
        if (i1 < j1)
        {
            return j1;
        }
        if (i1 > k1)
        {
            return k1;
        } else
        {
            return i1;
        }
    }

    static void a(d d1, com.fitbit.food.barcode.a.e e1, SurfaceHolder surfaceholder)
    {
        d1.b(e1, surfaceholder);
    }

    public static boolean a(Context context)
    {
        boolean flag1 = context.getPackageManager().hasSystemFeature("android.hardware.camera");
        boolean flag = flag1;
        if (flag1)
        {
            if (Camera.getNumberOfCameras() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        com.fitbit.e.a.a(b, "has camera = %s", new Object[] {
            Boolean.valueOf(flag)
        });
        return flag;
    }

    static boolean a(d d1)
    {
        return d1.r;
    }

    static Camera b(d d1)
    {
        return d1.h;
    }

    private void b(com.fitbit.food.barcode.a.e e1, SurfaceHolder surfaceholder)
    {
        this;
        JVM INSTR monitorenter ;
        if (r)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        r = true;
        if (h != null)
        {
            com.fitbit.e.a.a(b, "Configure picture size", new Object[0]);
            g.b(h);
            com.fitbit.e.a.a(b, "Try take photo", new Object[0]);
            h.takePicture(null, null, null, new _cls3(surfaceholder, e1));
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        surfaceholder;
_L3:
        com.fitbit.e.a.f(b, "Exception occurred when take photo", surfaceholder, new Object[0]);
        if (e1 == null) goto _L2; else goto _L1
_L1:
        e1.a(new IOException(surfaceholder));
          goto _L2
        e1;
        throw e1;
        surfaceholder;
          goto _L3
    }

    static String j()
    {
        return b;
    }

    private android.hardware.Camera.Parameters k()
        throws IOException
    {
        android.hardware.Camera.Parameters parameters;
        try
        {
            parameters = h.getParameters();
        }
        catch (RuntimeException runtimeexception)
        {
            com.fitbit.e.a.f(b, "Exception occurred when try get camera parameters", runtimeexception, new Object[0]);
            throw new IOException();
        }
        return parameters;
    }

    public e a(byte abyte0[])
    {
        Point point = g.b();
        Rect rect = h();
        if (rect == null)
        {
            return null;
        } else
        {
            return new k(abyte0, point.x, point.y, rect.left, rect.top, rect.width(), rect.height(), false);
        }
    }

    public void a()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Camera camera;
        int j1;
        com.fitbit.e.a.b(b, "Start open camera.", new Object[0]);
        camera = h;
        j1 = n;
        Object obj;
        int i1;
        i1 = j1;
        obj = camera;
        if (camera != null) goto _L4; else goto _L3
_L3:
        if (j1 < 0) goto _L6; else goto _L5
_L5:
        obj = com.fitbit.food.barcode.a.g.a(j1);
_L8:
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        throw new IOException();
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L6:
        obj = com.fitbit.food.barcode.a.g.a();
        if (true) goto _L8; else goto _L7
        obj;
        com.fitbit.e.a.f(b, "Exception occurred when try open camera", ((Throwable) (obj)), new Object[0]);
        throw new IOException(((Throwable) (obj)));
_L7:
        camera = ((f) (obj)).a();
        i1 = ((f) (obj)).b();
        h = camera;
        n = i1;
        obj = camera;
_L4:
        if (l) goto _L1; else goto _L9
_L9:
        l = true;
        g.a(((Camera) (obj)), i1);
        if (o != null && p > 0 && q > 0)
        {
            a(o, p, q);
            p = 0;
            q = 0;
        }
          goto _L1
    }

    public void a(Point point, int i1, int j1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!l) goto _L2; else goto _L1
_L1:
        int l1;
        int i2;
        l1 = point.x;
        i2 = point.y;
        point = g.c();
        int k1 = l1;
        if (l1 > point.x)
        {
            k1 = point.x;
        }
        l1 = i2;
        if (i2 > point.y)
        {
            l1 = point.y;
        }
        i2 = i1;
        if (i1 > point.x - k1)
        {
            i2 = point.x - k1;
        }
        i1 = j1;
        if (j1 > point.y - l1)
        {
            i1 = point.y - l1;
        }
        j = new Rect(k1, l1, k1 + i2, l1 + i1);
        com.fitbit.e.a.a(b, "Calculated manual framing rect: %s", new Object[] {
            j
        });
        k = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        o = point;
        p = i1;
        q = j1;
        if (true) goto _L4; else goto _L3
_L3:
        point;
        throw point;
    }

    public void a(android.hardware.Camera.PreviewCallback previewcallback)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera = h;
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        if (m)
        {
            camera.setOneShotPreviewCallback(previewcallback);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        previewcallback;
        throw previewcallback;
    }

    public void a(SurfaceHolder surfaceholder)
        throws IOException
    {
        com.fitbit.e.a.a(b, "Start configure camera", new Object[0]);
        h.setPreviewDisplay(surfaceholder);
        surfaceholder = k();
        if (surfaceholder == null)
        {
            surfaceholder = null;
        } else
        {
            surfaceholder = surfaceholder.flatten();
        }
        g.a(h);
        g.b(h, n);
_L1:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        com.fitbit.e.a.f(b, "Something went wrong configuring camera, using safe mode parameters", runtimeexception, new Object[0]);
        if (surfaceholder != null)
        {
            com.fitbit.e.a.d(b, (new StringBuilder()).append("Resetting to saved camera params: ").append(surfaceholder).toString(), new Object[0]);
            k().unflatten(surfaceholder);
            return;
        }
          goto _L1
    }

    public void a(com.fitbit.food.barcode.a.e e1, SurfaceHolder surfaceholder)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera;
        String s2;
        camera = h;
        s2 = b;
        String s1;
        if (camera != null)
        {
            s1 = " not";
        } else
        {
            s1 = "";
        }
        com.fitbit.e.a.a(s2, "Camera manager will try to take photo. Camera is%s null", new Object[] {
            s1
        });
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        r = false;
        s.postDelayed(new _cls1(e1, surfaceholder), 1500L);
        com.fitbit.e.a.a(b, "Try get auto focus", new Object[0]);
        camera.autoFocus(new _cls2(e1, surfaceholder));
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        com.fitbit.e.a.f(b, "Exception occurred when try get auto focus", new Object[0]);
        throw new IOException();
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
    }

    public void a(boolean flag)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (flag == g.c(h) || h == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (i != null)
        {
            i.b();
        }
        g.a(h, flag);
        if (i != null)
        {
            i.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.fitbit.e.a.f(b, "Exception occurred when set Torch mode", ((Throwable) (obj)), new Object[0]);
        throw new IOException();
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public b b(byte abyte0[])
    {
        Object obj = null;
        e e1 = a(abyte0);
        abyte0 = obj;
        if (e1 != null)
        {
            abyte0 = new b(new i(e1));
        }
        return abyte0;
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera = h;
        boolean flag;
        if (camera != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (h != null)
        {
            h.release();
            h = null;
            j = null;
            k = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = b;
        Object obj;
        if (h == null)
        {
            obj = "";
        } else
        {
            obj = " NOT";
        }
        com.fitbit.e.a.a(s1, "Reset camera. Camera is%s null", new Object[] {
            obj
        });
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        h.release();
        obj = h;
        h = null;
        a();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        IOException ioexception;
        ioexception;
        ((Camera) (obj)).release();
        a();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera = h;
        if (camera == null) goto _L2; else goto _L1
_L1:
        boolean flag = m;
        if (flag) goto _L2; else goto _L3
_L3:
        camera.startPreview();
_L4:
        m = true;
        i = new com.fitbit.food.barcode.a.a(h);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.fitbit.e.a.f(b, "start preview exception", ((Throwable) (obj)), new Object[0]);
          goto _L4
        obj;
        throw obj;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (i != null)
        {
            i.b();
            i = null;
        }
        if (h != null && m)
        {
            h.stopPreview();
            m = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public Rect g()
    {
        Rect rect = null;
        this;
        JVM INSTR monitorenter ;
        if (j != null) goto _L2; else goto _L1
_L1:
        Object obj = h;
        if (obj != null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return rect;
_L4:
        obj = g.c();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1 = a(((Point) (obj)).x, 240, 1200);
        int j1 = a(((Point) (obj)).y, 240, 675);
        int k1 = (((Point) (obj)).x - i1) / 2;
        int l1 = (((Point) (obj)).y - j1) / 2;
        j = new Rect(k1, l1, i1 + k1, j1 + l1);
        com.fitbit.e.a.a(b, "Calculated framing rect: %s", new Object[] {
            j
        });
_L2:
        rect = j;
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public Rect h()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (k != null) goto _L2; else goto _L1
_L1:
        Rect rect = g();
        if (rect != null) goto _L4; else goto _L3
_L3:
        rect = obj;
_L9:
        this;
        JVM INSTR monitorexit ;
        return rect;
_L4:
        Rect rect1;
        Point point;
        Point point1;
        rect1 = new Rect(rect);
        point = g.b();
        point1 = g.c();
        rect = obj;
        if (point == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        rect = obj;
        if (point1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (g.a() != 90) goto _L6; else goto _L5
_L5:
        rect = new Rect();
        rect.left = rect1.top;
        rect.right = rect1.bottom;
        rect.top = point1.x - rect1.right;
        rect.bottom = point1.x - rect1.left;
        rect.left = (rect.left * point.x) / point1.y;
        rect.right = (rect.right * point.x) / point1.y;
        rect.top = (rect.top * point.y) / point1.x;
        rect.bottom = (rect.bottom * point.y) / point1.x;
_L7:
        k = rect;
_L2:
        rect = k;
        continue; /* Loop/switch isn't completed */
_L6:
        rect1.left = (rect1.left * point.x) / point1.x;
        rect1.right = (rect1.right * point.x) / point1.x;
        rect1.top = (rect1.top * point.y) / point1.y;
        rect1.bottom = (rect1.bottom * point.y) / point1.y;
        rect = rect1;
          goto _L7
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean i()
        throws IOException
    {
        return g.c(h);
    }


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
