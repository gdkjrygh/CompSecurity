// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Display;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            CameraControl, SurfaceListener, ScaleMode, DeviceProfile, 
//            Size, SurfaceViewWrapper, CameraCallback, SurfaceWrapper, 
//            TextureViewWrapper

public class CameraView extends FrameLayout
    implements android.hardware.Camera.ErrorCallback, android.hardware.Camera.FaceDetectionListener, android.hardware.Camera.OnZoomChangeListener, android.hardware.Camera.ShutterCallback, android.os.Handler.Callback, CameraControl, SurfaceListener
{
    private final class a
        implements android.hardware.Camera.PictureCallback
    {

        CameraCallback.PictureType a;
        final CameraView b;

        public final void onPictureTaken(byte abyte0[], Camera camera1)
        {
            if (b.cameraCallback != null)
            {
                b.cameraCallback.onPictureTaken(a, abyte0);
            }
            if (a == CameraCallback.PictureType.c)
            {
                camera1.startPreview();
            }
        }

        a(CameraCallback.PictureType picturetype)
        {
            b = CameraView.this;
            super();
            a = picturetype;
        }
    }


    protected static final int MSG_REQUEST_LAYOUT = 1;
    protected static final int MSG_UPDATE_DEBUG = 2;
    protected static final Logger log = Logger.getLogger("SkypeMedia");
    private boolean camcorderHint;
    private Camera camera;
    private CameraCallback cameraCallback;
    private int cameraId;
    private android.hardware.Camera.Parameters cameraParameters;
    private boolean debug;
    private TextView debugTextView;
    protected DeviceProfile deviceProfile;
    private boolean faceDetectionEnabled;
    private boolean faceDetectionStarted;
    private int facing;
    private GestureDetector focusGestureDetector;
    private boolean focusing;
    private Handler handler;
    private int measureHeight;
    private Rect measureRect;
    private int measureWidth;
    private int orientation;
    private OrientationEventListener orientationListener;
    private int previewHeight;
    private android.hardware.Camera.Size previewSize;
    private int previewWidth;
    private boolean previewing;
    private ScaleMode scaleMode;
    private boolean surfaceAvailable;
    protected SurfaceWrapper surfaceWrapper;
    private boolean touchFocusEnabled;
    private boolean touchZoomEnabled;
    private WindowManager windowManager;
    private ScaleGestureDetector zoomGestureDetector;
    private float zoomScaleFactor;
    private boolean zooming;

    public CameraView(Context context)
    {
        this(context, null);
    }

    public CameraView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setKeepScreenOn(true);
        setWillNotDraw(true);
        handler = new Handler(this);
        scaleMode = ScaleMode.a;
        orientation = -1;
        facing = -1;
        camcorderHint = true;
        measureRect = new Rect();
        windowManager = (WindowManager)getContext().getSystemService("window");
        if (!isInEditMode())
        {
            orientationListener = new OrientationEventListener(getContext()) {

                final CameraView a;

                public final void onOrientationChanged(int i)
                {
                    a.updateCameraDisplayOrientation();
                }

            
            {
                a = CameraView.this;
                super(context, 2);
            }
            };
        }
        focusGestureDetector = new GestureDetector(getContext(), new android.view.GestureDetector.SimpleOnGestureListener() {

            final CameraView a;

            public final boolean onSingleTapConfirmed(MotionEvent motionevent)
            {
                a.touchFocus(motionevent);
                return true;
            }

            
            {
                a = CameraView.this;
                super();
            }
        });
        zoomGestureDetector = new ScaleGestureDetector(getContext(), new android.view.ScaleGestureDetector.SimpleOnScaleGestureListener() {

            final CameraView a;

            public final void onScaleEnd(ScaleGestureDetector scalegesturedetector)
            {
                if (a.isZoomSupported())
                {
                    a.zoomScaleFactor = scalegesturedetector.getScaleFactor();
                    scalegesturedetector = a.cameraParameters.getZoomRatios();
                    float f = (float)((Integer)scalegesturedetector.get(scalegesturedetector.size() - 1)).intValue() / 100F;
                    a.zoomScaleFactor = Math.max(1.0F, Math.min(a.zoomScaleFactor, f));
                    a.zoom(a.zoomScaleFactor);
                }
            }

            
            {
                a = CameraView.this;
                super();
            }
        });
    }

    private boolean acceptPreviewSize(Size size)
    {
        for (Set set = deviceProfile.g(); set != null && set.contains(size) || size.a(deviceProfile.m()) < 0 || size.a(deviceProfile.n()) > 0;)
        {
            return false;
        }

        return true;
    }

    private static int clamp(int i)
    {
        return Math.max(-1000, Math.min(1000, i));
    }

    private android.hardware.Camera.Size findCameraPreviewSize(int i, int j)
    {
        Object obj = null;
        Object obj1 = null;
        Float float1 = Float.valueOf((float)i / (float)j);
        if (j > i)
        {
            float1 = Float.valueOf((float)j / (float)i);
        }
        cameraParameters = camera.getParameters();
        Object obj2 = new TreeMap();
        Object obj3 = cameraParameters.getSupportedPreviewSizes();
        if (obj3 != null)
        {
            obj = ((List) (obj3)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj3 = (android.hardware.Camera.Size)((Iterator) (obj)).next();
                Size size = new Size(((android.hardware.Camera.Size) (obj3)).width, ((android.hardware.Camera.Size) (obj3)).height);
                log.info((new StringBuilder("preview ")).append(((android.hardware.Camera.Size) (obj3)).width).append(" x ").append(((android.hardware.Camera.Size) (obj3)).height).toString());
                if (acceptPreviewSize(size))
                {
                    ((TreeMap) (obj2)).put(Float.valueOf((float)((android.hardware.Camera.Size) (obj3)).width / (float)((android.hardware.Camera.Size) (obj3)).height), obj3);
                }
            } while (true);
            if (((TreeMap) (obj2)).isEmpty())
            {
                log.info("no acceptable preview resolutions using defaults");
                obj = camera;
                obj.getClass();
                ((TreeMap) (obj2)).put(Float.valueOf(1.333333F), new android.hardware.Camera.Size(((Camera) (obj)), 320, 240));
                obj = camera;
                obj.getClass();
                ((TreeMap) (obj2)).put(Float.valueOf(1.333333F), new android.hardware.Camera.Size(((Camera) (obj)), 640, 480));
            }
            obj3 = ((TreeMap) (obj2)).floorEntry(float1);
            obj2 = ((TreeMap) (obj2)).ceilingEntry(float1);
            obj = obj1;
            if (obj3 == null)
            {
                obj = obj1;
                if (obj2 != null)
                {
                    obj = (android.hardware.Camera.Size)((java.util.Map.Entry) (obj2)).getValue();
                }
            }
            obj1 = obj;
            if (obj2 == null)
            {
                obj1 = obj;
                if (obj3 != null)
                {
                    obj1 = (android.hardware.Camera.Size)((java.util.Map.Entry) (obj3)).getValue();
                }
            }
            obj = obj1;
            if (obj1 == null)
            {
                if (Math.abs(float1.floatValue() - ((Float)((java.util.Map.Entry) (obj3)).getKey()).floatValue()) > Math.abs(float1.floatValue() - ((Float)((java.util.Map.Entry) (obj2)).getKey()).floatValue()))
                {
                    obj = (android.hardware.Camera.Size)((java.util.Map.Entry) (obj2)).getValue();
                } else
                {
                    obj = (android.hardware.Camera.Size)((java.util.Map.Entry) (obj3)).getValue();
                }
            }
            log.info((new StringBuilder("best preview ")).append(((android.hardware.Camera.Size) (obj)).width).append(" x ").append(((android.hardware.Camera.Size) (obj)).height).toString());
        }
        return ((android.hardware.Camera.Size) (obj));
    }

    private int getOrientationHint(int i)
    {
label0:
        {
            int j = 0;
            android.hardware.Camera.CameraInfo camerainfo = getCameraInfo(facing);
            if (camerainfo != null)
            {
                j = camerainfo.orientation;
                if (facing == 1)
                {
                    j = (j + i) % 360;
                } else
                {
                    j = ((j - i) + 360) % 360;
                }
            }
            if (j >= 0)
            {
                i = j;
                if (j % 90 == 0)
                {
                    break label0;
                }
            }
            log.warning((new StringBuilder("invalid display orientation ")).append(j).toString());
            i = 0;
        }
        return i;
    }

    private void initCamera(int i)
    {
        this;
        JVM INSTR monitorenter ;
        releaseCamera();
        orientation = -1;
        previewWidth = 0;
        previewHeight = 0;
        measureWidth = 0;
        measureHeight = 0;
        faceDetectionStarted = false;
        int j = 0;
_L7:
        if (j >= Camera.getNumberOfCameras()) goto _L2; else goto _L1
_L1:
        android.hardware.Camera.CameraInfo camerainfo;
        camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(j, camerainfo);
        if (camerainfo.facing != i) goto _L4; else goto _L3
_L3:
        cameraId = j;
_L2:
        camera = Camera.open(cameraId);
        facing = i;
        cameraParameters = null;
        if (!deviceProfile.e()) goto _L6; else goto _L5
_L5:
        SurfaceViewWrapper surfaceviewwrapper = (SurfaceViewWrapper)surfaceWrapper;
        camera.setPreviewDisplay(surfaceviewwrapper.h().getHolder());
_L8:
        updateCameraDisplayOrientation();
        safeUpdateCameraParameters(getWidth(), getHeight());
        camera.startPreview();
        camera.setZoomChangeListener(this);
        previewing = true;
        zooming = false;
        focusing = false;
        if (cameraCallback != null)
        {
            cameraCallback.onPreviewStarted(i);
        }
        if (faceDetectionEnabled && cameraParameters != null && cameraParameters.getMaxNumDetectedFaces() > 0)
        {
            camera.setFaceDetectionListener(this);
            camera.startFaceDetection();
            faceDetectionStarted = true;
        }
_L9:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        j++;
          goto _L7
_L6:
        camera.setPreviewTexture(surfaceWrapper.b());
          goto _L8
        Object obj;
        obj;
        if (cameraCallback == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        cameraCallback.onOpenFailed(((Exception) (obj)));
          goto _L9
        obj;
        throw obj;
        if (!isDebug()) goto _L9; else goto _L10
_L10:
        ((Exception) (obj)).printStackTrace();
        throw new RuntimeException(((Throwable) (obj)));
          goto _L7
    }

    private static int round(int i, int j, int k)
    {
        int l = i;
        if (Math.abs(i - j) < k)
        {
            l = j;
        }
        return l;
    }

    private void safeUpdateCameraParameters(int i, int j)
    {
        try
        {
            updateCameraParameters(i, j);
            return;
        }
        catch (Exception exception)
        {
            log.log(Level.WARNING, "Can't access to camera parameters", exception);
        }
    }

    private void touchFocus(MotionEvent motionevent)
    {
        if (camera != null && !focusing)
        {
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            if (parameters.getMaxNumFocusAreas() > 0)
            {
                float f = (motionevent.getX() / (float)getWidth()) * 2000F - 1000F;
                float f1 = (motionevent.getY() / (float)getHeight()) * 2000F - 1000F;
                int i = clamp((int)f - 100);
                int j = clamp((int)f + 100);
                List list = Collections.singletonList(new android.hardware.Camera.Area(new Rect(i, clamp((int)f1 - 100), j, clamp((int)f1 + 100)), 1000));
                parameters.setFocusMode("auto");
                parameters.setFocusAreas(list);
                camera.setParameters(parameters);
                if (cameraCallback != null)
                {
                    cameraCallback.onFocusStart(new PointF(motionevent.getX(), motionevent.getY()));
                }
                camera.autoFocus(new android.hardware.Camera.AutoFocusCallback() {

                    final CameraView a;

                    public final void onAutoFocus(boolean flag, Camera camera1)
                    {
                        if (flag)
                        {
                            camera1.cancelAutoFocus();
                        }
                        a.focusing = false;
                        if (a.cameraCallback != null)
                        {
                            a.cameraCallback.onFocusEnd(flag);
                        }
                    }

            
            {
                a = CameraView.this;
                super();
            }
                });
            }
        }
    }

    private void updateCameraDisplayOrientation()
    {
        if (camera == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        android.hardware.Camera.CameraInfo camerainfo;
        int j;
        j = windowManager.getDefaultDisplay().getRotation() * 90;
        if (orientation == j)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        camerainfo = getCameraInfo(facing);
        if (camerainfo == null) goto _L2; else goto _L1
_L1:
        int i;
        if (camerainfo.facing != 1)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        i = (360 - (camerainfo.orientation + j) % 360) % 360;
_L4:
        camera.setDisplayOrientation(i);
_L2:
        orientation = j;
        return;
        i = ((camerainfo.orientation - j) + 360) % 360;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        exception.printStackTrace();
    }

    private void updateCameraParameters(int i, int j)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (camera == null || deviceProfile.d(facing)) goto _L2; else goto _L1
_L1:
        android.hardware.Camera.Size size;
        Integer integer;
        if (cameraParameters != null)
        {
            flag = false;
        }
        size = updatePreviewSize(i, j);
        if (size == null) goto _L4; else goto _L3
_L3:
        if (flag) goto _L6; else goto _L5
_L5:
        if (size.equals(cameraParameters.getPreviewSize())) goto _L4; else goto _L6
_L6:
        cameraParameters.setPreviewSize(size.width, size.height);
        integer = deviceProfile.h();
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        cameraParameters.setPreviewFormat(integer.intValue());
        if (camcorderHint && !faceDetectionEnabled)
        {
            if (!deviceProfile.f() && cameraParameters.getSupportedFocusModes().contains("continuous-video"))
            {
                cameraParameters.setFocusMode("continuous-video");
            }
            if (!deviceProfile.p())
            {
                cameraParameters.setRecordingHint(true);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 15 && cameraParameters.isVideoStabilizationSupported() && !deviceProfile.o())
        {
            cameraParameters.setVideoStabilization(true);
        }
        if (!previewing) goto _L8; else goto _L7
_L7:
        log.info("restart preview");
        camera.stopPreview();
        camera.setParameters(cameraParameters);
        camera.startPreview();
_L9:
        handler.sendEmptyMessage(1);
_L4:
        previewSize = size;
        updateOrientation();
        handler.sendEmptyMessage(2);
_L10:
        this;
        JVM INSTR monitorexit ;
        return;
_L8:
        camera.setParameters(cameraParameters);
          goto _L9
        Exception exception1;
        exception1;
        exception1.printStackTrace();
        log.log(Level.SEVERE, exception1.getMessage(), exception1);
          goto _L9
        Exception exception;
        exception;
        throw exception;
_L2:
        if (camera == null || camera.getParameters() == null)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        cameraParameters = camera.getParameters();
        exception = cameraParameters.getPreviewSize();
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        previewSize = exception;
        updateOrientation();
        handler.sendEmptyMessage(1);
          goto _L10
        previewWidth = 0;
        previewHeight = 0;
          goto _L10
        previewWidth = 0;
        previewHeight = 0;
          goto _L10
    }

    private void updateOrientation()
    {
label0:
        {
            if (previewSize != null)
            {
                int i = getOrientationHint(windowManager.getDefaultDisplay().getRotation() * 90);
                if (deviceProfile.l())
                {
                    i = 0;
                }
                log.info((new StringBuilder("orientation hint: ")).append(i).toString());
                if (i != 90 && i != 270)
                {
                    break label0;
                }
                previewWidth = previewSize.height;
                previewHeight = previewSize.width;
            }
            return;
        }
        previewWidth = previewSize.width;
        previewHeight = previewSize.height;
    }

    private android.hardware.Camera.Size updatePreviewSize(int i, int j)
    {
        Object obj = deviceProfile.e(facing);
        if (obj != null)
        {
            Camera camera1 = camera;
            camera1.getClass();
            obj = new android.hardware.Camera.Size(camera1, ((Size) (obj)).a(), ((Size) (obj)).b());
            cameraParameters = camera.getParameters();
            return ((android.hardware.Camera.Size) (obj));
        } else
        {
            return findCameraPreviewSize(i, j);
        }
    }

    protected void createDeviceProfile()
    {
        if (deviceProfile == null)
        {
            deviceProfile = DeviceProfile.a;
        }
    }

    protected SurfaceWrapper createSurface()
    {
        if (deviceProfile.e())
        {
            surfaceWrapper = new SurfaceViewWrapper(getContext(), this);
        } else
        {
            surfaceWrapper = new TextureViewWrapper(getContext(), this);
        }
        return surfaceWrapper;
    }

    public boolean getCamcorderHint()
    {
        return camcorderHint;
    }

    public Camera getCamera()
    {
        return camera;
    }

    public int getCameraFacing()
    {
        return facing;
    }

    public int getCameraId()
    {
        return cameraId;
    }

    protected android.hardware.Camera.CameraInfo getCameraInfo(int i)
    {
        for (int j = 0; j < Camera.getNumberOfCameras(); j++)
        {
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            Camera.getCameraInfo(j, camerainfo);
            if (camerainfo.facing == i)
            {
                return camerainfo;
            }
        }

        return null;
    }

    public android.hardware.Camera.Parameters getCameraParameters()
    {
        return cameraParameters;
    }

    protected String getDebugText()
    {
        return String.format("profile: %s \n preview: %d x %d", new Object[] {
            deviceProfile.toString(), Integer.valueOf(previewSize.width), Integer.valueOf(previewSize.height)
        });
    }

    public DeviceProfile getDeviceProfile()
    {
        return deviceProfile;
    }

    public int getOrientationHint()
    {
        return getOrientationHint(orientation);
    }

    public Size getPreviewSize()
    {
        return new Size(previewWidth, previewHeight);
    }

    public SurfaceWrapper getPreviewSurface()
    {
        return surfaceWrapper;
    }

    public ScaleMode getScaleMode()
    {
        return scaleMode;
    }

    public boolean handleMessage(Message message)
    {
        boolean flag = true;
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 52
    //                   2 32;
           goto _L1 _L2 _L3
_L1:
        flag = false;
_L5:
        return flag;
_L3:
        if (!debug) goto _L5; else goto _L4
_L4:
        debugTextView.setText(getDebugText());
        return true;
_L2:
        requestLayout();
        return true;
    }

    public void initialize()
    {
        int i = 1;
        createDeviceProfile();
        if (facing == -1)
        {
            if (getCameraInfo(1) == null)
            {
                i = 0;
            }
            facing = i;
        }
        surfaceWrapper = createSurface();
        removeAllViews();
        addView(surfaceWrapper.c(), new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        if (debug)
        {
            debugTextView = new TextView(getContext());
            debugTextView.setTextColor(0xff00ff00);
            debugTextView.setTextSize(8F);
            addView(debugTextView);
        }
    }

    public boolean isDebug()
    {
        return debug;
    }

    public boolean isFaceDetectionEnabled()
    {
        return faceDetectionEnabled;
    }

    public boolean isTouchFocusEnabled()
    {
        return touchFocusEnabled;
    }

    public boolean isTouchZoomEnabled()
    {
        return touchZoomEnabled;
    }

    public boolean isZoomSupported()
    {
        return cameraParameters != null && cameraParameters.isSmoothZoomSupported();
    }

    public void onDestroy()
    {
        releaseCamera();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        releaseCamera();
    }

    public void onError(int i, Camera camera1)
    {
        log.warning(String.format("camera error %d", new Object[] {
            Integer.valueOf(i)
        }));
        if (cameraCallback != null)
        {
            cameraCallback.onError(i);
        }
    }

    public void onFaceDetection(android.hardware.Camera.Face aface[], Camera camera1)
    {
        if (cameraCallback != null && aface != null)
        {
            cameraCallback.onFacesDetected(aface);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
        int j1;
        i1 = android.view.View.MeasureSpec.getSize(i);
        j1 = android.view.View.MeasureSpec.getSize(j);
        getWindowVisibleDisplayFrame(measureRect);
        if (camera == null || i1 > measureRect.width() || j1 > measureRect.height() || measureWidth == i1 && measureHeight == j1) goto _L2; else goto _L1
_L1:
        float f;
        float f1;
        Object obj;
        int k;
        int l;
label0:
        {
            safeUpdateCameraParameters(i1, j1);
            updateOrientation();
            l = previewWidth;
            int k1 = previewHeight;
            if (l != 0)
            {
                k = k1;
                if (k1 != 0)
                {
                    break label0;
                }
            }
            l = i1;
            k = j1;
        }
        measureWidth = i1;
        measureHeight = j1;
        f = (float)i1 / (float)l;
        f1 = (float)j1 / (float)k;
        obj = surfaceWrapper.c();
        if (obj == null) goto _L2; else goto _L3
_L3:
        static final class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[ScaleMode.values().length];
                try
                {
                    a[ScaleMode.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ScaleMode.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5.a[scaleMode.ordinal()];
        JVM INSTR tableswitch 1 2: default 192
    //                   1 199
    //                   2 307;
           goto _L2 _L4 _L5
_L2:
        super.onMeasure(i, j);
        return;
_L4:
        obj = surfaceWrapper.a(null);
        f = Math.max(f, f1);
        k = (int)((float)previewWidth * f);
        l = (int)((float)previewHeight * f);
        f = (float)k / (float)i1;
        f1 = (float)l / (float)j1;
        float f2 = (i1 - k) / 2;
        float f3 = (j1 - l) / 2;
        ((Matrix) (obj)).setScale(f, f1);
        ((Matrix) (obj)).postTranslate(f2, f3);
        surfaceWrapper.b(((Matrix) (obj)));
        continue; /* Loop/switch isn't completed */
_L5:
        f = Math.min(f, f1);
        obj = ((View) (obj)).getLayoutParams();
        obj.width = round((int)((float)l * f), i1, 48);
        obj.height = round((int)((float)k * f), j1, 48);
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onPause()
    {
        if (orientationListener.canDetectOrientation())
        {
            orientationListener.disable();
        }
        if (surfaceWrapper != null)
        {
            surfaceWrapper.d();
        }
        releaseCamera();
    }

    public void onResume()
    {
        if (orientationListener.canDetectOrientation())
        {
            orientationListener.enable();
        }
        if (camera == null && surfaceAvailable)
        {
            initCamera(facing);
        }
        if (surfaceWrapper != null)
        {
            surfaceWrapper.e();
        }
    }

    public void onShutter()
    {
        if (cameraCallback != null)
        {
            cameraCallback.onShutter();
        }
    }

    public void onSurfaceAvailable(SurfaceWrapper surfacewrapper)
    {
        surfaceAvailable = true;
        setCameraFacing(facing);
    }

    public boolean onSurfaceDestroyed(SurfaceWrapper surfacewrapper)
    {
        surfaceAvailable = false;
        releaseCamera();
        return true;
    }

    public void onSurfaceSizeChanged(SurfaceWrapper surfacewrapper, int i, int j)
    {
        handler.sendEmptyMessage(1);
    }

    public void onSurfaceUpdated(SurfaceWrapper surfacewrapper)
    {
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (touchZoomEnabled)
        {
            zoomGestureDetector.onTouchEvent(motionevent);
        }
        if (touchFocusEnabled)
        {
            focusGestureDetector.onTouchEvent(motionevent);
        }
        return true;
    }

    public void onZoomChange(int i, boolean flag, Camera camera1)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zooming = flag;
    }

    protected void releaseCamera()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        camera.lock();
        camera.stopPreview();
        camera.release();
        camera = null;
        cameraParameters = null;
        previewing = false;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        camera.release();
        camera = null;
        cameraParameters = null;
        previewing = false;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        obj;
        camera.release();
        camera = null;
        cameraParameters = null;
        previewing = false;
        throw obj;
    }

    public void restartPreview()
    {
        if (deviceProfile.e())
        {
            setCameraFacing(facing);
        }
    }

    public void setCamcorderHint(boolean flag)
    {
        camcorderHint = flag;
    }

    public void setCameraCallback(CameraCallback cameracallback)
    {
        this;
        JVM INSTR monitorenter ;
        cameraCallback = cameracallback;
        this;
        JVM INSTR monitorexit ;
        return;
        cameracallback;
        throw cameracallback;
    }

    public void setCameraFacing(int i)
    {
        log.info((new StringBuilder("setCameraFacing: ")).append(i).toString());
        if (surfaceAvailable)
        {
            initCamera(i);
            return;
        } else
        {
            facing = i;
            return;
        }
    }

    public void setDebug(boolean flag)
    {
        debug = flag;
    }

    public void setDeviceProfile(DeviceProfile deviceprofile)
    {
        if (deviceprofile == null)
        {
            throw new IllegalArgumentException("null profile");
        } else
        {
            deviceProfile = deviceprofile;
            return;
        }
    }

    public void setFaceDetectionEnabled(boolean flag)
    {
        faceDetectionEnabled = flag;
        if (camera != null)
        {
            if (cameraParameters != null && cameraParameters.getMaxNumDetectedFaces() > 0 && !faceDetectionStarted)
            {
                releaseCamera();
                initCamera(facing);
            } else
            if (faceDetectionStarted && !flag)
            {
                camera.stopFaceDetection();
                faceDetectionStarted = false;
                return;
            }
        }
    }

    public void setScaleMode(ScaleMode scalemode)
    {
        scaleMode = scalemode;
        requestLayout();
    }

    public void setTouchFocusEnabled(boolean flag)
    {
        touchFocusEnabled = flag;
    }

    public void setTouchZoomEnabled(boolean flag)
    {
        touchZoomEnabled = flag;
    }

    public void takePicture()
    {
        if (camera != null && previewing)
        {
            a a1 = new a(CameraCallback.PictureType.b);
            a a2 = new a(CameraCallback.PictureType.a);
            a a3 = new a(CameraCallback.PictureType.c);
            camera.takePicture(this, a1, a2, a3);
        }
    }

    public boolean zoom(float f)
    {
        if (isZoomSupported() && !zooming)
        {
            Object obj = new TreeMap();
            List list = cameraParameters.getZoomRatios();
            for (int i = 0; i < list.size(); i++)
            {
                ((TreeMap) (obj)).put(list.get(i), Integer.valueOf(i));
            }

            obj = ((TreeMap) (obj)).floorEntry(Integer.valueOf((int)(100F * f)));
            int j;
            if (obj == null)
            {
                j = 1;
            } else
            {
                j = ((Integer)((java.util.Map.Entry) (obj)).getValue()).intValue();
            }
            camera.stopSmoothZoom();
            camera.startSmoothZoom(Integer.valueOf(j).intValue());
            return true;
        } else
        {
            return false;
        }
    }






/*
    static float access$202(CameraView cameraview, float f)
    {
        cameraview.zoomScaleFactor = f;
        return f;
    }

*/



/*
    static boolean access$402(CameraView cameraview, boolean flag)
    {
        cameraview.focusing = flag;
        return flag;
    }

*/

}
