// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.Context;
import android.hardware.Camera;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package org.chromium.media:
//            VideoCapture

public class VideoCaptureTango extends VideoCapture
{

    private static final VideoCaptureFactory.CamParams CAM_PARAMS[] = {
        new VideoCaptureFactory.CamParams(0, "depth", 320, 240), new VideoCaptureFactory.CamParams(1, "fisheye", 640, 480), new VideoCaptureFactory.CamParams(2, "4MP", 1280, 720)
    };
    private static final byte CHROMA_ZERO_LEVEL = 127;
    private static final int DEPTH_CAMERA_ID = 0;
    private static final int FISHEYE_CAMERA_ID = 1;
    private static final int FOURMP_CAMERA_ID = 2;
    private static final int SF_FULL_HEIGHT = 1752;
    private static final int SF_HEIGHT = 1168;
    private static final int SF_LINES_BIGIMAGE = 720;
    private static final int SF_LINES_DEPTH = 60;
    private static final int SF_LINES_DEPTH_PADDED = 112;
    private static final int SF_LINES_FISHEYE = 240;
    private static final int SF_LINES_HEADER = 16;
    private static final int SF_LINES_RESERVED = 80;
    private static final int SF_OFFSET_4MP_CHROMA = 112;
    private static final int SF_WIDTH = 1280;
    private static final String TAG = "VideoCaptureTango";
    private ByteBuffer mFrameBuffer;
    private final int mTangoCameraId;

    VideoCaptureTango(Context context, int i, long l)
    {
        super(context, 0, l);
        mFrameBuffer = null;
        mTangoCameraId = i;
    }

    static VideoCaptureFactory.CamParams getCamParams(int i)
    {
        if (i >= CAM_PARAMS.length)
        {
            return null;
        } else
        {
            return CAM_PARAMS[i];
        }
    }

    static VideoCapture.CaptureFormat[] getDeviceSupportedFormats(int i)
    {
        ArrayList arraylist = new ArrayList();
        if (i != 0) goto _L2; else goto _L1
_L1:
        arraylist.add(new VideoCapture.CaptureFormat(320, 180, 5, 0x32315659));
_L4:
        return (VideoCapture.CaptureFormat[])arraylist.toArray(new VideoCapture.CaptureFormat[arraylist.size()]);
_L2:
        if (i == 1)
        {
            arraylist.add(new VideoCapture.CaptureFormat(640, 480, 30, 0x32315659));
        } else
        if (i == 2)
        {
            arraylist.add(new VideoCapture.CaptureFormat(1280, 720, 20, 0x32315659));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static int numberOfCameras()
    {
        return CAM_PARAMS.length;
    }

    protected void allocateBuffers()
    {
        mFrameBuffer = ByteBuffer.allocateDirect((mCaptureFormat.mWidth * mCaptureFormat.mHeight * 3) / 2);
        Arrays.fill(mFrameBuffer.array(), (byte)127);
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        mPreviewBufferLock.lock();
        boolean flag = mIsRunning;
        if (!flag)
        {
            mPreviewBufferLock.unlock();
            return;
        }
        if (abyte0.length != 0x223800) goto _L2; else goto _L1
_L1:
        int j;
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
        if (mTangoCameraId != 0) goto _L4; else goto _L3
_L3:
        j = 0x69000;
_L6:
        byte byte0;
        if (j >= 0x8e800)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = (byte)(abyte0[j + 1] << 4 | (abyte0[j] & 0xf0) >> 4);
        mFrameBuffer.put(byte0);
        j += 2;
        if (true) goto _L6; else goto _L5
_L12:
        if (j >= mCaptureFormat.mWidth * mCaptureFormat.mHeight - 0x12c00) goto _L8; else goto _L7
_L7:
        mFrameBuffer.put((byte)0);
        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (mTangoCameraId != 1) goto _L10; else goto _L9
_L9:
        ByteBuffer.wrap(abyte0, 20480, 0x4b000).get(mFrameBuffer.array(), 0, 0x4b000);
_L8:
        mFrameBuffer.rewind();
        nativeOnFrameAvailable(mNativeVideoCaptureDeviceAndroid, mFrameBuffer.array(), mFrameBuffer.capacity(), (k + i) % 360);
_L2:
        mPreviewBufferLock.unlock();
        return;
_L10:
        if (mTangoCameraId != 2)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        ByteBuffer.wrap(abyte0, 0x8c000, 0xe1000).get(mFrameBuffer.array(), 0, 0xe1000);
        ByteBuffer.wrap(abyte0, 0x190000, 0x38400).get(mFrameBuffer.array(), 0xe1000, 0x38400);
        ByteBuffer.wrap(abyte0, 0x1eb400, 0x38400).get(mFrameBuffer.array(), 0x119400, 0x38400);
          goto _L8
        abyte0;
        mPreviewBufferLock.unlock();
        throw abyte0;
        Log.e("VideoCaptureTango", (new StringBuilder()).append("Unknown camera, #id: ").append(mTangoCameraId).toString());
        mPreviewBufferLock.unlock();
        return;
_L5:
        j = 0;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected void setCaptureParameters(int i, int j, int k, android.hardware.Camera.Parameters parameters)
    {
        mCaptureFormat = new VideoCapture.CaptureFormat(CAM_PARAMS[mTangoCameraId].mWidth, CAM_PARAMS[mTangoCameraId].mHeight, k, 0x32315659);
        parameters.set("sf-mode", "all");
    }

    protected void setPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback)
    {
        mCamera.setPreviewCallback(previewcallback);
    }

}
