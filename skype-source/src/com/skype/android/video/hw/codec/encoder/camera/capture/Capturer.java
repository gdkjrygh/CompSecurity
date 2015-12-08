// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import android.graphics.SurfaceTexture;
import com.skype.android.video.hw.codec.encoder.camera.SurfaceObserver;
import com.skype.android.video.hw.codec.encoder.camera.gl.GLException;
import com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import com.skype.android.video.hw.utils.Systrace;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerSinks, CapturerException, CapturerSource, CameraCapturerSource, 
//            CapturerParameters

public class Capturer
{
    private class Runner
        implements Closeable, Runnable
    {

        private static final long CAPTURE_TIMEOUT_MS = 0x7fffffffffffffffL;
        private final CapturerParameters capturerParameters;
        private final RunnerEvents cb;
        private volatile boolean shallRun;
        final Capturer this$0;

        public void close()
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Requesting exit").toString());
            }
            shallRun = false;
        }

        public void run()
        {
            if (capturerParameters == null)
            {
                throw new IllegalStateException("no capture parameters set");
            }
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Entering").toString());
            }
            if (channel == null)
            {
                setup(capturerParameters);
            }
            if (cb != null)
            {
                cb.onStarted();
            }
            while (shallRun) 
            {
                prepareNextFrame(0x7fffffffffffffffL);
            }
              goto _L1
            Object obj;
            obj;
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": UnexpectedException caught").toString(), ((Throwable) (obj)));
            }
            shutdown();
            isStarted = false;
            if (cb != null)
            {
                cb.onFailed(((Exception) (obj)));
            }
            if (cb != null)
            {
                cb.onStopped();
            }
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
            }
_L2:
            return;
_L1:
            shutdown();
            isStarted = false;
            if (cb != null)
            {
                cb.onStopped();
            }
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
                return;
            }
              goto _L2
            obj;
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Capturing has failed").toString(), ((Throwable) (obj)));
            }
            shutdown();
            isStarted = false;
            if (cb != null)
            {
                cb.onFailed(((Exception) (obj)));
            }
            if (cb != null)
            {
                cb.onStopped();
            }
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
                return;
            }
              goto _L2
            obj;
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Interrupted").toString());
            }
            shutdown();
            isStarted = false;
            if (cb != null)
            {
                cb.onStopped();
            }
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
                return;
            }
              goto _L2
            obj;
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Timeout expired").toString());
            }
            shutdown();
            isStarted = false;
            if (cb != null)
            {
                cb.onFailed(((Exception) (obj)));
            }
            if (cb != null)
            {
                cb.onStopped();
            }
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
                return;
            }
              goto _L2
            obj;
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": GL Error").toString());
            }
            shutdown();
            isStarted = false;
            if (cb != null)
            {
                cb.onStopped();
            }
            if (!Log.isLoggable("SLIQ", 4)) goto _L2; else goto _L3
