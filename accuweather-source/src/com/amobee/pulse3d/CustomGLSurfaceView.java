// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import android.opengl.GLDebugHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.amobee.pulse3d:
//            SystemPropertiesProxy

public class CustomGLSurfaceView extends SurfaceView
    implements android.view.SurfaceHolder.Callback
{
    private abstract class BaseConfigChooser
        implements EGLConfigChooser
    {

        protected int mConfigSpec[];
        final CustomGLSurfaceView this$0;

        private int[] filterConfigSpec(int ai[])
        {
            if (mEGLContextClientVersion != 2 && mEGLContextClientVersion != 3)
            {
                return ai;
            }
            int i = ai.length;
            int ai1[] = new int[i + 2];
            System.arraycopy(ai, 0, ai1, 0, i - 1);
            ai1[i - 1] = 12352;
            if (mEGLContextClientVersion == 2)
            {
                ai1[i] = 4;
            } else
            {
                ai1[i] = 64;
            }
            ai1[i + 1] = 12344;
            return ai1;
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay)
        {
            int ai[] = new int[1];
            if (!egl10.eglChooseConfig(egldisplay, mConfigSpec, null, 0, ai))
            {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i = ai[0];
            if (i <= 0)
            {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig aeglconfig[] = new EGLConfig[i];
            if (!egl10.eglChooseConfig(egldisplay, mConfigSpec, aeglconfig, i, ai))
            {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            egl10 = chooseConfig(egl10, egldisplay, aeglconfig);
            if (egl10 == null)
            {
                throw new IllegalArgumentException("No config chosen");
            } else
            {
                return egl10;
            }
        }

        abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[]);

        public BaseConfigChooser(int ai[])
        {
            this$0 = CustomGLSurfaceView.this;
            super();
            mConfigSpec = filterConfigSpec(ai);
        }
    }

    private class ComponentSizeChooser extends BaseConfigChooser
    {

        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int mValue[];
        final CustomGLSurfaceView this$0;

        private int findConfigAttrib(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i, int j)
        {
            if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, i, mValue))
            {
                j = mValue[0];
            }
            return j;
        }

        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[])
        {
            int j = aeglconfig.length;
            for (int i = 0; i < j; i++)
            {
                EGLConfig eglconfig = aeglconfig[i];
                int k = findConfigAttrib(egl10, egldisplay, eglconfig, 12325, 0);
                int l = findConfigAttrib(egl10, egldisplay, eglconfig, 12326, 0);
                if (k < mDepthSize || l < mStencilSize)
                {
                    continue;
                }
                k = findConfigAttrib(egl10, egldisplay, eglconfig, 12324, 0);
                l = findConfigAttrib(egl10, egldisplay, eglconfig, 12323, 0);
                int i1 = findConfigAttrib(egl10, egldisplay, eglconfig, 12322, 0);
                int j1 = findConfigAttrib(egl10, egldisplay, eglconfig, 12321, 0);
                if (k == mRedSize && l == mGreenSize && i1 == mBlueSize && j1 == mAlphaSize)
                {
                    return eglconfig;
                }
            }

            return null;
        }

        public ComponentSizeChooser(int i, int j, int k, int l, int i1, int j1)
        {
            this$0 = CustomGLSurfaceView.this;
            super(new int[] {
                12324, i, 12323, j, 12322, k, 12321, l, 12325, i1, 
                12326, j1, 12344
            });
            mValue = new int[1];
            mRedSize = i;
            mGreenSize = j;
            mBlueSize = k;
            mAlphaSize = l;
            mDepthSize = i1;
            mStencilSize = j1;
        }
    }

    private class DefaultContextFactory
        implements EGLContextFactory
    {

        private int EGL_CONTEXT_CLIENT_VERSION;
        final CustomGLSurfaceView this$0;

        public EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
        {
            int ai[] = new int[3];
            ai[0] = EGL_CONTEXT_CLIENT_VERSION;
            ai[1] = mEGLContextClientVersion;
            ai[2] = 12344;
            EGLContext eglcontext = EGL10.EGL_NO_CONTEXT;
            if (mEGLContextClientVersion == 0)
            {
                ai = null;
            }
            return egl10.eglCreateContext(egldisplay, eglconfig, eglcontext, ai);
        }

        public void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
        {
            if (!egl10.eglDestroyContext(egldisplay, eglcontext))
            {
                Log.e("DefaultContextFactory", (new StringBuilder()).append("display:").append(egldisplay).append(" context: ").append(eglcontext).toString());
                EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
            }
        }

        private DefaultContextFactory()
        {
            this$0 = CustomGLSurfaceView.this;
            super();
            EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

    }

    private static class DefaultWindowSurfaceFactory
        implements EGLWindowSurfaceFactory
    {

        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj)
        {
            try
            {
                egl10 = egl10.eglCreateWindowSurface(egldisplay, eglconfig, obj, null);
            }
            // Misplaced declaration of an exception variable
            catch (EGL10 egl10)
            {
                Log.e("CustomGLSurfaceView", "eglCreateWindowSurface", egl10);
                return null;
            }
            return egl10;
        }

        public void destroySurface(EGL10 egl10, EGLDisplay egldisplay, EGLSurface eglsurface)
        {
            egl10.eglDestroySurface(egldisplay, eglsurface);
        }

        private DefaultWindowSurfaceFactory()
        {
        }

    }

    public static interface EGLConfigChooser
    {

        public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay);
    }

    public static interface EGLContextFactory
    {

        public abstract EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig);

        public abstract void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext);
    }

    public static interface EGLWindowSurfaceFactory
    {

        public abstract EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj);

        public abstract void destroySurface(EGL10 egl10, EGLDisplay egldisplay, EGLSurface eglsurface);
    }

    private static class EglHelper
    {

        EGL10 mEgl;
        EGLConfig mEglConfig;
        EGLContext mEglContext;
        EGLDisplay mEglDisplay;
        EGLSurface mEglSurface;
        private WeakReference mGLSurfaceViewWeakRef;

        private void destroySurfaceImp()
        {
            if (mEglSurface != null && mEglSurface != EGL10.EGL_NO_SURFACE)
            {
                mEgl.eglMakeCurrent(mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
                if (customglsurfaceview != null)
                {
                    customglsurfaceview.mEGLWindowSurfaceFactory.destroySurface(mEgl, mEglDisplay, mEglSurface);
                }
                mEglSurface = null;
            }
        }

        public static String formatEglError(String s, int i)
        {
            return (new StringBuilder()).append(s).append(" failed with error: ").append(i).toString();
        }

        public static void logEglErrorAsWarning(String s, String s1, int i)
        {
            Log.w(s, formatEglError(s1, i));
        }

        private void throwEglException(String s)
        {
            throwEglException(s, mEgl.eglGetError());
        }

        public static void throwEglException(String s, int i)
        {
            s = formatEglError(s, i);
            Log.e("EglHelper", (new StringBuilder()).append("throwEglException tid=").append(Thread.currentThread().getId()).append(" ").append(s).toString());
        }

        GL createGL()
        {
            GL gl1 = mEglContext.getGL();
            CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            Object obj = gl1;
            if (customglsurfaceview != null)
            {
                GL gl = gl1;
                if (customglsurfaceview.mGLWrapper != null)
                {
                    gl = customglsurfaceview.mGLWrapper.wrap(gl1);
                }
                obj = gl;
                if ((customglsurfaceview.mDebugFlags & 3) != 0)
                {
                    int i = 0;
                    obj = null;
                    if ((customglsurfaceview.mDebugFlags & 1) != 0)
                    {
                        i = false | true;
                    }
                    if ((customglsurfaceview.mDebugFlags & 2) != 0)
                    {
                        obj = new LogWriter();
                    }
                    obj = GLDebugHelper.wrap(gl, i, ((Writer) (obj)));
                }
            }
            return ((GL) (obj));
        }

        public boolean createSurface()
        {
            if (mEgl == null)
            {
                throw new RuntimeException("egl not initialized");
            }
            if (mEglDisplay == null)
            {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (mEglConfig == null)
            {
                throw new RuntimeException("mEglConfig not initialized");
            }
            destroySurfaceImp();
            CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            if (customglsurfaceview != null)
            {
                mEglSurface = customglsurfaceview.mEGLWindowSurfaceFactory.createWindowSurface(mEgl, mEglDisplay, mEglConfig, customglsurfaceview.getHolder());
            } else
            {
                mEglSurface = null;
            }
            if (mEglSurface == null || mEglSurface == EGL10.EGL_NO_SURFACE)
            {
                if (mEgl.eglGetError() == 12299)
                {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (!mEgl.eglMakeCurrent(mEglDisplay, mEglSurface, mEglSurface, mEglContext))
            {
                logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", mEgl.eglGetError());
                return false;
            } else
            {
                return true;
            }
        }

        public void destroySurface()
        {
            destroySurfaceImp();
        }

        public void finish()
        {
            if (mEglContext != null)
            {
                CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
                if (customglsurfaceview != null)
                {
                    customglsurfaceview.mEGLContextFactory.destroyContext(mEgl, mEglDisplay, mEglContext);
                }
                mEglContext = null;
            }
            if (mEglDisplay != null)
            {
                mEgl.eglTerminate(mEglDisplay);
                mEglDisplay = null;
            }
        }

        public void start()
        {
            mEgl = (EGL10)EGLContext.getEGL();
            mEglDisplay = mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (mEglDisplay == EGL10.EGL_NO_DISPLAY)
            {
                throw new RuntimeException("eglGetDisplay failed");
            }
            int ai[] = new int[2];
            if (!mEgl.eglInitialize(mEglDisplay, ai))
            {
                throw new RuntimeException("eglInitialize failed");
            }
            CustomGLSurfaceView customglsurfaceview = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            if (customglsurfaceview == null)
            {
                mEglConfig = null;
                mEglContext = null;
            } else
            {
                mEglConfig = customglsurfaceview.mEGLConfigChooser.chooseConfig(mEgl, mEglDisplay);
                mEglContext = customglsurfaceview.mEGLContextFactory.createContext(mEgl, mEglDisplay, mEglConfig);
            }
            if (mEglContext == null || mEglContext == EGL10.EGL_NO_CONTEXT)
            {
                mEglContext = null;
                throwEglException("createContext");
            }
            mEglSurface = null;
        }

        public int swap()
        {
            if (!mEgl.eglSwapBuffers(mEglDisplay, mEglSurface))
            {
                return mEgl.eglGetError();
            } else
            {
                return 12288;
            }
        }

        public EglHelper(WeakReference weakreference)
        {
            mGLSurfaceViewWeakRef = weakreference;
        }
    }

    static class GLThread extends Thread
    {

        private EglHelper mEglHelper;
        private ArrayList mEventQueue;
        private boolean mExited;
        private boolean mFinishedCreatingEglSurface;
        private WeakReference mGLSurfaceViewWeakRef;
        private boolean mHasSurface;
        private boolean mHaveEglContext;
        private boolean mHaveEglSurface;
        private int mHeight;
        private boolean mPaused;
        private boolean mRenderComplete;
        private int mRenderMode;
        private boolean mRequestPaused;
        private boolean mRequestRender;
        private boolean mShouldExit;
        private boolean mShouldReleaseEglContext;
        private boolean mSizeChanged;
        private boolean mSurfaceIsBad;
        private boolean mWaitingForSurface;
        private int mWidth;

        private void guardedRun()
            throws InterruptedException
        {
            GL10 gl10;
            int i;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int i2;
            int j2;
            int i3;
            mEglHelper = new EglHelper(mGLSurfaceViewWeakRef);
            mHaveEglContext = false;
            mHaveEglSurface = false;
            gl10 = null;
            l = 0;
            i = 0;
            j = 0;
            k1 = 0;
            k = 0;
            i1 = 0;
            j1 = 0;
            i3 = 0;
            i2 = 0;
            j2 = 0;
            obj = null;
_L3:
            Object obj2 = CustomGLSurfaceView.sGLThreadManager;
            obj2;
            JVM INSTR monitorenter ;
            int l1;
            int l2;
            l2 = k1;
            l1 = j1;
            j1 = i3;
_L18:
            if (!mShouldExit)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            obj2;
            JVM INSTR monitorexit ;
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                stopEglSurfaceLocked();
                stopEglContextLocked();
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            if (mEventQueue.isEmpty()) goto _L2; else goto _L1
_L1:
            obj1 = (Runnable)mEventQueue.remove(0);
            int k2;
            int k4;
            int l4;
            k2 = i1;
            l4 = i2;
            i1 = k;
            k = l2;
            k4 = j2;
            l2 = l1;
            k1 = i;
            i = l;
            l1 = j1;
_L15:
            obj2;
            JVM INSTR monitorexit ;
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_850;
            }
            ((Runnable) (obj1)).run();
            obj = null;
            i3 = l1;
            l = i;
            i = k1;
            j1 = l2;
            j2 = k4;
            k1 = k;
            k = i1;
            i2 = l4;
            i1 = k2;
              goto _L3
_L2:
            boolean flag = false;
            if (mPaused != mRequestPaused)
            {
                flag = mRequestPaused;
                mPaused = mRequestPaused;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            k1 = j1;
            if (!mShouldReleaseEglContext)
            {
                break MISSING_BLOCK_LABEL_284;
            }
            stopEglSurfaceLocked();
            stopEglContextLocked();
            mShouldReleaseEglContext = false;
            k1 = 1;
            k2 = l2;
            if (l2 == 0)
            {
                break MISSING_BLOCK_LABEL_304;
            }
            stopEglSurfaceLocked();
            stopEglContextLocked();
            k2 = 0;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_320;
            }
            if (mHaveEglSurface)
            {
                stopEglSurfaceLocked();
            }
            if (!flag) goto _L5; else goto _L4
_L4:
            if (!mHaveEglContext) goto _L5; else goto _L6
_L6:
            obj1 = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            if (obj1 != null) goto _L8; else goto _L7
_L7:
            boolean flag1 = false;
_L16:
            if (!flag1) goto _L10; else goto _L9
_L9:
            if (!CustomGLSurfaceView.sGLThreadManager.shouldReleaseEGLContextWhenPausing()) goto _L5; else goto _L10
_L10:
            stopEglContextLocked();
_L5:
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_389;
            }
            if (CustomGLSurfaceView.sGLThreadManager.shouldTerminateEGLWhenPausing())
            {
                mEglHelper.finish();
            }
            if (!mHasSurface && !mWaitingForSurface)
            {
                if (mHaveEglSurface)
                {
                    stopEglSurfaceLocked();
                }
                mWaitingForSurface = true;
                mSurfaceIsBad = false;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            if (mHasSurface && mWaitingForSurface)
            {
                mWaitingForSurface = false;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            l2 = l1;
            i3 = i1;
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_485;
            }
            i3 = 0;
            l2 = 0;
            mRenderComplete = true;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
            int j3;
            int k3;
            int l3;
            int i4;
            int j4;
            j3 = k1;
            l3 = l;
            i4 = i;
            j4 = j;
            k3 = k;
            if (!readyToDraw())
            {
                break MISSING_BLOCK_LABEL_809;
            }
            j1 = k1;
            i1 = l;
            if (mHaveEglContext) goto _L12; else goto _L11
_L11:
            if (k1 == 0) goto _L14; else goto _L13
_L13:
            j1 = 0;
            i1 = l;
_L12:
            l1 = i;
            l = j;
            k1 = k;
            if (!mHaveEglContext)
            {
                break MISSING_BLOCK_LABEL_591;
            }
            l1 = i;
            l = j;
            k1 = k;
            if (mHaveEglSurface)
            {
                break MISSING_BLOCK_LABEL_591;
            }
            mHaveEglSurface = true;
            l1 = 1;
            l = 1;
            k1 = 1;
            j3 = j1;
            l3 = i1;
            i4 = l1;
            j4 = l;
            k3 = k1;
            if (!mHaveEglSurface)
            {
                break MISSING_BLOCK_LABEL_809;
            }
            j = l1;
            k = j2;
            j2 = k1;
            if (!mSizeChanged)
            {
                break MISSING_BLOCK_LABEL_663;
            }
            j2 = 1;
            i2 = mWidth;
            k = mHeight;
            i3 = 1;
            j = 1;
            mSizeChanged = false;
            mRequestRender = false;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
            l1 = j1;
            i = i1;
            k1 = j;
            j = l;
            obj1 = obj;
            k4 = k;
            k = k2;
            i1 = j2;
            l4 = i2;
            k2 = i3;
              goto _L15
            obj;
            obj2;
            JVM INSTR monitorexit ;
            throw obj;
            obj1;
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                stopEglSurfaceLocked();
                stopEglContextLocked();
            }
            throw obj1;
_L8:
            flag1 = ((CustomGLSurfaceView) (obj1)).mPreserveEGLContextOnPause;
              goto _L16
_L14:
            flag = CustomGLSurfaceView.sGLThreadManager.tryAcquireEglContextLocked(this);
            j1 = k1;
            i1 = l;
            if (!flag) goto _L12; else goto _L17
_L17:
            mEglHelper.start();
            mHaveEglContext = true;
            i1 = 1;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
            j1 = k1;
              goto _L12
            obj;
            CustomGLSurfaceView.sGLThreadManager.releaseEglContextLocked(this);
            throw obj;
            CustomGLSurfaceView.sGLThreadManager.wait();
            j1 = j3;
            l = l3;
            i = i4;
            j = j4;
            l1 = l2;
            l2 = k2;
            k = k3;
            i1 = i3;
              goto _L18
            j3 = k1;
            if (k1 == 0) goto _L20; else goto _L19
_L19:
            if (!mEglHelper.createSurface()) goto _L22; else goto _L21
_L21:
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                mFinishedCreatingEglSurface = true;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            j3 = 0;
_L20:
            k3 = j;
            obj2 = gl10;
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_926;
            }
            obj2 = (GL10)mEglHelper.createGL();
            CustomGLSurfaceView.sGLThreadManager.checkGLDriver(((GL10) (obj2)));
            k3 = 0;
            l3 = i;
            if (i == 0) goto _L24; else goto _L23
_L23:
            obj = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            if (obj == null) goto _L26; else goto _L25
_L25:
            ((CustomGLSurfaceView) (obj)).mRenderer.onSurfaceCreated(((GL10) (obj2)), mEglHelper.mEglConfig);
              goto _L26
_L24:
            i4 = i1;
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_1013;
            }
            obj = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_1326;
            }
            ((CustomGLSurfaceView) (obj)).mRenderer.onSurfaceChanged(((GL10) (obj2)), l4, k4);
            break MISSING_BLOCK_LABEL_1326;
_L32:
            obj = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_1039;
            }
            ((CustomGLSurfaceView) (obj)).mRenderer.onDrawFrame(((GL10) (obj2)));
            j4 = k;
            if (!((CustomGLSurfaceView)mGLSurfaceViewWeakRef.get()).mSwapBufferEnabled) goto _L28; else goto _L27
