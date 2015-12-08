// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.zxing.client.android.camera:
//            FrontLightMode

final class CameraConfigurationManager
{

    private static final int MAX_PREVIEW_PIXELS = 0xfa000;
    private static final int MIN_PREVIEW_PIXELS = 0x24b80;
    private static final String TAG = "CameraConfiguration";
    private Point cameraResolution;
    private final Context context;
    private Point screenResolution;

    CameraConfigurationManager(Context context1)
    {
        context = context1;
    }

    private void doSetTorch(android.hardware.Camera.Parameters parameters, boolean flag, boolean flag1)
    {
        String s;
        if (flag)
        {
            s = findSettableValue(parameters.getSupportedFlashModes(), new String[] {
                "torch", "on"
            });
        } else
        {
            s = findSettableValue(parameters.getSupportedFlashModes(), new String[] {
                "off"
            });
        }
        if (s != null)
        {
            parameters.setFlashMode(s);
        }
    }

    private Point findBestPreviewSizeValue(android.hardware.Camera.Parameters parameters, Point point)
    {
        Object obj1;
        List list = parameters.getSupportedPreviewSizes();
        if (list == null)
        {
            Log.w("CameraConfiguration", "Device returned no supported preview sizes; using default");
            parameters = parameters.getPreviewSize();
            return new Point(((android.hardware.Camera.Size) (parameters)).width, ((android.hardware.Camera.Size) (parameters)).height);
        }
        obj1 = new ArrayList(list);
        Collections.sort(((List) (obj1)), new Comparator() {

            final CameraConfigurationManager this$0;

            public int compare(android.hardware.Camera.Size size2, android.hardware.Camera.Size size3)
            {
                int j1 = size2.height * size2.width;
                int k1 = size3.height * size3.width;
                if (k1 < j1)
                {
                    return -1;
                }
                return k1 <= j1 ? 0 : 1;
            }

            public volatile int compare(Object obj2, Object obj3)
            {
                return compare((android.hardware.Camera.Size)obj2, (android.hardware.Camera.Size)obj3);
            }

            
            {
                this$0 = CameraConfigurationManager.this;
                super();
            }
        });
        if (!Log.isLoggable("CameraConfiguration", 4)) goto _L2; else goto _L1
_L1:
        Object obj;
        Iterator iterator;
        obj = new StringBuilder();
        iterator = ((List) (obj1)).iterator();
_L5:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Log.i("CameraConfiguration", (new StringBuilder("Supported preview sizes: ")).append(obj).toString());
_L2:
        float f;
        float f2;
        obj = null;
        f2 = (float)point.x / (float)point.y;
        f = (1.0F / 0.0F);
        obj1 = ((List) (obj1)).iterator();
_L6:
        if (!((Iterator) (obj1)).hasNext())
        {
            point = ((Point) (obj));
            if (obj == null)
            {
                parameters = parameters.getPreviewSize();
                point = new Point(((android.hardware.Camera.Size) (parameters)).width, ((android.hardware.Camera.Size) (parameters)).height);
                Log.i("CameraConfiguration", (new StringBuilder("No suitable preview sizes, using default: ")).append(point).toString());
            }
            Log.i("CameraConfiguration", (new StringBuilder("Found best approximate preview size: ")).append(point).toString());
            return point;
        }
        break MISSING_BLOCK_LABEL_281;
_L4:
        android.hardware.Camera.Size size1 = (android.hardware.Camera.Size)iterator.next();
        ((StringBuilder) (obj)).append(size1.width).append('x').append(size1.height).append(' ');
          goto _L5
        android.hardware.Camera.Size size = (android.hardware.Camera.Size)((Iterator) (obj1)).next();
        int i = size.width;
        int j = size.height;
        int k = i * j;
        if (k >= 0x24b80 && k <= 0xfa000)
        {
            int l;
            int i1;
            if (i < j)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                l = j;
            } else
            {
                l = i;
            }
            if (i1 != 0)
            {
                i1 = i;
            } else
            {
                i1 = j;
            }
            if (l == point.x && i1 == point.y)
            {
                parameters = new Point(i, j);
                Log.i("CameraConfiguration", (new StringBuilder("Found preview size exactly matching screen size: ")).append(parameters).toString());
                return parameters;
            }
            float f1 = Math.abs((float)l / (float)i1 - f2);
            if (f1 < f)
            {
                obj = new Point(i, j);
                f = f1;
            }
        }
          goto _L6
    }

    private static transient String findSettableValue(Collection collection, String as[])
    {
        String s;
        Object obj;
        Log.i("CameraConfiguration", (new StringBuilder("Supported values: ")).append(collection).toString());
        obj = null;
        s = obj;
        if (collection == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = as.length;
        i = 0;
_L7:
        if (i < j) goto _L4; else goto _L3
_L3:
        s = obj;
_L2:
        Log.i("CameraConfiguration", (new StringBuilder("Settable value: ")).append(s).toString());
        return s;
_L4:
        s = as[i];
        if (!collection.contains(s)) goto _L5; else goto _L2
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void initializeTorch(android.hardware.Camera.Parameters parameters, SharedPreferences sharedpreferences, boolean flag)
    {
        boolean flag1;
        if (FrontLightMode.readPref(sharedpreferences) == FrontLightMode.ON)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        doSetTorch(parameters, flag1, flag);
    }

    Point getCameraResolution()
    {
        return cameraResolution;
    }

    Point getScreenResolution()
    {
        return screenResolution;
    }

    boolean getTorchState(Camera camera)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (camera == null)
            {
                break label0;
            }
            flag = flag1;
            if (camera.getParameters() == null)
            {
                break label0;
            }
            camera = camera.getParameters().getFlashMode();
            flag = flag1;
            if (camera == null)
            {
                break label0;
            }
            if (!"on".equals(camera))
            {
                flag = flag1;
                if (!"torch".equals(camera))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    void initFromCameraParameters(Camera camera)
    {
        camera = camera.getParameters();
        Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        int i = display.getWidth();
        int k = display.getHeight();
        int l = k;
        int j = i;
        if (i < k)
        {
            Log.i("CameraConfiguration", "Display reports portrait orientation; assuming this is incorrect");
            j = k;
            l = i;
        }
        screenResolution = new Point(j, l);
        Log.i("CameraConfiguration", (new StringBuilder("Screen resolution: ")).append(screenResolution).toString());
        cameraResolution = findBestPreviewSizeValue(camera, screenResolution);
        Log.i("CameraConfiguration", (new StringBuilder("Camera resolution: ")).append(cameraResolution).toString());
    }

    void setDesiredCameraParameters(Camera camera, boolean flag)
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        if (parameters == null)
        {
            Log.w("CameraConfiguration", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("CameraConfiguration", (new StringBuilder("Initial camera parameters: ")).append(parameters.flatten()).toString());
        if (flag)
        {
            Log.w("CameraConfiguration", "In camera config safe mode -- most settings will not be honored");
        }
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        initializeTorch(parameters, sharedpreferences, flag);
        String s = null;
        String s1;
        if (sharedpreferences.getBoolean("preferences_auto_focus", true))
        {
            if (flag || sharedpreferences.getBoolean("preferences_disable_continuous_focus", false))
            {
                s = findSettableValue(parameters.getSupportedFocusModes(), new String[] {
                    "auto"
                });
            } else
            {
                s = findSettableValue(parameters.getSupportedFocusModes(), new String[] {
                    "continuous-picture", "continuous-video", "auto"
                });
            }
        }
        s1 = s;
        if (!flag)
        {
            s1 = s;
            if (s == null)
            {
                s1 = findSettableValue(parameters.getSupportedFocusModes(), new String[] {
                    "macro", "edof"
                });
            }
        }
        if (s1 != null)
        {
            parameters.setFocusMode(s1);
        }
        if (sharedpreferences.getBoolean("preferences_invert_scan", false))
        {
            s = findSettableValue(parameters.getSupportedColorEffects(), new String[] {
                "negative"
            });
            if (s != null)
            {
                parameters.setColorEffect(s);
            }
        }
        parameters.setPreviewSize(cameraResolution.x, cameraResolution.y);
        camera.setParameters(parameters);
    }

    void setTorch(Camera camera, boolean flag)
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        doSetTorch(parameters, flag, false);
        camera.setParameters(parameters);
    }
}
