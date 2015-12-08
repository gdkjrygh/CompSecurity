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

    private static final double MAX_ASPECT_DISTORTION = 0.14999999999999999D;
    private static final int MIN_PREVIEW_PIXELS = 0x25800;
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
        Object obj;
label0:
        {
            obj = parameters.getSupportedPreviewSizes();
            if (obj == null)
            {
                Log.w("CameraConfiguration", "Device returned no supported preview sizes; using default");
                parameters = parameters.getPreviewSize();
                return new Point(((android.hardware.Camera.Size) (parameters)).width, ((android.hardware.Camera.Size) (parameters)).height);
            }
            obj = new ArrayList(((Collection) (obj)));
            Collections.sort(((List) (obj)), new Comparator() {

                final CameraConfigurationManager this$0;

                public int compare(android.hardware.Camera.Size size2, android.hardware.Camera.Size size3)
                {
                    int i1 = size2.height * size2.width;
                    int j1 = size3.height * size3.width;
                    if (j1 < i1)
                    {
                        return -1;
                    }
                    return j1 <= i1 ? 0 : 1;
                }

                public volatile int compare(Object obj1, Object obj2)
                {
                    return compare((android.hardware.Camera.Size)obj1, (android.hardware.Camera.Size)obj2);
                }

            
            {
                this$0 = CameraConfigurationManager.this;
                super();
            }
            });
            if (Log.isLoggable("CameraConfiguration", 4))
            {
                StringBuilder stringbuilder = new StringBuilder();
                android.hardware.Camera.Size size1;
                for (Iterator iterator1 = ((List) (obj)).iterator(); iterator1.hasNext(); stringbuilder.append(size1.width).append('x').append(size1.height).append(' '))
                {
                    size1 = (android.hardware.Camera.Size)iterator1.next();
                }

                Log.i("CameraConfiguration", (new StringBuilder()).append("Supported preview sizes: ").append(stringbuilder).toString());
            }
            double d = (double)point.x / (double)point.y;
            int i;
            int j;
            int k;
            int l;
label1:
            do
            {
                for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
                {
                    android.hardware.Camera.Size size = (android.hardware.Camera.Size)iterator.next();
                    i = size.width;
                    j = size.height;
                    if (i * j < 0x25800)
                    {
                        iterator.remove();
                    } else
                    {
                        if (i < j)
                        {
                            l = 1;
                        } else
                        {
                            l = 0;
                        }
                        if (l != 0)
                        {
                            k = j;
                        } else
                        {
                            k = i;
                        }
                        if (l != 0)
                        {
                            l = i;
                        } else
                        {
                            l = j;
                        }
                        if (Math.abs((double)k / (double)l - d) <= 0.14999999999999999D)
                        {
                            continue label1;
                        }
                        iterator.remove();
                    }
                }

                break label0;
            } while (k != point.x || l != point.y);
            parameters = new Point(i, j);
            Log.i("CameraConfiguration", (new StringBuilder()).append("Found preview size exactly matching screen size: ").append(parameters).toString());
            return parameters;
        }
        if (!((List) (obj)).isEmpty())
        {
            parameters = (android.hardware.Camera.Size)((List) (obj)).get(0);
            parameters = new Point(((android.hardware.Camera.Size) (parameters)).width, ((android.hardware.Camera.Size) (parameters)).height);
            Log.i("CameraConfiguration", (new StringBuilder()).append("Using largest suitable preview size: ").append(parameters).toString());
            return parameters;
        } else
        {
            parameters = parameters.getPreviewSize();
            parameters = new Point(((android.hardware.Camera.Size) (parameters)).width, ((android.hardware.Camera.Size) (parameters)).height);
            Log.i("CameraConfiguration", (new StringBuilder()).append("No suitable preview sizes, using default: ").append(parameters).toString());
            return parameters;
        }
    }

    private static transient String findSettableValue(Collection collection, String as[])
    {
        String s;
        Object obj;
        Log.i("CameraConfiguration", (new StringBuilder()).append("Supported values: ").append(collection).toString());
        obj = null;
        s = obj;
        if (collection == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = as.length;
        i = 0;
_L6:
        s = obj;
        if (i >= j) goto _L2; else goto _L3
_L3:
        s = as[i];
        if (!collection.contains(s)) goto _L4; else goto _L2
_L2:
        Log.i("CameraConfiguration", (new StringBuilder()).append("Settable value: ").append(s).toString());
        return s;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
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
        Point point = new Point();
        display.getSize(point);
        screenResolution = point;
        Log.i("CameraConfiguration", (new StringBuilder()).append("Screen resolution: ").append(screenResolution).toString());
        cameraResolution = findBestPreviewSizeValue(camera, screenResolution);
        Log.i("CameraConfiguration", (new StringBuilder()).append("Camera resolution: ").append(cameraResolution).toString());
    }

    void setDesiredCameraParameters(Camera camera, boolean flag)
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        if (parameters == null)
        {
            Log.w("CameraConfiguration", "Device error: no camera parameters are available. Proceeding without configuration.");
        } else
        {
            Log.i("CameraConfiguration", (new StringBuilder()).append("Initial camera parameters: ").append(parameters.flatten()).toString());
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
            camera.setDisplayOrientation(90);
            parameters.setPreviewSize(cameraResolution.x, cameraResolution.y);
            camera.setParameters(parameters);
            camera = camera.getParameters().getPreviewSize();
            if (camera != null && (cameraResolution.x != ((android.hardware.Camera.Size) (camera)).width || cameraResolution.y != ((android.hardware.Camera.Size) (camera)).height))
            {
                Log.w("CameraConfiguration", (new StringBuilder()).append("Camera said it supported preview size ").append(cameraResolution.x).append('x').append(cameraResolution.y).append(", but after setting it, preview size is ").append(((android.hardware.Camera.Size) (camera)).width).append('x').append(((android.hardware.Camera.Size) (camera)).height).toString());
                cameraResolution.x = ((android.hardware.Camera.Size) (camera)).width;
                cameraResolution.y = ((android.hardware.Camera.Size) (camera)).height;
                return;
            }
        }
    }

    void setTorch(Camera camera, boolean flag)
    {
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        doSetTorch(parameters, flag, false);
        camera.setParameters(parameters);
    }
}