_L27:
            i = mEglHelper.swap();
            j4 = k;
            i;
            JVM INSTR lookupswitch 2: default 1332
        //                       12288: 1132
        //                       12302: 1304;
               goto _L29 _L30 _L31
_L30:
            break; /* Loop/switch isn't completed */
_L29:
            EglHelper.logEglErrorAsWarning("GLThread", "eglSwapBuffers", i);
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                mSurfaceIsBad = true;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            j4 = k;
_L28:
            i3 = l1;
            l = l3;
            i = j3;
            j = k3;
            j1 = l2;
            obj = obj1;
            gl10 = ((GL10) (obj2));
            j2 = k4;
            k1 = j4;
            k = i4;
            i2 = l4;
            i1 = k2;
            if (k2 != 0)
            {
                j1 = 1;
                i3 = l1;
                l = l3;
                i = j3;
                j = k3;
                obj = obj1;
                gl10 = ((GL10) (obj2));
                j2 = k4;
                k1 = j4;
                k = i4;
                i2 = l4;
                i1 = k2;
            }
              goto _L3
            obj1;
            obj;
            JVM INSTR monitorexit ;
            throw obj1;
_L22:
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                mFinishedCreatingEglSurface = true;
                mSurfaceIsBad = true;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            i3 = l1;
            l = i;
            i = k1;
            j1 = l2;
            obj = obj1;
            j2 = k4;
            k1 = k;
            k = i1;
            i2 = l4;
            i1 = k2;
              goto _L3
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
_L31:
            j4 = 1;
              goto _L28
            exception2;
            obj;
            JVM INSTR monitorexit ;
            throw exception2;
            exception3;
            obj;
            JVM INSTR monitorexit ;
            throw exception3;