_L3:
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
            return;
            obj;
            if (cb != null)
            {
                cb.onStopped();
            }
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer$Runner.getSimpleName()).append(": Leaving").toString());
            }
            throw obj;
        }

        public Runner(CapturerParameters capturerparameters, RunnerEvents runnerevents)
        {
            this$0 = Capturer.this;
            super();
            shallRun = true;
            capturerParameters = capturerparameters;
            cb = runnerevents;
        }
    }

    public static interface RunnerEvents
    {

        public abstract void onFailed(Exception exception);

        public abstract void onStarted();

        public abstract void onStopped();
    }

    public static interface Sink
        extends SurfaceObserver
    {

        public abstract void setEnabled(boolean flag);

        public abstract void setFitFactor(float f);

        public abstract void setFlipped(boolean flag, boolean flag1);

        public abstract void setResolution(Resolution resolution);

        public abstract void setRotationAngle(int i);
    }

    public static interface SinkEvents
    {

        public abstract void onFrameCaptured(long l);
    }


    private Resolution cameraResolution;
    protected CapturerSource captureSource;
    private SurfaceTextureChannel channel;
    private volatile boolean isStarted;
    private Runner runner;
    private Thread runnerThread;
    private final Object sinkMutex = new Object();
    private final CapturerSinks sinks = new CapturerSinks();

    public Capturer()
    {
    }

    private void prepareNextFrame(long l)
        throws CapturerException, InterruptedException, TimeoutException
    {
        if (channel == null)
        {
            throw new IllegalStateException("closed");
        }
        l = channel.acquireFrame(l);
        synchronized (sinkMutex)
        {
            sinks.syncWith(channel);
            channel.pushAndRenderFrame(l);
        }
        Systrace.end();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        throw new CapturerException("Failed to push a frame through SurfaceTextureChannel", ((Throwable) (obj1)));
        obj1;
        Systrace.end();
        throw obj1;
    }

    private void shutdown()
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Closing").toString());
        }
        if (captureSource != null)
        {
            try
            {
                captureSource.close();
            }
            catch (IOException ioexception) { }
            captureSource = null;
        }
        if (channel != null)
        {
            channel.close();
            channel = null;
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Closed").toString());
        }
    }

    public Sink addEncoderSink(SinkEvents sinkevents)
    {
        this;
        JVM INSTR monitorenter ;
        sinkevents = sinks.addEncoderSink(sinkMutex, sinkevents, channel);
        this;
        JVM INSTR monitorexit ;
        return sinkevents;
        sinkevents;
        throw sinkevents;
    }

    public Sink addPreviewSink(SinkEvents sinkevents)
    {
        this;
        JVM INSTR monitorenter ;
        sinkevents = sinks.addPreviewSink(sinkMutex, sinkevents);
        this;
        JVM INSTR monitorexit ;
        return sinkevents;
        sinkevents;
        throw sinkevents;
    }

    public void closeSinks()
    {
        this;
        JVM INSTR monitorenter ;
        sinks.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected CapturerSource doCreateCapturerSource(CapturerParameters capturerparameters)
        throws CapturerException
    {
        return new CameraCapturerSource(capturerparameters.cameraId);
    }

    protected long doOverrideFrameTimestamp(long l)
    {
        return l;
    }

    public void initialize(CapturerParameters capturerparameters, RunnerEvents runnerevents)
    {
        this;
        JVM INSTR monitorenter ;
        if (isAlive())
        {
            throw new IllegalStateException("already running");
        }
        break MISSING_BLOCK_LABEL_24;
        capturerparameters;
        this;
        JVM INSTR monitorexit ;
        throw capturerparameters;
        runner = new Runner(capturerparameters, runnerevents);
        runnerThread = new Thread(runner, com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getCanonicalName());
        runnerThread.start();
        this;
        JVM INSTR monitorexit ;
    }

    public boolean isAlive()
    {
        this;
        JVM INSTR monitorenter ;
        if (runnerThread == null) goto _L2; else goto _L1
_L1:
        boolean flag = runnerThread.isAlive();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isStarted()
    {
        return isAlive() && isStarted;
    }

    public void removeSink(Sink sink)
    {
        this;
        JVM INSTR monitorenter ;
        sinks.removeSink(sink);
        this;
        JVM INSTR monitorexit ;
        return;
        sink;
        throw sink;
    }

    public void setCameraFramerate(float f)
        throws CapturerException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Switching camera to ").append(f).append(" fps").toString());
        }
        flag = isStarted;
        if (isStarted)
        {
            stop();
        }
        captureSource.setFramerate((int)(1000F * f));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setCameraParameters(Resolution resolution, float f)
        throws CapturerException
    {
        this;
        JVM INSTR monitorenter ;
        if (!Log.isLoggable("SLIQ", 4)) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder = (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Switching camera to ");
        Object obj;
        int i;
        boolean flag;
        if (resolution != null)
        {
            obj = resolution;
        } else
        {
            obj = "";
        }
        stringbuilder = stringbuilder.append(obj);
        if (f <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = (new StringBuilder("@")).append(f).append(" fps").toString();
_L3:
        Log.i("SLIQ", stringbuilder.append(((String) (obj))).toString());
_L2:
        flag = isStarted;
        if (isStarted)
        {
            stop();
        }
        obj = captureSource;
        if (f > 0.0F)
        {
            i = (int)(1000F * f);
        } else
        {
            i = 0;
        }
        ((CapturerSource) (obj)).configure(resolution, i);
        if (resolution == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        channel.setInputResolution(resolution);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        start();
        this;
        JVM INSTR monitorexit ;
        return;
        obj = "";
          goto _L3
        resolution;
        throw resolution;
    }

    public void setCameraResolution(Resolution resolution)
        throws CapturerException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Switching camera to ").append(resolution).toString());
        }
        flag = isStarted;
        if (isStarted)
        {
            stop();
        }
        captureSource.setResolution(resolution);
        channel.setInputResolution(resolution);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        start();
        this;
        JVM INSTR monitorexit ;
        return;
        resolution;
        throw resolution;
    }

    protected void setup(CapturerParameters capturerparameters)
        throws CapturerException, GLException
    {
        cameraResolution = capturerparameters.cameraResolution;
        try
        {
            channel = new SurfaceTextureChannel(capturerparameters.isPreEncodingRC) {

                final Capturer this$0;

                protected long getTimestamp(SurfaceTexture surfacetexture)
                {
                    return doOverrideFrameTimestamp(surfacetexture.getTimestamp());
                }

            
            {
                this$0 = Capturer.this;
                super(flag);
            }
            };
            sinks.syncWith(channel);
            sinks.setChannel(channel);
        }
        // Misplaced declaration of an exception variable
        catch (CapturerParameters capturerparameters)
        {
            try
            {
                throw new CapturerException("Failed to create SurfaceTextureChannel", capturerparameters);
            }
            // Misplaced declaration of an exception variable
            catch (CapturerParameters capturerparameters)
            {
                if (Log.isLoggable("SLIQ", 6))
                {
                    Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Initialization failed. Closing").toString());
                }
                shutdown();
                throw capturerparameters;
            }
            // Misplaced declaration of an exception variable
            catch (CapturerParameters capturerparameters)
            {
                if (Log.isLoggable("SLIQ", 6))
                {
                    Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Initialization failed. Closing").toString());
                }
                shutdown();
                throw capturerparameters;
            }
            // Misplaced declaration of an exception variable
            catch (CapturerParameters capturerparameters) { }
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Initialization failed. Closing").toString());
            }
            shutdown();
            throw capturerparameters;
        }
        channel.setInputResolution(cameraResolution);
        captureSource = doCreateCapturerSource(capturerparameters);
        captureSource.configure(capturerparameters.cameraResolution, (int)(capturerparameters.framerate * 1000F));
        captureSource.setSurfaceTexture(channel.getInput());
        channel.freeContext();
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Initialized").toString());
        }
        return;
    }

    public void start()
        throws CapturerException
    {
        this;
        JVM INSTR monitorenter ;
        if (captureSource == null)
        {
            throw new IllegalStateException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!isStarted)
        {
            captureSource.start();
            isStarted = true;
        }
        this;
        JVM INSTR monitorexit ;
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        if (captureSource == null)
        {
            throw new IllegalStateException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (isStarted)
        {
            captureSource.stop();
            isStarted = false;
        }
        this;
        JVM INSTR monitorexit ;
    }

    public void terminate(long l)
        throws InterruptedException
    {
        this;
        JVM INSTR monitorenter ;
        if (isStarted)
        {
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Stopping capture source").toString());
            }
            stop();
        }
        if (isAlive())
        {
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Shutting down the runner").toString());
            }
            runner.close();
            channel.interrupt();
            runnerThread.join(l);
        }
        if (isAlive() && Log.isLoggable("SLIQ", 5))
        {
            Log.w("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Runner thead did not exit in ").append(l).append(" ms").toString());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }





/*
    static boolean access$302(Capturer capturer, boolean flag)
    {
        capturer.isStarted = flag;
        return flag;
    }

*/
}
