// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.skype.android.util.Log;
import com.skype.android.video.hw.codec.encoder.camera.SurfaceObserver;
import com.skype.android.video.hw.codec.encoder.camera.capture.Capturer;
import com.skype.android.video.hw.codec.encoder.camera.capture.CapturerException;
import com.skype.android.video.hw.codec.encoder.camera.capture.CapturerParameters;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.capture:
//            AbstractPlatformCapturer

public class MediaCodecCapturer extends AbstractPlatformCapturer
{
    private static class Parameters
    {

        public int cameraId;
        public float framerate;
        public boolean isPreEncodingRC;
        public Resolution resolution;

        public String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [cameraId=").append(cameraId).append(", resolution=").append(resolution).append(", framerate=").append(framerate).append(", isPreEncodingRC").append(isPreEncodingRC).append("]").toString();
        }

        private Parameters()
        {
        }

    }


    private static final long CLOSE_TIMEOUT_MS = 2000L;
    private static final float MAX_RESOLUTION_ZOOM = 0.3333333F;
    private static final long RUNNER_SHUTDOWN_TIMEOUT_MS = 1000L;
    private static final float SENDER_SIDE_ROTATION_FIT_FACTOR = 0.5F;
    private Capturer capturer;
    private final com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.RunnerEvents capturerEventsHandler = new com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.RunnerEvents() {

        final MediaCodecCapturer this$0;

        public void onFailed(Exception exception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Failed", exception);
            }
            (new Thread(new Runnable() {

                final _cls1 this$1;

                public void run()
                {
                    MediaCodecCapturer.onCapturingFailed(nativeObj);
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            })).start();
            capturer.closeSinks();
        }

        public void onStarted()
        {
            synchronized (startMonitor)
            {
                if (Log.isLoggable("Capture", 4))
                {
                    Log.i("Capture", "Started");
                }
                isRunning = true;
                startMonitor.notifyAll();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onStopped()
        {
            synchronized (stopMonitor)
            {
                if (Log.isLoggable("Capture", 4))
                {
                    Log.i("Capture", "Stopped");
                }
                isRunning = false;
                stopMonitor.notifyAll();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = MediaCodecCapturer.this;
                super();
            }
    };
    private final Object controlCommandsMutex = new Object();
    private com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.Sink encoderSink;
    private final com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.SinkEvents encoderSinkEventsHandler = new com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.SinkEvents() {

        final MediaCodecCapturer this$0;

        public void onFrameCaptured(long l1)
        {
            MediaCodecCapturer.onFrameCaptured(nativeObj, 0, 0, null, l1);
        }

            
            {
                this$0 = MediaCodecCapturer.this;
                super();
            }
    };
    private volatile boolean isRunning;
    private final Parameters parameters = new Parameters();
    private com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.Sink previewSink;
    private final com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.SinkEvents previewSinkEventsHandler = new com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.SinkEvents() {

        final MediaCodecCapturer this$0;

        public void onFrameCaptured(long l1)
        {
        }

            
            {
                this$0 = MediaCodecCapturer.this;
                super();
            }
    };
    private final Object startMonitor = new Object();
    private final Object stopMonitor = new Object();

    public MediaCodecCapturer(long l, int i, int j, int k, float f)
    {
        super(l, i, new Resolution(j, k), f, 0.3333333F);
        parameters.cameraId = getCameraId();
        parameters.resolution = new Resolution(320, 240);
        parameters.framerate = 30F;
        capturer = new Capturer() {

            final MediaCodecCapturer this$0;

            protected long doOverrideFrameTimestamp(long l1)
            {
                return AbstractPlatformCapturer.getNativeTimestamp();
            }

            
            {
                this$0 = MediaCodecCapturer.this;
                super();
            }
        };
        previewSink = capturer.addPreviewSink(previewSinkEventsHandler);
        encoderSink = capturer.addEncoderSink(encoderSinkEventsHandler);
        previewSink.setEnabled(true);
    }

    private CapturerParameters composeCapturerParameters()
    {
        CapturerParameters capturerparameters = new CapturerParameters();
        capturerparameters.cameraId = parameters.cameraId;
        capturerparameters.cameraResolution = parameters.resolution;
        capturerparameters.framerate = parameters.framerate;
        capturerparameters.isPreEncodingRC = parameters.isPreEncodingRC;
        return capturerparameters;
    }

    private void setup()
        throws CapturerException
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Starting with ")).append(parameters).toString());
        }
        capturer.initialize(composeCapturerParameters(), capturerEventsHandler);
    }

    private void shutdown(long l)
    {
        if (capturer == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        capturer.terminate(l);
_L1:
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Interrupted", interruptedexception);
            return;
        }
          goto _L1
    }

    public boolean attachPreview(Object obj, int i, int j)
    {
        Object obj1;
        obj1 = obj;
        if (obj instanceof SurfaceHolder)
        {
            obj1 = ((SurfaceHolder)obj).getSurface();
        }
label0:
        {
            synchronized (controlCommandsMutex)
            {
                if (previewSink != null)
                {
                    break label0;
                }
            }
            return false;
        }
        com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.Sink sink;
        sink = previewSink;
        obj1 = (Surface)obj1;
        if (i <= 0 || j <= 0)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj = new Resolution(i, j);
_L1:
        sink.attachSurface(((Surface) (obj1)), ((Resolution) (obj)));
        obj2;
        JVM INSTR monitorexit ;
        return true;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Exception caught", ((Throwable) (obj)));
        }
        return false;
        obj = null;
          goto _L1
    }

    public volatile boolean banResolution(int i, int j)
    {
        return super.banResolution(i, j);
    }

    public void close()
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", "Closing");
        }
        synchronized (controlCommandsMutex)
        {
            shutdown(1000L);
            capturer.closeSinks();
            if (!stop(2000L) && Log.isLoggable("Capture", 5))
            {
                Log.w("Capture", "Could not close within 2000 ms. Abandoned");
            }
            capturer = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
        }
        return;
    }

    public boolean detachPreview()
    {
label0:
        {
            synchronized (controlCommandsMutex)
            {
                if (previewSink != null)
                {
                    break label0;
                }
            }
            return false;
        }
        previewSink.detachSurface();
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
        }
        return false;
    }

    public void enableSyncMode(boolean flag)
    {
        parameters.isPreEncodingRC = flag;
    }

    public int getCaptureHeight()
    {
        return 0;
    }

    public int getCaptureWidth()
    {
        return 0;
    }

    public SurfaceObserver getEncoderSurfaceObserver()
    {
        return encoderSink;
    }

    public volatile int getImageOrientation(int i)
    {
        return super.getImageOrientation(i);
    }

    public volatile float getMaxFramerate()
    {
        return super.getMaxFramerate();
    }

    public volatile boolean registerResolution(int i, int j)
    {
        return super.registerResolution(i, j);
    }

    public boolean setCallbackEnabled(boolean flag)
    {
label0:
        {
            synchronized (controlCommandsMutex)
            {
                if (encoderSink != null)
                {
                    break label0;
                }
            }
            return false;
        }
        encoderSink.setEnabled(flag);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
        }
        return false;
    }

    public boolean setCameraParameters(int i, int j, float f)
    {
        Object obj2;
        if (i > maxResolution.getWidth() || j > maxResolution.getHeight())
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", (new StringBuilder("Resolution ")).append(i).append("x").append(j).append(" exceeds maximum ").append(maxResolution).toString());
            }
            return false;
        }
        Object obj;
        boolean flag;
        if (i > 0 && j > 0)
        {
            obj = getNativeResolution(i, j);
        } else
        {
            obj = null;
        }
        obj2 = parameters;
        obj2;
        JVM INSTR monitorenter ;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Resolution requested ")).append(i).append("x").append(j).append(", selected ").append(obj).toString());
        }
        parameters.resolution = ((Resolution) (obj));
        if (f <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        parameters.framerate = f;
        obj2;
        JVM INSTR monitorexit ;
        obj2 = controlCommandsMutex;
        obj2;
        JVM INSTR monitorenter ;
        if (capturer == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        flag = capturer.isAlive();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        capturer.setCameraParameters(((Resolution) (obj)), f);
        obj2;
        JVM INSTR monitorexit ;
        return true;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Exception caught", ((Throwable) (obj1)));
        }
        shutdown(1000L);
        obj2;
        JVM INSTR monitorexit ;
        return false;
        obj1;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Exception caught", ((Throwable) (obj1)));
        }
        shutdown(1000L);
        obj2;
        JVM INSTR monitorexit ;
        return false;
    }

    public boolean setPreviewResolutioin(int i, int j)
    {
label0:
        {
            synchronized (controlCommandsMutex)
            {
                if (encoderSink != null)
                {
                    break label0;
                }
            }
            return false;
        }
        previewSink.setResolution(new Resolution(i, j));
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
        }
        return false;
    }

    public boolean setRotation(int i, boolean flag)
    {
        Object obj = controlCommandsMutex;
        obj;
        JVM INSTR monitorenter ;
        com.skype.android.video.hw.codec.encoder.camera.capture.Capturer.Sink sink;
        Exception exception;
        boolean flag1;
        boolean flag2;
        if (i % 180 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (previewSink != null)
        {
            previewSink.setRotationAngle((360 - i) % 360);
            if (cameraFacing == 0)
            {
                previewSink.setFlipped(flag1, flag1);
            }
        }
        if (encoderSink == null) goto _L2; else goto _L1
_L1:
        if (cameraFacing != 1) goto _L4; else goto _L3
_L3:
        sink = encoderSink;
        if (!flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        sink.setFlipped(flag2, flag1);
_L7:
        if (!flag) goto _L2; else goto _L5
_L5:
        encoderSink.setRotationAngle(i);
        encoderSink.setFitFactor(0.5F);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return true;
_L4:
        encoderSink.setFlipped(false, false);
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
        }
        return false;
    }

    public boolean start(long l)
    {
        boolean flag;
label0:
        {
            flag = true;
            synchronized (controlCommandsMutex)
            {
                if (capturer == null || !capturer.isAlive())
                {
                    break label0;
                }
            }
            return true;
        }
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", "Starting");
        }
        setup();
        synchronized (startMonitor)
        {
            if (!isRunning)
            {
                startMonitor.wait(l);
            }
        }
        capturer.start();
_L4:
        obj;
        JVM INSTR monitorexit ;
        obj = controlCommandsMutex;
        obj;
        JVM INSTR monitorenter ;
        Object obj2;
        if (capturer == null || !capturer.isStarted())
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", "Started");
        }