_L26:
            l3 = 0;
              goto _L24
            i4 = 0;
              goto _L32
        }

        private boolean readyToDraw()
        {
            return !mPaused && mHasSurface && !mSurfaceIsBad && mWidth > 0 && mHeight > 0 && (mRequestRender || mRenderMode == 1);
        }

        private void stopEglContextLocked()
        {
            if (mHaveEglContext)
            {
                mEglHelper.finish();
                mHaveEglContext = false;
                CustomGLSurfaceView.sGLThreadManager.releaseEglContextLocked(this);
            }
        }

        private void stopEglSurfaceLocked()
        {
            if (mHaveEglSurface)
            {
                mHaveEglSurface = false;
                mEglHelper.destroySurface();
            }
        }

        public boolean ableToDraw()
        {
            return mHaveEglContext && mHaveEglSurface && readyToDraw();
        }

        public int getRenderMode()
        {
            int i;
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                i = mRenderMode;
            }
            return i;
            exception;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onPause()
        {
            GLThreadManager glthreadmanager = CustomGLSurfaceView.sGLThreadManager;
            glthreadmanager;
            JVM INSTR monitorenter ;
            mRequestPaused = true;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
_L1:
            boolean flag;
            if (mExited)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            flag = mPaused;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            CustomGLSurfaceView.sGLThreadManager.wait();
              goto _L1
            Object obj;
            obj;
            Thread.currentThread().interrupt();
              goto _L1
            obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
        }

        public void onResume()
        {
            GLThreadManager glthreadmanager = CustomGLSurfaceView.sGLThreadManager;
            glthreadmanager;
            JVM INSTR monitorenter ;
            mRequestPaused = false;
            mRequestRender = true;
            mRenderComplete = false;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
_L1:
            boolean flag;
            if (mExited || !mPaused)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            flag = mRenderComplete;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            CustomGLSurfaceView.sGLThreadManager.wait();
              goto _L1
            Object obj;
            obj;
            Thread.currentThread().interrupt();
              goto _L1
            obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
        }

        public void onWindowResize(int i, int j)
        {
            GLThreadManager glthreadmanager = CustomGLSurfaceView.sGLThreadManager;
            glthreadmanager;
            JVM INSTR monitorenter ;
            mWidth = i;
            mHeight = j;
            mSizeChanged = true;
            mRequestRender = true;
            mRenderComplete = false;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
_L1:
            boolean flag;
            if (mExited || mPaused || mRenderComplete)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            flag = ableToDraw();
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            CustomGLSurfaceView.sGLThreadManager.wait();
              goto _L1
            Object obj;
            obj;
            Thread.currentThread().interrupt();
              goto _L1
            obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
        }

        public void queueEvent(Runnable runnable)
        {
            if (runnable == null)
            {
                throw new IllegalArgumentException("r must not be null");
            }
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                mEventQueue.add(runnable);
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            return;
            runnable;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw runnable;
        }

        public void requestExitAndWait()
        {
            GLThreadManager glthreadmanager = CustomGLSurfaceView.sGLThreadManager;
            glthreadmanager;
            JVM INSTR monitorenter ;
            mShouldExit = true;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
_L1:
            boolean flag = mExited;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            CustomGLSurfaceView.sGLThreadManager.wait();
              goto _L1
            Object obj;
            obj;
            Thread.currentThread().interrupt();
              goto _L1
            obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
        }

        public void requestReleaseEglContextLocked()
        {
            mShouldReleaseEglContext = true;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
        }

        public void requestRender()
        {
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                mRequestRender = true;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            return;
            exception;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void run()
        {
            Exception exception;
            setName((new StringBuilder()).append("GLThread ").append(getId()).toString());
            try
            {
                guardedRun();
            }
            catch (InterruptedException interruptedexception)
            {
                CustomGLSurfaceView.sGLThreadManager.threadExiting(this);
                return;
            }
            finally
            {
                CustomGLSurfaceView.sGLThreadManager.threadExiting(this);
            }
            CustomGLSurfaceView.sGLThreadManager.threadExiting(this);
            return;
            throw exception;
        }

        public void setRenderMode(int i)
        {
            if (i < 0 || i > 1)
            {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (CustomGLSurfaceView.sGLThreadManager)
            {
                mRenderMode = i;
                CustomGLSurfaceView.sGLThreadManager.notifyAll();
            }
            return;
            exception;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void surfaceCreated()
        {
            GLThreadManager glthreadmanager = CustomGLSurfaceView.sGLThreadManager;
            glthreadmanager;
            JVM INSTR monitorenter ;
            mHasSurface = true;
            mFinishedCreatingEglSurface = false;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
_L1:
            boolean flag;
            if (!mWaitingForSurface || mFinishedCreatingEglSurface)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            flag = mExited;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            CustomGLSurfaceView.sGLThreadManager.wait();
              goto _L1
            Object obj;
            obj;
            Thread.currentThread().interrupt();
              goto _L1
            obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
        }

        public void surfaceDestroyed()
        {
            GLThreadManager glthreadmanager = CustomGLSurfaceView.sGLThreadManager;
            glthreadmanager;
            JVM INSTR monitorenter ;
            mHasSurface = false;
            CustomGLSurfaceView.sGLThreadManager.notifyAll();
_L1:
            boolean flag;
            if (mWaitingForSurface)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            flag = mExited;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            CustomGLSurfaceView.sGLThreadManager.wait();
              goto _L1
            Object obj;
            obj;
            Thread.currentThread().interrupt();
              goto _L1
            obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
            throw obj;
            glthreadmanager;
            JVM INSTR monitorexit ;
        }


/*
        static boolean access$1202(GLThread glthread, boolean flag)
        {
            glthread.mExited = flag;
            return flag;
        }

*/


        GLThread(WeakReference weakreference)
        {
            mEventQueue = new ArrayList();
            mSizeChanged = true;
            mWidth = 0;
            mHeight = 0;
            mRequestRender = true;
            mRenderMode = 1;
            mGLSurfaceViewWeakRef = weakreference;
        }
    }

    private static class GLThreadManager
    {

        private static String TAG = "GLThreadManager";
        private static final int kGLES_20 = 0x20000;
        private static final String kMSM7K_RENDERER_PREFIX = "Q3Dimension MSM7500 ";
        private GLThread mEglOwner;
        private boolean mGLESDriverCheckComplete;
        private int mGLESVersion;
        private boolean mGLESVersionCheckComplete;
        private boolean mLimitedGLESContexts;
        private boolean mMultipleGLESContextsAllowed;

        private void checkGLESVersion()
        {
            if (!mGLESVersionCheckComplete)
            {
                mGLESVersion = SystemPropertiesProxy.getInt(((CustomGLSurfaceView)mEglOwner.mGLSurfaceViewWeakRef.get()).getContext(), "ro.opengles.version", 0).intValue();
                if (mGLESVersion >= 0x20000)
                {
                    mMultipleGLESContextsAllowed = true;
                }
                mGLESVersionCheckComplete = true;
            }
        }

        public void checkGLDriver(GL10 gl10)
        {
            boolean flag1 = true;
            this;
            JVM INSTR monitorenter ;
            if (mGLESDriverCheckComplete)
            {
                break MISSING_BLOCK_LABEL_73;
            }
            checkGLESVersion();
            gl10 = gl10.glGetString(7937);
            if (mGLESVersion >= 0x20000)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            boolean flag;
            if (!gl10.startsWith("Q3Dimension MSM7500 "))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mMultipleGLESContextsAllowed = flag;
            notifyAll();
            if (!mMultipleGLESContextsAllowed)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            mLimitedGLESContexts = flag;
            mGLESDriverCheckComplete = true;
            this;
            JVM INSTR monitorexit ;
            return;
            gl10;
            throw gl10;
        }

        public void releaseEglContextLocked(GLThread glthread)
        {
            if (mEglOwner == glthread)
            {
                mEglOwner = null;
            }
            notifyAll();
        }

        public boolean shouldReleaseEGLContextWhenPausing()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = mLimitedGLESContexts;
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        public boolean shouldTerminateEGLWhenPausing()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            checkGLESVersion();
            flag = mMultipleGLESContextsAllowed;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        public void threadExiting(GLThread glthread)
        {
            this;
            JVM INSTR monitorenter ;
            glthread.mExited = true;
            if (mEglOwner == glthread)
            {
                mEglOwner = null;
            }
            notifyAll();
            this;
            JVM INSTR monitorexit ;
            return;
            glthread;
            throw glthread;
        }

        public boolean tryAcquireEglContextLocked(GLThread glthread)
        {
            if (mEglOwner == glthread || mEglOwner == null)
            {
                mEglOwner = glthread;
                notifyAll();
            } else
            {
                checkGLESVersion();
                if (!mMultipleGLESContextsAllowed)
                {
                    if (mEglOwner != null)
                    {
                        mEglOwner.requestReleaseEglContextLocked();
                    }
                    return false;
                }
            }
            return true;
        }


        private GLThreadManager()
        {
        }

    }

    public static interface GLWrapper
    {

        public abstract GL wrap(GL gl);
    }

    static class LogWriter extends Writer
    {

        private StringBuilder mBuilder;

        private void flushBuilder()
        {
            if (mBuilder.length() > 0)
            {
                Log.v("CustomGLSurfaceView", mBuilder.toString());
                mBuilder.delete(0, mBuilder.length());
            }
        }

        public void close()
        {
            flushBuilder();
        }

        public void flush()
        {
            flushBuilder();
        }

        public void write(char ac[], int i, int j)
        {
            int k = 0;
            while (k < j) 
            {
                char c = ac[i + k];
                if (c == '\n')
                {
                    flushBuilder();
                } else
                {
                    mBuilder.append(c);
                }
                k++;
            }
        }

        LogWriter()
        {
            mBuilder = new StringBuilder();
        }
    }

    public static interface Renderer
    {

        public abstract void onDrawFrame(GL10 gl10);

        public abstract void onSurfaceChanged(GL10 gl10, int i, int j);

        public abstract void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig);
    }

    private class SimpleEGLConfigChooser extends ComponentSizeChooser
    {

        final CustomGLSurfaceView this$0;

        public SimpleEGLConfigChooser(boolean flag)
        {
            this$0 = CustomGLSurfaceView.this;
            byte byte0;
            if (flag)
            {
                byte0 = 16;
            } else
            {
                byte0 = 0;
            }
            super(8, 8, 8, 0, byte0, 0);
        }
    }


    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    private static final boolean LOG_ATTACH_DETACH = false;
    private static final boolean LOG_EGL = false;
    private static final boolean LOG_PAUSE_RESUME = false;
    private static final boolean LOG_RENDERER = false;
    private static final boolean LOG_RENDERER_DRAW_FRAME = false;
    private static final boolean LOG_SURFACE = false;
    private static final boolean LOG_THREADS = false;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    private static final String TAG = "CustomGLSurfaceView";
    private static final GLThreadManager sGLThreadManager = new GLThreadManager();
    private int mDebugFlags;
    private boolean mDetached;
    private EGLConfigChooser mEGLConfigChooser;
    private int mEGLContextClientVersion;
    private EGLContextFactory mEGLContextFactory;
    private EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    private GLThread mGLThread;
    private GLWrapper mGLWrapper;
    private boolean mPreserveEGLContextOnPause;
    private Renderer mRenderer;
    private boolean mSwapBufferEnabled;
    private final WeakReference mThisWeakRef;

    public CustomGLSurfaceView(Context context)
    {
        super(context);
        mSwapBufferEnabled = true;
        mThisWeakRef = new WeakReference(this);
        init();
    }

    public CustomGLSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mSwapBufferEnabled = true;
        mThisWeakRef = new WeakReference(this);
        init();
    }

    private void checkRenderThreadState()
    {
        if (mGLThread != null)
        {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        } else
        {
            return;
        }
    }

    private void init()
    {
        getHolder().addCallback(this);
    }

    protected void finalize()
        throws Throwable
    {
        if (mGLThread != null)
        {
            mGLThread.requestExitAndWait();
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public int getDebugFlags()
    {
        return mDebugFlags;
    }

    public boolean getPreserveEGLContextOnPause()
    {
        return mPreserveEGLContextOnPause;
    }

    public int getRenderMode()
    {
        return mGLThread.getRenderMode();
    }

    public boolean isSwapBufferEnabled()
    {
        return mSwapBufferEnabled;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (mDetached && mRenderer != null)
        {
            int i = 1;
            if (mGLThread != null)
            {
                i = mGLThread.getRenderMode();
            }
            mGLThread = new GLThread(mThisWeakRef);
            if (i != 1)
            {
                mGLThread.setRenderMode(i);
            }
            mGLThread.start();
        }
        mDetached = false;
    }

    protected void onDetachedFromWindow()
    {
        if (mGLThread != null)
        {
            mGLThread.requestExitAndWait();
        }
        mDetached = true;
        super.onDetachedFromWindow();
    }

    public void onPause()
    {
        mGLThread.onPause();
    }

    public void onResume()
    {
        mGLThread.onResume();
    }

    public void queueEvent(Runnable runnable)
    {
        mGLThread.queueEvent(runnable);
    }

    public void requestRender()
    {
        mGLThread.requestRender();
    }

    public void setDebugFlags(int i)
    {
        mDebugFlags = i;
    }

    public void setEGLConfigChooser(int i, int j, int k, int l, int i1, int j1)
    {
        setEGLConfigChooser(((EGLConfigChooser) (new ComponentSizeChooser(i, j, k, l, i1, j1))));
    }

    public void setEGLConfigChooser(EGLConfigChooser eglconfigchooser)
    {
        checkRenderThreadState();
        mEGLConfigChooser = eglconfigchooser;
    }

    public void setEGLConfigChooser(boolean flag)
    {
        setEGLConfigChooser(((EGLConfigChooser) (new SimpleEGLConfigChooser(flag))));
    }

    public void setEGLContextClientVersion(int i)
    {
        checkRenderThreadState();
        mEGLContextClientVersion = i;
    }

    public void setEGLContextFactory(EGLContextFactory eglcontextfactory)
    {
        checkRenderThreadState();
        mEGLContextFactory = eglcontextfactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eglwindowsurfacefactory)
    {
        checkRenderThreadState();
        mEGLWindowSurfaceFactory = eglwindowsurfacefactory;
    }

    public void setGLWrapper(GLWrapper glwrapper)
    {
        mGLWrapper = glwrapper;
    }

    public void setPreserveEGLContextOnPause(boolean flag)
    {
        mPreserveEGLContextOnPause = flag;
    }

    public void setRenderMode(int i)
    {
        mGLThread.setRenderMode(i);
    }

    public void setRenderer(Renderer renderer)
    {
        checkRenderThreadState();
        if (mEGLConfigChooser == null)
        {
            mEGLConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (mEGLContextFactory == null)
        {
            mEGLContextFactory = new DefaultContextFactory();
        }
        if (mEGLWindowSurfaceFactory == null)
        {
            mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        mRenderer = renderer;
        mGLThread = new GLThread(mThisWeakRef);
        mGLThread.start();
    }

    public void setSwapBufferEnabled(boolean flag)
    {
        mSwapBufferEnabled = flag;
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        mGLThread.onWindowResize(j, k);
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        mGLThread.surfaceCreated();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        mGLThread.surfaceDestroyed();
    }











}
