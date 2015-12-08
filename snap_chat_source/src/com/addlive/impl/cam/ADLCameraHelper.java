// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.addlive.impl.Log;
import com.addlive.impl.cb.ADLInjectFrameCb;
import com.addlive.service.Device;
import com.addlive.service.VideoCaptureDevice;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.addlive.impl.cam:
//            CaptureConfig

public class ADLCameraHelper extends HandlerThread
    implements android.hardware.Camera.PreviewCallback
{
    class AsyncResult
    {

        String error;
        boolean isSuccess;
        final ADLCameraHelper this$0;

        private AsyncResult()
        {
            this$0 = ADLCameraHelper.this;
            super();
            isSuccess = true;
            error = "";
        }

    }

    public static interface CamTask
    {

        public abstract void workOnCam(Camera camera1);
    }


    private static final int NUM_BUFFERS = 2;
    private static String selectedCam;
    private Camera camera;
    private List cameraDevices;
    private Context context;
    private CountDownLatch firstFrameLatch;
    private int fps;
    private ADLInjectFrameCb frameReceiver;
    private int height;
    private Map id2IdxMap;
    private int prevOrientation;
    private Handler taskHandler;
    private int width;

    public ADLCameraHelper(Context context1, ADLInjectFrameCb adlinjectframecb, CaptureConfig captureconfig)
    {
        super("CameraHandlerThread");
        id2IdxMap = new HashMap();
        cameraDevices = new LinkedList();
        taskHandler = null;
        prevOrientation = -1;
        width = captureconfig.getWidth();
        height = captureconfig.getHeight();
        fps = captureconfig.getFps();
        context = context1;
        frameReceiver = adlinjectframecb;
        start();
        taskHandler = new Handler(getLooper());
    }

    private void configInternal(CountDownLatch countdownlatch, AsyncResult asyncresult)
    {
        Log.d("AddLive_SDK", (new StringBuilder("Setting up hardware camera: ")).append(selectedCam).toString());
        camera = Camera.open(((Integer)id2IdxMap.get(selectedCam)).intValue());
        int k;
        int i = getOrientation(false);
        camera.setDisplayOrientation(i);
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        parameters.setPreviewFormat(17);
        parameters.setPreviewSize(width, height);
        int ai[] = getFrameRateRange(parameters.getSupportedPreviewFpsRange(), fps);
        parameters.setPreviewFpsRange(ai[0], ai[1]);
        camera.setParameters(parameters);
        camera.setPreviewCallbackWithBuffer(this);
        k = (width * 3 * height) / 2;
        int j = 0;
_L2:
        if (j >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        camera.addCallbackBuffer(new byte[k]);
        j++;
        if (true) goto _L2; else goto _L1
        Object obj;
        obj;
        Log.e("AddLive_SDK", "Failed to open camera device. It's most likely already in use.", ((Throwable) (obj)));
        asyncresult.isSuccess = false;
        asyncresult.error = (new StringBuilder()).append("Failed to open camera device. It's most likely already in use.").append(" (").append(((RuntimeException) (obj)).toString()).append(")").toString();
        countdownlatch.countDown();
        countdownlatch.countDown();
        return;
_L1:
        prevOrientation = getOrientation(true);
        countdownlatch.countDown();
        return;
        obj;
        Log.e("AddLive_SDK", "Failed to configure the camera", ((Throwable) (obj)));
        asyncresult.isSuccess = false;
        asyncresult.error = (new StringBuilder("Got an exception: ")).append(((Exception) (obj)).toString()).toString();
        countdownlatch.countDown();
        return;
        asyncresult;
        countdownlatch.countDown();
        throw asyncresult;
    }

    private void doOnCamInternal(CountDownLatch countdownlatch, CamTask camtask, AsyncResult asyncresult)
    {
        camtask.workOnCam(camera);
        countdownlatch.countDown();
        return;
        camtask;
        Log.e("AddLive_SDK", "Failed to perform camera operation", camtask);
        asyncresult.isSuccess = false;
        asyncresult.error = (new StringBuilder("Got an exception: ")).append(camtask.toString()).toString();
        countdownlatch.countDown();
        return;
        camtask;
        countdownlatch.countDown();
        throw camtask;
    }

    public static String getSelectedCam()
    {
        return selectedCam;
    }

    private void processFrame(byte abyte0[])
    {
        long l = System.currentTimeMillis();
        if (camera == null)
        {
            Log.w("AddLive_SDK", "Got new frame on already disposed camera");
            return;
        }
        try
        {
            int i = getOrientation(true);
            if (i != prevOrientation)
            {
                camera.setDisplayOrientation(getOrientation(false));
                prevOrientation = i;
            }
            int j = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
            frameReceiver.injectFrame(abyte0, width, height, abyte0.length, 17, i, j, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e("AddLive_SDK", "Error injectFrame: ", abyte0);
        }
        return;
    }

    public static void setSelectedCam(String s)
    {
        selectedCam = s;
    }

    private void stopInternal(CountDownLatch countdownlatch, AsyncResult asyncresult)
    {
        Camera camera1 = camera;
        if (camera1 == null)
        {
            countdownlatch.countDown();
            return;
        }
        camera.stopPreview();
        camera.release();
        camera = null;
        countdownlatch.countDown();
        return;
        Exception exception;
        exception;
        Log.e("AddLive_SDK", "Failed to configure the camera", exception);
        asyncresult.isSuccess = false;
        asyncresult.error = (new StringBuilder("Got an exception: ")).append(exception.toString()).toString();
        countdownlatch.countDown();
        return;
        asyncresult;
        countdownlatch.countDown();
        throw asyncresult;
    }

    public void checkHardware()
    {
        boolean flag1 = false;
        if (context == null)
        {
            throw new RuntimeException("Invalid context.");
        }
        boolean flag;
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera") || context.getPackageManager().hasSystemFeature("android.hardware.camera.front"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new RuntimeException("Camera feature is not supported by system.");
        }
        int j = Camera.getNumberOfCameras();
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        int i = ((flag1) ? 1 : 0);
        while (i < j) 
        {
            Camera.getCameraInfo(i, camerainfo);
            if (camerainfo.facing == 1)
            {
                cameraDevices.add(new Device(VideoCaptureDevice.FRONT_CAMERA.getId(), "Front Camera"));
                id2IdxMap.put(VideoCaptureDevice.FRONT_CAMERA.getId(), Integer.valueOf(i));
            } else
            {
                cameraDevices.add(new Device(VideoCaptureDevice.BACK_CAMERA.getId(), "Back Camera"));
                id2IdxMap.put(VideoCaptureDevice.BACK_CAMERA.getId(), Integer.valueOf(i));
            }
            i++;
        }
        if (!id2IdxMap.containsKey(selectedCam))
        {
            selectedCam = VideoCaptureDevice.BACK_CAMERA.getId();
        }
    }

    public void configure(CountDownLatch countdownlatch)
    {
        final CountDownLatch syncLatch = new CountDownLatch(1);
        final AsyncResult result = new AsyncResult();
        taskHandler.post(new Runnable() {

            final ADLCameraHelper this$0;
            final AsyncResult val$result;
            final CountDownLatch val$syncLatch;

            public void run()
            {
                configInternal(syncLatch, result);
            }

            
            {
                this$0 = ADLCameraHelper.this;
                syncLatch = countdownlatch;
                result = asyncresult;
                super();
            }
        });
        firstFrameLatch = countdownlatch;
        syncLatch.await();
        if (!result.isSuccess)
        {
            throw new IOException(result.error);
        } else
        {
            return;
        }
    }

    public void dispose()
    {
        quit();
        context = null;
    }

    public void doOnCam(final CamTask task)
    {
        final CountDownLatch syncLatch = new CountDownLatch(1);
        final AsyncResult result = new AsyncResult();
        taskHandler.post(new Runnable() {

            final ADLCameraHelper this$0;
            final AsyncResult val$result;
            final CountDownLatch val$syncLatch;
            final CamTask val$task;

            public void run()
            {
                doOnCamInternal(syncLatch, task, result);
            }

            
            {
                this$0 = ADLCameraHelper.this;
                syncLatch = countdownlatch;
                task = camtask;
                result = asyncresult;
                super();
            }
        });
        syncLatch.await();
        if (!result.isSuccess)
        {
            throw new IOException((new StringBuilder("Failed to stop the camera: ")).append(result.error).toString());
        } else
        {
            return;
        }
    }

    public List getCameraDevices()
    {
        return cameraDevices;
    }

    public String getDevice()
    {
        return selectedCam;
    }

    public int[] getFrameRateRange(List list, int i)
    {
        byte byte0 = -1;
        Object obj = new StringBuilder();
        int ai1[];
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append('[').append(ai1[0]).append(';').append(ai1[1]).append("], "))
        {
            ai1 = (int[])iterator.next();
        }

        ((StringBuilder) (obj)).delete(((StringBuilder) (obj)).length() - 2, ((StringBuilder) (obj)).length());
        Log.d("AddLive_SDK", "Looking up for best frame rate range within available ones:");
        Log.d("AddLive_SDK", ((StringBuilder) (obj)).toString());
        obj = new LinkedList();
        Iterator iterator1 = list.iterator();
        int j;
        int k;
        for (j = -1; iterator1.hasNext(); j = k)
        {
            int ai2[] = (int[])iterator1.next();
            k = j;
            if (ai2[1] > i * 1000)
            {
                continue;
            }
            k = j;
            if (j < ai2[1])
            {
                k = ai2[1];
            }
            ((List) (obj)).add(ai2);
        }

        if (((List) (obj)).isEmpty())
        {
            list = (int[])list.get(0);
            Log.w("AddLive_SDK", (new StringBuilder("The camera does not support framerate as low as the requested one. Will use the lowest framerate range possible: [")).append(list[0]).append(";").append(list[1]).append("]").toString());
            return list;
        }
        list = new LinkedList();
        obj = ((List) (obj)).iterator();
        int l = 0;
        i = byte0;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            int ai[] = (int[])((Iterator) (obj)).next();
            if (ai[1] == j)
            {
                int i1 = i;
                if (i < ai[0])
                {
                    i1 = ai[0];
                    l = list.size();
                }
                list.add(ai);
                i = i1;
            }
        } while (true);
        list = (int[])list.get(l);
        Log.d("AddLive_SDK", (new StringBuilder("Will use FPS range: [")).append(list[0]).append(";").append(list[1]).append("]").toString());
        return list;
    }

    public int getHeight()
    {
        return height;
    }

    public int getOrientation(boolean flag)
    {
        int i = ((Integer)id2IdxMap.get(selectedCam)).intValue();
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(i, camerainfo);
        i = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (flag)
        {
            if (camerainfo.facing == 1)
            {
                return (i + camerainfo.orientation / 90) % 4;
            } else
            {
                return ((camerainfo.orientation / 90 - i) + 4) % 4;
            }
        }
        if (camerainfo.facing == 1)
        {
            return (360 - (i * 90 + camerainfo.orientation) % 360) % 360;
        } else
        {
            return ((camerainfo.orientation - i * 90) + 360) % 360;
        }
    }

    public int getWidth()
    {
        return width;
    }

    public boolean isCamWorking()
    {
        return camera != null;
    }

    public void onPreviewFrame(byte abyte0[], Camera camera1)
    {
        processFrame(abyte0);
        camera1.addCallbackBuffer(abyte0);
        if (firstFrameLatch != null)
        {
            firstFrameLatch.countDown();
            firstFrameLatch = null;
        }
    }

    public int processProperty(String s, String s1)
    {
        char c1 = '\u03EA';
        if (s.equals("global.dev.camera.FPS"))
        {
            fps = Integer.parseInt(s1);
            break MISSING_BLOCK_LABEL_138;
        }
        if (s.equals("global.dev.camera.height"))
        {
            height = Integer.parseInt(s1);
            break MISSING_BLOCK_LABEL_138;
        }
        if (s.equals("global.dev.camera.width"))
        {
            width = Integer.parseInt(s1);
            break MISSING_BLOCK_LABEL_138;
        }
        char c = c1;
        try
        {
            if (!s.equals("global.dev.camera.mode"))
            {
                break MISSING_BLOCK_LABEL_140;
            }
            s = Pattern.compile("(\\d{1,3})x(\\d{1,3})@(\\d{1,2})").matcher(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 1002;
        }
        c = c1;
        if (!s.matches())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        width = Integer.parseInt(s.group(1));
        height = Integer.parseInt(s.group(2));
        fps = Integer.parseInt(s.group(3));
        c = '\0';
        return c;
    }

    public void setDevice(String s)
    {
        if (!id2IdxMap.keySet().contains(s))
        {
            throw new IllegalArgumentException((new StringBuilder("There is no camera device with id: ")).append(s).toString());
        }
        if (!selectedCam.equals(s))
        {
            selectedCam = s;
        }
    }

    public void stopCam()
    {
        final CountDownLatch syncLatch = new CountDownLatch(1);
        final AsyncResult result = new AsyncResult();
        taskHandler.post(new Runnable() {

            final ADLCameraHelper this$0;
            final AsyncResult val$result;
            final CountDownLatch val$syncLatch;

            public void run()
            {
                stopInternal(syncLatch, result);
            }

            
            {
                this$0 = ADLCameraHelper.this;
                syncLatch = countdownlatch;
                result = asyncresult;
                super();
            }
        });
        syncLatch.await();
        if (!result.isSuccess)
        {
            throw new IOException((new StringBuilder("Failed to stop the camera: ")).append(result.error).toString());
        } else
        {
            return;
        }
    }

    static 
    {
        selectedCam = VideoCaptureDevice.FRONT_CAMERA.getId();
    }



}
