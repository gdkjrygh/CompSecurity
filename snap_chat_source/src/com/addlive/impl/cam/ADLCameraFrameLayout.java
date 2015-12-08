// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.addlive.impl.Log;
import com.addlive.impl.cb.ADLInjectFrameCb;
import com.addlive.service.Device;
import com.addlive.service.VideoCaptureDevice;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCamera, CaptureConfig, ADLCameraHelper

public class ADLCameraFrameLayout
    implements android.app.Application.ActivityLifecycleCallbacks, android.graphics.SurfaceTexture.OnFrameAvailableListener, ADLCamera
{
    class InternalCamera
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
            android.hardware.Camera.Parameters parameters = mCamera.getParameters();
            parameters.setPreviewFormat(17);
            parameters.setPreviewSize(mWidth, mHeight);
            int ai[] = getFrameRateRange(parameters.getSupportedPreviewFpsRange(), mFps);
            parameters.setPreviewFpsRange(ai[0], ai[1]);
            mCamera.setParameters(parameters);
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
            android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
            Camera.getCameraInfo(i, camerainfo);
            i = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getRotation();
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

        public InternalCamera(Context context, CaptureConfig captureconfig)
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
            adlcameraframelayout = new android.hardware.Camera.CameraInfo();
            int i = ((flag1) ? 1 : 0);
            while (i < j) 
            {
                Camera.getCameraInfo(i, ADLCameraFrameLayout.this);
                if (facing == 1)
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

    class InternalRenderer
        implements android.opengl.GLSurfaceView.Renderer
    {

        private int mCamHeight;
        private int mCamWidth;
        private final String mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        private ADLInjectFrameCb mFrameReceiver;
        private int mHeight;
        private float mMVPMatrix[];
        private int mProgram;
        private RenderTexture mRenderTextureL;
        private RenderTexture mRenderTextureP;
        private float mSTMatrix[];
        private SurfaceTexture mSurfaceTexture;
        private int mTextureId;
        private final String mVertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        private int mWidth;
        private final float mXyzUv[] = {
            -1F, -1F, 0.0F, 0.0F, 0.0F, 1.0F, -1F, 0.0F, 1.0F, 0.0F, 
            -1F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
        };
        private FloatBuffer mXyzUvBuffer;
        private int maPositionHandle;
        private int maTextureHandle;
        private int muMVPMatrixHandle;
        private int muSTMatrixHandle;
        final ADLCameraFrameLayout this$0;

        public void drawFrame(int i, int j, long l)
        {
            mSurfaceTexture.updateTexImage();
            float f = 1.570796F * (float)(i + 3);
            if (i == 0 || i == 2)
            {
                mRenderTextureL.onDrawFrame(mSurfaceTexture, mTextureId, f);
                mFrameReceiver.injectFrame(null, mCamWidth, mCamHeight, 0, 0, i, j, l);
            } else
            {
                mRenderTextureP.onDrawFrame(mSurfaceTexture, mTextureId, f);
                mFrameReceiver.injectFrame(null, mCamHeight, mCamWidth, 0, 0, i, j, l);
            }
            mSurfaceTexture.getTransformMatrix(mSTMatrix);
            GLES20.glViewport(0, 0, mWidth, mHeight);
            GLES20.glUseProgram(mProgram);
            GLES20.glClear(16384);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, mTextureId);
            mXyzUvBuffer.position(0);
            GLES20.glVertexAttribPointer(maPositionHandle, 3, 5126, false, 20, mXyzUvBuffer);
            GLES20.glEnableVertexAttribArray(maPositionHandle);
            mXyzUvBuffer.position(3);
            GLES20.glVertexAttribPointer(maTextureHandle, 3, 5126, false, 20, mXyzUvBuffer);
            GLES20.glEnableVertexAttribArray(maTextureHandle);
            Matrix.setIdentityM(mMVPMatrix, 0);
            GLES20.glUniformMatrix4fv(muMVPMatrixHandle, 1, false, mMVPMatrix, 0);
            GLES20.glUniformMatrix4fv(muSTMatrixHandle, 1, false, mSTMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }

        public void onDrawFrame(GL10 gl10)
        {
        }

        public void onSurfaceChanged(GL10 gl10, int i, int j)
        {
            mWidth = i;
            mHeight = j;
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
        {
            Log.d("AddLive_SDK_FCam", "onSurfaceCreated");
            mTextureId = ADLCameraFrameLayout.createTexture(36197);
            mSurfaceTexture = new SurfaceTexture(mTextureId);
            mRenderTextureL = new RenderTexture(mCamWidth, mCamHeight);
            mRenderTextureP = new RenderTexture(mCamHeight, mCamWidth);
            mProgram = ADLCameraFrameLayout.createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            maPositionHandle = GLES20.glGetAttribLocation(mProgram, "aPosition");
            maTextureHandle = GLES20.glGetAttribLocation(mProgram, "aTextureCoord");
            muMVPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
            muSTMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uSTMatrix");
            try
            {
                startCamera();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (GL10 gl10)
            {
                Log.e("AddLive_SDK_FCam", "critical error: failed to start camera");
            }
        }

        public void startCamera()
        {
            if (mSurfaceTexture != null)
            {
                ADLCameraFrameLayout.this.startCamera(mSurfaceTexture);
            }
        }

        public void stopCamera()
        {
            if (mSurfaceTexture != null)
            {
                ADLCameraFrameLayout.this.stopCamera(mSurfaceTexture);
            }
        }

        public InternalRenderer(ADLInjectFrameCb adlinjectframecb, int i, int j)
        {
            this$0 = ADLCameraFrameLayout.this;
            super();
            mMVPMatrix = new float[16];
            mSTMatrix = new float[16];
            mCamWidth = i;
            mCamHeight = j;
            mXyzUvBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
            mXyzUvBuffer.put(mXyzUv).position(0);
            Matrix.setIdentityM(mSTMatrix, 0);
            mFrameReceiver = adlinjectframecb;
        }
    }

    class RenderTexture
    {

        private final String mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        private int mFramebufferId;
        private int mHeight;
        private float mMVPMatrix[];
        private int mProgram;
        private float mSTMatrix[];
        private int mTextureId;
        private final String mVertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        private int mWidth;
        private final float mXyzUv[] = {
            -1F, -1F, 0.0F, 0.0F, 0.0F, 1.0F, -1F, 0.0F, 1.0F, 0.0F, 
            -1F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F
        };
        private FloatBuffer mXyzUvBuffer;
        private int maPositionHandle;
        private int maTextureHandle;
        private int muMVPMatrixHandle;
        private int muSTMatrixHandle;
        final ADLCameraFrameLayout this$0;

        public void onDrawFrame(SurfaceTexture surfacetexture, int i, float f)
        {
            surfacetexture.getTransformMatrix(mSTMatrix);
            GLES20.glBindFramebuffer(36160, mFramebufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, mTextureId, 0);
            if (GLES20.glCheckFramebufferStatus(36160) != 36053)
            {
                Log.e("AddLive_SDK_FCam", "framebuffer not complete");
            }
            GLES20.glViewport(0, 0, mWidth, mHeight);
            GLES20.glUseProgram(mProgram);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            mXyzUvBuffer.position(0);
            GLES20.glVertexAttribPointer(maPositionHandle, 3, 5126, false, 20, mXyzUvBuffer);
            GLES20.glEnableVertexAttribArray(maPositionHandle);
            mXyzUvBuffer.position(3);
            GLES20.glVertexAttribPointer(maTextureHandle, 3, 5126, false, 20, mXyzUvBuffer);
            GLES20.glEnableVertexAttribArray(maTextureHandle);
            float f1 = (float)Math.cos(f);
            f = (float)Math.sin(f);
            Matrix.setIdentityM(mMVPMatrix, 0);
            mMVPMatrix[0] = f1;
            mMVPMatrix[1] = -f;
            mMVPMatrix[4] = f;
            mMVPMatrix[5] = f1;
            GLES20.glUniformMatrix4fv(muMVPMatrixHandle, 1, false, mMVPMatrix, 0);
            GLES20.glUniformMatrix4fv(muSTMatrixHandle, 1, false, mSTMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glFinish();
            GLES20.glBindTexture(3553, mTextureId);
        }

        public RenderTexture(int i, int j)
        {
            this$0 = ADLCameraFrameLayout.this;
            super();
            mMVPMatrix = new float[16];
            mSTMatrix = new float[16];
            mWidth = i;
            mHeight = j;
            mTextureId = ADLCameraFrameLayout.createTexture(3553);
            GLES20.glTexImage2D(3553, 0, 6408, mWidth, mHeight, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
            mFramebufferId = ADLCameraFrameLayout.createFramebuffer(mTextureId);
            mXyzUvBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
            mXyzUvBuffer.put(mXyzUv).position(0);
            mProgram = ADLCameraFrameLayout.createProgram("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            maPositionHandle = GLES20.glGetAttribLocation(mProgram, "aPosition");
            maTextureHandle = GLES20.glGetAttribLocation(mProgram, "aTextureCoord");
            muMVPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
            muSTMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uSTMatrix");
            GLES20.glBindFramebuffer(36160, 0);
        }
    }


    private static final String LOG_TAG = "AddLive_SDK_FCam";
    private InternalCamera mCamera;
    private Context mContext;
    private FrameLayout mFrameLayout;
    private GLSurfaceView mGLSurfaceView;
    private InternalRenderer mRenderer;

    public ADLCameraFrameLayout(ADLInjectFrameCb adlinjectframecb, Context context, CaptureConfig captureconfig)
    {
        Log.d("AddLive_SDK_FCam", "constructor");
        mContext = context;
        context = mContext.getApplicationContext();
        if (context instanceof Application)
        {
            ((Application)context).registerActivityLifecycleCallbacks(this);
        }
        mCamera = new InternalCamera(mContext, captureconfig);
        mRenderer = new InternalRenderer(adlinjectframecb, mCamera.getWidth(), mCamera.getHeight());
        mGLSurfaceView = new GLSurfaceView(mContext);
        mGLSurfaceView.setEGLContextClientVersion(2);
        mGLSurfaceView.setRenderer(mRenderer);
        mGLSurfaceView.setRenderMode(0);
    }

    private static int createFramebuffer(int i)
    {
        int ai[] = new int[1];
        GLES20.glGenFramebuffers(1, ai, 0);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        if (GLES20.glCheckFramebufferStatus(36160) != 36053)
        {
            Log.e("AddLive_SDK_FCam", "framebuffer not complete");
        }
        return ai[0];
    }

    private static int createProgram(String s, String s1)
    {
        int i = loadShader(35633, s);
        int j;
        int k;
        if (i != 0)
        {
            if ((j = loadShader(35632, s1)) != 0 && (k = GLES20.glCreateProgram()) != 0)
            {
                GLES20.glAttachShader(k, i);
                GLES20.glAttachShader(k, j);
                GLES20.glLinkProgram(k);
                s = new int[1];
                GLES20.glGetProgramiv(k, 35714, s, 0);
                if (s[0] != 1)
                {
                    Log.e("AddLive_SDK_FCam", (new StringBuilder("Could not link program: ")).append(GLES20.glGetProgramInfoLog(k)).toString());
                    GLES20.glDeleteProgram(k);
                    return 0;
                } else
                {
                    return k;
                }
            }
        }
        return 0;
    }

    private static int createTexture(int i)
    {
        int ai[] = new int[1];
        GLES20.glGenTextures(1, ai, 0);
        GLES20.glBindTexture(i, ai[0]);
        GLES20.glTexParameterf(i, 10241, 9729F);
        GLES20.glTexParameterf(i, 10240, 9729F);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
        return ai[0];
    }

    private static int loadShader(int i, String s)
    {
        int j = GLES20.glCreateShader(i);
        if (j == 0)
        {
            return 0;
        }
        GLES20.glShaderSource(j, s);
        GLES20.glCompileShader(j);
        s = new int[1];
        GLES20.glGetShaderiv(j, 35713, s, 0);
        if (s[0] == 0)
        {
            Log.e("AddLive_SDK_FCam", (new StringBuilder("Could not compile shader ")).append(i).append(":").append(GLES20.glGetShaderInfoLog(j)).toString());
            GLES20.glDeleteShader(j);
            return 0;
        } else
        {
            return j;
        }
    }

    private void startCamera(SurfaceTexture surfacetexture)
    {
        Log.d("AddLive_SDK_FCam", "startCamera");
        surfacetexture.setOnFrameAvailableListener(this);
        if (mCamera != null)
        {
            mCamera.start(surfacetexture);
        }
    }

    private void stopCamera(SurfaceTexture surfacetexture)
    {
        surfacetexture.setOnFrameAvailableListener(null);
    }

    public void dispose()
    {
        Log.d("AddLive_SDK_FCam", "dispose");
        Context context = mContext.getApplicationContext();
        if (context instanceof Application)
        {
            ((Application)context).unregisterActivityLifecycleCallbacks(this);
        }
        mGLSurfaceView = null;
        mRenderer = null;
        mCamera = null;
    }

    public List getCameraDevices()
    {
        return mCamera.getCameraDevices();
    }

    public String getDevice()
    {
        return mCamera.getDevice();
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        Log.d("AddLive_SDK_FCam", "onActivityCreated");
    }

    public void onActivityDestroyed(Activity activity)
    {
        Log.d("AddLive_SDK_FCam", "onActivityDestroyed");
    }

    public void onActivityPaused(Activity activity)
    {
        Log.d("AddLive_SDK_FCam", "onActivityPaused");
        mRenderer.stopCamera();
        mCamera.stop();
        mGLSurfaceView.onPause();
    }

    public void onActivityResumed(Activity activity)
    {
        Log.d("AddLive_SDK_FCam", "onActivityResumed");
        mCamera.configure();
        mGLSurfaceView.onResume();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        Log.d("AddLive_SDK_FCam", "onActivitySaveInst");
    }

    public void onActivityStarted(Activity activity)
    {
        Log.d("AddLive_SDK_FCam", "onActivityStarted");
    }

    public void onActivityStopped(Activity activity)
    {
        Log.d("AddLive_SDK_FCam", "onActivityStopped");
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        mGLSurfaceView.queueEvent(new Runnable() {

            int deviceOrient;
            long now;
            int orient;
            final ADLCameraFrameLayout this$0;
            WindowManager wm;

            public void run()
            {
                mRenderer.drawFrame(orient, deviceOrient, now);
            }

            
            {
                this$0 = ADLCameraFrameLayout.this;
                super();
                orient = mCamera.getOrientation();
                now = System.currentTimeMillis();
                wm = (WindowManager)mContext.getSystemService("window");
                deviceOrient = wm.getDefaultDisplay().getRotation();
            }
        });
        mGLSurfaceView.requestRender();
    }

    public int processProperty(String s, String s1)
    {
        return mCamera.processProperty(s, s1);
    }

    public void setDevice(String s)
    {
        mCamera.setDevice(s);
        mCamera.stop();
        mCamera.configure();
        mRenderer.startCamera();
    }

    public void start(Object obj)
    {
        Log.d("AddLive_SDK_FCam", "start");
        if (!(obj instanceof FrameLayout))
        {
            throw new IllegalArgumentException("ADLCameraFrameLayout expects a FrameLayout object");
        } else
        {
            stop();
            mCamera.configure();
            mFrameLayout = (FrameLayout)obj;
            mFrameLayout.addView(mGLSurfaceView, new android.widget.LinearLayout.LayoutParams(-1, -1));
            return;
        }
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("AddLive_SDK_FCam", "stop");
        mRenderer.stopCamera();
        mCamera.stop();
        Exception exception;
        try
        {
            mFrameLayout.removeView(mGLSurfaceView);
            mFrameLayout = null;
        }
        catch (Exception exception1) { }
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }








}
