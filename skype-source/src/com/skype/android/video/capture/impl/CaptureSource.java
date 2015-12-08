// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture.impl;

import android.os.Looper;
import android.view.SurfaceHolder;
import com.skype.android.platform.capture.Camera;
import com.skype.android.platform.capture.CameraCallback;
import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.CameraInfo;
import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraManagerSingleton;
import com.skype.android.platform.capture.CameraParameters;
import com.skype.android.platform.capture.CaptureException;
import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.util.Log;
import com.skype.android.util.Systrace;
import com.skype.android.video.hw.format.Resolution;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;

// Referenced classes of package com.skype.android.video.capture.impl:
//            FrameConsumer

public class CaptureSource
    implements CameraCallback, Closeable, Runnable
{
    public static final class CameraState extends Enum
    {

        private static final CameraState $VALUES[];
        public static final CameraState CLOSED;
        public static final CameraState INVALID;
        public static final CameraState STARTED;
        public static final CameraState STOPPED;

        public static CameraState valueOf(String s)
        {
            return (CameraState)Enum.valueOf(com/skype/android/video/capture/impl/CaptureSource$CameraState, s);
        }

        public static CameraState[] values()
        {
            return (CameraState[])$VALUES.clone();
        }

        static 
        {
            STARTED = new CameraState("STARTED", 0);
            STOPPED = new CameraState("STOPPED", 1);
            CLOSED = new CameraState("CLOSED", 2);
            INVALID = new CameraState("INVALID", 3);
            $VALUES = (new CameraState[] {
                STARTED, STOPPED, CLOSED, INVALID
            });
        }

        private CameraState(String s, int i)
        {
            super(s, i);
        }
    }

    private static class Parameters
    {

        public int angle;
        public Object display;
        public FpsRange fpsRange;
        public ImageFormat imageFormat;
        public Resolution resolution;

        public String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [resolution=").append(resolution).append(", imageFormat=").append(imageFormat).append(", fpsRange=").append(fpsRange).append(", display=").append(display).append(", angle=").append(angle).append("]").toString();
        }

        private Parameters()
        {
        }

    }


    private static final FpsRange DEFAULT_FPS_RANGE = new FpsRange(5000, 30000);
    private static final int NUM_BUFFERS = 3;
    private static final String TAG = "Capture";
    private Camera camera;
    private final int cameraId;
    private CameraState cameraState;
    private final Object cameraStateMonitor = new Integer(0);
    private final FrameConsumer frameConsumer;
    private volatile boolean hasPreview;
    private Looper looper;
    private final Resolution maxResolution;
    private final Parameters parameters = new Parameters(null);

    public CaptureSource(int i, FrameConsumer frameconsumer, Resolution resolution)
    {
        cameraState = CameraState.CLOSED;
        hasPreview = false;
        cameraId = i;
        frameConsumer = frameconsumer;
        maxResolution = resolution;
    }

    private static int getBufferSize(ImageFormat imageformat, Resolution resolution)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$skype$android$platform$capture$CameraInfo$Facing[];
            static final int $SwitchMap$com$skype$android$platform$capture$ImageFormat[];

            static 
            {
                $SwitchMap$com$skype$android$platform$capture$ImageFormat = new int[ImageFormat.values().length];
                try
                {
                    $SwitchMap$com$skype$android$platform$capture$ImageFormat[ImageFormat.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$platform$capture$ImageFormat[ImageFormat.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                $SwitchMap$com$skype$android$platform$capture$CameraInfo$Facing = new int[com.skype.android.platform.capture.CameraInfo.Facing.values().length];
                try
                {
                    $SwitchMap$com$skype$android$platform$capture$CameraInfo$Facing[com.skype.android.platform.capture.CameraInfo.Facing.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$platform$capture$CameraInfo$Facing[com.skype.android.platform.capture.CameraInfo.Facing.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.platform.capture.ImageFormat[imageformat.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("imageFormat=")).append(imageformat).toString());

        case 1: // '\001'
        case 2: // '\002'
            return (resolution.getWidth() * resolution.getHeight() * 3) / 2;
        }
    }

    private static int getOrientation(int i, int j)
        throws CaptureException
    {
        CameraInfo camerainfo = CameraManagerSingleton.a().b(j);
        switch (_cls1..SwitchMap.com.skype.android.platform.capture.CameraInfo.Facing[camerainfo.a().ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("cameraInfo.facing=")).append(camerainfo.a()).toString());

        case 1: // '\001'
            return (360 - (camerainfo.b() + i) % 360) % 360;

        case 2: // '\002'
            return ((camerainfo.b() - i) + 360) % 360;
        }
    }

    private static String idOf(Object obj)
    {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    private void setup(Camera camera1)
        throws CaptureException
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Applying ")).append(parameters).toString());
        }
        Parameters parameters1 = parameters;
        parameters1;
        JVM INSTR monitorenter ;
        CameraParameters cameraparameters;
        cameraparameters = camera1.b();
        cameraparameters.a(parameters.resolution);
        cameraparameters.a(parameters.imageFormat);
        cameraparameters.a(parameters.fpsRange);
        camera1.a(cameraparameters);
_L1:
        setPreviewDisplay((SurfaceHolder)parameters.display);
        camera1.a(getOrientation(parameters.angle, camera1.a().a()));
        return;
        CaptureException captureexception;
        captureexception;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Setting params to camera failed, trying capped FPS range ")).append(DEFAULT_FPS_RANGE).append(" instead of native one ").append(parameters.fpsRange).toString());
        }
        cameraparameters.a(DEFAULT_FPS_RANGE);
        parameters.fpsRange = DEFAULT_FPS_RANGE;
        camera1.a(cameraparameters);
          goto _L1
        camera1;
        parameters1;
        JVM INSTR monitorexit ;
        throw camera1;
    }

    private boolean stopPreview(boolean flag)
        throws CaptureException, IOException
    {
        Object obj = cameraStateMonitor;
        obj;
        JVM INSTR monitorenter ;
        if (cameraState == CameraState.INVALID)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (cameraState == CameraState.STOPPED)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (cameraState != CameraState.CLOSED)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        boolean flag1 = false;
        if (cameraState != CameraState.STARTED)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        camera.a(null);
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Stopping preview from camera ")).append(cameraId).toString());
        }
        camera.d();
        cameraState = CameraState.STOPPED;
        flag1 = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Closing camera ")).append(cameraId).toString());
        }
        camera.close();
        camera = null;
        cameraState = CameraState.CLOSED;
        flag1 = true;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        cameraStateMonitor.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void threadProc()
        throws IOException, InterruptedException, CaptureException
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Opening camera ")).append(cameraId).toString());
        }
        if (looper == null)
        {
            Looper.prepare();
            looper = Looper.myLooper();
        }
        camera = CameraManagerSingleton.a().a(cameraId);
        setup(camera);
        startPreview();
        Looper.loop();
        stopPreview(true);
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Could not start camera", ((Throwable) (obj)));
        }
        synchronized (cameraStateMonitor)
        {
            cameraState = CameraState.INVALID;
            cameraStateMonitor.notify();
        }
        stopPreview(true);
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        obj1;
        stopPreview(true);
        throw obj1;
        obj1;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Could not start camera", ((Throwable) (obj1)));
        }
        synchronized (cameraStateMonitor)
        {
            cameraState = CameraState.INVALID;
            cameraStateMonitor.notify();
        }
        stopPreview(true);
        return;
        exception1;
        obj2;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void close()
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Requesting stop capturing from camera ")).append(cameraId).toString());
        }
        StringBuilder stringbuilder;
        boolean flag;
        flag = stopPreview(true);
        if (!Log.isLoggable("Capture", 4))
        {
            break MISSING_BLOCK_LABEL_96;
        }
        stringbuilder = (new StringBuilder("Preview from the camera ")).append(cameraId);
        String s;
        if (flag)
        {
            s = " was";
        } else
        {
            s = " was not";
        }
        Log.i("Capture", stringbuilder.append(s).append(" stopped").toString());
        Thread.sleep(100L);
