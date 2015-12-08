// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;

import android.os.Looper;
import com.microsoft.dl.utils.Clock;
import com.microsoft.dl.utils.Log;
import com.microsoft.dl.utils.Systrace;
import com.microsoft.dl.video.capture.api.Camera;
import com.microsoft.dl.video.capture.api.CameraCallback;
import com.microsoft.dl.video.capture.api.CameraManager;
import com.microsoft.dl.video.capture.api.CameraManagerSingleton;
import com.microsoft.dl.video.capture.api.CameraParameters;
import com.microsoft.dl.video.capture.api.CaptureException;
import com.microsoft.dl.video.capture.api.ImageFormat;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            DummyPreviewSurface

public class CaptureWorker
    implements CameraCallback, Closeable, Runnable
{
    private static final class Orientation extends Enum
    {

        public static final Orientation LANDSCAPE_LEFT;
        public static final Orientation LANDSCAPE_RIGHT;
        public static final Orientation PORTRAIT;
        public static final Orientation PORTRAIT_UPSIDEDOWN;
        private static final Orientation d[];
        private final boolean a;
        private final boolean b;
        private final boolean c;

        public static Orientation valueOf(String s)
        {
            return (Orientation)Enum.valueOf(com/microsoft/dl/video/capture/impl/CaptureWorker$Orientation, s);
        }

        public static Orientation[] values()
        {
            return (Orientation[])d.clone();
        }

        public final boolean isHorizFlipped()
        {
            return b;
        }

        public final boolean isTransposed()
        {
            return c;
        }

        public final boolean isVertFlipped()
        {
            return a;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(name()).append(" (");
            String s;
            if (a)
            {
                s = "V";
            } else
            {
                s = "-";
            }
            stringbuilder = stringbuilder.append(s);
            if (b)
            {
                s = "H";
            } else
            {
                s = "-";
            }
            stringbuilder = stringbuilder.append(s);
            if (c)
            {
                s = "T";
            } else
            {
                s = "-";
            }
            return stringbuilder.append(s).append(")").toString();
        }

        static 
        {
            LANDSCAPE_LEFT = new Orientation("LANDSCAPE_LEFT", 0, false, false, false);
            PORTRAIT = new Orientation("PORTRAIT", 1, false, true, true);
            LANDSCAPE_RIGHT = new Orientation("LANDSCAPE_RIGHT", 2, true, true, false);
            PORTRAIT_UPSIDEDOWN = new Orientation("PORTRAIT_UPSIDEDOWN", 3, true, false, true);
            d = (new Orientation[] {
                LANDSCAPE_LEFT, PORTRAIT, LANDSCAPE_RIGHT, PORTRAIT_UPSIDEDOWN
            });
        }

        private Orientation(String s, int i1, boolean flag, boolean flag1, boolean flag2)
        {
            super(s, i1);
            a = flag;
            b = flag1;
            c = flag2;
        }
    }


    private final String a;
    private final int b;
    private final int c;
    private final long d;
    private final byte e[][];
    private final Object f = new Object();
    private Camera g;
    private Looper h;
    private volatile CaptureException i;
    private DummyPreviewSurface j;
    private CameraParameters k;
    private Object l;
    private int m;
    private Orientation n;
    private int o;
    private int p;

    public CaptureWorker(int i1, int j1, int k1, long l1, String s)
    {
        m = -1;
        o = -1;
        p = -1;
        a = s;
        b = i1;
        c = j1;
        d = l1;
        e = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            k1, j1
        });
    }

    static CaptureException a(CaptureWorker captureworker)
    {
        return captureworker.i;
    }

    static void a(Throwable throwable, long l1)
    {
        onCapturingFailed(throwable, l1);
    }

    static long b(CaptureWorker captureworker)
    {
        return captureworker.d;
    }

    static String c(CaptureWorker captureworker)
    {
        return captureworker.a;
    }

    private static native void onCapturingFailed(Throwable throwable, long l1);

    private static native void onFrameCaptured(byte abyte0[], long l1, int i1, boolean flag, boolean flag1, boolean flag2, long l2);

    public final void close()
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Closing capture worker (")).append(a).append(")").toString());
        }
        synchronized (f)
        {
            if (h != null)
            {
                h.quit();
                h = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isOpen(long l1)
        throws InterruptedException, CaptureException
    {
        boolean flag = true;
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (i != null)
        {
            throw i;
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        f.wait(l1);
        if (g == null)
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
    }

    public final boolean isUpdate(CameraParameters cameraparameters, Object obj, int i1, int j1, int k1)
    {
        while (cameraparameters != null && !cameraparameters.equals(k) || obj == null && l != j.getSurfaceHolder() || obj != null && obj != l || i1 >= 0 && i1 != m || j1 >= 0 && j1 != o || k1 >= 0 && k1 != p) 
        {
            return true;
        }
        return false;
    }

    public final void onError(int i1, Camera camera)
    {
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Got error ")).append(i1).append(" (").append(a).append(")").toString());
        }
        i = new CaptureException((new StringBuilder("Error ")).append(i1).toString());
        close();
    }

    public final void onFrame(byte abyte0[], Camera camera)
    {
        long l1;
        l1 = Clock.getPlatformTime();
        Systrace.begin(com.microsoft.dl.utils.Systrace.Section.CaptureVideo);
        onFrameCaptured(abyte0, l1, p, n.isVertFlipped(), n.isHorizFlipped(), n.isTransposed(), d);
        camera.addCallbackBuffer(abyte0);
_L2:
        Systrace.end();
        return;
        abyte0;
        if (!Log.isLoggable("Capture", 6)) goto _L2; else goto _L1
_L1:
        Log.e("Capture", (new StringBuilder("Could not return buffer to the camera (")).append(a).append(")").toString(), abyte0);
          goto _L2
        abyte0;
        Systrace.end();
        throw abyte0;
    }

    public final void run()
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Entering thread proc (")).append(a).append(")").toString());
        }
        j = new DummyPreviewSurface();
        Looper.prepare();
        synchronized (f)
        {
            h = Looper.myLooper();
            g = CameraManagerSingleton.getInstance().openCamera(b);
            f.notifyAll();
        }
        Looper.loop();
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        Camera camera = g;
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        Exception exception1;
        Camera camera1;
        try
        {
            g.close();
        }
        catch (IOException ioexception) { }
        g = null;
        if (j != null)
        {
            j.close();
        }
        f.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Leaving thread proc (")).append(a).append(")").toString());
        }
        if (i == null) goto _L2; else goto _L1
