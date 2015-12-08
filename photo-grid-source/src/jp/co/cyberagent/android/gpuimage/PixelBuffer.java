// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public class PixelBuffer
{

    static final boolean LIST_CONFIGS = false;
    static final String TAG = "PixelBuffer";
    Bitmap mBitmap;
    EGL10 mEGL;
    EGLConfig mEGLConfig;
    EGLConfig mEGLConfigs[];
    EGLContext mEGLContext;
    EGLDisplay mEGLDisplay;
    EGLSurface mEGLSurface;
    GL10 mGL;
    int mHeight;
    android.opengl.GLSurfaceView.Renderer mRenderer;
    String mThreadOwner;
    int mWidth;

    public PixelBuffer(int i, int j)
    {
        mWidth = i;
        mHeight = j;
        int ai[] = new int[2];
        i = mWidth;
        j = mHeight;
        mEGL = (EGL10)EGLContext.getEGL();
        mEGLDisplay = mEGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        mEGL.eglInitialize(mEGLDisplay, ai);
        mEGLConfig = chooseConfig();
        mEGLContext = mEGL.eglCreateContext(mEGLDisplay, mEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        });
        mEGLSurface = mEGL.eglCreatePbufferSurface(mEGLDisplay, mEGLConfig, new int[] {
            12375, i, 12374, j, 12344
        });
        if (mEGL.eglGetError() != 12288)
        {
            destroyEGL();
            throw new IllegalArgumentException();
        } else
        {
            mEGL.eglMakeCurrent(mEGLDisplay, mEGLSurface, mEGLSurface, mEGLContext);
            mGL = (GL10)mEGLContext.getGL();
            mThreadOwner = Thread.currentThread().getName();
            return;
        }
    }

    private EGLConfig chooseConfig()
    {
        int ai[] = new int[15];
        int[] _tmp = ai;
        ai[0] = 12325;
        ai[1] = 0;
        ai[2] = 12326;
        ai[3] = 0;
        ai[4] = 12324;
        ai[5] = 8;
        ai[6] = 12323;
        ai[7] = 8;
        ai[8] = 12322;
        ai[9] = 8;
        ai[10] = 12321;
        ai[11] = 8;
        ai[12] = 12352;
        ai[13] = 4;
        ai[14] = 12344;
        int ai1[] = new int[1];
        mEGL.eglChooseConfig(mEGLDisplay, ai, null, 0, ai1);
        int i = ai1[0];
        mEGLConfigs = new EGLConfig[i];
        mEGL.eglChooseConfig(mEGLDisplay, ai, mEGLConfigs, i, ai1);
        return mEGLConfigs[0];
    }

    private void convertToBitmap()
    {
        int ai[];
        IntBuffer intbuffer;
        int ai1[];
        ai = new int[mWidth * mHeight];
        intbuffer = IntBuffer.allocate(mWidth * mHeight);
        mGL.glReadPixels(0, 0, mWidth, mHeight, 6408, 5121, intbuffer);
        ai1 = intbuffer.array();
        int i = 0;
_L8:
        if (i >= mHeight) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        if (j >= mWidth)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[(mHeight - i - 1) * mWidth + j] = ai1[mWidth * i + j];
        j++;
        if (true) goto _L4; else goto _L3
_L2:
        intbuffer.clear();
        mBitmap = Bitmap.createBitmap(mWidth, mHeight, android.graphics.Bitmap.Config.ARGB_8888);
        mBitmap.copyPixelsFromBuffer(IntBuffer.wrap(ai));
_L6:
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        outofmemoryerror.printStackTrace();
        if (mBitmap == null) goto _L6; else goto _L5
_L5:
        mBitmap.recycle();
        mBitmap = null;
        return;
_L3:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void convertToBitmapOnlyForS4()
    {
        int k = mWidth - mWidth % 8;
        int ai[] = new int[mHeight * k];
        IntBuffer intbuffer = IntBuffer.allocate(mHeight * k);
        mGL.glReadPixels(0, 0, k, mHeight, 6408, 5121, intbuffer);
        int ai1[] = intbuffer.array();
        for (int i = 0; i < mHeight; i++)
        {
            for (int j = 0; j < k; j++)
            {
                ai[(mHeight - i - 1) * k + j] = ai1[i * k + j];
            }

        }

        mBitmap = Bitmap.createBitmap(k, mHeight, android.graphics.Bitmap.Config.ARGB_8888);
        mBitmap.copyPixelsFromBuffer(IntBuffer.wrap(ai));
    }

    private int getConfigAttrib(EGLConfig eglconfig, int i)
    {
        int j = 0;
        int ai[] = new int[1];
        if (mEGL.eglGetConfigAttrib(mEGLDisplay, eglconfig, i, ai))
        {
            j = ai[0];
        }
        return j;
    }

    private void listConfig()
    {
        Log.i("PixelBuffer", "Config List {");
        EGLConfig aeglconfig[] = mEGLConfigs;
        int j = aeglconfig.length;
        for (int i = 0; i < j; i++)
        {
            EGLConfig eglconfig = aeglconfig[i];
            int k = getConfigAttrib(eglconfig, 12325);
            int l = getConfigAttrib(eglconfig, 12326);
            int i1 = getConfigAttrib(eglconfig, 12324);
            int j1 = getConfigAttrib(eglconfig, 12323);
            int k1 = getConfigAttrib(eglconfig, 12322);
            int l1 = getConfigAttrib(eglconfig, 12321);
            Log.i("PixelBuffer", (new StringBuilder("    <d,s,r,g,b,a> = <")).append(k).append(",").append(l).append(",").append(i1).append(",").append(j1).append(",").append(k1).append(",").append(l1).append(">").toString());
        }

        Log.i("PixelBuffer", "}");
    }

    public void destroy()
    {
        mRenderer.onDrawFrame(mGL);
        mRenderer.onDrawFrame(mGL);
        mEGL.eglMakeCurrent(mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        mEGL.eglDestroySurface(mEGLDisplay, mEGLSurface);
        mEGL.eglDestroyContext(mEGLDisplay, mEGLContext);
        mEGL.eglTerminate(mEGLDisplay);
    }

    public void destroyEGL()
    {
        mEGL.eglMakeCurrent(mEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        mEGL.eglDestroySurface(mEGLDisplay, mEGLSurface);
        mEGL.eglDestroyContext(mEGLDisplay, mEGLContext);
        mEGL.eglTerminate(mEGLDisplay);
    }

    public Bitmap getBitmap()
    {
        if (mRenderer == null)
        {
            Log.e("PixelBuffer", "getBitmap: Renderer was not set.");
            return null;
        }
        if (!Thread.currentThread().getName().equals(mThreadOwner))
        {
            Log.e("PixelBuffer", "getBitmap: This thread does not own the OpenGL context.");
            return null;
        }
        mRenderer.onDrawFrame(mGL);
        mRenderer.onDrawFrame(mGL);
        if (phoneModel("GT-I9502") || phoneModel("GT-I9500") || phoneModel("GT-I9505") || phoneModel("GT-I9508") || phoneModel("GT-I959"))
        {
            convertToBitmapOnlyForS4();
        } else
        {
            convertToBitmap();
        }
        return mBitmap;
    }

    public boolean phoneModel(String s)
    {
        String s1 = Build.MODEL;
        String s2 = Build.DEVICE;
        return s1.startsWith(s) || s2.startsWith(s);
    }

    public void setRenderer(android.opengl.GLSurfaceView.Renderer renderer)
    {
        mRenderer = renderer;
        if (!Thread.currentThread().getName().equals(mThreadOwner))
        {
            Log.e("PixelBuffer", "setRenderer: This thread does not own the OpenGL context.");
            return;
        } else
        {
            mRenderer.onSurfaceCreated(mGL, mEGLConfig);
            mRenderer.onSurfaceChanged(mGL, mWidth, mHeight);
            return;
        }
    }
}
