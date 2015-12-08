// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.skype.android.fake.capture.impl.CameraConfig;
import com.skype.android.fake.capture.impl.CameraConfigOptions;
import com.skype.android.fake.capture.impl.CaptureSession;
import com.skype.android.fake.capture.impl.FrameProducer;
import com.skype.android.fake.capture.impl.PreviewRenderer;
import com.skype.android.fake.capture.impl.SourceVideoFileList;
import com.skype.android.platform.capture.Camera;
import com.skype.android.platform.capture.CameraCallback;
import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.CameraInfo;
import com.skype.android.platform.capture.CameraParameters;
import com.skype.android.platform.capture.CaptureException;
import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.util.Log;
import com.skype.android.util.Systrace;
import com.skype.android.video.hw.format.Resolution;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NavigableSet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

final class com.skype.android.fake.capture.a
    implements Camera
{
    private static final class a extends Handler
    {

        private final com.skype.android.fake.capture.a a;
        private final AtomicReference b;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 57;
               goto _L1 _L2
_L1:
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", (new StringBuilder("Unknown message ")).append(message).toString());
            }
_L4:
            return;
_L2:
            CameraCallback cameracallback = (CameraCallback)b.get();
            if (cameracallback != null)
            {
                cameracallback.onFrame((byte[])message.obj, a);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public a(com.skype.android.fake.capture.a a1, Looper looper)
        {
            super(looper);
            a = a1;
            b = com.skype.android.fake.capture.a.d(a1);
        }
    }

    private static final class b
        implements com.skype.android.fake.capture.impl.FrameProducer.Callback
    {

        private final com.skype.android.fake.capture.a a;
        private final a b;
        private final Deque c;
        private final PreviewRenderer d;
        private final AtomicReference e;

        public final void a()
        {
            if (d == null)
            {
                break MISSING_BLOCK_LABEL_24;
            }
            Systrace.begin(com.skype.android.util.Systrace.Section.k);
            com.skype.android.fake.capture.a.e(a);
            Systrace.end();
            return;
            Exception exception;
            exception;
            Systrace.end();
            throw exception;
        }

        public final void a(byte abyte0[])
        {
            if (b != null)
            {
                b.sendMessage(b.obtainMessage(0, abyte0));
            }
        }

        public final byte[] a(int i1, long l1)
        {
            if (e.get() == null)
            {
                return null;
            }
            Deque deque = c;
            deque;
            JVM INSTR monitorenter ;
            boolean flag = c.isEmpty();
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            c.wait(l1);
            Object obj;
            obj = (byte[])c.pop();
            if (obj.length < i1)
            {
                throw new RuntimeException((new StringBuilder("Insuficient buffer size: ")).append(obj.length).append(" instead of ").append(i1).toString());
            }
            break MISSING_BLOCK_LABEL_135;
            obj;
            deque;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            if (Log.isLoggable("Capture", 5))
            {
                Log.w("Capture", "Interrupted", ((Throwable) (obj)));
            }
            deque;
            JVM INSTR monitorexit ;
            return null;
            deque;
            JVM INSTR monitorexit ;
            return ((byte []) (obj));
        }

        public b(com.skype.android.fake.capture.a a1)
        {
            a = a1;
            b = com.skype.android.fake.capture.a.a(a1);
            c = com.skype.android.fake.capture.a.b(a1);
            d = com.skype.android.fake.capture.a.c(a1);
            e = com.skype.android.fake.capture.a.d(a1);
        }
    }


    private static final ImageFormat a;
    private static final Resolution b = new Resolution(320, 240);
    private static final FpsRange c = new FpsRange(0, 15000);
    private static final Semaphore d = new Semaphore(1);
    private final CameraConfig e;
    private final CaptureSession f;
    private final a g;
    private final Deque h = new ArrayDeque();
    private final SourceVideoFileList i = new SourceVideoFileList("/sdcard/fakecam/video");
    private final Object j = new Object();
    private final CameraParameters k = new CameraParameters();
    private boolean l;
    private FrameProducer m;
    private PreviewRenderer n;
    private final AtomicReference o = new AtomicReference();
    private volatile boolean p;
    private volatile int q;

    public com.skype.android.fake.capture.a(CameraConfig cameraconfig, CaptureSession capturesession)
    {
        if (!d.tryAcquire())
        {
            throw new RuntimeException("A camera is already open");
        }
        e = cameraconfig;
        f = capturesession;
        Object obj = Looper.myLooper();
        capturesession = ((CaptureSession) (obj));
        if (obj != null)
        {
            capturesession = Looper.getMainLooper();
        }
        if (capturesession != null)
        {
            capturesession = new a(this, capturesession);
        } else
        {
            capturesession = null;
        }
        g = capturesession;
        obj = k;
        if (cameraconfig.b.b().contains(a))
        {
            capturesession = a;
        } else
        {
            capturesession = (ImageFormat)cameraconfig.b.b().first();
        }
        ((CameraParameters) (obj)).a(capturesession);
        obj = k;
        if (cameraconfig.b.c().contains(b))
        {
            capturesession = b;
        } else
        {
            capturesession = (Resolution)cameraconfig.b.c().first();
        }
        ((CameraParameters) (obj)).a(capturesession);
        obj = k;
        if (cameraconfig.b.d().contains(c))
        {
            capturesession = c;
        } else
        {
            capturesession = (FpsRange)cameraconfig.b.d().first();
        }
        ((CameraParameters) (obj)).a(capturesession);
        p = true;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(cameraconfig.b.a()).append(" is open").toString());
        }
    }

    static a a(com.skype.android.fake.capture.a a1)
    {
        return a1.g;
    }

    static Deque b(com.skype.android.fake.capture.a a1)
    {
        return a1.h;
    }

    static PreviewRenderer c(com.skype.android.fake.capture.a a1)
    {
        return a1.n;
    }

    static AtomicReference d(com.skype.android.fake.capture.a a1)
    {
        return a1.o;
    }

    static int e(com.skype.android.fake.capture.a a1)
    {
        return a1.q;
    }

    public final CameraCapabilities a()
    {
        if (!p)
        {
            throw new IllegalStateException("The camera is not open");
        } else
        {
            return e.b.f();
        }
    }

    public final void a(int i1)
    {
        if (!p)
        {
            throw new IllegalStateException("The camera is not open");
        }
        if (i1 < 0 || i1 % 90 > 0)
        {
            throw new IllegalArgumentException(String.valueOf(i1));
        }
        q = i1 % 360;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" got preview orientation ").append(q).append(" deg").toString());
        }
    }

    public final void a(CameraCallback cameracallback)
    {
        if (!p)
        {
            throw new IllegalStateException("The camera is not open");
        }
        if (cameracallback == null)
        {
            synchronized (h)
            {
                h.clear();
            }
        }
        o.set(cameracallback);
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" callback set to ").append(cameracallback).toString());
        }
        return;
        cameracallback;
        deque;
        JVM INSTR monitorexit ;
        throw cameracallback;
    }

    public final void a(CameraParameters cameraparameters)
    {
        if (!p)
        {
            throw new IllegalStateException("The camera is not open");
        }
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        if (l)
        {
            throw new IllegalStateException("Preview is started");
        }
        break MISSING_BLOCK_LABEL_46;
        cameraparameters;
        obj;
        JVM INSTR monitorexit ;
        throw cameraparameters;
        if (!e.b.b().contains(cameraparameters.b()))
        {
            throw new IllegalArgumentException((new StringBuilder("Image format ")).append(cameraparameters.b()).append(" is not supported").toString());
        }
        if (!e.b.c().contains(cameraparameters.a()))
        {
            throw new IllegalArgumentException((new StringBuilder("Resolution ")).append(cameraparameters.a()).append(" is not supported").toString());
        }
        if (!e.b.d().contains(cameraparameters.c()))
        {
            throw new IllegalArgumentException((new StringBuilder("FPS range ")).append(cameraparameters.c()).append(" is not supported").toString());
        }
        k.a(cameraparameters.b());
        k.a(cameraparameters.a());
        k.a(cameraparameters.c());
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" configured to ").append(cameraparameters).toString());
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(Object obj)
    {
        if (!p)
        {
            throw new IllegalStateException("The camera is not open");
        }
        Object obj1 = j;
        obj1;
        JVM INSTR monitorenter ;
        if (l)
        {
            throw new IllegalStateException("Preview is started");
        }
        break MISSING_BLOCK_LABEL_46;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        if (n != null)
        {
            n.close();
            n = null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        if (!(obj instanceof SurfaceTexture)) goto _L2; else goto _L1
_L1:
        new Surface((SurfaceTexture)obj);
        n = new PreviewRenderer();
_L3:
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" preview display attached: ").append(obj).toString());
        }
