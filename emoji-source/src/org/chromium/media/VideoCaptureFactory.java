// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;

// Referenced classes of package org.chromium.media:
//            VideoCaptureTango, VideoCaptureAndroid, VideoCapture

class VideoCaptureFactory
{
    static class CamParams
    {

        final int mHeight;
        final int mId;
        final String mName;
        final int mWidth;

        CamParams(int i, String s, int j, int k)
        {
            mId = i;
            mName = s;
            mWidth = j;
            mHeight = k;
        }
    }

    static class ChromiumCameraInfo
    {

        static final boolean $assertionsDisabled;
        private static final String SPECIAL_DEVICE_LIST[][] = {
            {
                "Peanut", "peanut"
            }
        };
        private static final String TAG = "ChromiumCameraInfo";
        private static int sNumberOfSystemCameras = -1;
        private final android.hardware.Camera.CameraInfo mCameraInfo;
        private final int mId;

        private static ChromiumCameraInfo getAt(int i)
        {
            return new ChromiumCameraInfo(i);
        }

        private android.hardware.Camera.CameraInfo getCameraInfo(int i)
        {
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            try
            {
                Camera.getCameraInfo(i, camerainfo);
            }
            catch (RuntimeException runtimeexception)
            {
                Log.e("ChromiumCameraInfo", (new StringBuilder()).append("getCameraInfo: android.hardware.Camera.getCameraInfo: ").append(runtimeexception).toString());
                return null;
            }
            return camerainfo;
        }

        private String getDeviceName()
        {
            if (isSpecialCamera(mId))
            {
                return VideoCaptureTango.getCamParams(toSpecialCameraId(mId)).mName;
            }
            if (mCameraInfo == null)
            {
                return "";
            }
            StringBuilder stringbuilder = (new StringBuilder()).append("Camera enumerated: ");
            String s;
            if (mCameraInfo.facing == 1)
            {
                s = "front";
            } else
            {
                s = "back";
            }
            Log.d("ChromiumCameraInfo", stringbuilder.append(s).toString());
            stringbuilder = (new StringBuilder()).append("camera ").append(mId).append(", facing ");
            if (mCameraInfo.facing == 1)
            {
                s = "front";
            } else
            {
                s = "back";
            }
            return stringbuilder.append(s).toString();
        }

        private int getId()
        {
            return mId;
        }

        private static int getNumberOfCameras(Context context)
        {
            if (sNumberOfSystemCameras == -1)
            {
                if (context.getPackageManager().checkPermission("android.permission.CAMERA", context.getPackageName()) == 0)
                {
                    sNumberOfSystemCameras = Camera.getNumberOfCameras();
                } else
                {
                    sNumberOfSystemCameras = 0;
                    Log.w("ChromiumCameraInfo", "Missing android.permission.CAMERA permission, no system camera available.");
                }
            }
            if (isSpecialDevice())
            {
                Log.d("ChromiumCameraInfo", (new StringBuilder()).append("Special device: ").append(Build.MODEL).toString());
                return sNumberOfSystemCameras + VideoCaptureTango.numberOfCameras();
            } else
            {
                return sNumberOfSystemCameras;
            }
        }

        private int getOrientation()
        {
            while (isSpecialCamera(mId) || mCameraInfo == null) 
            {
                return 0;
            }
            return mCameraInfo.orientation;
        }

        private static boolean isSpecialCamera(int i)
        {
            return i >= sNumberOfSystemCameras;
        }

        private static boolean isSpecialDevice()
        {
            String as[][] = SPECIAL_DEVICE_LIST;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String as1[] = as[i];
                if (as1[0].contentEquals(Build.MODEL) && as1[1].contentEquals(Build.DEVICE))
                {
                    return true;
                }
            }

            return false;
        }

        private static int toSpecialCameraId(int i)
        {
            if (!$assertionsDisabled && !isSpecialCamera(i))
            {
                throw new AssertionError();
            } else
            {
                return i - sNumberOfSystemCameras;
            }
        }

        static 
        {
            boolean flag;
            if (!org/chromium/media/VideoCaptureFactory.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }



        private ChromiumCameraInfo(int i)
        {
            mId = i;
            android.hardware.Camera.CameraInfo camerainfo;
            if (isSpecialCamera(i))
            {
                camerainfo = null;
            } else
            {
                camerainfo = getCameraInfo(mId);
            }
            mCameraInfo = camerainfo;
        }
    }


    VideoCaptureFactory()
    {
    }

    static VideoCapture createVideoCapture(Context context, int i, long l)
    {
        if (ChromiumCameraInfo.isSpecialCamera(i))
        {
            return new VideoCaptureTango(context, ChromiumCameraInfo.toSpecialCameraId(i), l);
        } else
        {
            return new VideoCaptureAndroid(context, i, l);
        }
    }

    static int getCaptureFormatFramerate(VideoCapture.CaptureFormat captureformat)
    {
        return captureformat.getFramerate();
    }

    static int getCaptureFormatHeight(VideoCapture.CaptureFormat captureformat)
    {
        return captureformat.getHeight();
    }

    static int getCaptureFormatPixelFormat(VideoCapture.CaptureFormat captureformat)
    {
        return captureformat.getPixelFormat();
    }

    static int getCaptureFormatWidth(VideoCapture.CaptureFormat captureformat)
    {
        return captureformat.getWidth();
    }

    static VideoCapture.CaptureFormat[] getDeviceSupportedFormats(int i)
    {
        if (ChromiumCameraInfo.isSpecialCamera(i))
        {
            return VideoCaptureTango.getDeviceSupportedFormats(ChromiumCameraInfo.toSpecialCameraId(i));
        } else
        {
            return VideoCaptureAndroid.getDeviceSupportedFormats(i);
        }
    }
}
