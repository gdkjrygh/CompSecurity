// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.addlive.impl.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCameraFrameLayout

class mProgram
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

    public (int i, int j)
    {
        this$0 = ADLCameraFrameLayout.this;
        super();
        mMVPMatrix = new float[16];
        mSTMatrix = new float[16];
        mWidth = i;
        mHeight = j;
        mTextureId = ADLCameraFrameLayout.access$500(3553);
        GLES20.glTexImage2D(3553, 0, 6408, mWidth, mHeight, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        mFramebufferId = ADLCameraFrameLayout.access$700(mTextureId);
        mXyzUvBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        mXyzUvBuffer.put(mXyzUv).position(0);
        mProgram = ADLCameraFrameLayout.access$600("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        maPositionHandle = GLES20.glGetAttribLocation(mProgram, "aPosition");
        maTextureHandle = GLES20.glGetAttribLocation(mProgram, "aTextureCoord");
        muMVPMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uMVPMatrix");
        muSTMatrixHandle = GLES20.glGetUniformLocation(mProgram, "uSTMatrix");
        GLES20.glBindFramebuffer(36160, 0);
    }
}
