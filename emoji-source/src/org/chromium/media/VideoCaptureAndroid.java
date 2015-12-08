// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package org.chromium.media:
//            VideoCapture

public class VideoCaptureAndroid extends VideoCapture
{
    private static class BuggyDeviceHack
    {

        private static final IdAndSizes CAPTURESIZE_BUGGY_DEVICE_LIST[] = {
            new IdAndSizes("Nexus 7", "flo", 640, 480)
        };
        private static final String COLORSPACE_BUGGY_DEVICE_LIST[] = {
            "SAMSUNG-SGH-I747", "ODROID-U2"
        };

        static void applyMinDimensions(VideoCapture.CaptureFormat captureformat)
        {
            IdAndSizes aidandsizes[] = CAPTURESIZE_BUGGY_DEVICE_LIST;
            int k = aidandsizes.length;
            int i = 0;
            while (i < k) 
            {
                IdAndSizes idandsizes = aidandsizes[i];
                if (idandsizes.mModel.contentEquals(Build.MODEL) && idandsizes.mDevice.contentEquals(Build.DEVICE))
                {
                    int j;
                    if (idandsizes.mMinWidth > captureformat.mWidth)
                    {
                        j = idandsizes.mMinWidth;
                    } else
                    {
                        j = captureformat.mWidth;
                    }
                    captureformat.mWidth = j;
                    if (idandsizes.mMinHeight > captureformat.mHeight)
                    {
                        j = idandsizes.mMinHeight;
                    } else
                    {
                        j = captureformat.mHeight;
                    }
                    captureformat.mHeight = j;
                }
                i++;
            }
        }

        static int getImageFormat()
        {
            if (android.os.Build.VERSION.SDK_INT >= 16) goto _L2; else goto _L1
_L1:
            return 17;
_L2:
            String as[] = COLORSPACE_BUGGY_DEVICE_LIST;
            int j = as.length;
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (as[i].contentEquals(Build.MODEL))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
            return 0x32315659;
        }


        private BuggyDeviceHack()
        {
        }
    }

    private static class BuggyDeviceHack.IdAndSizes
    {

        public final String mDevice;
        public final int mMinHeight;
        public final int mMinWidth;
        public final String mModel;

        BuggyDeviceHack.IdAndSizes(String s, String s1, int i, int j)
        {
            mModel = s;
            mDevice = s1;
            mMinWidth = i;
            mMinHeight = j;
        }
    }


    private static final int NUM_CAPTURE_BUFFERS = 3;
    private static final String TAG = "VideoCaptureAndroid";
    private int mExpectedFrameSize;

    VideoCaptureAndroid(Context context, int i, long l)
    {
        super(context, i, l);
    }

    static VideoCapture.CaptureFormat[] getDeviceSupportedFormats(int i)
    {
        Camera camera;
        android.hardware.Camera.Parameters parameters;
        ArrayList arraylist;
        Iterator iterator;
        try
        {
            camera = Camera.open(i);
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("VideoCaptureAndroid", (new StringBuilder()).append("Camera.open: ").append(runtimeexception).toString());
            return null;
        }
        parameters = getCameraParameters(camera);
        if (parameters == null)
        {
            return null;
        }
        arraylist = new ArrayList();
        List list = parameters.getSupportedPreviewFormats();
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        if (((List) (obj)).size() == 0)
        {
            ((List) (obj)).add(Integer.valueOf(0));
        }
        iterator = ((List) (obj)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = (Integer)iterator.next();
        i = 0;
        if (((Integer) (obj1)).intValue() != 0x32315659) goto _L4; else goto _L3
_L3:
        i = 0x32315659;
_L6:
        List list1 = parameters.getSupportedPreviewFpsRange();
        obj1 = list1;
        if (list1 == null)
        {
            obj1 = new ArrayList();
        }
        if (((List) (obj1)).size() == 0)
        {
            ((List) (obj1)).add(new int[] {
                0, 0
            });
        }
        Iterator iterator1 = ((List) (obj1)).iterator();
        while (iterator1.hasNext()) 
        {
            int ai[] = (int[])iterator1.next();
            List list2 = parameters.getSupportedPreviewSizes();
            obj1 = list2;
            if (list2 == null)
            {
                obj1 = new ArrayList();
            }
            if (((List) (obj1)).size() == 0)
            {
                camera.getClass();
                ((List) (obj1)).add(new android.hardware.Camera.Size(camera, 0, 0));
            }
            obj1 = ((List) (obj1)).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                android.hardware.Camera.Size size = (android.hardware.Camera.Size)((Iterator) (obj1)).next();
                arraylist.add(new VideoCapture.CaptureFormat(size.width, size.height, (ai[1] + 999) / 1000, i));
            }
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (((Integer) (obj1)).intValue() != 17) goto _L6; else goto _L5
_L2:
        camera.release();
        return (VideoCapture.CaptureFormat[])arraylist.toArray(new VideoCapture.CaptureFormat[arraylist.size()]);
    }

    protected void allocateBuffers()
    {
        mExpectedFrameSize = (mCaptureFormat.mWidth * mCaptureFormat.mHeight * ImageFormat.getBitsPerPixel(mCaptureFormat.mPixelFormat)) / 8;
        for (int i = 0; i < 3; i++)
        {
            byte abyte0[] = new byte[mExpectedFrameSize];
            mCamera.addCallbackBuffer(abyte0);
        }

    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        mPreviewBufferLock.lock();
        boolean flag = mIsRunning;
        if (flag) goto _L2; else goto _L1
_L1:
        mPreviewBufferLock.unlock();
        if (camera != null)
        {
            camera.addCallbackBuffer(abyte0);
        }
_L4:
        return;
_L2:
        int j;
        if (abyte0.length != mExpectedFrameSize)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        j = getDeviceOrientation();
        if (j != mDeviceOrientation)
        {
            mDeviceOrientation = j;
        }
        int i = j;
        if (mCameraFacing == 0)
        {
            i = 360 - j;
        }
        int k = mCameraOrientation;
        nativeOnFrameAvailable(mNativeVideoCaptureDeviceAndroid, abyte0, mExpectedFrameSize, (k + i) % 360);
        mPreviewBufferLock.unlock();
        if (camera == null) goto _L4; else goto _L3
_L3:
        camera.addCallbackBuffer(abyte0);
        return;
        Exception exception;
        exception;
        mPreviewBufferLock.unlock();
        if (camera != null)
        {
            camera.addCallbackBuffer(abyte0);
        }
        throw exception;
    }

    protected void setCaptureParameters(int i, int j, int k, android.hardware.Camera.Parameters parameters)
    {
        mCaptureFormat = new VideoCapture.CaptureFormat(i, j, k, BuggyDeviceHack.getImageFormat());
        BuggyDeviceHack.applyMinDimensions(mCaptureFormat);
    }

    protected void setPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback)
    {
        mCamera.setPreviewCallbackWithBuffer(previewcallback);
    }
}
