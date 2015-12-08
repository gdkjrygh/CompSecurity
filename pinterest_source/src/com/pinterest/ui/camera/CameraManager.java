// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.camera;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.widget.ImageView;
import com.pinterest.kit.utils.DrawableUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.pinterest.ui.camera:
//            CameraPreview

public class CameraManager
{

    private static final int CAMERA_GRID_LENGTH = 2000;
    private static final int CAMERA_GRID_OFFSET = 1000;
    private static final float CAMERA_MARGIN_PERCENTAGE = 0.2F;
    public static final int CAMERA_ORIENTATION_FRONT_FLIP = 180;
    public static final int CAMERA_ORIENTATION_PORTRAIT = 90;
    public static final String DEBUG_TAG = "CameraManager";
    public static final String PINTEREST_DIRECTORY_NAME = "Pinterest";
    private static final float TOUCH_RECT_WIDTH_FACTOR = 0.18F;
    private static Camera _camera;
    private static float _currentFingerDist;
    private static android.hardware.Camera.Parameters _parameters;
    private static List _supportedFlashList = new ArrayList();

    public CameraManager()
    {
    }

    public static boolean checkCameraHardware(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    public static boolean checkFlashHardware()
    {
        if (!isCameraAvailable())
        {
            return false;
        }
        if (_parameters.getFlashMode() == null)
        {
            return false;
        }
        List list = _parameters.getSupportedFlashModes();
        return list != null && !list.isEmpty() && (list.size() != 1 || !((String)list.get(0)).equals("off"));
    }

    public static void clearSupportedFlashList()
    {
        _supportedFlashList = new ArrayList();
    }

    public static void closeCamera(CameraPreview camerapreview)
    {
        if (!isCameraAvailable())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        disableFlash();
        camerapreview.stopPreview();
        camerapreview.getHolder().removeCallback(camerapreview);
        _camera.release();
        _camera = null;
        camerapreview.replaceCamera(null);
        return;
        camerapreview;
        camerapreview.printStackTrace();
        return;
    }

    public static void disableFlash()
    {
        if (isCameraAvailable() && _parameters != null)
        {
            _camera.cancelAutoFocus();
            _parameters.setFlashMode("off");
            _camera.setParameters(_parameters);
        }
    }

    public static Camera getCamera()
    {
        return _camera;
    }

    private static float getFingerSpacing(MotionEvent motionevent)
    {
        float f = motionevent.getX(0) - motionevent.getX(1);
        float f1 = motionevent.getY(0) - motionevent.getY(1);
        return (float)Math.sqrt(f * f + f1 * f1);
    }

    public static File getOutputMediaFile()
    {
        File file;
label0:
        {
            if ("mounted".equals(Environment.getExternalStorageState()))
            {
                file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Pinterest");
                if (file.exists() || file.mkdirs())
                {
                    break label0;
                }
                Log.d("CameraManager", "failed to create directory");
            }
            return null;
        }
        String s = (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date());
        return new File((new StringBuilder()).append(file.getPath()).append(File.separator).append("IMG_").append(s).append(".jpg").toString());
    }

    private static Uri getOutputMediaFileUri()
    {
        return Uri.fromFile(getOutputMediaFile());
    }

    public static void handleZoom(MotionEvent motionevent)
    {
        float f;
        int j;
        int k;
        k = _parameters.getMaxZoom();
        j = _parameters.getZoom();
        f = getFingerSpacing(motionevent);
        if (f <= _currentFingerDist) goto _L2; else goto _L1
_L1:
        int i;
        i = j;
        if (j < k)
        {
            i = j + 1;
        }
_L4:
        _currentFingerDist = f;
        _parameters.setZoom(i);
        if (isCameraAvailable())
        {
            _camera.setParameters(_parameters);
        }
        return;
_L2:
        i = j;
        if (f < _currentFingerDist)
        {
            i = j;
            if (j > 0)
            {
                i = j - 1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean isCameraAvailable()
    {
        return _camera != null;
    }

    public static int normalizeRotation(int i, int j)
    {
        if (j > 45 && j <= 135)
        {
            j = 90;
        } else
        if (j > 135 && j <= 225)
        {
            j = 180;
        } else
        if (j > 225 && j <= 315)
        {
            j = 270;
        } else
        {
            j = 0;
        }
        if (i == 1)
        {
            return ((90 - j) + 180) % 360;
        } else
        {
            return (j + 90) % 360;
        }
    }

    public static void setCameraFlashMode(ImageView imageview, int i, boolean flag)
    {
        String s;
        int j;
        j = 0x7f02019e;
        s = "off";
        if (_supportedFlashList.isEmpty() && _parameters.getSupportedFlashModes() != null)
        {
            if (_parameters.getSupportedFlashModes().contains("off"))
            {
                _supportedFlashList.add("off");
            }
            if (_parameters.getSupportedFlashModes().contains("on"))
            {
                _supportedFlashList.add("on");
            }
            if (_parameters.getSupportedFlashModes().contains("auto"))
            {
                _supportedFlashList.add("auto");
            }
        }
        if (!_supportedFlashList.isEmpty())
        {
            int k = _supportedFlashList.size();
            s = (String)_supportedFlashList.get(i % k);
        }
        if (!checkFlashHardware()) goto _L2; else goto _L1
_L1:
        imageview.setVisibility(0);
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 192
    //                   3551: 284
    //                   3005871: 299;
           goto _L3 _L4 _L5
_L3:
        i;
        JVM INSTR tableswitch 0 1: default 216
    //                   0 314
    //                   1 321;
           goto _L6 _L7 _L8
_L6:
        i = j;
_L9:
        imageview.setImageDrawable(DrawableUtils.tintIcon(i, 0x7f0e00bf));
        imageview.setContentDescription(String.format(imageview.getResources().getString(0x7f0706e4), new Object[] {
            s
        }));
        if (isCameraAvailable() && _parameters != null)
        {
            _parameters.setFlashMode(s);
            _camera.setParameters(_parameters);
        }
        return;
_L4:
        if (s.equals("on"))
        {
            i = 0;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (s.equals("auto"))
        {
            i = 1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f02019f;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 0x7f02019d;
        if (true) goto _L9; else goto _L2
_L2:
        if (flag)
        {
            imageview.setVisibility(8);
            return;
        }
        imageview.setVisibility(0);
        imageview.setImageDrawable(DrawableUtils.tintIcon(0x7f02019e, 0x7f0e00c1));
        return;
        if (true) goto _L3; else goto _L10
_L10:
    }

    public static void setCameraOrientation(int i)
    {
        _parameters.setRotation(i);
        _camera.setParameters(_parameters);
    }

    public static void touchMetering(MotionEvent motionevent, CameraPreview camerapreview)
    {
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        float f2 = (float)camerapreview.getWidth() * 0.18F;
        motionevent = new Rect((int)(f - f2 / 2.0F), (int)(f1 - f2 / 2.0F), (int)(f2 / 2.0F + f), (int)(f2 / 2.0F + f1));
        int i = (int)((float)camerapreview.getWidth() * 0.2F);
        int k = (int)((float)camerapreview.getHeight() * 0.2F);
        if (f >= (float)i && (float)(camerapreview.getWidth() - i) >= f && f1 >= (float)i && (float)(camerapreview.getHeight() - k) >= f1)
        {
            camerapreview = new Rect((((Rect) (motionevent)).left * 2000) / camerapreview.getWidth() - 1000, (((Rect) (motionevent)).top * 2000) / camerapreview.getHeight() - 1000, (((Rect) (motionevent)).right * 2000) / camerapreview.getWidth() - 1000, (((Rect) (motionevent)).bottom * 2000) / camerapreview.getHeight() - 1000);
            motionevent = new ArrayList();
            motionevent.add(new android.hardware.Camera.Area(camerapreview, 1000));
            if (isCameraAvailable())
            {
                camerapreview = _camera.getParameters();
                int j = camerapreview.getMaxNumMeteringAreas();
                if (j > 0 && motionevent.size() <= j)
                {
                    camerapreview.setMeteringAreas(motionevent);
                    _camera.setParameters(camerapreview);
                    return;
                }
            }
        }
    }




/*
    static Camera access$002(Camera camera)
    {
        _camera = camera;
        return camera;
    }

*/


/*
    static android.hardware.Camera.Parameters access$102(android.hardware.Camera.Parameters parameters)
    {
        _parameters = parameters;
        return parameters;
    }

*/
}
