// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.r;
import com.google.android.apps.unveil.env.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            CameraProxy, FakeParameters, ParametersProxy

public abstract class FakeCamera
    implements CameraProxy
{

    private static final int FRAME_DELAY_FOR_FAILURE_MS = 1000;
    public static final String LOCKSTEP_KEY = "lockstep_callbacks";
    private static final int MIN_FRAME_DELAY_MS = 10;
    public static final String SKIP_RENDERING_KEY = "skip_rendering";
    public static FakeCamera camera;
    private final List bufferQueue = new ArrayList();
    private android.hardware.Camera.PreviewCallback callback;
    private volatile boolean callbackRunning;
    private CallbackType callbackType;
    private SurfaceHolder cameraSurfaceHolder;
    private final Map extraSettings;
    private android.hardware.Camera.AutoFocusCallback focusCallback;
    private final Handler handler;
    private RawFrame lastFrameData;
    private int localRgbBuffer[];
    private final af logger = new af();
    private final Paint paint = new Paint();
    private FakeParameters parameters;
    private boolean previewActive;
    private int previewHeight;
    private int previewWidth;
    private int renderRotation;
    public Resources resources;
    private final boolean skipRendering = getExtraValue("skip_rendering", "").equals("true");
    private final boolean waitForCallbacks = getExtraValue("lockstep_callbacks", "").equals("true");

    protected FakeCamera(Handler handler1, Map map, Resources resources1)
    {
        callbackRunning = false;
        extraSettings = map;
        resources = resources1;
        paint.setFilterBitmap(false);
        parameters = new FakeParameters();
        callback = null;
        callbackType = CallbackType.ONESHOT;
        handler = handler1;
    }

    private boolean drawFrame(RawFrame rawframe)
    {
        if (cameraSurfaceHolder == null)
        {
            return false;
        }
        Canvas canvas = cameraSurfaceHolder.lockCanvas();
        if (canvas == null)
        {
            logger.e("couldn't get canvas!", new Object[0]);
            return false;
        } else
        {
            android.graphics.Matrix matrix = ImageUtils.a(rawframe.frameSize, new Size(canvas.getWidth(), canvas.getHeight()), getDisplayOrientation());
            canvas.save();
            canvas.concat(matrix);
            canvas.drawBitmap(rawframe.getRgbData(), 0, rawframe.frameSize.width, 0, 0, rawframe.frameSize.width, rawframe.frameSize.height, true, new Paint());
            canvas.restore();
            cameraSurfaceHolder.unlockCanvasAndPost(canvas);
            return true;
        }
    }

    private void frameLoop()
    {
        w w1;
        long l;
        l = 1000 / parameters.getInt("preview-frame-rate");
        w1 = new w();
        w1.a();
_L2:
        boolean flag;
        if (!previewActive)
        {
            break; /* Loop/switch isn't completed */
        }
        maybeWaitForCallbacks();
        w1.c();
        flag = renderFrameAndCallBack();
        long l1 = w1.d();
        if (!flag)
        {
            try
            {
                logger.c("renderFrameAndCallBack() was unsuccessful. Sleeping for a while.", new Object[0]);
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedexception)
            {
                logger.f("Problem sleeping.", new Object[0]);
            }
            continue; /* Loop/switch isn't completed */
        }
        Thread.sleep(Math.max(10L, l - l1));
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void handleCallback(RawFrame rawframe)
    {
        final byte dataBuffer[];
        final android.hardware.Camera.PreviewCallback tmpCallback;
        dataBuffer = null;
        if (callback == null || callbackRunning)
        {
            return;
        }
        tmpCallback = callback;
        callbackRunning = true;
        _cls5..SwitchMap.com.google.android.apps.unveil.sensors.proxies.camera.FakeCamera.CallbackType[callbackType.ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 106
    //                   2 162
    //                   3 167;
           goto _L1 _L2 _L3 _L4
_L1:
        List list;
        if (rawframe.yuvData == null)
        {
            ImageUtils.convertARGB8888ToYUV420SP(rawframe.rgbData, dataBuffer, previewWidth, previewHeight);
        } else
        {
            System.arraycopy(rawframe.yuvData, 0, dataBuffer, 0, dataBuffer.length);
        }
        handler.post(new _cls4());
        return;
_L2:
        list = bufferQueue;
        list;
        JVM INSTR monitorenter ;
        if (bufferQueue.size() <= 0) goto _L6; else goto _L5
_L5:
        dataBuffer = (byte[])bufferQueue.remove(0);
          goto _L1
        rawframe;
        list;
        JVM INSTR monitorexit ;
        throw rawframe;
_L6:
        callbackRunning = false;
        list;
        JVM INSTR monitorexit ;
        return;
_L3:
        callback = null;
_L4:
        dataBuffer = new byte[ImageUtils.b(previewWidth, previewHeight)];
          goto _L1
    }

    private void maybeWaitForCallbacks()
    {
        if (!waitForCallbacks)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
_L1:
        if (!previewActive)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (callback == null || callbackRunning || callbackType == CallbackType.WITH_BUFFER && bufferQueue.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        wait();
          goto _L1
        obj;
        logger.f("Exception!", new Object[0]);
          goto _L1
        this;
        JVM INSTR monitorexit ;
    }

    private boolean renderFrameAndCallBack()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = previewActive;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        int i;
        if (previewWidth == 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        i = previewHeight;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        Thread.sleep(1000L);
          goto _L1
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L1
        obj;
        throw obj;
        if (localRgbBuffer == null)
        {
            localRgbBuffer = new int[getWidth() * getHeight()];
        }
        lastFrameData = generateFrame();
        if (!skipRendering)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        flag = true;
_L3:
        handleCallback(lastFrameData);
          goto _L1
        flag = drawFrame(lastFrameData);
          goto _L3
    }

    public void addCallbackBuffer(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        synchronized (bufferQueue)
        {
            bufferQueue.add(abyte0);
        }
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        list;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void autoFocus(android.hardware.Camera.AutoFocusCallback autofocuscallback)
    {
        focusCallback = autofocuscallback;
        (new _cls1()).start();
    }

    public void cancelAutoFocus()
    {
    }

    protected abstract RawFrame generateFrame();

    protected int getDisplayOrientation()
    {
        return renderRotation;
    }

    protected String getExtraValue(String s, String s1)
    {
        if (extraSettings == null || !extraSettings.containsKey(s))
        {
            return s1;
        } else
        {
            return (String)extraSettings.get(s);
        }
    }

    protected int getHeight()
    {
        return previewHeight;
    }

    public ParametersProxy getParameters()
    {
        return new FakeParameters(parameters);
    }

    protected int getWidth()
    {
        return previewWidth;
    }

    public void release()
    {
        previewActive = false;
        camera = null;
    }

    public void setDisplayOrientation(int i)
    {
        renderRotation = i;
    }

    public void setOneShotPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback)
    {
        this;
        JVM INSTR monitorenter ;
        callbackType = CallbackType.ONESHOT;
        callback = previewcallback;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        previewcallback;
        throw previewcallback;
    }

    public void setParameters(ParametersProxy parametersproxy)
    {
        this;
        JVM INSTR monitorenter ;
        parameters = new FakeParameters((FakeParameters)parametersproxy);
        previewHeight = parameters.getPreviewSize().height;
        previewWidth = parameters.getPreviewSize().width;
        parameters.getPictureSize();
        this;
        JVM INSTR monitorexit ;
        return;
        parametersproxy;
        throw parametersproxy;
    }

    public void setPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback)
    {
        this;
        JVM INSTR monitorenter ;
        callbackType = CallbackType.REPEATING;
        callback = previewcallback;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        previewcallback;
        throw previewcallback;
    }

    public void setPreviewCallbackWithBuffer(android.hardware.Camera.PreviewCallback previewcallback)
    {
        this;
        JVM INSTR monitorenter ;
        callback = previewcallback;
        if (previewcallback == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        callbackType = CallbackType.WITH_BUFFER;
_L1:
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        callbackType = CallbackType.ONESHOT;
          goto _L1
        previewcallback;
        throw previewcallback;
    }

    public void setPreviewDisplay(SurfaceHolder surfaceholder)
    {
        cameraSurfaceHolder = surfaceholder;
        surfaceholder.setType(0);
    }

    public void setPreviewTexture(r r)
    {
        throw new NoSuchMethodError("FakeCamera doesn't support setPreviewTexture");
    }

    public void setZoomChangeListener(android.hardware.Camera.OnZoomChangeListener onzoomchangelistener)
    {
        logger.c("FakeCamera.setZoomChangeListener(): zooming not supported!", new Object[0]);
    }

    public void startPreview()
    {
        previewActive = true;
        logger.b("Starting preview loop.", new Object[0]);
        (new _cls2()).start();
    }

    public void startSmoothZoom(int i)
    {
        logger.c("FakeCamera.startSmoothZoom(): zooming not supported!", new Object[0]);
    }

    public void stopPreview()
    {
        this;
        JVM INSTR monitorenter ;
        previewActive = false;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void takePicture(android.hardware.Camera.ShutterCallback shuttercallback, android.hardware.Camera.PictureCallback picturecallback, final android.hardware.Camera.PictureCallback callback)
    {
        (new _cls3()).start();
    }







/*
    static boolean access$702(FakeCamera fakecamera, boolean flag)
    {
        fakecamera.callbackRunning = flag;
        return flag;
    }

*/

    private class CallbackType extends Enum
    {

        private static final CallbackType $VALUES[];
        public static final CallbackType ONESHOT;
        public static final CallbackType REPEATING;
        public static final CallbackType WITH_BUFFER;

        public static CallbackType valueOf(String s)
        {
            return (CallbackType)Enum.valueOf(com/google/android/apps/unveil/sensors/proxies/camera/FakeCamera$CallbackType, s);
        }

        public static CallbackType[] values()
        {
            return (CallbackType[])$VALUES.clone();
        }

        static 
        {
            ONESHOT = new CallbackType("ONESHOT", 0);
            REPEATING = new CallbackType("REPEATING", 1);
            WITH_BUFFER = new CallbackType("WITH_BUFFER", 2);
            $VALUES = (new CallbackType[] {
                ONESHOT, REPEATING, WITH_BUFFER
            });
        }

        private CallbackType(String s, int i)
        {
            super(s, i);
        }
    }


    private class RawFrame
    {

        final Size frameSize;
        private boolean isRgbDataDirty;
        private int rgbData[];
        final FakeCamera this$0;
        private byte yuvData[];

        public int[] getRgbData()
        {
            if (rgbData == null)
            {
                rgbData = new int[frameSize.width * frameSize.height];
            }
            if (isRgbDataDirty)
            {
                ImageUtils.convertYUV420SPToARGB8888(yuvData, rgbData, frameSize.width, frameSize.height, false);
                isRgbDataDirty = false;
            }
            return rgbData;
        }

        public byte[] getYuvDataAndClearRgbData()
        {
            isRgbDataDirty = true;
            return yuvData;
        }

        public void loadRgb(Bitmap bitmap)
        {
            bitmap.getPixels(rgbData, 0, frameSize.width, 0, 0, frameSize.width, frameSize.height);
            isRgbDataDirty = false;
            yuvData = null;
        }



        public RawFrame(int i, int j, byte abyte0[])
        {
            this$0 = FakeCamera.this;
            super();
            isRgbDataDirty = true;
            frameSize = new Size(i, j);
            yuvData = abyte0;
        }

        public RawFrame(int i, int j, int ai[])
        {
            this$0 = FakeCamera.this;
            super();
            isRgbDataDirty = true;
            frameSize = new Size(i, j);
            rgbData = ai;
            isRgbDataDirty = false;
        }

        public RawFrame(Bitmap bitmap)
        {
            this(bitmap.getWidth(), bitmap.getHeight(), new int[bitmap.getWidth() * bitmap.getHeight()]);
            loadRgb(bitmap);
        }
    }


    private class _cls5
    {

        static final int $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType[];

        static 
        {
            $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType = new int[CallbackType.values().length];
            try
            {
                $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType[CallbackType.WITH_BUFFER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType[CallbackType.ONESHOT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$google$android$apps$unveil$sensors$proxies$camera$FakeCamera$CallbackType[CallbackType.REPEATING.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls4
        implements Runnable
    {

        final FakeCamera this$0;
        final byte val$dataBuffer[];
        final android.hardware.Camera.PreviewCallback val$tmpCallback;

        public void run()
        {
            tmpCallback.onPreviewFrame(dataBuffer, null);
            callbackRunning = false;
            synchronized (FakeCamera.this)
            {
                notify();
            }
            return;
            exception;
            fakecamera;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls4()
        {
            this$0 = FakeCamera.this;
            tmpCallback = previewcallback;
            dataBuffer = abyte0;
            super();
        }
    }


    private class _cls1 extends Thread
    {

        final FakeCamera this$0;

        public void run()
        {
            try
            {
                sleep(100L);
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
            focusCallback.onAutoFocus(true, null);
        }

        _cls1()
        {
            this$0 = FakeCamera.this;
            super();
        }
    }


    private class _cls2 extends Thread
    {

        final FakeCamera this$0;

        public void run()
        {
            frameLoop();
        }

        _cls2()
        {
            this$0 = FakeCamera.this;
            super();
        }
    }


    private class _cls3 extends Thread
    {

        final FakeCamera this$0;
        final android.hardware.Camera.PictureCallback val$callback;

        public void run()
        {
            final Object jpegBytes;
            try
            {
                sleep(100L);
            }
            // Misplaced declaration of an exception variable
            catch (final Object jpegBytes)
            {
                ((InterruptedException) (jpegBytes)).printStackTrace();
            }
            this;
            JVM INSTR monitorenter ;
            if (lastFrameData.rgbData != null)
            {
                break MISSING_BLOCK_LABEL_216;
            }
            jpegBytes = new int[lastFrameData.frameSize.width * lastFrameData.frameSize.height];
            ImageUtils.convertYUV420SPToARGB8888(lastFrameData.yuvData, ((int []) (jpegBytes)), lastFrameData.frameSize.width, lastFrameData.frameSize.height, false);
_L1:
            this;
            JVM INSTR monitorexit ;
            jpegBytes = Bitmap.createBitmap(((int []) (jpegBytes)), lastFrameData.frameSize.width, lastFrameData.frameSize.height, android.graphics.Bitmap.Config.ARGB_8888);
            Object obj = parameters.getPictureSize();
            jpegBytes = Bitmap.createScaledBitmap(((Bitmap) (jpegBytes)), ((Size) (obj)).width, ((Size) (obj)).height, false);
            obj = new ByteArrayOutputStream();
            ((Bitmap) (jpegBytes)).compress(android.graphics.Bitmap.CompressFormat.JPEG, parameters.getInt("jpeg-quality"), ((java.io.OutputStream) (obj)));
            jpegBytes = ((ByteArrayOutputStream) (obj)).toByteArray();
            class _cls1
                implements Runnable
            {

                final _cls3 this$1;
                final byte val$jpegBytes[];

                public void run()
                {
                    callback.onPictureTaken(jpegBytes, null);
                }

                _cls1()
                {
                    this$1 = _cls3.this;
                    jpegBytes = abyte0;
                    super();
                }
            }

            handler.post(new _cls1());
            return;
            jpegBytes = lastFrameData.rgbData;
              goto _L1
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        _cls3()
        {
            this$0 = FakeCamera.this;
            callback = picturecallback;
            super();
        }
    }

}
