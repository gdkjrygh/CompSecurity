// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.addlive.impl.Log;
import com.addlive.impl.cb.ADLInjectFrameCb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCameraFrameLayout

class mFrameReceiver
    implements android.opengl.derer
{

    private int mCamHeight;
    private int mCamWidth;
    private final String mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private ADLInjectFrameCb mFrameReceiver;
    private int mHeight;
    private float mMVPMatrix[];
    private int mProgram;
    private mSurfaceTexture mRenderTextureL;
    private mSurfaceTexture mRenderTextureP;
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
            mRenderTextureL.rawFrame(mSurfaceTexture, mTextureId, f);
            mFrameReceiver.injectFrame(null, mCamWidth, mCamHeight, 0, 0, i, j, l);
        } else
        {
            mRenderTextureP.rawFrame(mSurfaceTexture, mTextureId, f);
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
        mTextureId = ADLCameraFrameLayout.access$500(36197);
        mSurfaceTexture = new SurfaceTexture(mTextureId);
        mRenderTextureL = new it>(ADLCameraFrameLayout.this, mCamWidth, mCamHeight);
        mRenderTextureP = new it>(ADLCameraFrameLayout.this, mCamHeight, mCamWidth);
        mProgram = ADLCameraFrameLayout.access$600("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
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
            ADLCameraFrameLayout.access$300(ADLCameraFrameLayout.this, mSurfaceTexture);
        }
    }

    public void stopCamera()
    {
        if (mSurfaceTexture != null)
        {
            ADLCameraFrameLayout.access$400(ADLCameraFrameLayout.this, mSurfaceTexture);
        }
    }

    public (ADLInjectFrameCb adlinjectframecb, int i, int j)
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
