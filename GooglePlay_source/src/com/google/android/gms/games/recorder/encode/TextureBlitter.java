// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.gms.games.internal.GamesLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            EglControl

public final class TextureBlitter
{

    static final FloatBuffer FULL_RECTANGLE_BUF = createFloatBuffer(FULL_RECTANGLE_COORDS);
    private static final float FULL_RECTANGLE_COORDS[] = {
        -1F, -1F, 1.0F, -1F, -1F, 1.0F, 1.0F, 1.0F
    };
    static final FloatBuffer FULL_RECTANGLE_TEX_BUF = createFloatBuffer(FULL_RECTANGLE_TEX_COORDS);
    private static final float FULL_RECTANGLE_TEX_COORDS[] = {
        0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F
    };
    static final int VERTEX_COUNT = 4;
    final int mAPositionLoc;
    final int mATextureCoordLoc;
    private final EglControl mEglControl;
    final float mIdentityMatrix[] = new float[16];
    int mProgramHandle;
    final int mUMvpMatrixLoc;
    final int mUTexMatrixLoc;

    public TextureBlitter(EglControl eglcontrol)
    {
        boolean flag = false;
        super();
        mEglControl = eglcontrol;
        Matrix.setIdentityM(mIdentityMatrix, 0);
        int j = EglControl.loadShader(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        int i;
        if (j == 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            int k = EglControl.loadShader(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            i = ((flag) ? 1 : 0);
            if (k != 0)
            {
                i = GLES20.glCreateProgram();
                EglControl.checkGlError("glCreateProgram");
                if (i == 0)
                {
                    GamesLog.e("ScreencastEglState", "Could not create program");
                }
                GLES20.glAttachShader(i, j);
                EglControl.checkGlError("glAttachShader");
                GLES20.glAttachShader(i, k);
                EglControl.checkGlError("glAttachShader");
                GLES20.glLinkProgram(i);
                eglcontrol = new int[1];
                GLES20.glGetProgramiv(i, 35714, eglcontrol, 0);
                if (eglcontrol[0] != 1)
                {
                    GamesLog.e("ScreencastEglState", "Could not link program: ");
                    GamesLog.e("ScreencastEglState", GLES20.glGetProgramInfoLog(i));
                    GLES20.glDeleteProgram(i);
                    i = ((flag) ? 1 : 0);
                }
            }
        }
        mProgramHandle = i;
        if (mProgramHandle == 0)
        {
            throw new RuntimeException("Unable to create program");
        } else
        {
            mAPositionLoc = GLES20.glGetAttribLocation(mProgramHandle, "aPosition");
            checkLocation(mAPositionLoc, "aPosition");
            mATextureCoordLoc = GLES20.glGetAttribLocation(mProgramHandle, "aTextureCoord");
            checkLocation(mATextureCoordLoc, "aTextureCoord");
            mUMvpMatrixLoc = GLES20.glGetUniformLocation(mProgramHandle, "uMVPMatrix");
            checkLocation(mUMvpMatrixLoc, "uMVPMatrix");
            mUTexMatrixLoc = GLES20.glGetUniformLocation(mProgramHandle, "uTexMatrix");
            checkLocation(mUTexMatrixLoc, "uTexMatrix");
            return;
        }
    }

    private static void checkLocation(int i, String s)
    {
        if (i < 0)
        {
            throw new RuntimeException((new StringBuilder("Unable to locate '")).append(s).append("' in program").toString());
        } else
        {
            return;
        }
    }

    private static FloatBuffer createFloatBuffer(float af[])
    {
        Object obj = ByteBuffer.allocateDirect(af.length * 4);
        ((ByteBuffer) (obj)).order(ByteOrder.nativeOrder());
        obj = ((ByteBuffer) (obj)).asFloatBuffer();
        ((FloatBuffer) (obj)).put(af);
        ((FloatBuffer) (obj)).position(0);
        return ((FloatBuffer) (obj));
    }

}