_L1:
        obj = new Thread(new Runnable() {

            final CaptureWorker a;
            private final Thread b = Thread.currentThread();

            public void run()
            {
                b.join();
                CaptureWorker.a(CaptureWorker.a(a), CaptureWorker.b(a));
_L1:
                return;
                InterruptedException interruptedexception;
                interruptedexception;
                if (Log.isLoggable("Capture", 5))
                {
                    Log.w("Capture", (new StringBuilder("Interrupted (")).append(CaptureWorker.c(a)).append(")").toString(), interruptedexception);
                    return;
                }
                  goto _L1
            }

            
            {
                a = CaptureWorker.this;
                super();
            }
        });
_L5:
        ((Thread) (obj)).start();
_L2:
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Exception caught (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        i = ((CaptureException) (obj));
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        exception = g;
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        try
        {
            g.close();
        }
        catch (IOException ioexception2) { }
        g = null;
        if (j != null)
        {
            j.close();
        }
        f.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Leaving thread proc (")).append(a).append(")").toString());
        }
        if (i != null)
        {
            obj = new Thread(new _cls1());
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Exception caught (")).append(a).append(")").toString(), ((Throwable) (obj)));
        }
        i = new CaptureException(((Throwable) (obj)));
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        exception = g;
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        try
        {
            g.close();
        }
        catch (IOException ioexception1) { }
        g = null;
        if (j != null)
        {
            j.close();
        }
        f.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Leaving thread proc (")).append(a).append(")").toString());
        }
        if (i == null) goto _L2; else goto _L3
_L3:
        obj = new Thread(new _cls1());
        if (true) goto _L5; else goto _L4
