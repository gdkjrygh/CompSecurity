// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public abstract class VideoCapture
    implements android.hardware.Camera.PreviewCallback
{
    protected static class CaptureFormat
    {

        final int mFramerate;
        int mHeight;
        final int mPixelFormat;
        int mWidth;

        public int getFramerate()
        {
            return mFramerate;
        }

        public int getHeight()
        {
            return mHeight;
        }

        public int getPixelFormat()
        {
            return mPixelFormat;
        }

        public int getWidth()
        {
            return mWidth;
        }

        public CaptureFormat(int i, int j, int k, int l)
        {
            mWidth = i;
            mHeight = j;
            mFramerate = k;
            mPixelFormat = l;
        }
    }


    protected static final int GL_TEXTURE_EXTERNAL_OES = 36197;
    private static final String TAG = "VideoCapture";
    protected Camera mCamera;
    protected int mCameraFacing;
    protected int mCameraOrientation;
    protected CaptureFormat mCaptureFormat;
    protected Context mContext;
    protected int mDeviceOrientation;
    protected int mGlTextures[];
    protected int mId;
    protected boolean mIsRunning;
    protected long mNativeVideoCaptureDeviceAndroid;
    protected ReentrantLock mPreviewBufferLock;
    protected SurfaceTexture mSurfaceTexture;

    VideoCapture(Context context, int i, long l)
    {
        mCaptureFormat = null;
        mPreviewBufferLock = new ReentrantLock();
        mContext = null;
        mIsRunning = false;
        mGlTextures = null;
        mSurfaceTexture = null;
        mContext = context;
        mId = i;
        mNativeVideoCaptureDeviceAndroid = l;
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
            Log.e("VideoCapture", (new StringBuilder()).append("getCameraInfo: android.hardware.Camera.getCameraInfo: ").append(runtimeexception).toString());
            return null;
        }
        return camerainfo;
    }

    protected static android.hardware.Camera.Parameters getCameraParameters(Camera camera)
    {
        android.hardware.Camera.Parameters parameters;
        try
        {
            parameters = camera.getParameters();
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("VideoCapture", (new StringBuilder()).append("getCameraParameters: android.hardware.Camera.getParameters: ").append(runtimeexception).toString());
            camera.release();
            return null;
        }
        return parameters;
    }

    boolean allocate(int i, int j, int k)
    {
        Log.d("VideoCapture", (new StringBuilder()).append("allocate: requested (").append(i).append("x").append(j).append(")@").append(k).append("fps").toString());
        Object obj;
        try
        {
            mCamera = Camera.open(mId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("VideoCapture", (new StringBuilder()).append("allocate: Camera.open: ").append(obj).toString());
            return false;
        }
        obj = getCameraInfo(mId);
        if (obj == null)
        {
            mCamera.release();
            mCamera = null;
            return false;
        }
        mCameraOrientation = ((android.hardware.Camera.CameraInfo) (obj)).orientation;
        mCameraFacing = ((android.hardware.Camera.CameraInfo) (obj)).facing;
        mDeviceOrientation = getDeviceOrientation();
        Log.d("VideoCapture", (new StringBuilder()).append("allocate: orientation dev=").append(mDeviceOrientation).append(", cam=").append(mCameraOrientation).append(", facing=").append(mCameraFacing).toString());
        android.hardware.Camera.Parameters parameters = getCameraParameters(mCamera);
        if (parameters == null)
        {
            mCamera = null;
            return false;
        }
        obj = parameters.getSupportedPreviewFpsRange();
        if (obj == null || ((List) (obj)).size() == 0)
        {
            Log.e("VideoCapture", "allocate: no fps range found");
            return false;
        }
        int j1 = k * 1000;
        int ai1[] = (int[])((List) (obj)).get(0);
        int i1 = (ai1[0] + 999) / 1000;
        Iterator iterator = ((List) (obj)).iterator();
        int ai[];
        int l;
        do
        {
            ai = ai1;
            l = i1;
            if (!iterator.hasNext())
            {
                break;
            }
            ai = (int[])iterator.next();
            if (ai[0] > j1 || j1 > ai[1])
            {
                continue;
            }
            l = k;
            break;
        } while (true);
        Log.d("VideoCapture", (new StringBuilder()).append("allocate: fps set to ").append(l).toString());
        Object obj1 = parameters.getSupportedPreviewSizes();
        j1 = 0x7fffffff;
        i1 = i;
        k = j;
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            android.hardware.Camera.Size size = (android.hardware.Camera.Size)((Iterator) (obj1)).next();
            int k1 = Math.abs(size.width - i) + Math.abs(size.height - j);
            Log.d("VideoCapture", (new StringBuilder()).append("allocate: supported (").append(size.width).append(", ").append(size.height).append("), diff=").append(k1).toString());
            if (k1 < j1 && size.width % 32 == 0)
            {
                j1 = k1;
                i1 = size.width;
                k = size.height;
            }
        } while (true);
        if (j1 == 0x7fffffff)
        {
            Log.e("VideoCapture", "allocate: can not find a multiple-of-32 resolution");
            return false;
        }
        Log.d("VideoCapture", (new StringBuilder()).append("allocate: matched (").append(i1).append("x").append(k).append(")").toString());
        if (parameters.isVideoStabilizationSupported())
        {
            Log.d("VideoCapture", (new StringBuilder()).append("Image stabilization supported, currently: ").append(parameters.getVideoStabilization()).append(", setting it.").toString());
            parameters.setVideoStabilization(true);
        } else
        {
            Log.d("VideoCapture", "Image stabilization not supported.");
        }
        setCaptureParameters(i1, k, l, parameters);
        parameters.setPreviewSize(mCaptureFormat.mWidth, mCaptureFormat.mHeight);
        parameters.setPreviewFpsRange(ai[0], ai[1]);
        parameters.setPreviewFormat(mCaptureFormat.mPixelFormat);
        try
        {
            mCamera.setParameters(parameters);
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("VideoCapture", (new StringBuilder()).append("setParameters: ").append(runtimeexception).toString());
            return false;
        }
        mGlTextures = new int[1];
        GLES20.glGenTextures(1, mGlTextures, 0);
        GLES20.glBindTexture(36197, mGlTextures[0]);
        GLES20.glTexParameterf(36197, 10241, 9729F);
        GLES20.glTexParameterf(36197, 10240, 9729F);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        mSurfaceTexture = new SurfaceTexture(mGlTextures[0]);
        mSurfaceTexture.setOnFrameAvailableListener(null);
        try
        {
            mCamera.setPreviewTexture(mSurfaceTexture);
        }
        catch (IOException ioexception)
        {
            Log.e("VideoCapture", (new StringBuilder()).append("allocate: ").append(ioexception).toString());
            return false;
        }
        allocateBuffers();
        return true;
    }

    abstract void allocateBuffers();

    public void deallocate()
    {
        if (mCamera == null)
        {
            return;
        }
        stopCapture();
        try
        {
            mCamera.setPreviewTexture(null);
            if (mGlTextures != null)
            {
                GLES20.glDeleteTextures(1, mGlTextures, 0);
            }
            mCaptureFormat = null;
            mCamera.release();
            mCamera = null;
            return;
        }
        catch (IOException ioexception)
        {
            Log.e("VideoCapture", (new StringBuilder()).append("deallocate: failed to deallocate camera, ").append(ioexception).toString());
        }
    }

    public int getColorspace()
    {
        switch (mCaptureFormat.mPixelFormat)
        {
        default:
            return 0;

        case 842094169: 
            return 0x32315659;

        case 17: // '\021'
            return 17;
        }
    }

    protected int getDeviceOrientation()
    {
        if (mContext == null) goto _L2; else goto _L1
_L1:
        ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        JVM INSTR tableswitch 1 3: default 56
    //                   1 58
    //                   2 61
    //                   3 65;
           goto _L2 _L3 _L4 _L5
_L2:
        return 0;
_L3:
        return 90;
_L4:
        return 180;
_L5:
        return 270;
    }

    public native void nativeOnFrameAvailable(long l, byte abyte0[], int i, int j);

    public int queryFrameRate()
    {
        return mCaptureFormat.mFramerate;
    }

    public int queryHeight()
    {
        return mCaptureFormat.mHeight;
    }

    public int queryWidth()
    {
        return mCaptureFormat.mWidth;
    }

    abstract void setCaptureParameters(int i, int j, int k, android.hardware.Camera.Parameters parameters);

    abstract void setPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback);

    public int startCapture()
    {
        if (mCamera == null)
        {
            Log.e("VideoCapture", "startCapture: camera is null");
            return -1;
        }
        mPreviewBufferLock.lock();
        boolean flag = mIsRunning;
        if (flag)
        {
            mPreviewBufferLock.unlock();
            return 0;
        }
        mIsRunning = true;
        mPreviewBufferLock.unlock();
        setPreviewCallback(this);
        Exception exception;
        try
        {
            mCamera.startPreview();
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("VideoCapture", (new StringBuilder()).append("startCapture: Camera.startPreview: ").append(runtimeexception).toString());
            return -1;
        }
        return 0;
        exception;
        mPreviewBufferLock.unlock();
        throw exception;
    }

    public int stopCapture()
    {
        if (mCamera == null)
        {
            Log.e("VideoCapture", "stopCapture: camera is null");
            return 0;
        }
        mPreviewBufferLock.lock();
        boolean flag = mIsRunning;
        if (!flag)
        {
            mPreviewBufferLock.unlock();
            return 0;
        }
        mIsRunning = false;
        mPreviewBufferLock.unlock();
        mCamera.stopPreview();
        setPreviewCallback(null);
        return 0;
        Exception exception;
        exception;
        mPreviewBufferLock.unlock();
        throw exception;
    }
}
