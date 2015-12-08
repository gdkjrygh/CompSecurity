// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.gl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.util.SparseArray;
import android.view.Surface;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.utils.CodecUtils;
import com.skype.android.video.hw.utils.FrameRateController;
import com.skype.android.video.hw.utils.Log;
import com.skype.android.video.hw.utils.Systrace;
import java.io.Closeable;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.camera.gl:
//            ChannelPushFrame, GLException, Context, BufferRenderingTarget, 
//            AbstractRenderingTarget, SurfaceTextureRenderer, EncoderRenderingTarget, ScreenRenderingTarget

public class SurfaceTextureChannel
    implements ChannelPushFrame, Closeable
{
    public static final class OutputType extends Enum
    {

        private static final OutputType $VALUES[];
        public static final OutputType ENCODER;
        public static final OutputType SCREEN;

        public static OutputType valueOf(String s)
        {
            return (OutputType)Enum.valueOf(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel$OutputType, s);
        }

        public static OutputType[] values()
        {
            return (OutputType[])$VALUES.clone();
        }

        static 
        {
            SCREEN = new OutputType("SCREEN", 0);
            ENCODER = new OutputType("ENCODER", 1);
            $VALUES = (new OutputType[] {
                SCREEN, ENCODER
            });
        }

        private OutputType(String s, int i)
        {
            super(s, i);
        }
    }

    private class SourceFrameAvailableListener
        implements android.graphics.SurfaceTexture.OnFrameAvailableListener
    {

        final SurfaceTextureChannel this$0;

        public void onFrameAvailable(SurfaceTexture surfacetexture)
        {
            synchronized (newFrameArrivedEvent)
            {
                sourceState = SourceState.FRAME_AVAILABLE;
                newFrameArrivedEvent.notifyAll();
            }
            return;
            exception;
            surfacetexture;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SourceFrameAvailableListener()
        {
            this$0 = SurfaceTextureChannel.this;
            super();
        }

    }

    private static final class SourceState extends Enum
    {

        private static final SourceState $VALUES[];
        public static final SourceState FRAME_AVAILABLE;
        public static final SourceState INTERRUPTED;
        public static final SourceState WAITING_FOR_FRAME;

        public static SourceState valueOf(String s)
        {
            return (SourceState)Enum.valueOf(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel$SourceState, s);
        }

        public static SourceState[] values()
        {
            return (SourceState[])$VALUES.clone();
        }

        static 
        {
            WAITING_FOR_FRAME = new SourceState("WAITING_FOR_FRAME", 0);
            FRAME_AVAILABLE = new SourceState("FRAME_AVAILABLE", 1);
            INTERRUPTED = new SourceState("INTERRUPTED", 2);
            $VALUES = (new SourceState[] {
                WAITING_FOR_FRAME, FRAME_AVAILABLE, INTERRUPTED
            });
        }

        private SourceState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int EGL_SHARED_CONTEXT_ATTRIBUTES[] = {
        12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 
        12325, 0, 12326, 0, 12344
    };
    private AbstractRenderingTarget defaultRenderingTarget;
    private boolean dropFrame;
    private EGLDisplay eglDisplay;
    private FrameRateController frameRateController;
    private boolean isBroadComChip;
    private boolean isFirstFrame;
    private final boolean isPreEncodingRC;
    private final Object newFrameArrivedEvent = new Object();
    private SurfaceTextureRenderer renderer;
    private final SparseArray renderingTargets = new SparseArray();
    private Context sharedContext;
    private Resolution sourceResolution;
    private volatile SourceState sourceState;
    private SurfaceTexture sourceTexture;

    public SurfaceTextureChannel(boolean flag)
        throws GLException
    {
        eglDisplay = EGL14.EGL_NO_DISPLAY;
        isFirstFrame = true;
        isBroadComChip = false;
        dropFrame = false;
        sourceState = SourceState.WAITING_FOR_FRAME;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Constructing").toString());
        }
        isPreEncodingRC = flag;
        String as[];
        int i;
        try
        {
            frameRateController = new FrameRateController(30F);
            eglDisplay = createEGLDisplay();
            sharedContext = new Context(eglDisplay, EGL_SHARED_CONTEXT_ATTRIBUTES);
            defaultRenderingTarget = new BufferRenderingTarget(sharedContext, null);
            defaultRenderingTarget.setSurface(null, new Resolution(320, 240));
            renderer = new SurfaceTextureRenderer();
            sourceTexture = new SurfaceTexture(renderer.getSourceTextureId());
            sourceTexture.setOnFrameAvailableListener(new SourceFrameAvailableListener());
        }
        catch (GLException glexception)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Initialization failed. Closing").toString());
            }
            close();
            throw glexception;
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Initialization failed. Closing").toString());
            }
            close();
            throw runtimeexception;
        }
        as = CodecUtils.enumEncoders();
        i = 0;
        do
        {
label0:
            {
                if (i < as.length)
                {
                    String s = as[i];
                    if (!s.toLowerCase().contains("brcm") && !s.toLowerCase().contains("broadcom"))
                    {
                        break label0;
                    }
                    isBroadComChip = true;
                }
                return;
            }
            i++;
        } while (true);
    }

    private SourceState awaitNewFrame(long l)
        throws InterruptedException, GLException
    {
        SourceState sourcestate;
        synchronized (newFrameArrivedEvent)
        {
            if (sourceState == SourceState.WAITING_FOR_FRAME)
            {
                newFrameArrivedEvent.wait(l);
            }
            Systrace.begin(com.skype.android.video.hw.utils.Systrace.Section.CaptureVideo);
            sourcestate = sourceState;
            sourceState = SourceState.WAITING_FOR_FRAME;
        }
        return sourcestate;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static EGLDisplay createEGLDisplay()
        throws GLException
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Creating EGL display").toString());
        }
        EGLDisplay egldisplay = EGL14.eglGetDisplay(0);
        if (egldisplay == EGL14.EGL_NO_DISPLAY)
        {
            throw new GLException("Failed to get EGL14 display.", EGL14.eglGetError());
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Initializing EGL").toString());
        }
        int ai[] = new int[2];
        if (!EGL14.eglInitialize(egldisplay, ai, 0, ai, 1))
        {
            throw new GLException("Failed to initialize EGL.", EGL14.eglGetError());
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": EGL initialized: version ").append(ai[0]).append(".").append(ai[1]).toString());
        }
        return egldisplay;
    }

    private AbstractRenderingTarget createRenderingTarget(OutputType outputtype, AbstractRenderingTarget.Events events)
        throws GLException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$OutputType[];
            static final int $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$SourceState[];

            static 
            {
                $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$OutputType = new int[OutputType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$OutputType[OutputType.ENCODER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$OutputType[OutputType.SCREEN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$SourceState = new int[SourceState.values().length];
                try
                {
                    $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$SourceState[SourceState.WAITING_FOR_FRAME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$video$hw$codec$encoder$camera$gl$SurfaceTextureChannel$SourceState[SourceState.INTERRUPTED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel.OutputType[outputtype.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("unknown rendering target type ")).append(outputtype).toString());

        case 1: // '\001'
            return new EncoderRenderingTarget(sharedContext, events);

        case 2: // '\002'
            return new ScreenRenderingTarget(sharedContext, events);
        }
    }

    private void pushFrameToAllTargets(long l)
        throws GLException
    {
        int i = 0;
        for (int j = renderingTargets.size(); i < j; i++)
        {
            AbstractRenderingTarget abstractrenderingtarget = (AbstractRenderingTarget)renderingTargets.valueAt(i);
            pushFrameToSingleTarget(l, abstractrenderingtarget);
            abstractrenderingtarget.onFrameReady(l);
        }

    }

    private void pushFrameToSingleTarget(long l, AbstractRenderingTarget abstractrenderingtarget)
        throws GLException
    {
        if (!abstractrenderingtarget.isEnabled() || !abstractrenderingtarget.hasSurface() || abstractrenderingtarget.getResolution() == null) goto _L2; else goto _L1
_L1:
        if (!(abstractrenderingtarget instanceof ScreenRenderingTarget)) goto _L4; else goto _L3
_L3:
        Systrace.begin(com.skype.android.video.hw.utils.Systrace.Section.RenderVideoPreview);
        render(l, abstractrenderingtarget);
        Systrace.end();
_L2:
        return;
        abstractrenderingtarget;
        Systrace.end();
        throw abstractrenderingtarget;
_L4:
        if (dropFrame) goto _L2; else goto _L5
_L5:
        Systrace.begin(com.skype.android.video.hw.utils.Systrace.Section.RenderVideoTarget);
        render(l, abstractrenderingtarget);
        if (isFirstFrame && isBroadComChip)
        {
            isFirstFrame = false;
            render(1000L + l, abstractrenderingtarget);
        }
        Systrace.end();
        return;
        abstractrenderingtarget;
        Systrace.end();
        throw abstractrenderingtarget;
    }

    private void render(long l, AbstractRenderingTarget abstractrenderingtarget)
        throws GLException
    {
        abstractrenderingtarget.bind();
        renderer.draw(sourceTexture, sourceResolution, abstractrenderingtarget.getResolution(), abstractrenderingtarget.getFitFactor(), abstractrenderingtarget.getRotationAngle(), abstractrenderingtarget.isHorizFlipped(), abstractrenderingtarget.isVertFlipped());
        abstractrenderingtarget.setTimestamp(l);
        abstractrenderingtarget.swapBuffers();
    }

    private void renderPreviewAndSignalFrameReady(long l)
        throws GLException
    {
        int i = 0;
        for (int j = renderingTargets.size(); i < j; i++)
        {
            AbstractRenderingTarget abstractrenderingtarget = (AbstractRenderingTarget)renderingTargets.valueAt(i);
            if (!abstractrenderingtarget.isEnabled() || !abstractrenderingtarget.hasSurface() || abstractrenderingtarget.getResolution() == null)
            {
                continue;
            }
            if (abstractrenderingtarget instanceof ScreenRenderingTarget)
            {
                pushFrameToSingleTarget(l, abstractrenderingtarget);
            }
            abstractrenderingtarget.onFrameReady(l);
        }

    }

    private void updateFrameRateContoller(long l)
    {
        boolean flag1 = true;
        l /= 0xf4240L;
        AbstractRenderingTarget abstractrenderingtarget = null;
        int i = 0;
        int j = renderingTargets.size();
        AbstractRenderingTarget abstractrenderingtarget1;
        do
        {
            abstractrenderingtarget1 = abstractrenderingtarget;
            if (i >= j)
            {
                break;
            }
            abstractrenderingtarget = (AbstractRenderingTarget)renderingTargets.valueAt(i);
            if (abstractrenderingtarget.isEnabled() && abstractrenderingtarget.hasSurface() && abstractrenderingtarget.getResolution() != null)
            {
                abstractrenderingtarget1 = abstractrenderingtarget;
                if (abstractrenderingtarget instanceof EncoderRenderingTarget)
                {
                    break;
                }
            }
            i++;
        } while (true);
        if (abstractrenderingtarget1 != null)
        {
            float f = abstractrenderingtarget1.getTargetFrameRate();
            boolean flag;
            if (f > 0.0F && frameRateController.GetTargetFps() != f)
            {
                FrameRateController frameratecontroller = frameRateController;
                StringBuilder stringbuilder;
                if (f > frameRateController.GetTargetFps() + 1.0F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                frameratecontroller.Reset(f, l, flag);
            }
            if (f > 0.0F && frameRateController.GetDropFlag(l))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            dropFrame = flag;
            if (Log.isLoggable("SLIQ", 3))
            {
                stringbuilder = (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName());
                String s;
                if (dropFrame)
                {
                    s = ": drop ";
                } else
                {
                    s = ": encode ";
                }
                Log.d("SLIQ", stringbuilder.append(s).append("current Frame").toString());
            }
            if (!dropFrame && f > 0.0F)
            {
                frameRateController.Update(l);
            }
        }
    }

    public long acquireFrame(long l)
        throws GLException, InterruptedException, TimeoutException
    {
        if (sourceTexture == null || renderingTargets == null || renderer == null)
        {
            throw new IllegalStateException("closed");
        }
        switch (_cls1..SwitchMap.com.skype.android.video.hw.codec.encoder.camera.gl.SurfaceTextureChannel.SourceState[awaitNewFrame(l).ordinal()])
        {
        default:
            defaultRenderingTarget.bind();
            try
            {
                if (Log.isLoggable("SLIQ", 3))
                {
                    Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Updating source texture image").toString());
                }
                sourceTexture.updateTexImage();
            }
            catch (RuntimeException runtimeexception)
            {
                throw new GLException("Failed to update texture image", runtimeexception);
            }
            return getTimestamp(sourceTexture);

        case 1: // '\001'
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Could not get a frame withing ").append(l).append(" ms. Timeouyt elapsed").toString());
            }
            throw new TimeoutException();

        case 2: // '\002'
            break;
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Wait for a frame interrupted").toString());
        }
        throw new InterruptedException();
    }

    public void allocateOutput(OutputType outputtype, int i, AbstractRenderingTarget.Events events)
        throws GLException
    {
        if (renderingTargets.indexOfKey(i) >= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("another target ")).append(i).append("/").append(outputtype).append(" exists").toString());
        } else
        {
            renderingTargets.append(i, createRenderingTarget(outputtype, events));
            return;
        }
    }

    public void attachOutput(int i, Surface surface, Resolution resolution)
        throws GLException
    {
        if (renderingTargets == null)
        {
            throw new IllegalStateException("closed");
        } else
        {
            ((AbstractRenderingTarget)renderingTargets.get(i)).setSurface(surface, resolution);
            return;
        }
    }

    public void close()
    {
        int i = 0;
        for (int j = renderingTargets.size(); i < j; i++)
        {
            ((AbstractRenderingTarget)renderingTargets.valueAt(i)).close();
        }

        renderingTargets.clear();
        if (sourceTexture != null)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Releasing surface texture 0x").append(Integer.toHexString(System.identityHashCode(sourceTexture))).toString());
            }
            sourceTexture.release();
            sourceTexture = null;
        }
        if (renderer != null)
        {
            renderer.close();
            renderer = null;
        }
        if (defaultRenderingTarget != null)
        {
            defaultRenderingTarget.close();
            defaultRenderingTarget = null;
        }
        if (sharedContext != null)
        {
            sharedContext.close();
            sharedContext = null;
        }
        if (eglDisplay != null)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Terminating EGL").toString());
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(eglDisplay);
            eglDisplay = EGL14.EGL_NO_DISPLAY;
        }
    }

    public void deallocateOutput(int i)
    {
        i = renderingTargets.indexOfKey(i);
        if (i < 0)
        {
            return;
        }
        AbstractRenderingTarget abstractrenderingtarget = (AbstractRenderingTarget)renderingTargets.valueAt(i);
        if (abstractrenderingtarget != null)
        {
            abstractrenderingtarget.close();
        }
        renderingTargets.removeAt(i);
    }

    public void detachOutput(int i)
    {
        if (renderingTargets == null)
        {
            throw new IllegalStateException("closed");
        } else
        {
            ((AbstractRenderingTarget)renderingTargets.get(i)).unsetSurface();
            return;
        }
    }

    public boolean executePushFrame(int i)
        throws GLException
    {
        if (!isPreEncodingRC)
        {
            return false;
        } else
        {
            pushFrameToSingleTarget(sourceTexture.getTimestamp(), (AbstractRenderingTarget)renderingTargets.get(i));
            return dropFrame;
        }
    }

    public void freeContext()
        throws GLException
    {
        defaultRenderingTarget.unbind();
    }

    public SurfaceTexture getInput()
    {
        return sourceTexture;
    }

    public Object getSharedMutex()
    {
        return renderingTargets;
    }

    protected long getTimestamp(SurfaceTexture surfacetexture)
    {
        return surfacetexture.getTimestamp();
    }

    public boolean hasTarget(int i)
    {
        return renderingTargets.indexOfKey(i) >= 0;
    }

    public void interrupt()
    {
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/codec/encoder/camera/gl/SurfaceTextureChannel.getSimpleName()).append(": Interrupting").toString());
        }
        synchronized (newFrameArrivedEvent)
        {
            sourceState = SourceState.INTERRUPTED;
            newFrameArrivedEvent.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isOutputAttached(int i)
    {
        if (renderingTargets == null)
        {
            throw new IllegalStateException("closed");
        } else
        {
            return ((AbstractRenderingTarget)renderingTargets.get(i)).hasSurface();
        }
    }

    public boolean isOutputAttached(int i, Surface surface, Resolution resolution)
    {
        if (renderingTargets == null)
        {
            throw new IllegalStateException("closed");
        }
        AbstractRenderingTarget abstractrenderingtarget = (AbstractRenderingTarget)renderingTargets.get(i);
        return abstractrenderingtarget.hasSurface() && abstractrenderingtarget.getSurface() == surface && (resolution == null && abstractrenderingtarget.getResolution() == null || resolution != null && resolution.equals(abstractrenderingtarget.getResolution()));
    }

    public void pushAndRenderFrame(long l)
        throws GLException
    {
        updateFrameRateContoller(l);
        if (isPreEncodingRC)
        {
            renderPreviewAndSignalFrameReady(l);
            return;
        } else
        {
            pushFrameToAllTargets(l);
            return;
        }
    }

    public void setInputResolution(Resolution resolution)
    {
        sourceResolution = resolution;
    }

    public void setParameters(int i, boolean flag, int j, float f, boolean flag1, boolean flag2, float f1)
    {
        if (renderingTargets == null)
        {
            throw new IllegalStateException("closed");
        } else
        {
            AbstractRenderingTarget abstractrenderingtarget = (AbstractRenderingTarget)renderingTargets.get(i);
            abstractrenderingtarget.setEnabled(flag);
            abstractrenderingtarget.setRotationAngle(j);
            abstractrenderingtarget.setFlipped(flag1, flag2);
            abstractrenderingtarget.setFitFactor(f);
            abstractrenderingtarget.setTargetFrameRate(f1);
            return;
        }
    }




/*
    static SourceState access$202(SurfaceTextureChannel surfacetexturechannel, SourceState sourcestate)
    {
        surfacetexturechannel.sourceState = sourcestate;
        return sourcestate;
    }

*/
}
