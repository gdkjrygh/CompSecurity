// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import android.view.SurfaceHolder;
import com.skype.android.platform.capture.CaptureException;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.util.Log;
import com.skype.android.video.capture.impl.CaptureSource;
import com.skype.android.video.capture.impl.FrameConsumer;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.capture:
//            AbstractPlatformCapturer

public class LegacyCapturer extends AbstractPlatformCapturer
{
    private static class State
    {

        private int flags;

        public boolean areSet(Flags flags1, Flags flags2)
        {
            boolean flag = true;
            this;
            JVM INSTR monitorenter ;
            int i;
            int j;
            i = 1 << flags1.ordinal() | 1 << flags2.ordinal();
            j = flags;
            if ((j & i) != i)
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            flags1;
            throw flags1;
        }

        public boolean isSet(Flags flags1)
        {
            boolean flag = true;
            this;
            JVM INSTR monitorenter ;
            int i;
            int j;
            i = 1 << flags1.ordinal();
            j = flags;
            if ((j & i) != i)
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            flags1;
            throw flags1;
        }

        public void reset()
        {
            this;
            JVM INSTR monitorenter ;
            flags = 0;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public void set(Flags flags1)
        {
            this;
            JVM INSTR monitorenter ;
            flags = flags | 1 << flags1.ordinal();
            this;
            JVM INSTR monitorexit ;
            return;
            flags1;
            throw flags1;
        }

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(getClass().getSimpleName()).append(" [StartRequested=");
            String s;
            if (isSet(Flags.StartRequested))
            {
                s = "true";
            } else
            {
                s = "false";
            }
            stringbuilder = stringbuilder.append(s).append(", CallbackEnabled=");
            if (isSet(Flags.CallbackEnabled))
            {
                s = "true";
            } else
            {
                s = "false";
            }
            stringbuilder = stringbuilder.append(s).append(", SurfaceProvided=");
            if (isSet(Flags.SurfaceProvided))
            {
                s = "true";
            } else
            {
                s = "false";
            }
            return stringbuilder.append(s).append("]").toString();
        }

        public void unset(Flags flags1)
        {
            this;
            JVM INSTR monitorenter ;
            flags = flags & ~(1 << flags1.ordinal());
            this;
            JVM INSTR monitorexit ;
            return;
            flags1;
            throw flags1;
        }

        private State()
        {
        }

    }

    public static final class State.Flags extends Enum
    {

        private static final State.Flags $VALUES[];
        public static final State.Flags CallbackEnabled;
        public static final State.Flags StartRequested;
        public static final State.Flags SurfaceProvided;

        public static State.Flags valueOf(String s)
        {
            return (State.Flags)Enum.valueOf(com/skype/android/video/capture/LegacyCapturer$State$Flags, s);
        }

        public static State.Flags[] values()
        {
            return (State.Flags[])$VALUES.clone();
        }

        static 
        {
            StartRequested = new State.Flags("StartRequested", 0);
            CallbackEnabled = new State.Flags("CallbackEnabled", 1);
            SurfaceProvided = new State.Flags("SurfaceProvided", 2);
            $VALUES = (new State.Flags[] {
                StartRequested, CallbackEnabled, SurfaceProvided
            });
        }

        private State.Flags(String s, int i)
        {
            super(s, i);
        }
    }


    private static final float MAX_RESOLUTION_ZOOM = 0.3333333F;
    private final FrameConsumer frameConsumer = new FrameConsumer() {

        final LegacyCapturer this$0;

        public void onFrameArrived(byte abyte0[], int i1, int j1)
        {
            if (state.isSet(State.Flags.CallbackEnabled))
            {
                AbstractPlatformCapturer.onFrameCaptured(nativeObj, i1, j1, abyte0, AbstractPlatformCapturer.getNativeTimestamp());
            }
        }

            
            {
                this$0 = LegacyCapturer.this;
                super();
            }
    };
    private Thread runnerThread;
    private final CaptureSource source;
    private final State state = new State();

    public LegacyCapturer(long l, int i, int j, int k, float f)
    {
        super(l, i, new Resolution(j, k), f, 0.3333333F);
        source = new CaptureSource(getCameraId(), frameConsumer, findMaxNativeResolution());
    }