_L4:
        obj1;
        JVM INSTR monitorexit ;
        return;
_L2:
label0:
        {
            if (!(obj instanceof SurfaceHolder))
            {
                break label0;
            }
            ((SurfaceHolder)obj).getSurface();
            n = new PreviewRenderer();
        }
          goto _L3
        throw new IllegalArgumentException((new StringBuilder("display is instance of ")).append(obj.getClass().getCanonicalName()).toString());
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" preview detached").toString());
        }
          goto _L4
    }

    public final void a(byte abyte0[])
    {
        if (!p)
        {
            throw new IllegalStateException("The camera is not open");
        }
        synchronized (h)
        {
            h.addLast(abyte0);
            h.notifyAll();
            if (Log.isLoggable("Capture", 3))
            {
                Log.d("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" has now ").append(h.size()).append(" buffers").toString());
            }
        }
        return;
        abyte0;
        deque;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public final CameraParameters b()
    {
        if (!p)
        {
            throw new IllegalStateException("The camera is not open");
        }
        CameraParameters cameraparameters;
        synchronized (j)
        {
            cameraparameters = k.d();
        }
        return cameraparameters;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
        throws CaptureException
    {
label0:
        {
            if (!p)
            {
                throw new IllegalStateException("The camera is not open");
            }
            synchronized (j)
            {
                if (!l)
                {
                    break label0;
                }
            }
            return;
        }
        if (n == null)
        {
            throw new IllegalStateException("Preview display is not set");
        }
        break MISSING_BLOCK_LABEL_57;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        com.skype.android.fake.capture.impl.SourceVideoFileList.VideoFile videofile;
        Object obj1;
        obj1 = new com.skype.android.fake.capture.impl.SourceVideoFileList.Query();
        obj1.a = e.c.a();
        obj1.b = k.b();
        obj1.c = k.a();
        obj1.d = k.c();
        videofile = i.a(((com.skype.android.fake.capture.impl.SourceVideoFileList.Query) (obj1)));
        if (videofile != null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        throw new CaptureException((new StringBuilder("Could not find video file matching ")).append(obj1).toString());
        obj1 = new com.skype.android.fake.capture.impl.FrameProducer.StampRect(e.c.b(), k.a());
        f.a(e.b.a(), k.a().getWidth(), k.a().getHeight(), k.b().toString(), (new StringBuilder()).append(e.a.a().toString()).append("/").append(e.b.a()).toString(), videofile.e.getAbsolutePath(), ((com.skype.android.fake.capture.impl.FrameProducer.StampRect) (obj1)).a, ((com.skype.android.fake.capture.impl.FrameProducer.StampRect) (obj1)).b, ((com.skype.android.fake.capture.impl.FrameProducer.StampRect) (obj1)).c);
        m = new FrameProducer(e.b.a(), f, videofile.e.getAbsolutePath(), k.b(), k.a(), videofile.d * 1000, k.c(), ((com.skype.android.fake.capture.impl.FrameProducer.StampRect) (obj1)), new b(this));
        l = true;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" started").toString());
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        IOException ioexception;
        ioexception;
        if (m != null)
        {
            m.close();
        }
        throw new CaptureException("Could not start capturing", ioexception);
    }

    public final void close()
    {
        if (!p)
        {
            throw new IllegalStateException("The camera is not open");
        }
        d();
        if (n != null)
        {
            n.close();
            n = null;
        }
        p = false;
        d.release();
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" is closed").toString());
        }
    }

    public final void d()
    {
label0:
        {
            if (!p)
            {
                throw new IllegalStateException("The camera is not open");
            }
            synchronized (j)
            {
                if (l)
                {
                    break label0;
                }
            }
            return;
        }
        if (m != null)
        {
            m.close();
            m = null;
        }
        l = false;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(e.b.a()).append(" stopped").toString());
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = ImageFormat.b;
    }
}
