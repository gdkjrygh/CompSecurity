// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Camera;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.roidapp.baselib.c.an;
import com.roidapp.imagelib.b.d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jp.co.cyberagent.android.gpuimage.GPUImage;

// Referenced classes of package com.roidapp.imagelib.a:
//            ac, ad, ae, ab, 
//            af, ag

public class aa
{

    private static final List H = Arrays.asList(new String[] {
        "ZTE U930HD"
    });
    private static boolean s = false;
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    protected Activity a;
    protected Camera b;
    protected List c;
    protected List d;
    protected android.hardware.Camera.Size e;
    protected android.hardware.Camera.Size f;
    protected Handler g;
    protected GPUImage h;
    ag i;
    protected int j;
    protected int k;
    protected float l;
    protected float m;
    protected boolean n;
    protected boolean o;
    android.hardware.Camera.ShutterCallback p;
    android.hardware.Camera.PictureCallback q;
    android.hardware.Camera.PictureCallback r;
    private Context t;
    private android.hardware.Camera.Parameters u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public aa(Activity activity, int i1, int j1, GPUImage gpuimage)
    {
        v = 0;
        y = -1;
        D = false;
        i = null;
        n = false;
        o = false;
        p = new ac(this);
        q = new ad(this);
        r = new ae(this);
        a = activity;
        t = activity;
        x = j1;
        h = gpuimage;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            if (Camera.getNumberOfCameras() > i1)
            {
                w = i1;
            } else
            {
                w = 0;
            }
        } else
        {
            w = 0;
        }
        if (Camera.getNumberOfCameras() > 1)
        {
            D = true;
        }
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        b = Camera.open(w);
_L1:
        u = b.getParameters();
        c = u.getSupportedPreviewSizes();
        d = u.getSupportedPictureSizes();
        return;
        try
        {
            b = Camera.open();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
            throw new Exception();
        }
          goto _L1
    }

    static int a(aa aa1)
    {
        return aa1.w;
    }

    public final int a()
    {
        return E;
    }

    protected final android.hardware.Camera.Size a(android.hardware.Camera.Size size)
    {
        int j1 = 0;
        Object obj = null;
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            android.hardware.Camera.Size size2 = (android.hardware.Camera.Size)iterator.next();
            if (size2.equals(size))
            {
                return size2;
            }
        }

        float f3 = (float)size.width / (float)size.height;
        float f1 = 3.402823E+38F;
        Iterator iterator1 = d.iterator();
        int i1 = 0;
        size = obj;
        while (iterator1.hasNext()) 
        {
            android.hardware.Camera.Size size1 = (android.hardware.Camera.Size)iterator1.next();
            float f2 = Math.abs(f3 - (float)size1.width / (float)size1.height);
            int k1;
            if (f2 <= f1 && (size1.width >= i1 || size1.height >= j1) || f2 < f1)
            {
                j1 = size1.width;
                i1 = size1.height;
                size = size1;
                f1 = f2;
            } else
            {
                int l1 = i1;
                i1 = j1;
                j1 = l1;
            }
            k1 = j1;
            j1 = i1;
            i1 = k1;
        }
        return size;
    }

    protected final android.hardware.Camera.Size a(boolean flag, int i1, int j1)
    {
        if (!flag)
        {
            int k1 = i1;
            i1 = j1;
            j1 = k1;
        }
        if (s)
        {
            android.hardware.Camera.Size size1;
            for (Iterator iterator = c.iterator(); iterator.hasNext(); (new StringBuilder("  w: ")).append(size1.width).append(", h: ").append(size1.height))
            {
                size1 = (android.hardware.Camera.Size)iterator.next();
            }

            android.hardware.Camera.Size size2;
            for (Iterator iterator1 = d.iterator(); iterator1.hasNext(); (new StringBuilder("  w: ")).append(size2.width).append(", h: ").append(size2.height))
            {
                size2 = (android.hardware.Camera.Size)iterator1.next();
            }

        }
        Collections.sort(c, new ab(this));
        float f1;
        float f3;
        android.hardware.Camera.Size size;
        Iterator iterator2;
        int l1;
        int i2;
        if (w == 1)
        {
            l1 = Math.min(j1, 720);
            i2 = Math.min(i1, 720);
        } else
        {
            i2 = i1;
            l1 = j1;
        }
        f3 = (float)j1 / (float)i1;
        f1 = 3.402823E+38F;
        size = null;
        iterator2 = c.iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size3 = (android.hardware.Camera.Size)iterator2.next();
            float f2 = Math.abs(f3 - (float)size3.width / (float)size3.height);
            if (f2 <= f1 && (size3.width <= l1 || size3.height <= i2) || f2 < f1)
            {
                f1 = f2;
                size = size3;
            }
        } while (true);
        return size;
    }

    public final void a(float f1, float f2)
    {
        if (b == null)
        {
            return;
        }
        l = f1;
        m = f2;
        try
        {
            b.autoFocus(null);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public final void a(int i1)
    {
        if (b == null)
        {
            return;
        }
        try
        {
            B = i1;
            if (B > A)
            {
                B = A;
            }
            if (B < 0)
            {
                B = 0;
            }
            u.setZoom(B);
            b.setParameters(u);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public final void a(int i1, int j1)
    {
        y = i1;
        z = j1;
    }

    public final void a(boolean flag)
    {
        while (b == null || k()) 
        {
            return;
        }
        try
        {
            u.getSupportedFlashModes();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        u.setFlashMode("on");
_L1:
        b.setParameters(u);
        return;
        u.setFlashMode("off");
          goto _L1
    }

    protected final boolean a(android.hardware.Camera.Size size, boolean flag, int i1, int j1, View view)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        if (flag)
        {
            f2 = size.width;
            f3 = size.height;
        } else
        {
            f2 = size.height;
            f3 = size.width;
        }
        f5 = (float)j1 / f2;
        f4 = (float)i1 / f3;
        if (x == af.a)
        {
            f1 = f5;
            if (f5 >= f4)
            {
                f1 = f4;
            }
        } else
        {
            f1 = f5;
            if (f5 < f4)
            {
                f1 = f4;
            }
        }
        size = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
        i1 = (int)(f2 * f1);
        j1 = (int)(f3 * f1);
        if (s)
        {
            (new StringBuilder("Preview Layout Size - w: ")).append(j1).append(", h: ").append(i1);
        }
        if (j1 != view.getWidth() || i1 != view.getHeight())
        {
            size.height = i1;
            size.width = j1;
            if (y >= 0)
            {
                size.topMargin = z - i1 / 2;
                size.leftMargin = y - j1 / 2;
            }
            view.setLayoutParams(size);
            return true;
        } else
        {
            return false;
        }
    }

    protected final void b(boolean flag)
    {
        boolean flag1 = true;
        if (android.os.Build.VERSION.SDK_INT >= 8) goto _L2; else goto _L1
_L1:
        List list;
        int i1;
        if (flag)
        {
            u.set("orientation", "portrait");
            flag = false;
            i1 = 0;
        } else
        {
            u.set("orientation", "landscape");
            flag = false;
            i1 = 0;
        }
_L10:
        u.setPreviewSize(e.width, e.height);
        u.setPictureSize(f.width, f.height);
        if (s)
        {
            (new StringBuilder("Preview Actual Size - w: ")).append(e.width).append(", h: ").append(e.height);
            (new StringBuilder("Picture Actual Size - w: ")).append(f.width).append(", h: ").append(f.height);
        }
        list = u.getSupportedFocusModes();
        if (list != null && list.contains("auto"))
        {
            u.setFocusMode("auto");
        }
        u.setPreviewFormat(17);
        u.setPictureFormat(256);
        u.setJpegQuality(100);
        C = false;
        if (b == null) goto _L4; else goto _L3
_L3:
        if (b == null)
        {
            A = 1;
        }
        A = u.getMaxZoom();
_L12:
        Exception exception;
        try
        {
            if (u.isZoomSupported() && u.getMaxZoom() > 0)
            {
                C = true;
            }
        }
        catch (Exception exception1)
        {
            exception1.printStackTrace();
        }
_L4:
        b.setParameters(u);
        h.setUpCamera(b, i1, flag, false);
        E = i1;
        F = flag;
        G = false;
        return;
_L2:
        a.getWindowManager().getDefaultDisplay().getRotation();
        JVM INSTR tableswitch 0 3: default 380
    //                   0 449
    //                   1 454
    //                   2 460
    //                   3 467;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_467;
_L5:
        i1 = 0;
_L11:
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(w, camerainfo);
        int j1;
        if (camerainfo.facing == 1)
        {
            j1 = (i1 + camerainfo.orientation) % 360;
        } else
        {
            j1 = ((camerainfo.orientation - i1) + 360) % 360;
        }
        b.setDisplayOrientation(j1);
        i1 = j1;
        flag = flag1;
        if (camerainfo.facing != 1)
        {
            flag = false;
            i1 = j1;
        }
          goto _L10
_L6:
        i1 = 0;
          goto _L11
_L7:
        i1 = 90;
          goto _L11
_L8:
        i1 = 180;
          goto _L11
        i1 = 270;
          goto _L11
        exception;
        exception.printStackTrace();
          goto _L12
    }

    public final boolean b()
    {
        return F;
    }

    public final boolean c()
    {
        return G;
    }

    public final boolean d()
    {
        return D;
    }

    public final boolean e()
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L2; else goto _L1
_L1:
        android.hardware.Camera.CameraInfo camerainfo;
        int i1;
        int j1;
        j1 = Camera.getNumberOfCameras();
        camerainfo = new android.hardware.Camera.CameraInfo();
        i1 = 0;
_L8:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        Camera.getCameraInfo(i1, camerainfo);
        if (camerainfo.facing != 0) goto _L6; else goto _L5
_L5:
        if (i1 != -1)
        {
            flag = true;
        }
        return flag;
_L6:
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = -1;
        if (true) goto _L5; else goto _L2
_L2:
        return a.getPackageManager().hasSystemFeature("android.hardware.camera");
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean f()
    {
        Object obj = null;
        List list = b.getParameters().getSupportedFlashModes();
        obj = list;
_L1:
        boolean flag;
        if (obj == null)
        {
            return false;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_63;
            }
        } while (!((String)((Iterator) (obj)).next()).contains("on"));
        flag = true;
_L2:
        return flag;
        RuntimeException runtimeexception;
        runtimeexception;
          goto _L1
        flag = false;
          goto _L2
    }

    public final void g()
    {
        if (b == null)
        {
            return;
        }
        try
        {
            b.cancelAutoFocus();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public final int h()
    {
        return B;
    }

    public final int i()
    {
        return A;
    }

    public final boolean j()
    {
        return C;
    }

    public final boolean k()
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(w, camerainfo);
        return camerainfo.facing == 1;
    }

    public final void l()
    {
        if (b == null)
        {
            return;
        } else
        {
            h.clearDrawQueue();
            h.stopRender();
            b.stopPreview();
            b.setPreviewCallback(null);
            b.release();
            b = null;
            return;
        }
    }

    public final boolean m()
    {
        if (!com.roidapp.imagelib.b.d.a())
        {
            an.a(new WeakReference(a), "Your SD card is unmounted, please check it then restart the app.");
            return false;
        }
        if (!com.roidapp.imagelib.b.d.b())
        {
            an.a(new WeakReference(a), "Storage card space is insufficient; please make sure you have at least 10 MB available");
            return false;
        }
        if (b != null)
        {
            System.gc();
            h.clearDrawQueue();
            h.stopRender();
            b.setPreviewCallback(null);
            try
            {
                b.startPreview();
                b.takePicture(null, null, r);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public final boolean n()
    {
        return a.getResources().getConfiguration().orientation == 1;
    }

    public final boolean o()
    {
        return n;
    }

}
