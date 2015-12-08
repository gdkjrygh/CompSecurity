// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import com.moodstocks.android.Configuration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.moodstocks.android.camera:
//            Size, AutoFocusManager

public class CameraInstance extends Handler
    implements android.hardware.Camera.PreviewCallback
{

    private static final int MAX_DIM = 1280;
    private static final int MIN_DIM = 480;
    private static final String TAG = "CameraInstance";
    private Camera camera;
    private AutoFocusManager focusManager;
    private Listener listener;
    private OpenThread openThread;
    private PreviewParamsManager previewParamsManager;

    protected CameraInstance(Listener listener1)
    {
        openThread = null;
        camera = null;
        previewParamsManager = null;
        focusManager = null;
        listener = listener1;
    }

    private void closeImpl()
    {
        if (camera == null)
        {
            Log.e("CameraInstance", "`closeImpl` called with null camera -> no-op");
            return;
        } else
        {
            camera.release();
            camera = null;
            return;
        }
    }

    private void init(Camera camera1, boolean flag, int i)
    {
        camera = camera1;
        previewParamsManager = new PreviewParamsManager(flag, i);
        camera1 = camera.getParameters();
        camera1.setPreviewFormat(17);
        if (Configuration.platform == 1)
        {
            camera1.setPreviewFpsRange(10000, 10000);
        }
        Object obj = camera1.getSupportedPreviewSizes();
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)((Iterator) (obj)).next();
            if (size.width <= 1280 && size.height <= 1280 && (size.width >= 480 || size.height >= 480))
            {
                arraylist.add(new Size(size));
            }
        } while (true);
        previewParamsManager.setAvailablePreviewSizes(arraylist);
        camera.setParameters(camera1);
    }

    protected void close()
    {
        if (openThread == null)
        {
            Log.e("CameraInstance", "`close` called with null openThread -> no-op");
            return;
        }
        if (openThread.isAlive())
        {
            try
            {
                openThread.interrupt();
                openThread.join();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                openThread.interrupt();
                Log.e("CameraInstance", "`close` received InterruptedException");
                interruptedexception.printStackTrace();
                return;
            }
        } else
        {
            closeImpl();
            return;
        }
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.e("CameraInstance", (new StringBuilder()).append("handleMessage: bad message received (").append(message.what).append(")").toString());
            return;

        case 0: // '\0'
            if (Configuration.platform != 1)
            {
                focusManager = new AutoFocusManager(camera);
            } else
            {
                focusManager = null;
            }
            listener.onCameraOpenSuccess();
            return;

        case 1: // '\001'
            listener.onCameraOpenException((Exception)message.obj);
            return;
        }
    }

    protected boolean isFocussed()
    {
        if (focusManager != null)
        {
            return focusManager.isFocussed();
        } else
        {
            return true;
        }
    }

    public void onPreviewFrame(byte abyte0[], Camera camera1)
    {
        listener.onNewFrame(abyte0, previewParamsManager.getFrameSize(), previewParamsManager.getFrameOrientation());
    }

    protected void openAsync(boolean flag, boolean flag1)
    {
        openThread = new OpenThread(flag, flag1, null);
        openThread.start();
    }

    protected void requestFocus()
    {
        if (focusManager != null)
        {
            focusManager.requestFocus();
        }
    }

    protected void startPreview(SurfaceHolder surfaceholder)
    {
        if (camera == null)
        {
            Log.e("CameraInstance", "`startPreview` called with null camera -> no-op");
        } else
        {
            try
            {
                camera.setPreviewDisplay(surfaceholder);
                camera.setPreviewCallback(this);
                camera.startPreview();
                if (focusManager != null)
                {
                    focusManager.start();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (SurfaceHolder surfaceholder)
            {
                Log.e("CameraInstance", "`startPreview` received IOException");
                surfaceholder.printStackTrace();
                return;
            }
        }
    }

    protected void stopPreview()
    {
        if (camera == null)
        {
            Log.e("CameraInstance", "`stopPreview` called with null camera -> no-op");
            return;
        }
        if (focusManager != null)
        {
            focusManager.stop();
        }
        camera.setPreviewCallback(null);
        camera.stopPreview();
    }

    protected void updatePreviewParameters(Size size, boolean flag, int i)
    {
        if (camera == null)
        {
            Log.e("CameraInstance", "`updatePreviewParameters` called with null camera -> no-op");
            return;
        } else
        {
            previewParamsManager.update(size, flag, i);
            size = previewParamsManager.getFrameSize();
            i = previewParamsManager.getDisplayOrientation();
            android.hardware.Camera.Parameters parameters = camera.getParameters();
            parameters.setPreviewSize(size.width, size.height);
            camera.setParameters(parameters);
            camera.setDisplayOrientation(i);
            return;
        }
    }



    private class PreviewParamsManager
    {

        private List availablePreviewSizes;
        private Size cachedLand;
        private Size cachedPort;
        private int displayOrientation;
        private int frameOrientation;
        private Size frameSize;
        private boolean front;
        private int orientation;

        private Size findBestPreviewSize(boolean flag, Size size)
        {
            float f;
            Iterator iterator;
            if (flag)
            {
                f = (float)size.height / (float)size.width;
            } else
            {
                f = (float)size.width / (float)size.height;
            }
            size = new Size();
            iterator = availablePreviewSizes.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Size size1 = (Size)iterator.next();
                int i = size1.width;
                int k = size1.height;
                if (i <= 1280 && k <= 1280)
                {
                    float f1 = (float)i / (float)k;
                    if ((double)(((f1 - f) * (f1 - f)) / (f * f)) < 0.01D && i > size.width)
                    {
                        size = size1;
                    }
                }
            } while (true);
            Size size2 = size;
            if (!size.isSet())
            {
                Iterator iterator1 = availablePreviewSizes.iterator();
                do
                {
                    size2 = size;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    size2 = (Size)iterator1.next();
                    int j = size2.width;
                    int l = size2.height;
                    if (j <= 1280 && l <= 1280 && j > size.width)
                    {
                        size = size2;
                    }
                } while (true);
            }
            return size2;
        }

        protected int getDisplayOrientation()
        {
            return displayOrientation;
        }

        protected int getFrameOrientation()
        {
            return frameOrientation;
        }

        protected Size getFrameSize()
        {
            return frameSize;
        }

        protected void setAvailablePreviewSizes(List list)
        {
            availablePreviewSizes = list;
        }

        protected void update(Size size, boolean flag, int i)
        {
            int j;
            boolean flag1 = false;
            if (flag)
            {
                if (!cachedPort.isSet())
                {
                    cachedPort = findBestPreviewSize(flag, size);
                }
                frameSize = cachedPort;
            } else
            {
                if (!cachedLand.isSet())
                {
                    cachedLand = findBestPreviewSize(flag, size);
                }
                frameSize = cachedLand;
            }
            j = ((flag1) ? 1 : 0);
            i;
            JVM INSTR tableswitch 0 3: default 72
        //                       0 76
        //                       1 154
        //                       2 161
        //                       3 169;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_169;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            j = ((flag1) ? 1 : 0);
_L6:
            if (front)
            {
                displayOrientation = (j + orientation) % 360;
                frameOrientation = displayOrientation;
                displayOrientation = (360 - displayOrientation) % 360;
                return;
            } else
            {
                displayOrientation = ((orientation - j) + 360) % 360;
                frameOrientation = displayOrientation;
                return;
            }
_L3:
            j = 90;
              goto _L6
_L4:
            j = 180;
              goto _L6
            j = 270;
              goto _L6
        }

        protected PreviewParamsManager(boolean flag, int i)
        {
            cachedLand = new Size();
            cachedPort = new Size();
            front = flag;
            orientation = i;
        }
    }


    private class OpenThread extends Thread
    {

        private CameraInstance instance;
        private boolean wantBack;
        private boolean wantFront;

        public void run()
        {
            int k;
            int l;
            int i1;
            int j1;
            byte byte0;
            byte0 = -1;
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            int i2 = Camera.getNumberOfCameras();
            int i = 0;
            l = -1;
            k = -1;
            j1 = -1;
            int k1;
            for (i1 = -1; i < i2; i1 = k1)
            {
                Camera.getCameraInfo(i, camerainfo);
                int l1 = j1;
                k1 = i1;
                if (i1 < 0)
                {
                    l1 = j1;
                    k1 = i1;
                    if (camerainfo.facing == 0)
                    {
                        l1 = camerainfo.orientation;
                        k1 = i;
                    }
                }
                j1 = l;
                i1 = k;
                if (k < 0)
                {
                    j1 = l;
                    i1 = k;
                    if (camerainfo.facing == 1)
                    {
                        j1 = camerainfo.orientation;
                        i1 = i;
                    }
                }
                i++;
                l = j1;
                k = i1;
                j1 = l1;
            }

            if (!wantBack) goto _L2; else goto _L1
_L1:
            if (i1 < 0) goto _L4; else goto _L3
_L3:
            int j;
            boolean flag;
            flag = false;
            j = j1;
            k = i1;
_L10:
            Object obj = null;
            if (k >= 0) goto _L6; else goto _L5
_L5:
            String s = "";
            if (wantFront && !wantBack)
            {
                obj = "front-facing ";
            } else
            {
                obj = s;
                if (wantBack)
                {
                    obj = s;
                    if (!wantFront)
                    {
                        obj = "back-facing ";
                    }
                }
            }
            obj = new Exception((new StringBuilder()).append("No available ").append(((String) (obj))).append("camera").toString());
_L8:
            if (isInterrupted())
            {
                if (obj == null)
                {
                    instance.closeImpl();
                }
                return;
            }
            break; /* Loop/switch isn't completed */
_L2:
            if (wantFront && k >= 0)
            {
                j = l;
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
              goto _L4
_L6:
            Camera camera1 = Camera.open(k);
            if (camera1 != null)
            {
                try
                {
                    instance.init(camera1, flag, j);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
                continue; /* Loop/switch isn't completed */
            }
            obj = new Exception("Opening camera failed (unknown reason)");
            if (true) goto _L8; else goto _L7
_L7:
            if (obj != null)
            {
                instance.obtainMessage(1, obj).sendToTarget();
                return;
            } else
            {
                instance.obtainMessage(0).sendToTarget();
                return;
            }
_L4:
            flag = false;
            j = -1;
            k = byte0;
            if (true) goto _L10; else goto _L9
_L9:
        }

        private OpenThread(boolean flag, boolean flag1)
        {
            instance = CameraInstance.this;
            wantFront = flag1;
            wantBack = flag;
        }

        OpenThread(boolean flag, boolean flag1, _cls1 _pcls1)
        {
            this(flag, flag1);
        }
    }


    private class Listener
    {

        public abstract void onCameraOpenException(Exception exception);

        public abstract void onCameraOpenSuccess();

        public abstract void onNewFrame(byte abyte0[], Size size, int i);
    }

}
