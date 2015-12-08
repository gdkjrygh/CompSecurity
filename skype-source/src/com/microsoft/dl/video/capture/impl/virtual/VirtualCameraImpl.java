// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.microsoft.dl.utils.Log;
import com.microsoft.dl.utils.Systrace;
import com.microsoft.dl.video.capture.api.Camera;
import com.microsoft.dl.video.capture.api.CameraCallback;
import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.CameraParameters;
import com.microsoft.dl.video.capture.api.CaptureException;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import com.microsoft.dl.video.capture.impl.virtual.impl.CameraConfig;
import com.microsoft.dl.video.capture.impl.virtual.impl.CameraConfigOptions;
import com.microsoft.dl.video.capture.impl.virtual.impl.CaptureSession;
import com.microsoft.dl.video.capture.impl.virtual.impl.FrameProducer;
import com.microsoft.dl.video.capture.impl.virtual.impl.PreviewRenderer;
import com.microsoft.dl.video.capture.impl.virtual.impl.SourceVideoFileList;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NavigableSet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual:
//            VirtualCameraManagerImpl

class VirtualCameraImpl
    implements Camera
{
    private static class EventHandler extends Handler
    {

        private final VirtualCameraImpl a;
        private final AtomicReference b;

        public void handleMessage(Message message)
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

        public EventHandler(VirtualCameraImpl virtualcameraimpl)
        {
            Looper looper1 = Looper.myLooper();
            Looper looper = looper1;
            if (looper1 != null)
            {
                looper = Looper.getMainLooper();
            }
            super(looper);
            a = virtualcameraimpl;
            b = VirtualCameraImpl.d(virtualcameraimpl);
        }
    }

    private static class VideoFrameSourceCallback
        implements com.microsoft.dl.video.capture.impl.virtual.impl.FrameProducer.Callback
    {

        private final VirtualCameraImpl a;
        private final EventHandler b;
        private final Deque c;
        private final PreviewRenderer d;
        private final AtomicReference e;

        public byte[] getBuffer(int i1, long l1)
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

        public void onFrameCaptured(ByteBuffer bytebuffer, ImageFormat imageformat, Resolution resolution)
        {
            if (d == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            Systrace.begin(com.microsoft.dl.utils.Systrace.Section.PreviewFakeVideoFrame);
            d.drawFrame(bytebuffer, imageformat, resolution, VirtualCameraImpl.e(a));
            Systrace.end();
            return;
            bytebuffer;
            Systrace.end();
            throw bytebuffer;
        }

        public void onFrameReady(byte abyte0[])
        {
            b.sendMessage(b.obtainMessage(0, abyte0));
        }

        public VideoFrameSourceCallback(VirtualCameraImpl virtualcameraimpl)
        {
            a = virtualcameraimpl;
            b = VirtualCameraImpl.a(virtualcameraimpl);
            c = VirtualCameraImpl.b(virtualcameraimpl);
            d = VirtualCameraImpl.c(virtualcameraimpl);
            e = VirtualCameraImpl.d(virtualcameraimpl);
        }
    }


    private static final File a;
    private static final ImageFormat b;
    private static final Resolution c = new Resolution(320, 240);
    private static final FpsRange d = new FpsRange(0, 15000);
    private static final Semaphore e = new Semaphore(1);
    private final CameraConfig f;
    private final CaptureSession g;
    private final EventHandler h = new EventHandler(this);
    private final Deque i = new ArrayDeque();
    private final SourceVideoFileList j;
    private final Object k = new Object();
    private final CameraParameters l = new CameraParameters();
    private boolean m;
    private FrameProducer n;
    private PreviewRenderer o;
    private final AtomicReference p = new AtomicReference();
    private volatile boolean q;
    private volatile int r;

    public VirtualCameraImpl(CameraConfig cameraconfig, CaptureSession capturesession)
    {
        if (!e.tryAcquire())
        {
            throw new RuntimeException("A camera is already open");
        }
        f = cameraconfig;
        g = capturesession;
        j = new SourceVideoFileList(a);
        CameraParameters cameraparameters = l;
        if (cameraconfig.getCapabilities().getSupportedImageFormats().contains(b))
        {
            capturesession = b;
        } else
        {
            capturesession = (ImageFormat)cameraconfig.getCapabilities().getSupportedImageFormats().first();
        }
        cameraparameters.setImageFormat(capturesession);
        cameraparameters = l;
        if (cameraconfig.getCapabilities().getSupportedResolutions().contains(c))
        {
            capturesession = c;
        } else
        {
            capturesession = (Resolution)cameraconfig.getCapabilities().getSupportedResolutions().first();
        }
        cameraparameters.setResolution(capturesession);
        cameraparameters = l;
        if (cameraconfig.getCapabilities().getSupportedFpsRanges().contains(d))
        {
            capturesession = d;
        } else
        {
            capturesession = (FpsRange)cameraconfig.getCapabilities().getSupportedFpsRanges().first();
        }
        cameraparameters.setFpsRange(capturesession);
        q = true;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(cameraconfig.getCapabilities().getCameraId()).append(" is open").toString());
        }
    }

    static EventHandler a(VirtualCameraImpl virtualcameraimpl)
    {
        return virtualcameraimpl.h;
    }

    static Deque b(VirtualCameraImpl virtualcameraimpl)
    {
        return virtualcameraimpl.i;
    }

    static PreviewRenderer c(VirtualCameraImpl virtualcameraimpl)
    {
        return virtualcameraimpl.o;
    }

    static AtomicReference d(VirtualCameraImpl virtualcameraimpl)
    {
        return virtualcameraimpl.p;
    }

    static int e(VirtualCameraImpl virtualcameraimpl)
    {
        return virtualcameraimpl.r;
    }

    public void addCallbackBuffer(byte abyte0[])
    {
        if (!q)
        {
            throw new IllegalStateException("The camera is not open");
        }
        synchronized (i)
        {
            i.addLast(abyte0);
            i.notifyAll();
            if (Log.isLoggable("Capture", 3))
            {
                Log.d("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" has now ").append(i.size()).append(" buffers").toString());
            }
        }
        return;
        abyte0;
        deque;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void close()
    {
        if (!q)
        {
            throw new IllegalStateException("The camera is not open");
        }
        stopPreview();
        if (o != null)
        {
            o.close();
            o = null;
        }
        q = false;
        e.release();
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" is closed").toString());
        }
    }

    public CameraParameters getParameters()
    {
        if (!q)
        {
            throw new IllegalStateException("The camera is not open");
        }
        CameraParameters cameraparameters;
        synchronized (k)
        {
            cameraparameters = l.clone();
        }
        return cameraparameters;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setCallback(CameraCallback cameracallback)
    {
        if (!q)
        {
            throw new IllegalStateException("The camera is not open");
        }
        if (cameracallback == null)
        {
            synchronized (i)
            {
                i.clear();
            }
        }
        p.set(cameracallback);
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" callback set to ").append(cameracallback).toString());
        }
        return;
        cameracallback;
        deque;
        JVM INSTR monitorexit ;
        throw cameracallback;
    }

    public void setDisplayOrientation(int i1)
    {
        if (!q)
        {
            throw new IllegalStateException("The camera is not open");
        }
        if (i1 < 0 || i1 % 90 > 0)
        {
            throw new IllegalArgumentException(String.valueOf(i1));
        }
        r = i1 % 360;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" got preview orientation ").append(r).append(" deg").toString());
        }
    }

    public void setParameters(CameraParameters cameraparameters)
    {
        if (!q)
        {
            throw new IllegalStateException("The camera is not open");
        }
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        if (m)
        {
            throw new IllegalStateException("Preview is started");
        }
        break MISSING_BLOCK_LABEL_47;
        cameraparameters;
        obj;
        JVM INSTR monitorexit ;
        throw cameraparameters;
        if (!f.getCapabilities().getSupportedImageFormats().contains(cameraparameters.getImageFormat()))
        {
            throw new IllegalArgumentException((new StringBuilder("Image format ")).append(cameraparameters.getImageFormat()).append(" is not supported").toString());
        }
        if (!f.getCapabilities().getSupportedResolutions().contains(cameraparameters.getResolution()))
        {
            throw new IllegalArgumentException((new StringBuilder("Resolution ")).append(cameraparameters.getResolution()).append(" is not supported").toString());
        }
        if (!f.getCapabilities().getSupportedFpsRanges().contains(cameraparameters.getFpsRange()))
        {
            throw new IllegalArgumentException((new StringBuilder("FPS range ")).append(cameraparameters.getFpsRange()).append(" is not supported").toString());
        }
        l.setImageFormat(cameraparameters.getImageFormat());
        l.setResolution(cameraparameters.getResolution());
        l.setFpsRange(cameraparameters.getFpsRange());
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" configured to ").append(cameraparameters).toString());
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public void setPreviewDisplay(Object obj)
    {
        if (!q)
        {
            throw new IllegalStateException("The camera is not open");
        }
        Object obj1 = k;
        obj1;
        JVM INSTR monitorenter ;
        if (m)
        {
            throw new IllegalStateException("Preview is started");
        }
        break MISSING_BLOCK_LABEL_47;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        if (o != null)
        {
            o.close();
            o = null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        if (!(obj instanceof SurfaceTexture)) goto _L2; else goto _L1
_L1:
        o = new PreviewRenderer(new Surface((SurfaceTexture)obj));
_L3:
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" preview display attached: ").append(obj).toString());
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
            o = new PreviewRenderer(((SurfaceHolder)obj).getSurface());
        }
          goto _L3
        throw new IllegalArgumentException((new StringBuilder("display is instance of ")).append(obj.getClass().getCanonicalName()).toString());
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" preview detached").toString());
        }
          goto _L4
    }

    public void startPreview()
        throws CaptureException
    {
label0:
        {
            if (!q)
            {
                throw new IllegalStateException("The camera is not open");
            }
            synchronized (k)
            {
                if (!m)
                {
                    break label0;
                }
            }
            return;
        }
        if (o == null)
        {
            throw new IllegalStateException("Preview display is not set");
        }
        break MISSING_BLOCK_LABEL_57;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        com.microsoft.dl.video.capture.impl.virtual.impl.SourceVideoFileList.VideoFile videofile;
        Object obj1;
        obj1 = new com.microsoft.dl.video.capture.impl.virtual.impl.SourceVideoFileList.Query();
        ((com.microsoft.dl.video.capture.impl.virtual.impl.SourceVideoFileList.Query) (obj1)).setName(f.getOptions().getVideoFileName());
        ((com.microsoft.dl.video.capture.impl.virtual.impl.SourceVideoFileList.Query) (obj1)).setImageFormat(l.getImageFormat());
        ((com.microsoft.dl.video.capture.impl.virtual.impl.SourceVideoFileList.Query) (obj1)).setResolution(l.getResolution());
        ((com.microsoft.dl.video.capture.impl.virtual.impl.SourceVideoFileList.Query) (obj1)).setFpsRange(l.getFpsRange());
        videofile = j.selectAny(((com.microsoft.dl.video.capture.impl.virtual.impl.SourceVideoFileList.Query) (obj1)));
        if (videofile != null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        throw new CaptureException((new StringBuilder("Could not find video file matching ")).append(obj1).toString());
        obj1 = new com.microsoft.dl.video.capture.impl.virtual.impl.FrameProducer.StampRect(f.getOptions().getStamp(), l.getResolution());
        g.logPreviewStart(f.getCapabilities().getCameraId(), l.getResolution().getWidth(), l.getResolution().getHeight(), l.getImageFormat().toString(), (new StringBuilder()).append(f.getCapabilities().getFacing().toString()).append("/").append(f.getCapabilities().getCameraId()).toString(), videofile.getFile().getAbsolutePath(), ((com.microsoft.dl.video.capture.impl.virtual.impl.FrameProducer.StampRect) (obj1)).getLeft(), ((com.microsoft.dl.video.capture.impl.virtual.impl.FrameProducer.StampRect) (obj1)).getTop(), ((com.microsoft.dl.video.capture.impl.virtual.impl.FrameProducer.StampRect) (obj1)).getSize());
        n = new FrameProducer(f.getCapabilities().getCameraId(), g, videofile.getFile().getAbsolutePath(), l.getImageFormat(), l.getResolution(), videofile.getFps() * 100, l.getFpsRange(), ((com.microsoft.dl.video.capture.impl.virtual.impl.FrameProducer.StampRect) (obj1)), new VideoFrameSourceCallback(this));
        m = true;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" started").toString());
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        IOException ioexception;
        ioexception;
        if (n != null)
        {
            n.close();
        }
        throw new CaptureException("Could not start capturing", ioexception);
    }

    public void stopPreview()
    {
label0:
        {
            if (!q)
            {
                throw new IllegalStateException("The camera is not open");
            }
            synchronized (k)
            {
                if (m)
                {
                    break label0;
                }
            }
            return;
        }
        if (n != null)
        {
            n.close();
            n = null;
        }
        m = false;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(f.getCapabilities().getCameraId()).append(" stopped").toString());
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
        a = new File(VirtualCameraManagerImpl.DIR, "video");
        b = ImageFormat.NV21;
    }
}
