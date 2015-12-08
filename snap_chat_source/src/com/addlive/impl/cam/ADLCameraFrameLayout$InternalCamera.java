// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Display;
import android.view.WindowManager;
import com.addlive.impl.Log;
import com.addlive.impl.cb.ADLInjectFrameCb;
import com.addlive.service.Device;
import com.addlive.service.VideoCaptureDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCameraFrameLayout, CaptureConfig, ADLCameraHelper

class mId2IdxMap
{

    private Camera mCamera;
    private List mCameraDevices;
    private Context mContext;
    private int mFps;
    private ADLInjectFrameCb mFrameReceiver;
    private int mHeight;
    private Map mId2IdxMap;
    private int mWidth;
    final ADLCameraFrameLayout this$0;

    public void configure()
    {
        mCamera = Camera.open(((Integer)mId2IdxMap.get(ADLCameraHelper.getSelectedCam())).intValue());
        int i = getOrientation();
        mCamera.setDisplayOrientation(i);
        android.hardware.era era = mCamera.getParameters();
        era.mCamera(17);
        era.mCamera(mWidth, mHeight);
        int ai[] = getFrameRateRange(era.wFpsRange(), mFps);
        era.(ai[0], ai[1]);
        mCamera.setParameters(era);
    }

    public List getCameraDevices()
    {
        return mCameraDevices;
    }

    public String getDevice()
    {
        return ADLCameraHelper.getSelectedCam();
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
        Log.d("AddLive_SDK_FCam", "Looking up for best frame rate range within available ones:");
        Log.d("AddLive_SDK_FCam", ((StringBuilder) (obj)).toString());
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
            Log.w("AddLive_SDK_FCam", (new StringBuilder("The camera does not support framerate as low as the requested one. Will use the lowest framerate range possible: [")).append(list[0]).append(";").append(list[1]).append("]").toString());
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
        Log.d("AddLive_SDK_FCam", (new StringBuilder("Will use FPS range: [")).append(list[0]).append(";").append(list[1]).append("]").toString());
        return list;
    }

    public int getHeight()
    {
        return mHeight;
    }

    public int getOrientation()
    {
        int i = ((Integer)mId2IdxMap.get(ADLCameraHelper.getSelectedCam())).intValue();
        android.hardware.era era = new android.hardware.era.mId2IdxMap();
        Camera.getCameraInfo(i, era);
        i = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (era.mContext == 1)
        {
            return (360 - (i * 90 + era.mContext) % 360) % 360;
        } else
        {
            return ((era.mContext - i * 90) + 360) % 360;
        }
    }

    public int getWidth()
    {
        return mWidth;
    }

    public int processProperty(String s, String s1)
    {
        char c1 = '\u03EA';
        if (s.equals("global.dev.camera.FPS"))
        {
            mFps = Integer.parseInt(s1);
            break MISSING_BLOCK_LABEL_138;
        }
        if (s.equals("global.dev.camera.height"))
        {
            mHeight = Integer.parseInt(s1);
            break MISSING_BLOCK_LABEL_138;
        }
        if (s.equals("global.dev.camera.width"))
        {
            mWidth = Integer.parseInt(s1);
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
        mWidth = Integer.parseInt(s.group(1));
        mHeight = Integer.parseInt(s.group(2));
        mFps = Integer.parseInt(s.group(3));
        c = '\0';
        return c;
    }

    public void setDevice(String s)
    {
        if (!mId2IdxMap.keySet().contains(s))
        {
            throw new IllegalArgumentException((new StringBuilder("There is no camera device with id: ")).append(s).toString());
        }
        if (!ADLCameraHelper.getSelectedCam().equals(s))
        {
            ADLCameraHelper.setSelectedCam(s);
        }
    }

    public void start(SurfaceTexture surfacetexture)
    {
        if (mCamera == null)
        {
            return;
        } else
        {
            mCamera.setPreviewTexture(surfacetexture);
            mCamera.startPreview();
            return;
        }
    }

    public void stop()
    {
        if (mCamera == null)
        {
            return;
        } else
        {
            mCamera.stopPreview();
            mCamera.release();
            mCamera = null;
            return;
        }
    }

    public (Context context, CaptureConfig captureconfig)
    {
        boolean flag1 = false;
        this$0 = ADLCameraFrameLayout.this;
        super();
        mId2IdxMap = new HashMap();
        mCameraDevices = new LinkedList();
        mContext = context;
        mWidth = captureconfig.getWidth();
        mHeight = captureconfig.getHeight();
        mFps = captureconfig.getFps();
        if (mContext == null)
        {
            throw new RuntimeException("Invalid context.");
        }
        boolean flag;
        if (mContext.getPackageManager().hasSystemFeature("android.hardware.camera") || mContext.getPackageManager().hasSystemFeature("android.hardware.camera.front"))
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
        adlcameraframelayout = new android.hardware.era.mContext();
        int i = ((flag1) ? 1 : 0);
        while (i < j) 
        {
            Camera.getCameraInfo(i, ADLCameraFrameLayout.this);
            if (ADLCameraFrameLayout.this.mContext == 1)
            {
                mCameraDevices.add(new Device(VideoCaptureDevice.FRONT_CAMERA.getId(), "Front Camera"));
                mId2IdxMap.put(VideoCaptureDevice.FRONT_CAMERA.getId(), Integer.valueOf(i));
            } else
            {
                mCameraDevices.add(new Device(VideoCaptureDevice.BACK_CAMERA.getId(), "Back Camera"));
                mId2IdxMap.put(VideoCaptureDevice.BACK_CAMERA.getId(), Integer.valueOf(i));
            }
            i++;
        }
        if (!mId2IdxMap.containsKey(ADLCameraHelper.getSelectedCam()))
        {
            ADLCameraHelper.setSelectedCam(VideoCaptureDevice.BACK_CAMERA.getId());
        }
    }
}