    private void shutdown()
    {
        source.close();
        source.waitUntil(com.skype.android.video.capture.impl.CaptureSource.CameraState.CLOSED);
_L2:
        runnerThread.interrupt();
        runnerThread = null;
        return;
        Object obj;
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Interrupted", ((Throwable) (obj)));
        }
        continue; /* Loop/switch isn't completed */
        obj;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Exception caught", ((Throwable) (obj)));
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void stopCapturing()
        throws InterruptedException, CaptureException
    {
        synchronized (state)
        {
            if (runnerThread != null && runnerThread.isAlive())
            {
                source.close();
                source.waitUntil(com.skype.android.video.capture.impl.CaptureSource.CameraState.CLOSED);
                runnerThread = null;
            }
        }
        return;
        exception;
        state1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean tryStartCapturing()
        throws CaptureException, InterruptedException
    {
label0:
        {
            boolean flag;
            synchronized (state)
            {
                if (runnerThread == null || !runnerThread.isAlive())
                {
                    break label0;
                }
                flag = source.startPreview();
            }
            return flag;
        }
        if (state.areSet(State.Flags.StartRequested, State.Flags.SurfaceProvided))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        state1;
        JVM INSTR monitorexit ;
        return false;
        exception;
        state1;
        JVM INSTR monitorexit ;
        throw exception;
        runnerThread = new Thread(source);
        runnerThread.start();
        source.waitUntil(com.skype.android.video.capture.impl.CaptureSource.CameraState.STARTED);
        state1;
        JVM INSTR monitorexit ;
        return true;
    }

    public boolean attachPreview(Object obj, int i, int j)
    {
        if (!(obj instanceof SurfaceHolder))
        {
            return false;
        }
        synchronized (state)
        {
            state.set(State.Flags.SurfaceProvided);
            source.setPreviewDisplay((SurfaceHolder)obj);
        }
        tryStartCapturing();
        return true;
        obj;
        state1;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", ((Throwable) (obj)));
            }
            shutdown();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", ((Throwable) (obj)));
            }
            shutdown();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", "Interrupted", ((Throwable) (obj)));
        }
        shutdown();
        return false;
    }

    public volatile boolean banResolution(int i, int j)
    {
        return super.banResolution(i, j);
    }

    public void close()
    {
        try
        {
            state.reset();
            stopCapturing();
            return;
        }
        catch (CaptureException captureexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", captureexception);
            }
            shutdown();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            shutdown();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Interrupted", interruptedexception);
            }
        }
        shutdown();
    }

    public boolean detachPreview()
    {
        synchronized (state)
        {
            state.unset(State.Flags.SurfaceProvided);
            source.setPreviewDisplay(null);
        }
        return true;
        exception;
        state1;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (CaptureException captureexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", captureexception);
            }
            shutdown();
            return false;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
        }
        shutdown();
        return false;
    }

    public int getCaptureHeight()
    {
        return source.getResolution().getHeight();
    }

    public int getCaptureWidth()
    {
        return source.getResolution().getWidth();
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
        if (flag)
        {
            try
            {
                state.set(State.Flags.CallbackEnabled);
                tryStartCapturing();
            }
            catch (CaptureException captureexception)
            {
                if (Log.isLoggable("Capture", 6))
                {
                    Log.e("Capture", "Exception caught", captureexception);
                }
                shutdown();
                return false;
            }
            catch (RuntimeException runtimeexception)
            {
                if (Log.isLoggable("Capture", 6))
                {
                    Log.e("Capture", "Exception caught", runtimeexception);
                }
                shutdown();
                return false;
            }
            catch (InterruptedException interruptedexception)
            {
                if (Log.isLoggable("Capture", 6))
                {
                    Log.e("Capture", "Interrupted", interruptedexception);
                }
                shutdown();
                return false;
            }
            break MISSING_BLOCK_LABEL_131;
        }
        state.unset(State.Flags.CallbackEnabled);
        source.stopPreview();
        source.waitUntil(com.skype.android.video.capture.impl.CaptureSource.CameraState.STOPPED);
        return true;
    }

    public boolean setCameraParameters(int i, int j, float f)
    {
        com.skype.android.platform.capture.FpsRange fpsrange = null;
        if (i > maxResolution.getWidth() || j > maxResolution.getHeight())
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", (new StringBuilder("Resolution ")).append(i).append("x").append(j).append(" exceeds maximum ").append(maxResolution).toString());
            }
            return false;
        }
        Resolution resolution;
        if (i > 0 && j > 0)
        {
            resolution = getNativeResolution(i, j);
        } else
        {
            resolution = null;
        }
        if (f > 0.0F)
        {
            fpsrange = findFpsRange(f);
        }
        try
        {
            source.setParameters(resolution, fpsrange, ImageFormat.b);
        }
        catch (CaptureException captureexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", captureexception);
            }
            shutdown();
            return false;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            shutdown();
            return false;
        }
        return true;
    }

    public boolean setPreviewResolutioin(int i, int j)
    {
        return true;
    }

    public boolean setRotation(int i, boolean flag)
    {
        try
        {
            source.setPreviewOrientation(i);
        }
        catch (CaptureException captureexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", captureexception);
            }
            shutdown();
            return false;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            shutdown();
            return false;
        }
        return true;
    }

    public boolean start(long l)
    {
        try
        {
            state.set(State.Flags.StartRequested);
            tryStartCapturing();
        }
        catch (CaptureException captureexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", captureexception);
            }
            shutdown();
            return false;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            shutdown();
            return false;
        }
        catch (InterruptedException interruptedexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Interrupted", interruptedexception);
            }
            shutdown();
            return false;
        }
        return true;
    }

    public boolean stop(long l)
    {
        try
        {
            state.unset(State.Flags.StartRequested);
            stopCapturing();
        }
        catch (CaptureException captureexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", captureexception);
            }
            shutdown();
            return false;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Exception caught", runtimeexception);
            }
            shutdown();
            return false;
        }
        catch (InterruptedException interruptedexception)
        {
            if (Log.isLoggable("Capture", 6))
            {
                Log.e("Capture", "Interrupted", interruptedexception);
            }
            shutdown();
            return false;
        }
        return true;
    }

}