_L2:
        if (looper != null)
        {
            looper.quit();
            looper = null;
        }
        return;
        Object obj;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Failed to stop preview from the camera ")).append(cameraId).toString(), ((Throwable) (obj)));
        }
        continue; /* Loop/switch isn't completed */
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Failed to stop preview from the camera ")).append(cameraId).toString(), ((Throwable) (obj)));
        }
        continue; /* Loop/switch isn't completed */
        obj;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", "close() interrupted");
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int getCameraId()
    {
        return cameraId;
    }

    public Resolution getResolution()
    {
        Resolution resolution;
        synchronized (parameters)
        {
            resolution = parameters.resolution;
        }
        return resolution;
        exception;
        parameters1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onFrame(byte abyte0[], Camera camera1)
    {
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", (new StringBuilder("Frame buffer ")).append(idOf(abyte0)).append(" arrived").toString());
        }
        Systrace.begin(com.skype.android.util.Systrace.Section.a);
        if (!hasPreview)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        int i;
        int j;
        synchronized (parameters)
        {
            i = parameters.resolution.getWidth();
            j = parameters.resolution.getHeight();
        }
        frameConsumer.onFrameArrived(abyte0, i, j);
        camera1.a(abyte0);
_L2:
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", (new StringBuilder("Frame buffer ")).append(idOf(abyte0)).append(" returned").toString());
        }
        Systrace.end();
        return;
        abyte0;
        parameters1;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0;
        Systrace.end();
        throw abyte0;
        camera1;
        if (!Log.isLoggable("Capture", 6)) goto _L2; else goto _L1
_L1:
        Log.e("Capture", "Failed to return buffer", camera1);
          goto _L2
    }

    public void run()
    {
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", "Entering thread proc");
        }
        threadProc();
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", "Leaving thread proc");
        }
