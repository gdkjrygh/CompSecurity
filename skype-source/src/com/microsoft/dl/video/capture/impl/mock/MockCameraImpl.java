// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.mock;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.Camera;
import com.microsoft.dl.video.capture.api.CameraCallback;
import com.microsoft.dl.video.capture.api.CameraCapabilities;
import com.microsoft.dl.video.capture.api.CameraParameters;
import com.microsoft.dl.video.capture.api.CaptureException;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.microsoft.dl.video.capture.impl.mock:
//            MockCamera

public class MockCameraImpl
    implements Camera, MockCamera
{
    private static class EventHandler extends Handler
    {

        private final MockCameraImpl a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                if (Log.isLoggable("Capture", 6))
                {
                    Log.e("Capture", (new StringBuilder("Unknown message ")).append(message).toString());
                }
                return;

            case 0: // '\0'
                byte abyte0[] = (byte[])message.obj;
                long l = message.arg1;
                MockCameraImpl.a(a, abyte0, l);
                return;
            }
        }

        public EventHandler(MockCameraImpl mockcameraimpl)
        {
            Looper looper1 = Looper.myLooper();
            Looper looper = looper1;
            if (looper1 != null)
            {
                looper = Looper.getMainLooper();
            }
            super(looper);
            a = mockcameraimpl;
        }
    }


    private final CameraCapabilities a;
    private final CameraParameters b = new CameraParameters();
    private final EventHandler c = new EventHandler(this);
    private final Deque d = new ArrayDeque();
    private final AtomicReference e = new AtomicReference();
    private volatile boolean f;
    private volatile boolean g;
    private final Object h = new Object();
    private Object i;

    public MockCameraImpl(CameraCapabilities cameracapabilities)
        throws CaptureException
    {
        f = true;
        a = cameracapabilities;
        b.setImageFormat((ImageFormat)a.getSupportedImageFormats().iterator().next());
        b.setResolution((Resolution)a.getSupportedResolutions().iterator().next());
        b.setFpsRange((FpsRange)a.getSupportedFpsRanges().iterator().next());
    }

    static boolean a(MockCameraImpl mockcameraimpl, byte abyte0[], long l)
    {
        byte abyte1[] = mockcameraimpl.a(abyte0.length, l);
        if (abyte1 == null)
        {
            if (Log.isLoggable("Capture", 5))
            {
                Log.w("Capture", (new StringBuilder("Could not get the buffer for ")).append(abyte0.length).append(" bytes in ").append(l).append(" ms. Skipping the frame.").toString());
            }
            return false;
        }
        System.arraycopy(abyte0, 0, abyte1, 0, Math.min(abyte0.length, abyte1.length));
        abyte0 = (CameraCallback)mockcameraimpl.e.get();
        if (!mockcameraimpl.f || !mockcameraimpl.g || abyte0 == null)
        {
            if (Log.isLoggable("Capture", 5))
            {
                Log.w("Capture", "The camera is not ready to process the frame. Skipping.");
            }
            return false;
        } else
        {
            abyte0.onFrame(abyte1, mockcameraimpl);
            return true;
        }
    }

    private byte[] a(int j, long l)
    {
        if (e.get() == null)
        {
            return null;
        }
        Deque deque = d;
        deque;
        JVM INSTR monitorenter ;
        boolean flag = d.isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        d.wait(l);
        Object obj = (byte[])d.pop();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        deque;
        JVM INSTR monitorexit ;
        return null;
        obj;
        if (Log.isLoggable("Capture", 5))
        {
            Log.w("Capture", "Interrupted", ((Throwable) (obj)));
        }
        deque;
        JVM INSTR monitorexit ;
        return null;
        obj;
        deque;
        JVM INSTR monitorexit ;
        return null;
        if (obj.length < j)
        {
            throw new RuntimeException((new StringBuilder("Insuficient buffer size: ")).append(obj.length).append(" instead of ").append(j).toString());
        }
        break MISSING_BLOCK_LABEL_152;
        obj;
        deque;
        JVM INSTR monitorexit ;
        throw obj;
        deque;
        JVM INSTR monitorexit ;
        return ((byte []) (obj));
    }

    public final void addCallbackBuffer(byte abyte0[])
        throws CaptureException
    {
        Deque deque = d;
        deque;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new CaptureException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        abyte0;
        deque;
        JVM INSTR monitorexit ;
        throw abyte0;
        d.addLast(abyte0);
        d.notifyAll();
        deque;
        JVM INSTR monitorexit ;
    }

    public final void close()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new IllegalStateException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        f = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public final CameraParameters getParameters()
        throws CaptureException
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new CaptureException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        CameraParameters cameraparameters = b.clone();
        obj;
        JVM INSTR monitorexit ;
        return cameraparameters;
    }

    public final boolean pushFrame(byte abyte0[], int j, int k)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!g)
        {
            throw new IllegalStateException("Preview is not started");
        }
        break MISSING_BLOCK_LABEL_32;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        boolean flag = c.sendMessageDelayed(c.obtainMessage(0, j, 0, abyte0), k);
        obj;
        JVM INSTR monitorexit ;
        return flag;
    }

    public final void setCallback(CameraCallback cameracallback)
        throws CaptureException
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new CaptureException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        cameracallback;
        obj;
        JVM INSTR monitorexit ;
        throw cameracallback;
        if (cameracallback == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (g)
        {
            throw new CaptureException("Can not set callack during the capturing");
        }
        if (cameracallback != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        synchronized (d)
        {
            d.clear();
        }
        e.set(cameracallback);
        obj;
        JVM INSTR monitorexit ;
        return;
        cameracallback;
        deque;
        JVM INSTR monitorexit ;
        throw cameracallback;
    }

    public final void setDisplayOrientation(int j)
        throws CaptureException
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new CaptureException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (g)
        {
            throw new CaptureException("Can not set display orientation during the capturing");
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public final void setParameters(CameraParameters cameraparameters)
        throws CaptureException
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new CaptureException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        cameraparameters;
        obj;
        JVM INSTR monitorexit ;
        throw cameraparameters;
        if (g)
        {
            throw new CaptureException("Can not set parameters during the capturing");
        }
        if (!a.getSupportedImageFormats().contains(cameraparameters.getImageFormat()))
        {
            throw new CaptureException((new StringBuilder("Image format ")).append(cameraparameters.getImageFormat()).append(" is not supported").toString());
        }
        if (!a.getSupportedResolutions().contains(cameraparameters.getResolution()))
        {
            throw new CaptureException((new StringBuilder("Resolution ")).append(cameraparameters.getResolution()).append(" is not supported").toString());
        }
        if (!a.getSupportedFpsRanges().contains(cameraparameters.getFpsRange()))
        {
            throw new CaptureException((new StringBuilder("FPS range ")).append(cameraparameters.getFpsRange()).append(" is not supported").toString());
        }
        b.setImageFormat(cameraparameters.getImageFormat());
        b.setResolution(cameraparameters.getResolution());
        b.setFpsRange(cameraparameters.getFpsRange());
        obj;
        JVM INSTR monitorexit ;
    }

    public final void setPreviewDisplay(Object obj)
        throws CaptureException
    {
        Object obj1 = h;
        obj1;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new CaptureException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        if (g)
        {
            throw new CaptureException("Can not set preview display during the capturing");
        }
        i = obj;
        obj1;
        JVM INSTR monitorexit ;
    }

    public final void startPreview()
        throws CaptureException
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new CaptureException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (g)
        {
            throw new CaptureException("Preview was already started");
        }
        if (i == null)
        {
            throw new CaptureException("No preview display set");
        }
        g = true;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void stopPreview()
        throws CaptureException
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!f)
        {
            throw new CaptureException("The camera is not open");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (!g)
        {
            throw new CaptureException("Preview was not started");
        }
        g = false;
        obj;
        JVM INSTR monitorexit ;
    }
}