_L4:
        exception1;
        obj = f;
        obj;
        JVM INSTR monitorenter ;
        camera1 = g;
        if (camera1 == null)
        {
            break MISSING_BLOCK_LABEL_593;
        }
        try
        {
            g.close();
        }
        catch (IOException ioexception3) { }
        g = null;
        if (j != null)
        {
            j.close();
        }
        f.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Leaving thread proc (")).append(a).append(")").toString());
        }
        if (i != null)
        {
            (new Thread(new _cls1())).start();
        }
        throw exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void start(CameraParameters cameraparameters, Object obj, int i1, int j1, int k1)
        throws CaptureException
    {
        boolean flag1 = true;
        if (cameraparameters == null && k == null)
        {
            throw new IllegalArgumentException("parameters are not set");
        }
        boolean flag;
        if (cameraparameters == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k1 >= 0)
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            throw new IllegalArgumentException("both parameters and modeId must be provided togethier");
        }
        if (i1 >= 0 && i1 % 90 > 0)
        {
            throw new IllegalArgumentException("orientationAngle must be divisible by 90");
        }
        Object obj2 = f;
        obj2;
        JVM INSTR monitorenter ;
        if (!Log.isLoggable("Capture", 4)) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder = (new StringBuilder("Starting capture worker(")).append(a).append("): parameters=[");
        if (cameraparameters == null) goto _L4; else goto _L3
_L3:
        Object obj1 = cameraparameters;
_L26:
        obj1 = stringbuilder.append(obj1).append("], modeId=");
        if (k1 < 0) goto _L6; else goto _L5
_L5:
        int l1 = k1;
_L14:
        stringbuilder = ((StringBuilder) (obj1)).append(l1).append(", previewDisplay=[");
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj1 = obj;
_L15:
        obj1 = stringbuilder.append(obj1).append("], orientationAngle=");
        if (i1 < 0) goto _L10; else goto _L9
_L9:
        l1 = i1;
_L16:
        obj1 = ((StringBuilder) (obj1)).append(l1).append(", framerate=");
        if (j1 < 0) goto _L12; else goto _L11
_L11:
        l1 = j1;
_L17:
        Log.i("Capture", ((StringBuilder) (obj1)).append((float)l1 / 1000F).append(" fps").toString());
_L2:
        if (g == null)
        {
            throw new IllegalStateException("camera is not open");
        }
          goto _L13
        cameraparameters;
        obj2;
        JVM INSTR monitorexit ;
        throw cameraparameters;
_L4:
        obj1 = k;
        continue; /* Loop/switch isn't completed */
_L6:
        l1 = p;
          goto _L14
_L8:
label0:
        {
            if (l == null)
            {
                break label0;
            }
            obj1 = l;
        }
          goto _L15
        obj1 = j.getSurfaceHolder();
          goto _L15
_L10:
        l1 = m;
          goto _L16
_L12:
        l1 = o;
          goto _L17
_L13:
        if (cameraparameters == null)
        {
            break MISSING_BLOCK_LABEL_441;
        }
        if (!cameraparameters.equals(k))
        {
            if (cameraparameters.getImageFormat().getSampleSize(cameraparameters.getResolution()) > c)
            {
                throw new IllegalArgumentException((new StringBuilder("Resolution ")).append(cameraparameters.getResolution()).append(" exceeds max sample size ").append(c).toString());
            }
            g.setParameters(cameraparameters);
            k = cameraparameters;
            p = k1;
        }
        if (obj != null) goto _L19; else goto _L18
_L18:
        if (l == j.getSurfaceHolder()) goto _L19; else goto _L20
_L20:
        l = j.getSurfaceHolder();
        g.setPreviewDisplay(l);
_L23:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        if (i1 != m)
        {
            g.setDisplayOrientation(i1);
            m = i1;
            n = Orientation.values()[(i1 % 360) / 90];
        }
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_537;
        }
        o = j1;
        cameraparameters = e;
        j1 = cameraparameters.length;
        i1 = 0;
_L21:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_608;
        }
        obj = cameraparameters[i1];
        g.addCallbackBuffer(((byte []) (obj)));
        i1++;
        if (true) goto _L21; else goto _L19
_L19:
        if (obj == null) goto _L23; else goto _L22
_L22:
        if (obj == l) goto _L23; else goto _L24
_L24:
        l = obj;
        g.setPreviewDisplay(l);
          goto _L23
        g.setCallback(this);
        g.startPreview();
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Capture worker started (")).append(a).append(")").toString());
        }
        obj2;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L26; else goto _L25
_L25:
    }

    public final void stop()
        throws CaptureException
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Stopping capture worker (")).append(a).append(")").toString());
        }
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            throw new IllegalStateException("camera is not open");
        }
        break MISSING_BLOCK_LABEL_70;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        g.setCallback(null);
        g.stopPreview();
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Capture worker stopped (")).append(a).append(")").toString());
        }
        obj;
        JVM INSTR monitorexit ;
    }
}