_L1:
        return;
        Exception exception;
        exception;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Thread proc is interupted by exception", exception);
            return;
        }
          goto _L1
    }

    public void setParameters(Resolution resolution, FpsRange fpsrange, ImageFormat imageformat)
        throws CaptureException
    {
        Parameters parameters1 = parameters;
        parameters1;
        JVM INSTR monitorenter ;
        if (resolution == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        parameters.resolution = resolution;
        if (fpsrange == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        parameters.fpsRange = fpsrange;
        if (imageformat == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parameters.imageFormat = imageformat;
        resolution = ((Resolution) (cameraStateMonitor));
        resolution;
        JVM INSTR monitorenter ;
        if (camera == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = stopPreview();
        fpsrange = camera.b();
        fpsrange.a(parameters.resolution);
        fpsrange.a(parameters.fpsRange);
        fpsrange.a(parameters.imageFormat);
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Applying ")).append(fpsrange).append(" to camera ").append(cameraId).toString());
        }
        camera.a(fpsrange);
_L5:
        if (!flag) goto _L2; else goto _L3
_L3:
        startPreview();
_L2:
        resolution;
        JVM INSTR monitorexit ;
        parameters1;
        JVM INSTR monitorexit ;
        return;
        imageformat;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Setting params to camera failed, trying capped FPS range ")).append(DEFAULT_FPS_RANGE).append(" instead of native one ").append(parameters.fpsRange).toString());
        }
        fpsrange.a(DEFAULT_FPS_RANGE);
        parameters.fpsRange = DEFAULT_FPS_RANGE;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Applying ")).append(fpsrange).append(" to camera ").append(cameraId).toString());
        }
        camera.a(fpsrange);
        if (true) goto _L5; else goto _L4
_L4:
        fpsrange;
        resolution;
        JVM INSTR monitorexit ;
        throw fpsrange;
        resolution;
        parameters1;
        JVM INSTR monitorexit ;
        throw resolution;
    }

    public void setPreviewDisplay(SurfaceHolder surfaceholder)
        throws CaptureException
    {
        Parameters parameters1 = parameters;
        parameters1;
        JVM INSTR monitorenter ;
        parameters.display = surfaceholder;
        surfaceholder = ((SurfaceHolder) (cameraStateMonitor));
        surfaceholder;
        JVM INSTR monitorenter ;
        boolean flag;
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        flag = stopPreview();
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Setting preview display ")).append(parameters.display).append(" on camera ").append(cameraId).toString());
        }
        if (parameters.display == null)
        {
            hasPreview = false;
        }
        camera.a(parameters.display);
        if (parameters.display != null)
        {
            hasPreview = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        if (parameters.display != null)
        {
            startPreview();
        }
        surfaceholder;
        JVM INSTR monitorexit ;
        parameters1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        surfaceholder;
        JVM INSTR monitorexit ;
        throw exception;
        surfaceholder;
        parameters1;
        JVM INSTR monitorexit ;
        throw surfaceholder;
    }

    public void setPreviewOrientation(int i)
        throws CaptureException
    {
        Parameters parameters1 = parameters;
        parameters1;
        JVM INSTR monitorenter ;
        Object obj = cameraStateMonitor;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        parameters.angle = i;
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        flag = stopPreview();
        i = getOrientation(parameters.angle, cameraId);
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Setting preview angle ")).append(parameters.angle).append(" (adjusted to ").append(i).append(") on camera ").append(cameraId).toString());
        }
        camera.a(i);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        startPreview();
        obj;
        JVM INSTR monitorexit ;
        parameters1;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        parameters1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean startPreview()
        throws CaptureException
    {
        Parameters parameters1 = parameters;
        parameters1;
        JVM INSTR monitorenter ;
        synchronized (cameraStateMonitor)
        {
            if (cameraState != CameraState.STARTED)
            {
                break MISSING_BLOCK_LABEL_30;
            }
        }
        parameters1;
        JVM INSTR monitorexit ;
        return false;
        byte abyte0[][];
        int k;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Starting preview from camera ")).append(cameraId).toString());
        }
        int i = getBufferSize(parameters.imageFormat, maxResolution);
        abyte0 = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            3, i
        });
        k = abyte0.length;
        int j = 0;
_L2:
        byte abyte1[];
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte1 = abyte0[j];
        camera.a(abyte1);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        camera.a(this);
        camera.c();
        cameraState = CameraState.STARTED;
        cameraStateMonitor.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        parameters1;
        JVM INSTR monitorexit ;
        return true;
        obj;
        parameters1;
        JVM INSTR monitorexit ;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean stopPreview()
        throws CaptureException
    {
        boolean flag;
        try
        {
            flag = stopPreview(false);
        }
        catch (IOException ioexception)
        {
            throw new CaptureException("Could not stop preview", ioexception);
        }
        return flag;
    }

    public void waitUntil(CameraState camerastate)
        throws InterruptedException, CaptureException
    {
        Object obj = cameraStateMonitor;
        obj;
        JVM INSTR monitorenter ;
_L1:
        if (cameraState == camerastate)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (cameraState == CameraState.INVALID)
        {
            throw new CaptureException((new StringBuilder()).append(getClass().getSimpleName()).append(" is in wrong state").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        camerastate;
        obj;
        JVM INSTR monitorexit ;
        throw camerastate;
        cameraStateMonitor.wait();
          goto _L1
        obj;
        JVM INSTR monitorexit ;
    }

}
