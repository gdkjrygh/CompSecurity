// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.card.payment:
//            CardIOActivity, e

class CardScanner
    implements android.hardware.Camera.AutoFocusCallback, android.hardware.Camera.PreviewCallback, android.view.SurfaceHolder.Callback
{

    private static final String a;
    private static boolean c;
    private static boolean s;
    private static boolean t;
    private Bitmap b;
    private WeakReference d;
    private boolean e;
    private boolean f;
    private int g;
    private boolean h;
    private long i;
    private long j;
    private Camera k;
    private byte l[];
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;

    CardScanner(CardIOActivity cardioactivity, int i1)
    {
        boolean flag = true;
        super();
        e = false;
        g = 1;
        h = true;
        i = 0L;
        j = 0L;
        k = null;
        m = true;
        n = false;
        Intent intent = cardioactivity.getIntent();
        if (intent != null)
        {
            e = intent.getBooleanExtra("io.card.payment.suppressScan", false);
            if (!intent.getBooleanExtra("io.card.payment.requireExpiry", false) || !intent.getBooleanExtra("io.card.payment.scanExpiry", true))
            {
                flag = false;
            }
            f = flag;
        }
        d = new WeakReference(cardioactivity);
        g = i1;
        nSetup(e, 6F);
    }

    static boolean a()
    {
        return !c && (nUseNeon() || nUseTegra());
    }

    private Camera b(int i1, int j1)
    {
        long l1 = System.currentTimeMillis();
        if (!m) goto _L2; else goto _L1
_L1:
        i1 = j1;
_L3:
        Camera camera = Camera.open();
        return camera;
        Object obj;
        obj;
        Log.w("card.io", "Wasn't able to connect to camera service. Waiting and trying again...");
        Thread.sleep(50L);
        j1 = i1;
_L4:
        i1 = j1;
        if (System.currentTimeMillis() - l1 < (long)j1) goto _L3; else goto _L2
_L2:
        Log.w(a, "camera connect timeout");
        return null;
        obj;
        Log.e("card.io", "Interrupted while waiting for camera", ((Throwable) (obj)));
        j1 = i1;
          goto _L4
        obj;
        Log.e("card.io", "Unexpected exception. Please report it to support@card.io", ((Throwable) (obj)));
        j1 = 0;
          goto _L4
    }

    private boolean b(SurfaceHolder surfaceholder)
    {
        if (!t && surfaceholder == null)
        {
            throw new AssertionError();
        }
        if (!t && surfaceholder.getSurface() == null)
        {
            throw new AssertionError();
        }
        (new StringBuilder("surfaceFrame: ")).append(String.valueOf(surfaceholder.getSurfaceFrame()));
        h = true;
        if (m)
        {
            try
            {
                k.setPreviewDisplay(surfaceholder);
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "can't set preview display", surfaceholder);
                return false;
            }
            try
            {
                k.startPreview();
                k.autoFocus(this);
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "startPreview failed on camera. Error: ", surfaceholder);
                return false;
            }
        }
        return true;
    }

    private native void nCleanup();

    private native void nGetGuideFrame(int i1, int j1, int k1, Rect rect);

    private native int nGetNumFramesScanned();

    private native void nResetAnalytics();

    private native void nScanFrame(byte abyte0[], int i1, int j1, int k1, e e1, Bitmap bitmap, boolean flag);

    private native void nSetup(boolean flag, float f1);

    public static native boolean nUseNeon();

    public static native boolean nUseTegra();

    final Rect a(int i1, int j1)
    {
        int k1 = g;
        Rect rect = null;
        if (a())
        {
            rect = new Rect();
            nGetGuideFrame(k1, i1, j1, rect);
        }
        return rect;
    }

    final void a(int i1)
    {
        g = i1;
    }

    final void a(boolean flag)
    {
        if (!m)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        RuntimeException runtimeexception;
        boolean flag1;
        if (j < i)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        i = System.currentTimeMillis();
        k.autoFocus(this);
        if (flag)
        {
            try
            {
                o = o + 1;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RuntimeException runtimeexception)
            {
                Log.w(a, (new StringBuilder("could not trigger auto focus: ")).append(runtimeexception).toString());
            }
            break MISSING_BLOCK_LABEL_91;
        }
        p = p + 1;
        return;
    }

    final boolean a(SurfaceHolder surfaceholder)
    {
        (new StringBuilder("resumeScanning(")).append(surfaceholder).append(")");
        if (k == null)
        {
            b();
        }
        if (m && k == null)
        {
            return false;
        }
        if (!t && surfaceholder == null)
        {
            throw new AssertionError();
        }
        if (m && l == null)
        {
            (new StringBuilder("- mCamera:")).append(k);
            int i1 = k.getParameters().getPreviewFormat();
            (new StringBuilder("- preview format: ")).append(i1);
            i1 = ImageFormat.getBitsPerPixel(i1) / 8;
            (new StringBuilder("- bytes per pixel: ")).append(i1);
            i1 = i1 * 0x4b000 * 3;
            (new StringBuilder("- buffer size: ")).append(i1);
            l = new byte[i1];
            k.addCallbackBuffer(l);
        }
        surfaceholder.addCallback(this);
        surfaceholder.setType(3);
        if (m)
        {
            k.setPreviewCallbackWithBuffer(this);
        }
        if (n)
        {
            b(surfaceholder);
        }
        b(false);
        System.currentTimeMillis();
        nResetAnalytics();
        return true;
    }

    final void b()
    {
        h = true;
        i = 0L;
        j = 0L;
        o = 0;
        p = 0;
        q = 0;
        r = 0;
        if (!m || k != null) goto _L2; else goto _L1
_L1:
        k = b(50, 5000);
        if (k != null) goto _L4; else goto _L3
_L3:
        Log.e("card.io", "prepare scanner couldn't connect to camera!");
_L8:
        return;
_L4:
        android.hardware.Camera.Parameters parameters;
        List list;
        k.setDisplayOrientation(90);
        parameters = k.getParameters();
        list = parameters.getSupportedPreviewSizes();
        if (list == null) goto _L6; else goto _L5
_L5:
        android.hardware.Camera.Size size;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_297;
            }
            size = (android.hardware.Camera.Size)iterator.next();
        } while (size.width != 640 || size.height != 480);
