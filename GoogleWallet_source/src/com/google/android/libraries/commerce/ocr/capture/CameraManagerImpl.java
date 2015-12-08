// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture:
//            CameraManager, SizeSelectionStrategy

public final class CameraManagerImpl
    implements android.hardware.Camera.PreviewCallback, CameraManager
{

    private final boolean attemptToUseContinuousPictureFocusMode;
    Camera camera;
    Point containerSize;
    private final List continuousPreviewImageCallbacks = new CopyOnWriteArrayList();
    private boolean focusing;
    boolean inContinuousPictureFocusMode;
    boolean isCameraActive;
    CameraManager.ImageCallback oneShotImageCallback;
    private int orientation;
    private final int orientationOffset;
    private Point pictureSize;
    private OcrImage previewCallbackBuffer;
    private int previewFormat;
    private Point previewSize;
    private final ScreenManager screenManager;
    private final ShapeModifier shapeModifier;
    private SizeSelectionStrategy sizeSelectionStrategy;
    private final Point targetPictureSize;
    private final Point targetPreviewSize;
    private final boolean usePreviewCallbackBuffer = usePreviewCallbackBuffer();

    public CameraManagerImpl(ScreenManager screenmanager, int i, ShapeModifier shapemodifier, Point point, Point point1, SizeSelectionStrategy sizeselectionstrategy, boolean flag)
    {
        screenManager = screenmanager;
        orientationOffset = i;
        shapeModifier = shapemodifier;
        targetPreviewSize = point;
        targetPictureSize = point1;
        attemptToUseContinuousPictureFocusMode = flag;
        previewFormat = 17;
        sizeSelectionStrategy = sizeselectionstrategy;
    }

    private void addCallbackBuffer()
    {
        this;
        JVM INSTR monitorenter ;
        if (camera != null)
        {
            camera.addCallbackBuffer(previewCallbackBuffer.getData());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private Point adjustForScreenOrientation(int i, int j)
    {
        switch (screenManager.getScreenOrientation())
        {
        default:
            return new Point(j, i);

        case 2: // '\002'
            return new Point(i, j);
        }
    }

    private Point adjustForScreenOrientation(Point point)
    {
        return adjustForScreenOrientation(point.x, point.y);
    }

    private android.hardware.Camera.Size getBestFitSize(Point point, Point point1, List list)
    {
        android.hardware.Camera.Size size = sizeSelectionStrategy.getClosest(list, getMaxDpiFilter(point1), point, point1);
        point1 = size;
        if (size == null)
        {
            Log.d("CameraManagerImpl", "Cannot find supported aspect ratio size, match height only");
            int i = point.x;
            double d = 1.7976931348623157E+308D;
            list = list.iterator();
            point = size;
            do
            {
                point1 = point;
                if (!list.hasNext())
                {
                    break;
                }
                point1 = (android.hardware.Camera.Size)list.next();
                if ((double)Math.abs(((android.hardware.Camera.Size) (point1)).height - i) < d)
                {
                    point = point1;
                    d = Math.abs(((android.hardware.Camera.Size) (point1)).height - i);
                }
            } while (true);
        }
        return point1;
    }

    private Point getContainerSize()
    {
        return adjustForScreenOrientation(containerSize.y, containerSize.x);
    }

    private Predicate getMaxDpiFilter(Point point)
    {
        return new Predicate() {

            final CameraManagerImpl this$0;
            final int val$maxDpi;

            private boolean apply(android.hardware.Camera.Size size)
            {
                return size.width * size.height <= maxDpi;
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((android.hardware.Camera.Size)obj);
            }

            
            {
                this$0 = CameraManagerImpl.this;
                maxDpi = i;
                super();
            }
        };
    }

    private int getOrientationRelativeToDisplay()
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(0, camerainfo);
        int i = (screenManager.getDisplayRotation() + orientationOffset) * 90;
        if (camerainfo.facing == 1)
        {
            return (360 - (camerainfo.orientation + i) % 360) % 360;
        } else
        {
            return ((camerainfo.orientation - i) + 360) % 360;
        }
    }

    private Point getPictureSize(android.hardware.Camera.Parameters parameters)
    {
        if (pictureSize != null)
        {
            return pictureSize;
        }
        Object obj = parameters.getPictureSize();
        obj = new Point(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height);
        if (targetPictureSize != null)
        {
            obj = getPreviewSize(parameters);
            double d = (double)((Point) (obj)).x / (double)((Point) (obj)).y;
            long l = 0x7fffffffffffffffL;
            Object obj1 = null;
            long l1 = 0x7fffffffffffffffL;
            obj = null;
            Iterator iterator = parameters.getSupportedPictureSizes().iterator();
            parameters = obj1;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                android.hardware.Camera.Size size = (android.hardware.Camera.Size)iterator.next();
                double d1 = (double)size.width / (double)size.height;
                int i = Math.abs(size.width - targetPictureSize.x);
                int j = Math.abs(size.height - targetPictureSize.y);
                i = i * i + j * j;
                if (d1 == d && (long)i < l)
                {
                    l = i;
                    parameters = new Point(size.width, size.height);
                } else
                if (d1 != d && (long)i < l1)
                {
                    l1 = i;
                    obj = new Point(size.width, size.height);
                }
            } while (true);
            if (parameters != null)
            {
                obj = parameters;
            }
        }
        parameters = String.valueOf(obj);
        Log.v("CameraManagerImpl", (new StringBuilder(String.valueOf(parameters).length() + 14)).append("Picture size: ").append(parameters).toString());
        return ((Point) (obj));
    }

    private int getPreviewBufferSize()
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        android.hardware.Camera.Size size = parameters.getPreviewSize();
        int i = size.width;
        int j = size.height;
        return (ImageFormat.getBitsPerPixel(parameters.getPreviewFormat()) * (i * j)) / 8 + 16;
    }

    private int getPreviewFormat()
    {
        return previewFormat;
    }

    private Point getPreviewSize(android.hardware.Camera.Parameters parameters)
    {
        if (previewSize != null)
        {
            return previewSize;
        } else
        {
            parameters = getBestFitSize(getContainerSize(), targetPreviewSize, parameters.getSupportedPreviewSizes());
            int i = ((android.hardware.Camera.Size) (parameters)).width;
            int j = ((android.hardware.Camera.Size) (parameters)).height;
            Log.d("CameraManagerImpl", (new StringBuilder(46)).append("Setting preview size = ").append(i).append("x").append(j).toString());
            previewSize = new Point(((android.hardware.Camera.Size) (parameters)).width, ((android.hardware.Camera.Size) (parameters)).height);
            return previewSize;
        }
    }

    private Point getScreenFillingPreviewSize(Point point, Point point1)
    {
        return adjustForScreenOrientation(getScreenFillingPreviewSizeForLandscape(adjustForScreenOrientation(point), point1));
    }

    private Point getScreenFillingPreviewSizeForLandscape(Point point, Point point1)
    {
        int i = point.x;
        int j = point.y;
        point = shapeModifier;
        Rect rect = ShapeModifier.toRect(point1);
        point1 = shapeModifier.getShapeModifier(rect).scaleToWidth(i).getAsRect();
        point = point1;
        if (point1.height() > j)
        {
            point = shapeModifier.getShapeModifier(rect).scaleToHeight(j).getAsRect();
        }
        return new Point(point.width(), point.height());
    }

    private boolean isFocusing()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = focusing;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void requestAutoFocus(final android.hardware.Camera.AutoFocusCallback callback)
    {
        if (inContinuousPictureFocusMode)
        {
            if (callback != null)
            {
                callback.onAutoFocus(true, camera);
            }
        } else
        if (camera != null && isCameraActive && !isFocusing())
        {
            setFocusing(true);
            try
            {
                camera.autoFocus(new android.hardware.Camera.AutoFocusCallback() {

                    final CameraManagerImpl this$0;
                    final android.hardware.Camera.AutoFocusCallback val$callback;

                    public final void onAutoFocus(boolean flag, Camera camera1)
                    {
                        if (callback != null)
                        {
                            callback.onAutoFocus(flag, camera1);
                        }
                        setFocusing(false);
                    }

            
            {
                this$0 = CameraManagerImpl.this;
                callback = autofocuscallback;
                super();
            }
                });
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                Log.w("CameraManagerImpl", runtimeexception.getMessage());
            }
            setFocusing(false);
            if (callback != null)
            {
                callback.onAutoFocus(false, camera);
                return;
            }
        }
    }

    private boolean requestFullImage(final CameraManager.ImageCallback imageCallback)
    {
        isCameraActive = false;
        try
        {
            camera.takePicture(null, null, new android.hardware.Camera.PictureCallback() {

                final CameraManagerImpl this$0;
                final CameraManager.ImageCallback val$imageCallback;

                public final void onPictureTaken(byte abyte0[], Camera camera1)
                {
                    camera1 = camera1.getParameters();
                    Point point = new Point(camera1.getPictureSize().width, camera1.getPictureSize().height);
                    imageCallback.onImage(new OcrImage(abyte0, camera1.getPictureFormat(), point, getOrientation()));
                }

            
            {
                this$0 = CameraManagerImpl.this;
                imageCallback = imagecallback;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final CameraManager.ImageCallback imageCallback)
        {
            Log.w("CameraManagerImpl", imageCallback.toString());
            return false;
        }
        return true;
    }

    private void setCameraParameters()
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        previewSize = getPreviewSize(parameters);
        pictureSize = getPictureSize(parameters);
        int i = previewSize.x;
        int j = previewSize.y;
        Log.i("CameraManagerImpl", (new StringBuilder(38)).append("Preview size: ").append(i).append(", ").append(j).toString());
        i = pictureSize.x;
        j = pictureSize.y;
        Log.i("CameraManagerImpl", (new StringBuilder(38)).append("Picture size: ").append(i).append(", ").append(j).toString());
        parameters.setPictureSize(pictureSize.x, pictureSize.y);
        parameters.setPreviewSize(previewSize.x, previewSize.y);
        inContinuousPictureFocusMode = setContinuousPictureFocusModeIfSupported(parameters);
        boolean flag = inContinuousPictureFocusMode;
        Log.i("CameraManagerImpl", (new StringBuilder(40)).append("Use continuous-picture-focus-mode: ").append(flag).toString());
        previewFormat = parameters.getPreviewFormat();
        camera.setParameters(parameters);
    }

    private boolean setContinuousPictureFocusModeIfSupported(android.hardware.Camera.Parameters parameters)
    {
        if (!attemptToUseContinuousPictureFocusMode)
        {
            return false;
        }
        boolean flag = false;
        String s = parameters.getFocusMode();
        if (parameters.getSupportedFocusModes().contains("continuous-picture"))
        {
            flag = true;
            s = "continuous-picture";
        }
        parameters.setFocusMode(s);
        return flag;
    }

    private void setFocusing(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        focusing = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void setOrientation()
    {
        orientation = getOrientationRelativeToDisplay();
        int i = orientation;
        Log.d("CameraManagerImpl", (new StringBuilder(30)).append("Orientation set to ").append(i).toString());
        camera.setDisplayOrientation(orientation);
    }

    private void setPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback)
    {
        if (usePreviewCallbackBuffer)
        {
            camera.setPreviewCallbackWithBuffer(previewcallback);
            return;
        } else
        {
            camera.setPreviewCallback(previewcallback);
            return;
        }
    }

    private static boolean usePreviewCallbackBuffer()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public final void addContinuousPreviewImageCallback(CameraManager.ImageCallback imagecallback)
    {
        this;
        JVM INSTR monitorenter ;
        continuousPreviewImageCallbacks.add(imagecallback);
        this;
        JVM INSTR monitorexit ;
        return;
        imagecallback;
        throw imagecallback;
    }

    public final void closeDriver()
    {
        this;
        JVM INSTR monitorenter ;
        if (camera != null)
        {
            Log.i("CameraManagerImpl", "close camera driver");
            setPreviewCallback(null);
            camera.stopPreview();
            isCameraActive = false;
            camera.release();
            camera = null;
            previewSize = null;
            pictureSize = null;
        }
        continuousPreviewImageCallbacks.clear();
        previewCallbackBuffer = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int getOrientation()
    {
        return orientation;
    }

    public final Point getPreviewSize()
    {
        return adjustForScreenOrientation(previewSize);
    }

    public final Point getScreenFillingPreviewSize()
    {
        return getScreenFillingPreviewSize(containerSize, previewSize);
    }

    public final void onPreviewFrame(byte abyte0[], Camera camera1)
    {
        if (abyte0 != null)
        {
            if (usePreviewCallbackBuffer)
            {
                abyte0 = previewCallbackBuffer;
            } else
            {
                abyte0 = new OcrImage(abyte0, getPreviewFormat(), previewSize, getOrientation());
            }
            if (oneShotImageCallback != null)
            {
                camera1 = oneShotImageCallback;
                oneShotImageCallback = null;
                camera1.onImage(abyte0);
            }
            if (!continuousPreviewImageCallbacks.isEmpty())
            {
                for (camera1 = continuousPreviewImageCallbacks.iterator(); camera1.hasNext(); ((CameraManager.ImageCallback)camera1.next()).onImage(abyte0)) { }
            }
        }
        if (usePreviewCallbackBuffer)
        {
            addCallbackBuffer();
        }
    }

    public final void openDriver(Point point, SurfaceHolder surfaceholder, CameraManager.OnFinishCallback onfinishcallback)
        throws RuntimeException
    {
        this;
        JVM INSTR monitorenter ;
        containerSize = point;
        if (camera != null) goto _L2; else goto _L1
_L1:
        Log.i("CameraManagerImpl", "open camera driver");
        camera = Camera.open();
        setCameraParameters();
        setOrientation();
        camera.setPreviewDisplay(surfaceholder);
_L3:
        onfinishcallback.onFinish();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        point;
        Log.e("CameraManagerImpl", "camera driver failed to set preview display");
          goto _L3
        point;
        throw point;
    }

    public final void requestAutoFocus()
    {
        if (!isFocusing())
        {
            requestAutoFocus(null);
        }
    }

    public final boolean requestImage(CameraManager.ImageCallback imagecallback, byte byte0)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (isCameraActive) goto _L2; else goto _L1
_L1:
        Log.v("CameraManagerImpl", "Requesting image from inactive camera results in no-op.");
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        byte0;
        JVM INSTR tableswitch 1 2: default 48
    //                   1 84
    //                   2 103;
           goto _L3 _L4 _L5
_L3:
        Log.w("CameraManagerImpl", (new StringBuilder(29)).append("Unsupported image format ").append(byte0).toString());
        continue; /* Loop/switch isn't completed */
        imagecallback;
        throw imagecallback;
_L4:
        oneShotImageCallback = imagecallback;
        if (usePreviewCallbackBuffer)
        {
            addCallbackBuffer();
        }
        break; /* Loop/switch isn't completed */
_L5:
        flag = requestFullImage(imagecallback);
        continue; /* Loop/switch isn't completed */
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void restartPreview()
    {
        startPreview(null);
    }

    public final void setSizeSelectionStrategy(SizeSelectionStrategy sizeselectionstrategy)
    {
        sizeSelectionStrategy = sizeselectionstrategy;
    }

    public final void startPreview(CameraManager.OnFinishCallback onfinishcallback)
    {
        if (camera != null && !isCameraActive)
        {
            setFocusing(false);
            setPreviewCallback(this);
            camera.startPreview();
            isCameraActive = true;
            if (usePreviewCallbackBuffer && previewCallbackBuffer == null)
            {
                previewCallbackBuffer = new OcrImage(new byte[getPreviewBufferSize()], getPreviewFormat(), previewSize, getOrientation());
                addCallbackBuffer();
            }
            if (onfinishcallback != null)
            {
                onfinishcallback.onFinish();
            }
        }
    }

    public final void stopPreview()
    {
        this;
        JVM INSTR monitorenter ;
        if (camera != null && isCameraActive)
        {
            camera.cancelAutoFocus();
            camera.stopPreview();
            isCameraActive = false;
        }
        oneShotImageCallback = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
