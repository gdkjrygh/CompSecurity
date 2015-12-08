// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.camera;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Camera;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.ui.camera:
//            CameraManager

public class CameraPreview extends SurfaceView
    implements android.view.SurfaceHolder.Callback
{

    private static final double ASPECT_TOLERANCE = 0.050000000000000003D;
    private static final String DEBUG_TAG = "CameraPreview";
    private boolean _active;
    private Camera _camera;
    private SurfaceHolder _holder;
    private android.hardware.Camera.Size _previewSize;
    private List _supportedPreviewSizes;

    public CameraPreview(Context context)
    {
        super(context);
        _holder = getHolder();
        _holder.addCallback(this);
        setFocusable(true);
        setFocusableInTouchMode(true);
        _holder.setType(3);
    }

    public static void apply34Ratio(FrameLayout framelayout)
    {
        DisplayMetrics displaymetrics = framelayout.getResources().getDisplayMetrics();
        framelayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(displaymetrics.widthPixels, (displaymetrics.widthPixels / 3) * 4));
    }

    private android.hardware.Camera.Size getOptimalPreviewSize(List list, int i, int j)
    {
        double d1;
        Object obj1;
        int k;
        if (i > j)
        {
            k = i;
        } else
        {
            k = j;
        }
        if (i <= j)
        {
            j = i;
        }
        d1 = (double)k / (double)j;
        if (list != null) goto _L2; else goto _L1
_L1:
        obj1 = null;
_L4:
        return ((android.hardware.Camera.Size) (obj1));
_L2:
        Object obj = null;
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            obj1 = (android.hardware.Camera.Size)iterator.next();
            if (Math.abs((double)((android.hardware.Camera.Size) (obj1)).width / (double)((android.hardware.Camera.Size) (obj1)).height - d1) <= 0.050000000000000003D && (double)Math.abs(((android.hardware.Camera.Size) (obj1)).height - j) < d)
            {
                d = Math.abs(((android.hardware.Camera.Size) (obj1)).height - j);
                obj = obj1;
            }
        } while (true);
        obj1 = obj;
        if (obj != null)
        {
            continue;
        }
        d = 1.7976931348623157E+308D;
        iterator = list.iterator();
        do
        {
            obj1 = obj;
            if (!iterator.hasNext())
            {
                continue;
            }
            list = (android.hardware.Camera.Size)iterator.next();
            if ((double)Math.abs(((android.hardware.Camera.Size) (list)).height - j) < d)
            {
                d = Math.abs(((android.hardware.Camera.Size) (list)).height - j);
            } else
            {
                list = ((List) (obj));
            }
            obj = list;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateCamera()
    {
        _supportedPreviewSizes = _camera.getParameters().getSupportedPreviewSizes();
        _camera.setDisplayOrientation(90);
        _camera.setPreviewDisplay(_holder);
        android.hardware.Camera.Parameters parameters = _camera.getParameters();
        _previewSize = getOptimalPreviewSize(_supportedPreviewSizes, getWidth(), getHeight());
        parameters.setPreviewSize(_previewSize.width, _previewSize.height);
        _camera.setParameters(parameters);
        _camera.startPreview();
        setActive(true);
    }

    public boolean isActive()
    {
        return _active;
    }

    public boolean isCameraAvailable()
    {
        return _camera != null;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isClickable()) goto _L2; else goto _L1
_L1:
        if (motionevent.getAction() != 0) goto _L4; else goto _L3
_L3:
        if (isCameraAvailable())
        {
            CameraManager.touchMetering(motionevent, this);
        }
_L2:
        return true;
_L4:
        if (motionevent.getAction() != 2 || motionevent.getPointerCount() != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!isCameraAvailable() || !_camera.getParameters().isZoomSupported()) goto _L2; else goto _L5
_L5:
        CameraManager.handleZoom(motionevent);
        return true;
        if (motionevent.getAction() != 1) goto _L2; else goto _L6
_L6:
        try
        {
            _camera.autoFocus(null);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            motionevent.printStackTrace();
            return true;
        }
        return true;
    }

    public void replaceCamera(Camera camera)
    {
        _camera = camera;
        if (isCameraAvailable())
        {
            updateCamera();
        }
    }

    public void setActive(boolean flag)
    {
        _active = flag;
    }

    public void stopPreview()
    {
        try
        {
            setActive(false);
            _camera.stopPreview();
            return;
        }
        catch (Exception exception)
        {
            Log.v("CameraPreview", "Tried to stop a non-existent preview");
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        if (_holder.getSurface() == null)
        {
            return;
        }
        stopPreview();
        try
        {
            if (isCameraAvailable())
            {
                CameraManager.disableFlash();
                updateCamera();
            }
            setClickable(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            surfaceholder.printStackTrace();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        try
        {
            if (isCameraAvailable())
            {
                CameraManager.disableFlash();
                _holder = surfaceholder;
                _camera.setPreviewDisplay(_holder);
                _camera.startPreview();
                setActive(true);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            surfaceholder.printStackTrace();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }
}
