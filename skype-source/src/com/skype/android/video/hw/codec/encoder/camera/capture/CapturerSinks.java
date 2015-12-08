// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import android.util.SparseArray;
import android.view.Surface;
import com.skype.android.video.hw.codec.encoder.camera.gl.ChannelPushFrame;
import com.skype.android.video.hw.codec.encoder.camera.gl.GLException;
import com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.capture:
//            CapturerException, Capturer

public class CapturerSinks
    implements Closeable
{
    private abstract class AbstractSink
        implements Capturer.Sink, Closeable
    {

        protected final Capturer.SinkEvents cb;
        private TargetSurfaceHolder currentTarget;
        private volatile float fitFactor;
        protected final int id;
        private volatile boolean isEnabled;
        private volatile boolean isHorizFlipped;
        private volatile boolean isVertFlipped;
        private TargetSurfaceHolder newTarget;
        private volatile int rotationAngle;
        protected final Object sharedMutex;
        private final Object targetSurfaceMutex = new Object();
        final CapturerSinks this$0;

        private void setTarget(Surface surface, Resolution resolution)
        {
            boolean flag1 = true;
            Object obj = targetSurfaceMutex;
            obj;
            JVM INSTR monitorenter ;
            if (newTarget == null && surface == null) goto _L2; else goto _L1
_L1:
            if (newTarget == null || newTarget.getSurface() != surface) goto _L3; else goto _L2
_L2:
            if (newTarget == null) goto _L5; else goto _L4
_L4:
            boolean flag;
            if (resolution != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (resolution.equals(newTarget.getResolution()))
            {
                flag1 = false;
            }
            if (!(flag1 & flag)) goto _L5; else goto _L6
_L6:
            newTarget.setResolution(resolution);
            isDirty.set(true);
_L5:
            obj;
            JVM INSTR monitorexit ;
            return;
_L3:
            if (newTarget != null && currentTarget != newTarget)
            {
                if (Log.isLoggable("SLIQ", 3))
                {
                    Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Closing unused ").append(newTarget).toString());
                }
                newTarget.close();
            }
            if (surface == null)
            {
                break MISSING_BLOCK_LABEL_223;
            }
            surface = new TargetSurfaceHolder(surface, resolution, canReleaseSurface());
_L7:
            newTarget = surface;
            isDirty.set(true);
              goto _L5
            surface;
            obj;
            JVM INSTR monitorexit ;
            throw surface;
            surface = null;
              goto _L7
        }

        public void attachSurface(Surface surface, Resolution resolution)
        {
            synchronized (sharedMutex)
            {
                if (Log.isLoggable("SLIQ", 4))
                {
                    Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Surface provided: ").append(surface).append(" at ").append(resolution).toString());
                }
                setTarget(surface, resolution);
            }
            return;
            surface;
            obj;
            JVM INSTR monitorexit ;
            throw surface;
        }

        public abstract boolean canReleaseSurface();

        public void close()
        {
            synchronized (sharedMutex)
            {
                if (newTarget == null && currentTarget != null)
                {
                    if (Log.isLoggable("SLIQ", 3))
                    {
                        Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Closing old ").append(currentTarget).toString());
                    }
                    currentTarget.close();
                    currentTarget = null;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void detachSurface()
        {
            synchronized (sharedMutex)
            {
                if (Log.isLoggable("SLIQ", 4))
                {
                    Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Surface abandoned").toString());
                }
                setTarget(null, null);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (AbstractSink)obj;
                if (id != ((AbstractSink) (obj)).id)
                {
                    return false;
                }
            }
            return true;
        }

        public float getFitFactor()
        {
            return fitFactor;
        }

        public int getId()
        {
            return id;
        }

        public int getRotationAngle()
        {
            return rotationAngle;
        }

        public TargetSurfaceHolder getTargetSurface()
        {
            Object obj = targetSurfaceMutex;
            obj;
            JVM INSTR monitorenter ;
            if (newTarget == null) goto _L2; else goto _L1
_L1:
            if (currentTarget != null && currentTarget != newTarget)
            {
                if (Log.isLoggable("SLIQ", 3))
                {
                    Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Closing old ").append(currentTarget).toString());
                }
                currentTarget.close();
            }
_L4:
            TargetSurfaceHolder targetsurfaceholder;
            currentTarget = newTarget;
            targetsurfaceholder = currentTarget;
            return targetsurfaceholder;
_L2:
            if (currentTarget == null) goto _L4; else goto _L3
_L3:
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Closing old ").append(currentTarget).toString());
            }
            currentTarget.close();
              goto _L4
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public abstract com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel.OutputType getType();

        public int hashCode()
        {
            return id;
        }

        public boolean isEnabled()
        {
            return isEnabled;
        }

        public boolean isHorizFlipped()
        {
            return isHorizFlipped;
        }

        public boolean isVertFlipped()
        {
            return isVertFlipped;
        }

        public abstract void onFrameCaptured(long l);

        public void setEnabled(boolean flag)
        {
            isDirty.set(true);
            isEnabled = flag;
        }

        public void setFitFactor(float f)
        {
            isDirty.set(true);
            fitFactor = f;
        }

        public void setFlipped(boolean flag, boolean flag1)
        {
            isDirty.set(true);
            isHorizFlipped = flag;
            isVertFlipped = flag1;
        }

        public void setResolution(Resolution resolution)
        {
            Object obj = sharedMutex;
            obj;
            JVM INSTR monitorenter ;
            Object obj1 = targetSurfaceMutex;
            obj1;
            JVM INSTR monitorenter ;
            if (newTarget == null)
            {
                throw new IllegalStateException("no surface attached");
            }
            break MISSING_BLOCK_LABEL_41;
            resolution;
            obj1;
            JVM INSTR monitorexit ;
            throw resolution;
            resolution;
            obj;
            JVM INSTR monitorexit ;
            throw resolution;
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" Surface resolution provided: ").append(resolution).toString());
            }
            newTarget.setResolution(resolution);
            isDirty.set(true);
            obj1;
            JVM INSTR monitorexit ;
            obj;
            JVM INSTR monitorexit ;
        }

        public void setRotationAngle(int i)
        {
            isDirty.set(true);
            rotationAngle = i;
        }

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(getClass().getSimpleName()).append(" #").append(id).append(" [ ( ").append(currentTarget).append(" -> ").append(newTarget).append(" ), @").append(rotationAngle).append(" deg");
            String s;
            if (!isEnabled)
            {
                s = ", disabled";
            } else
            {
                s = "";
            }
            stringbuilder = stringbuilder.append(s);
            if (isHorizFlipped)
            {
                s = ", H-flipped";
            } else
            {
                s = "";
            }
            stringbuilder = stringbuilder.append(s);
            if (isVertFlipped)
            {
                s = ", V-flipped";
            } else
            {
                s = "";
            }
            return stringbuilder.append(s).append("]").toString();
        }

        protected AbstractSink(Object obj, Capturer.SinkEvents sinkevents, int i)
        {
            this$0 = CapturerSinks.this;
            super();
            sharedMutex = obj;
            cb = sinkevents;
            id = i;
        }
    }

    private class EncoderSink extends AbstractSink
    {

        private volatile ChannelPushFrame channel;
        private float targetFps;
        final CapturerSinks this$0;

        public boolean canReleaseSurface()
        {
            return true;
        }

        public float getTargetFrameRate()
        {
            return targetFps;
        }

        public com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel.OutputType getType()
        {
            return com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel.OutputType.ENCODER;
        }

        public void onFrameCaptured(long l)
        {
            cb.onFrameCaptured(l);
        }

        public boolean pushFrame()
            throws CapturerException
        {
            if (channel != null)
            {
                boolean flag;
                try
                {
                    flag = channel.executePushFrame(id);
                }
                catch (GLException glexception)
                {
                    throw new CapturerException("Push encoder frame failed", glexception);
                }
                return flag;
            }
            if (Log.isLoggable("SLIQ", 5))
            {
                Log.w("SLIQ", "Attempt to push frame when channel does not exist");
            }
            return false;
        }

        public void setChannel(ChannelPushFrame channelpushframe)
        {
            channel = channelpushframe;
        }

        public void setTargetFrameRate(float f)
        {
            isDirty.set(true);
            targetFps = f;
        }

        public EncoderSink(Object obj, Capturer.SinkEvents sinkevents, int i, ChannelPushFrame channelpushframe)
        {
            this$0 = CapturerSinks.this;
            super(obj, sinkevents, i);
            targetFps = 30F;
            channel = channelpushframe;
        }
    }

    private class PreviewSink extends AbstractSink
    {

        final CapturerSinks this$0;

        public boolean canReleaseSurface()
        {
            return false;
        }

        public float getTargetFrameRate()
        {
            return 0.0F;
        }

        public com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel.OutputType getType()
        {
            return com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel.OutputType.SCREEN;
        }

        public void onFrameCaptured(long l)
        {
        }

        public boolean pushFrame()
            throws CapturerException
        {
            return false;
        }

        public void setTargetFrameRate(float f)
        {
        }

        public PreviewSink(Object obj, Capturer.SinkEvents sinkevents, int i)
        {
            this$0 = CapturerSinks.this;
            super(obj, sinkevents, i);
        }
    }

    public static class TargetSurfaceHolder
        implements Closeable
    {

        private final boolean canReleaseSurface;
        private Resolution resolution;
        private Surface surface;

        public void close()
        {
            if (surface != null)
            {
                if (canReleaseSurface)
                {
                    if (Log.isLoggable("SLIQ", 4))
                    {
                        Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/capture/Capturer.getSimpleName()).append(": Releasing surface: ").append(this).toString());
                    }
                    surface.release();
                }
                surface = null;
            }
            resolution = null;
        }

        public Resolution getResolution()
        {
            return resolution;
        }

        public Surface getSurface()
        {
            return surface;
        }

        public void setResolution(Resolution resolution1)
        {
            resolution = resolution1;
        }

        public String toString()
        {
            return (new StringBuilder()).append(surface).append(" at ").append(resolution).toString();
        }

        public TargetSurfaceHolder(Surface surface1, Resolution resolution1, boolean flag)
        {
            canReleaseSurface = flag;
            surface = surface1;
            resolution = resolution1;
        }
    }


    private final AtomicBoolean isDirty = new AtomicBoolean();
    private final SparseArray removedSinks = new SparseArray();
    private int sinkCounter;
    private final SparseArray sinks = new SparseArray();

    public CapturerSinks()
    {
    }

    public Capturer.Sink addEncoderSink(Object obj, Capturer.SinkEvents sinkevents, ChannelPushFrame channelpushframe)
    {
        isDirty.set(true);
        int i = sinkCounter;
        sinkCounter = i + 1;
        obj = new EncoderSink(obj, sinkevents, i, channelpushframe);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Adding ").append(obj).append(" to the capturer").toString());
        }
        sinks.append(((EncoderSink) (obj)).getId(), obj);
        return ((Capturer.Sink) (obj));
    }

    public Capturer.Sink addPreviewSink(Object obj, Capturer.SinkEvents sinkevents)
    {
        isDirty.set(true);
        int i = sinkCounter;
        sinkCounter = i + 1;
        obj = new PreviewSink(obj, sinkevents, i);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Adding ").append(obj).append(" to the capturer").toString());
        }
        sinks.append(((PreviewSink) (obj)).getId(), obj);
        return ((Capturer.Sink) (obj));
    }

    public void close()
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Closing").toString());
        }
        int i = 0;
        for (int j = removedSinks.size(); i < j; i++)
        {
            ((AbstractSink)removedSinks.valueAt(i)).close();
        }

        removedSinks.clear();
        i = 0;
        for (int k = sinks.size(); i < k; i++)
        {
            ((AbstractSink)sinks.valueAt(i)).close();
        }

        sinks.clear();
    }

    public void removeSink(Capturer.Sink sink)
    {
        isDirty.set(true);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Removing ").append(sink).append(" from the capturer").toString());
        }
        sink = (AbstractSink)sink;
        removedSinks.append(sink.getId(), sink);
        sinks.delete(sink.getId());
    }

    public void setChannel(ChannelPushFrame channelpushframe)
    {
        int i = 0;
        for (int j = sinks.size(); i < j; i++)
        {
            AbstractSink abstractsink = (AbstractSink)sinks.valueAt(i);
            if (abstractsink instanceof EncoderSink)
            {
                ((EncoderSink)abstractsink).setChannel(channelpushframe);
            }
        }

    }

    public void syncWith(SurfaceTextureChannel surfacetexturechannel)
        throws GLException
    {
        if (isDirty.getAndSet(false))
        {
            if (removedSinks.size() > 0)
            {
                if (Log.isLoggable("SLIQ", 4))
                {
                    Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Got ").append(removedSinks.size()).append(" removed sinks").toString());
                }
                int i = 0;
                for (int k = removedSinks.size(); i < k; i++)
                {
                    AbstractSink abstractsink = (AbstractSink)removedSinks.valueAt(i);
                    if (Log.isLoggable("SLIQ", 4))
                    {
                        Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Deallocating ").append(abstractsink).append(" at the ").append(surfacetexturechannel.getClass().getSimpleName()).toString());
                    }
                    surfacetexturechannel.deallocateOutput(abstractsink.getId());
                    abstractsink.close();
                }

                removedSinks.clear();
            }
            int j = 0;
            int l = sinks.size();
            while (j < l) 
            {
                final AbstractSink sink = (AbstractSink)sinks.valueAt(j);
                if (!surfacetexturechannel.hasTarget(sink.getId()))
                {
                    if (Log.isLoggable("SLIQ", 4))
                    {
                        Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Allocating ").append(sink).append(" at the ").append(surfacetexturechannel.getClass().getSimpleName()).toString());
                    }
                    surfacetexturechannel.allocateOutput(sink.getType(), sink.getId(), new com.skype.android.video.hw.codec.encoder.camera.gl.AbstractRenderingTarget.Events() {

                        final CapturerSinks this$0;
                        final AbstractSink val$sink;

                        public void onFrameRendered(long l1)
                        {
                            sink.onFrameCaptured(l1);
                        }

            
            {
                this$0 = CapturerSinks.this;
                sink = abstractsink;
                super();
            }
                    });
                }
                TargetSurfaceHolder targetsurfaceholder = sink.getTargetSurface();
                if (targetsurfaceholder != null)
                {
                    if (!surfacetexturechannel.isOutputAttached(sink.getId(), targetsurfaceholder.getSurface(), targetsurfaceholder.getResolution()))
                    {
                        if (Log.isLoggable("SLIQ", 4))
                        {
                            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Attaching ").append(sink).append(" to the ").append(surfacetexturechannel.getClass().getSimpleName()).toString());
                        }
                        surfacetexturechannel.attachOutput(sink.getId(), targetsurfaceholder.getSurface(), targetsurfaceholder.getResolution());
                    }
                } else
                if (surfacetexturechannel.isOutputAttached(sink.getId()))
                {
                    if (Log.isLoggable("SLIQ", 4))
                    {
                        Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Detaching ").append(sink).append(" from the ").append(surfacetexturechannel.getClass().getSimpleName()).toString());
                    }
                    surfacetexturechannel.detachOutput(sink.getId());
                }
                surfacetexturechannel.setParameters(sink.getId(), sink.isEnabled(), sink.getRotationAngle(), sink.getFitFactor(), sink.isHorizFlipped(), sink.isVertFlipped(), sink.getTargetFrameRate());
                j++;
            }
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [sinkCounter=").append(sinkCounter).append(", sinks=").append(sinks).append(", removedSinks=").append(removedSinks).append("]").toString();
    }

}
