// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.skype.android.video.hw.codec.encoder.camera.gl.GLException;
import com.skype.android.video.hw.codec.encoder.camera.gl.VirtualSourceGenerator;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerSource, CapturerException

public class VirtualCaptureSource
    implements CapturerSource
{
    private class Runner
        implements Runnable
    {

        final VirtualCaptureSource this$0;

        public void run()
        {
            synchronized (nativeObjMutex)
            {
                timestamp = getFrame(nativeObj);
            }
            writeFrame();
_L1:
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            GLException glexception;
            glexception;
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Exception caught!", glexception);
                return;
            }
              goto _L1
        }

        private Runner()
        {
            this$0 = VirtualCaptureSource.this;
            super();
        }

    }


    private ScheduledFuture activeTask;
    private final Object activeTaskMutex = new Object();
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private ByteBuffer frameData;
    private int frameSize;
    private int framerate;
    private long nativeObj;
    private final Object nativeObjMutex = new Object();
    private final Runnable runner = new Runner();
    private Resolution sourceResolution;
    private Surface surface;
    private final Object surfaceMutex = new Object();
    private SurfaceTexture surfaceTexture;
    private volatile long timestamp;
    private final boolean useRunner;
    private VirtualSourceGenerator virtualSource;

    public VirtualCaptureSource(boolean flag)
        throws GLException
    {
        useRunner = flag;
        nativeObj = createNative(useRunner);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Created. nativeObj=0x").append(Long.toHexString(nativeObj)).toString());
        }
        virtualSource = new VirtualSourceGenerator();
        timestamp = 0x989680L;
    }

    private native long createNative(boolean flag);

    private native void deleteNative(long l);

    private native long getFrame(long l);

    private native void setResolution(long l, int i, int j, ByteBuffer bytebuffer);

    private void startRunner()
    {
        Object obj = activeTaskMutex;
        obj;
        JVM INSTR monitorenter ;
        if (activeTask != null)
        {
            throw new IllegalStateException("already running");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        long l = 0x3b9aca00 / framerate;
        activeTask = executor.scheduleAtFixedRate(runner, 0L, l, TimeUnit.MICROSECONDS);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Runner task scheduled with period ").append((float)l / 1000F).append(" ms").toString());
        }
        obj;
        JVM INSTR monitorexit ;
    }

    private void stopRunner()
    {
        Object obj = activeTaskMutex;
        obj;
        JVM INSTR monitorenter ;
        if (activeTask == null)
        {
            throw new IllegalStateException("not running");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (activeTask.cancel(false))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (Log.isLoggable("SLIQ", 5))
        {
            Log.w("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Could not cancel active task").toString());
        }
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Runner task canceled").toString());
        }
        activeTask = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private native void unlock(long l);

    private void writeFrame()
        throws GLException
    {
        Object obj = surfaceMutex;
        obj;
        JVM INSTR monitorenter ;
        virtualSource.renderOneFrame(frameData, timestamp);
_L1:
        return;
        Object obj1;
        obj1;
        Log.e("SLIQ", "", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void close()
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Closing. nativeObj=0x").append(Long.toHexString(nativeObj)).toString());
        }
        synchronized (activeTaskMutex)
        {
            if (activeTask != null)
            {
                stop();
            }
        }
        setSurfaceTexture(null);
        synchronized (nativeObjMutex)
        {
            if (nativeObj != 0L)
            {
                deleteNative(nativeObj);
                nativeObj = 0L;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public void configure(Resolution resolution, int i)
        throws CapturerException
    {
        setResolution(resolution);
        setFramerate(i);
    }

    public void frameAvailableCallback()
    {
        synchronized (nativeObjMutex)
        {
            timestamp = getFrame(nativeObj);
        }
        writeFrame();
_L1:
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        GLException glexception;
        glexception;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Exception caught!", glexception);
            return;
        }
          goto _L1
    }

    public long getNativeCtx()
    {
        return nativeObj;
    }

    public void resolutionChangedCallback(int i, int j)
    {
        Object obj = nativeObjMutex;
        obj;
        JVM INSTR monitorenter ;
        sourceResolution = new Resolution(i, j);
        setResolution(sourceResolution);
_L2:
        return;
        Object obj1;
        obj1;
        if (!Log.isLoggable("SLIQ", 6)) goto _L2; else goto _L1
_L1:
        Log.e("SLIQ", "Exception caught!", ((Throwable) (obj1)));
          goto _L2
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void setFramerate(int i)
        throws CapturerException
    {
        framerate = i;
        synchronized (activeTaskMutex)
        {
            if (activeTask != null)
            {
                stop();
                start();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setResolution(Resolution resolution)
        throws CapturerException
    {
        synchronized (surfaceMutex)
        {
            sourceResolution = resolution;
            frameSize = sourceResolution.getWidth() * 4 * sourceResolution.getHeight();
            frameData = ByteBuffer.allocateDirect(frameSize);
        }
        synchronized (nativeObjMutex)
        {
            setResolution(nativeObj, resolution.getWidth(), resolution.getHeight(), frameData);
            virtualSource.setResolution(resolution);
            if (surfaceTexture != null)
            {
                surfaceTexture.setDefaultBufferSize(sourceResolution.getWidth() + 15 & 0xfff0, sourceResolution.getHeight() + 15 & 0xfff0);
            }
        }
        return;
        resolution;
        obj;
        JVM INSTR monitorexit ;
        throw resolution;
        resolution;
        obj;
        JVM INSTR monitorexit ;
        throw resolution;
    }

    public void setSurfaceTexture(SurfaceTexture surfacetexture)
    {
        Object obj = surfaceMutex;
        obj;
        JVM INSTR monitorenter ;
        if (surfacetexture == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (surface != null)
        {
            surface.release();
            surface = null;
        }
        if (surfaceTexture != null)
        {
            surfaceTexture.release();
        }
        surfaceTexture = surfacetexture;
        if (surfacetexture == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        surface = new Surface(surfaceTexture);
        surfacetexture.setDefaultBufferSize(sourceResolution.getWidth(), sourceResolution.getHeight());
        virtualSource.setResolution(sourceResolution);
        virtualSource.setSurface(surface);
        obj;
        JVM INSTR monitorexit ;
        return;
        surfacetexture;
        obj;
        JVM INSTR monitorexit ;
        throw surfacetexture;
    }

    public void start()
        throws CapturerException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Starting. nativeObj=0x").append(Long.toHexString(nativeObj)).toString());
        }
        virtualSource.setup();
_L2:
        if (useRunner)
        {
            startRunner();
        }
        return;
        GLException glexception;
        glexception;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Exception caught!", glexception);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void stop()
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Stopping. nativeObj=0x").append(Long.toHexString(nativeObj)).toString());
        }
        if (useRunner)
        {
            stopRunner();
        }
        virtualSource.close();
_L1:
        return;
        GLException glexception;
        glexception;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Exception caught!", glexception);
            return;
        }
          goto _L1
    }

    public void unlock()
    {
        unlock(nativeObj);
    }



/*
    static long access$202(VirtualCaptureSource virtualcapturesource, long l)
    {
        virtualcapturesource.timestamp = l;
        return l;
    }

*/



}