_L6:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        obj2;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Exception caught", ((Throwable) (obj2)));
        }
        shutdown(1000L);
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj2;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Exception caught", ((Throwable) (obj2)));
        }
        shutdown(1000L);
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj2;
        if (!Log.isLoggable("Capture", 6)) goto _L4; else goto _L3
_L3:
        Log.e("Capture", "Interrupted", ((Throwable) (obj2)));
          goto _L4
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!Log.isLoggable("Capture", 6)) goto _L6; else goto _L5
_L5:
        Log.e("Capture", "Failed to start");
          goto _L6
    }

    public boolean stop(long l)
    {
label0:
        {
            synchronized (controlCommandsMutex)
            {
                if (capturer != null && capturer.isAlive())
                {
                    break label0;
                }
            }
            return true;
        }
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", "Stopping");
        }
        shutdown(1000L);
        obj;
        JVM INSTR monitorexit ;
        obj = stopMonitor;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = isRunning;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        stopMonitor.wait(l);
_L2:
        obj;
        JVM INSTR monitorexit ;
        synchronized (controlCommandsMutex)
        {
            if (!capturer.isAlive())
            {
                break MISSING_BLOCK_LABEL_169;
            }
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Failed to stop");
            }
        }
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Object obj1;
        obj1;
        if (!Log.isLoggable("Capture", 6)) goto _L2; else goto _L1
_L1:
        Log.e("Capture", "Interrupted", ((Throwable) (obj1)));
          goto _L2
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", "Stopped");
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
    }



/*
    static boolean access$202(MediaCodecCapturer mediacodeccapturer, boolean flag)
    {
        mediacodeccapturer.isRunning = flag;
        return flag;
    }

*/


}