_L10:
        if (size == null)
        {
            Log.w("card.io", "Didn't find a supported 640x480 resolution, so forcing");
            size = (android.hardware.Camera.Size)list.get(0);
            size.width = 640;
            size.height = 480;
        }
_L6:
        (new StringBuilder("- parameters: ")).append(parameters);
        parameters.setPreviewSize(640, 480);
        k.setParameters(parameters);
_L9:
        if (b != null) goto _L8; else goto _L7
_L7:
        b = Bitmap.createBitmap(428, 270, android.graphics.Bitmap.Config.ARGB_8888);
        return;
_L2:
        if (!m)
        {
            Log.w(a, "useCamera is false!");
        } else
        if (k != null)
        {
            (new StringBuilder("we already have a camera instance: ")).append(k);
        }
          goto _L9
          goto _L8
        size = null;
          goto _L10
    }

    public final boolean b(boolean flag)
    {
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        (new StringBuilder("setFlashOn: ")).append(flag);
        android.hardware.Camera.Parameters parameters = k.getParameters();
        String s1;
        if (flag)
        {
            s1 = "torch";
        } else
        {
            s1 = "off";
        }
        parameters.setFlashMode(s1);
        k.setParameters(parameters);
        q = q + 1;
        return true;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w(a, (new StringBuilder("Could not set flash mode: ")).append(runtimeexception).toString());
        return false;
    }

    public final void c()
    {
        b(false);
        if (k != null)
        {
            try
            {
                k.stopPreview();
                k.setPreviewDisplay(null);
            }
            catch (IOException ioexception)
            {
                Log.w("card.io", "can't stop preview display", ioexception);
            }
            k.setPreviewCallback(null);
            k.release();
            l = null;
            k = null;
        }
    }

    public final void d()
    {
        if (k != null)
        {
            c();
        }
        nCleanup();
        l = null;
    }

    public final boolean e()
    {
        if (!m)
        {
            return false;
        } else
        {
            return k.getParameters().getFlashMode().equals("torch");
        }
    }

    public void onAutoFocus(boolean flag, Camera camera)
    {
        j = System.currentTimeMillis();
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        Log.w(a, "frame is null! skipping");
_L4:
        return;
_L2:
        if (!s)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.e(a, "processing in progress.... dropping frame");
        r = r + 1;
        if (camera != null)
        {
            camera.addCallbackBuffer(abyte0);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        e e1;
        s = true;
        if (h)
        {
            h = false;
            g = 1;
            ((CardIOActivity)d.get()).a(1);
        }
        e1 = new e();
        nScanFrame(abyte0, 640, 480, g, e1, b, f);
        boolean flag;
        if (e1.f >= 6F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L6; else goto _L5
_L5:
        a(false);
_L8:
        if (camera != null)
        {
            camera.addCallbackBuffer(abyte0);
        }
        s = false;
        return;
_L6:
        if (!e1.a)
        {
            if (!e)
            {
                continue; /* Loop/switch isn't completed */
            }
            boolean flag1;
            if (e1.b && e1.c && e1.e && e1.d)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        (new StringBuilder("detected card: ")).append(e1.a());
        ((CardIOActivity)d.get()).a(b, e1);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        boolean flag;
        if (surfaceholder != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        String.format("Preview.surfaceChanged(holder?:%b, f:%d, w:%d, h:%d )", new Object[] {
            Boolean.valueOf(flag), Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1)
        });
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        if (k != null || !m)
        {
            n = true;
            b(surfaceholder);
            return;
        } else
        {
            Log.wtf("card.io", "CardScanner.surfaceCreated() - camera is null!");
            return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (k != null)
        {
            try
            {
                k.stopPreview();
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("card.io", "error stopping camera", surfaceholder);
            }
        }
        n = false;
    }

    static 
    {
        boolean flag;
        if (!io/card/payment/CardScanner.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        t = flag;
        a = io/card/payment/CardScanner.getSimpleName();
        c = false;
        System.loadLibrary("cardioDecider");
        (new StringBuilder("Loaded card.io decider library.  nUseNeon():")).append(nUseNeon()).append(",nUseTegra():").append(nUseTegra());
        if (nUseNeon() || nUseTegra())
        {
            System.loadLibrary("opencv_core");
            System.loadLibrary("opencv_imgproc");
        }
        if (!nUseNeon()) goto _L2; else goto _L1
_L1:
        System.loadLibrary("cardioRecognizer");
_L4:
        s = false;
        return;
_L2:
        UnsatisfiedLinkError unsatisfiedlinkerror;
        if (nUseTegra())
        {
            System.loadLibrary("cardioRecognizer_tegra2");
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Log.w("card.io", "unsupported processor - card.io scanning requires ARMv7 architecture");
            c = true;
        }
        // Misplaced declaration of an exception variable
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            Log.e("card.io", (new StringBuilder("Failed to load native library: ")).append(unsatisfiedlinkerror.getMessage()).toString());
            c = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
