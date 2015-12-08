// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import android.graphics.SurfaceTexture;
import com.addlive.impl.Log;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.addlive.view:
//            VideoViewType

public class GLThread extends Thread
{
    abstract class BaseConfigChooser
        implements EGLConfigChooser
    {

        protected int mConfigSpec[];
        final GLThread this$0;

        private int[] filterConfigSpec(int ai[])
        {
            int i = ai.length;
            int ai1[] = new int[i + 2];
            System.arraycopy(ai, 0, ai1, 0, i - 1);
            ai1[i - 1] = 12352;
            ai1[i] = 4;
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
            this$0 = GLThread.this;
            super();
            mConfigSpec = filterConfigSpec(ai);
        }
    }

    class CircleEGLConfigChooser extends ComponentSizeChooser
    {

        final GLThread this$0;

        public CircleEGLConfigChooser(boolean flag)
        {
            this$0 = GLThread.this;
            byte byte0;
            if (flag)
            {
                byte0 = 16;
            } else
            {
                byte0 = 0;
            }
            super(8, 8, 8, 8, byte0, 0);
        }
    }

    class ComponentSizeChooser extends BaseConfigChooser
    {

        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int mValue[];
        final GLThread this$0;

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
            this$0 = GLThread.this;
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

    class DefaultContextFactory
        implements EGLContextFactory
    {

        private int EGL_CONTEXT_CLIENT_VERSION;
        final GLThread this$0;

        public EGLContext createContext(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
        {
            int i = EGL_CONTEXT_CLIENT_VERSION;
            return egl10.eglCreateContext(egldisplay, eglconfig, EGL10.EGL_NO_CONTEXT, new int[] {
                i, 2, 12344
            });
        }

        public void destroyContext(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
        {
            if (!egl10.eglDestroyContext(egldisplay, eglcontext))
            {
                Log.e("DefaultContextFactory", (new StringBuilder("display:")).append(egldisplay).append(" context: ").append(eglcontext).toString());
                throw new RuntimeException("eglDestroyContext failed: ");
            } else
            {
                return;
            }
        }

        private DefaultContextFactory()
        {
            this$0 = GLThread.this;
            super();
            EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

    }

    static class DefaultWindowSurfaceFactory
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
                Log.e("AddLive_SDK", "eglCreateWindowSurface", egl10);
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

    class EglHelper
    {

        EGLConfigChooser mEGLConfigChooser;
        EGLContextFactory mEGLContextFactory;
        EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
        EGL10 mEgl;
        EGLConfig mEglConfig;
        EGLContext mEglContext;
        EGLDisplay mEglDisplay;
        EGLSurface mEglSurface;
        final GLThread this$0;

        private void throwEglException(String s)
        {
            throwEglException(s, mEgl.eglGetError());
        }

        private void throwEglException(String s, int i)
        {
            throw new RuntimeException((new StringBuilder()).append(s).append(" failed: ").append(i).toString());
        }

        public GL createSurface(SurfaceTexture surfacetexture)
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
            if (mEglSurface != null && mEglSurface != EGL10.EGL_NO_SURFACE)
            {
                mEgl.eglMakeCurrent(mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                mEGLWindowSurfaceFactory.destroySurface(mEgl, mEglDisplay, mEglSurface);
            }
            mEglSurface = mEGLWindowSurfaceFactory.createWindowSurface(mEgl, mEglDisplay, mEglConfig, surfacetexture);
            if (mEglSurface == null || mEglSurface == EGL10.EGL_NO_SURFACE)
            {
                if (mEgl.eglGetError() == 12299)
                {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return null;
            }
            if (!mEgl.eglMakeCurrent(mEglDisplay, mEglSurface, mEglSurface, mEglContext))
            {
                throwEglException("eglMakeCurrent");
            }
            return mEglContext.getGL();
        }

        public void destroySurface()
        {
            if (mEglSurface != null && mEglSurface != EGL10.EGL_NO_SURFACE)
            {
                mEgl.eglMakeCurrent(mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                mEGLWindowSurfaceFactory.destroySurface(mEgl, mEglDisplay, mEglSurface);
                mEglSurface = null;
            }
        }

        public void finish()
        {
            if (mEglContext != null)
            {
                mEGLContextFactory.destroyContext(mEgl, mEglDisplay, mEglContext);
                mEglContext = null;
            }
            if (mEglDisplay != null)
            {
                mEgl.eglTerminate(mEglDisplay);
                mEglDisplay = null;
            }
        }

        public void purgeBuffers()
        {
            mEgl.eglMakeCurrent(mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            mEgl.eglMakeCurrent(mEglDisplay, mEglSurface, mEglSurface, mEglContext);
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
            mEglConfig = mEGLConfigChooser.chooseConfig(mEgl, mEglDisplay);
            mEglContext = mEGLContextFactory.createContext(mEgl, mEglDisplay, mEglConfig);
            if (mEglContext == null || mEglContext == EGL10.EGL_NO_CONTEXT)
            {
                mEglContext = null;
                throwEglException("createContext");
            }
            mEglSurface = null;
        }

        public boolean swap()
        {
            if (mEgl.eglSwapBuffers(mEglDisplay, mEglSurface)) goto _L2; else goto _L1
_L1:
            int i = mEgl.eglGetError();
            i;
            JVM INSTR tableswitch 12299 12302: default 60
        //                       12299 71
        //                       12300 60
        //                       12301 60
        //                       12302 69;
               goto _L3 _L4 _L3 _L3 _L5
_L3:
            throwEglException("eglSwapBuffers", i);
_L2:
            return true;
_L5:
            return false;
_L4:
            Log.e("EglHelper", (new StringBuilder("eglSwapBuffers returned EGL_BAD_NATIVE_WINDOW. tid=")).append(Thread.currentThread().getId()).toString());
            if (true) goto _L2; else goto _L6
_L6:
        }

        public EglHelper()
        {
            this$0 = GLThread.this;
            super();
            if (type == VideoViewType.CIRCLE)
            {
                mEGLConfigChooser = new CircleEGLConfigChooser(true);
            } else
            {
                mEGLConfigChooser = new SimpleEGLConfigChooser(true);
            }
            mEGLContextFactory = new DefaultContextFactory();
            mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
    }

    static class GLThreadManager
    {

        private static String TAG = "GLThreadManager";
        private static final String kADRENO = "Adreno";
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
                mMultipleGLESContextsAllowed = true;
                mGLESVersionCheckComplete = true;
            }
        }

        public void checkGLDriver(GL10 gl10)
        {
            boolean flag1 = false;
            this;
            JVM INSTR monitorenter ;
            if (mGLESDriverCheckComplete) goto _L2; else goto _L1
_L1:
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
            if (!mMultipleGLESContextsAllowed) goto _L4; else goto _L3
_L3:
            flag = flag1;
            if (!gl10.startsWith("Adreno")) goto _L5; else goto _L4
_L5:
            mLimitedGLESContexts = flag;
            mGLESDriverCheckComplete = true;
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
            gl10;
            throw gl10;
_L4:
            flag = true;
            if (true) goto _L5; else goto _L6
_L6:
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

    class SimpleEGLConfigChooser extends ComponentSizeChooser
    {

        final GLThread this$0;

        public SimpleEGLConfigChooser(boolean flag)
        {
            this$0 = GLThread.this;
            byte byte0;
            if (flag)
            {
                byte0 = 16;
            } else
            {
                byte0 = 0;
            }
            super(5, 6, 5, 0, byte0, 0);
        }
    }


    private static final GLThreadManager sGLThreadManager = new GLThreadManager();
    private EglHelper mEglHelper;
    private ArrayList mEventQueue;
    private boolean mExited;
    private boolean mHasSurface;
    private boolean mHaveEglContext;
    private boolean mHaveEglSurface;
    private int mHeight;
    private boolean mPaused;
    private boolean mPreserveEGLContextOnPause;
    private boolean mRenderComplete;
    private android.opengl.GLSurfaceView.Renderer mRenderer;
    private boolean mRequestPaused;
    private boolean mRequestRender;
    private boolean mShouldExit;
    private boolean mShouldReleaseEglContext;
    private boolean mSizeChanged;
    private boolean mWaitingForSurface;
    private int mWidth;
    private SurfaceTexture surface;
    private VideoViewType type;

    GLThread(android.opengl.GLSurfaceView.Renderer renderer, VideoViewType videoviewtype)
    {
        mEventQueue = new ArrayList();
        mPreserveEGLContextOnPause = true;
        mSizeChanged = false;
        mWidth = 0;
        mHeight = 0;
        mRequestRender = true;
        mRenderer = renderer;
        mPaused = false;
        type = videoviewtype;
    }

    private void checkRenderThreadState()
    {
    }

    private void guardedRun()
    {
        int i;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag1;
        mEglHelper = new EglHelper();
        mHaveEglContext = false;
        mHaveEglSurface = false;
        obj2 = null;
        obj = null;
        i1 = 0;
        l1 = 0;
        j = 0;
        k1 = 0;
        j1 = 0;
        k = 0;
        flag1 = false;
        i = 0;
_L12:
        GLThreadManager glthreadmanager = sGLThreadManager;
        glthreadmanager;
        JVM INSTR monitorenter ;
        int l;
        l = k;
        k = l1;
_L10:
        if (!mShouldExit)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        glthreadmanager;
        JVM INSTR monitorexit ;
        synchronized (sGLThreadManager)
        {
            stopEglSurfaceLocked();
            stopEglContextLocked();
        }
        return;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        if (mEventQueue.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = (Runnable)mEventQueue.remove(0);
        l1 = j1;
        j1 = k1;
        int i2 = j;
        k1 = k;
        j = i1;
        k = l;
        i1 = i2;
        l = k1;
        k1 = l1;
_L7:
        glthreadmanager;
        JVM INSTR monitorexit ;
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Runnable) (obj)).run();
        l1 = j1;
        j1 = k1;
        obj = null;
        k1 = j;
        j = i1;
        i1 = k1;
        k1 = l1;
        l1 = l;
        continue; /* Loop/switch isn't completed */
_L2:
        if (mPaused != mRequestPaused)
        {
            mPaused = mRequestPaused;
            sGLThreadManager.notifyAll();
        }
        l1 = i1;
        if (!mShouldReleaseEglContext)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        stopEglSurfaceLocked();
        stopEglContextLocked();
        mShouldReleaseEglContext = false;
        l1 = 1;
        boolean flag;
        flag = k;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        stopEglSurfaceLocked();
        stopEglContextLocked();
        flag = false;
        if (mHaveEglSurface && mPaused)
        {
            stopEglSurfaceLocked();
            if (!mPreserveEGLContextOnPause || sGLThreadManager.shouldReleaseEGLContextWhenPausing())
            {
                stopEglContextLocked();
            }
            if (sGLThreadManager.shouldTerminateEGLWhenPausing())
            {
                mEglHelper.finish();
            }
        }
        if (!mHasSurface && !mWaitingForSurface)
        {
            if (mHaveEglSurface)
            {
                stopEglSurfaceLocked();
            }
            mWaitingForSurface = true;
            sGLThreadManager.notifyAll();
        }
        if (mHasSurface && mWaitingForSurface)
        {
            mWaitingForSurface = false;
            sGLThreadManager.notifyAll();
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        mRenderComplete = true;
        sGLThreadManager.notifyAll();
        int j2;
        int k2;
        int l2;
        int i3;
        j2 = l1;
        i3 = k1;
        k2 = j1;
        l2 = l;
        if (!readyToDraw())
        {
            break MISSING_BLOCK_LABEL_664;
        }
        i1 = l1;
        k = l;
        if (mHaveEglContext) goto _L4; else goto _L3
_L3:
        if (l1 == 0) goto _L6; else goto _L5
_L5:
        i1 = 0;
        k = l;
_L4:
        l1 = k1;
        l = j1;
        if (!mHaveEglContext)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        l1 = k1;
        l = j1;
        if (mHaveEglSurface)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        mHaveEglSurface = true;
        l = 1;
        l1 = 1;
        j2 = i1;
        i3 = l1;
        k2 = l;
        l2 = k;
        if (!mHaveEglSurface)
        {
            break MISSING_BLOCK_LABEL_664;
        }
        if (!mSizeChanged)
        {
            break MISSING_BLOCK_LABEL_542;
        }
        l1 = 1;
        j = mWidth;
        i = mHeight;
        mSizeChanged = false;
        mRequestRender = false;
        sGLThreadManager.notifyAll();
        j1 = l1;
        l1 = i1;
        k1 = l;
        l = ((flag) ? 1 : 0);
        i1 = j;
        j = l1;
          goto _L7
_L6:
        boolean flag2 = sGLThreadManager.tryAcquireEglContextLocked(this);
        i1 = l1;
        k = l;
        if (!flag2) goto _L4; else goto _L8
_L8:
        mEglHelper.start();
        mHaveEglContext = true;
        k = 1;
        sGLThreadManager.notifyAll();
        i1 = l1;
          goto _L4
        Exception exception;
        exception;
        glthreadmanager;
        JVM INSTR monitorexit ;
        throw exception;
        obj2;
        synchronized (sGLThreadManager)
        {
            stopEglSurfaceLocked();
            stopEglContextLocked();
        }
        throw obj2;
        obj1;
        sGLThreadManager.releaseEglContextLocked(this);
        throw obj1;
        sGLThreadManager.wait();
        i1 = j2;
        k1 = i3;
        k = ((flag) ? 1 : 0);
        j1 = k2;
        l = l2;
        if (true) goto _L10; else goto _L9
_L9:
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_757;
        }
        obj2 = (GL10)mEglHelper.createSurface(surface);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_747;
        }
        Log.e("AddLive_SDK", "Failed to create an OpenGL Surface. Ending the GLThread run loop");
        synchronized (sGLThreadManager)
        {
            stopEglSurfaceLocked();
            stopEglContextLocked();
        }
        return;
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        sGLThreadManager.checkGLDriver(((GL10) (obj2)));
        k1 = 0;
        flag = k;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_786;
        }
        mRenderer.onSurfaceCreated(((GL10) (obj2)), mEglHelper.mEglConfig);
        flag = false;
        l1 = j1;
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_819;
        }
        mEglHelper.purgeBuffers();
        mRenderer.onSurfaceChanged(((GL10) (obj2)), i1, i);
        l1 = 0;
        mRenderer.onDrawFrame(((GL10) (obj2)));
        flag2 = mEglHelper.swap();
        if (!flag2)
        {
            k = 1;
        } else
        {
            k = l;
        }
        j1 = k1;
        flag1 = true;
        l = j;
        j = i1;
        i1 = l;
        k1 = l1;
        l1 = k;
        k = ((flag) ? 1 : 0);
        if (true) goto _L12; else goto _L11
_L11:
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private boolean readyToDraw()
    {
        return !mPaused && mHasSurface && mWidth > 0 && mHeight > 0 && mRequestRender;
    }

    private void stopEglContextLocked()
    {
        if (mHaveEglContext)
        {
            mEglHelper.finish();
            mHaveEglContext = false;
            sGLThreadManager.releaseEglContextLocked(this);
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

    private void waitForRenderComplete()
    {
        while (!mExited && !mPaused && !mRenderComplete && ableToDraw()) 
        {
            try
            {
                sGLThreadManager.wait();
            }
            catch (InterruptedException interruptedexception)
            {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean ableToDraw()
    {
        return mHaveEglContext && mHaveEglSurface && readyToDraw();
    }

    public void onPause()
    {
        GLThreadManager glthreadmanager = sGLThreadManager;
        glthreadmanager;
        JVM INSTR monitorenter ;
        mRequestPaused = true;
        sGLThreadManager.notifyAll();
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
        sGLThreadManager.wait();
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
        GLThreadManager glthreadmanager = sGLThreadManager;
        glthreadmanager;
        JVM INSTR monitorenter ;
        mRequestPaused = false;
        mRequestRender = true;
        mRenderComplete = false;
        sGLThreadManager.notifyAll();
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
        sGLThreadManager.wait();
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
        synchronized (sGLThreadManager)
        {
            mWidth = i;
            mHeight = j;
            mSizeChanged = true;
            mRequestRender = true;
            mRenderComplete = false;
            sGLThreadManager.notifyAll();
            waitForRenderComplete();
        }
        return;
        exception;
        glthreadmanager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void queueEvent(Runnable runnable)
    {
        if (runnable == null)
        {
            throw new IllegalArgumentException("r must not be null");
        }
        synchronized (sGLThreadManager)
        {
            mEventQueue.add(runnable);
            sGLThreadManager.notifyAll();
        }
        return;
        runnable;
        glthreadmanager;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public void requestExitAndWait()
    {
        GLThreadManager glthreadmanager = sGLThreadManager;
        glthreadmanager;
        JVM INSTR monitorenter ;
        mShouldExit = true;
        sGLThreadManager.notifyAll();
_L1:
        boolean flag = mExited;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        sGLThreadManager.wait();
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
        sGLThreadManager.notifyAll();
    }

    public void requestRender()
    {
        synchronized (sGLThreadManager)
        {
            mRequestRender = true;
            mRenderComplete = false;
            sGLThreadManager.notifyAll();
        }
        return;
        exception;
        glthreadmanager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        setName((new StringBuilder("GLThread ")).append(getId()).toString());
        guardedRun();
        sGLThreadManager.threadExiting(this);
        return;
        Object obj;
        obj;
        Log.e("AddLive_SDK", "Got an error during rendering loop", ((Throwable) (obj)));
        sGLThreadManager.threadExiting(this);
        return;
        obj;
        sGLThreadManager.threadExiting(this);
        throw obj;
    }

    public void setSurface(SurfaceTexture surfacetexture)
    {
        surface = surfacetexture;
    }

    public void surfaceCreated()
    {
        Log.w("AddLive_SDK", "Processing surface created");
        GLThreadManager glthreadmanager = sGLThreadManager;
        glthreadmanager;
        JVM INSTR monitorenter ;
        mHasSurface = true;
        sGLThreadManager.notifyAll();
_L1:
        boolean flag;
        if (!mWaitingForSurface)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        flag = mExited;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        sGLThreadManager.wait();
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
        Log.w("AddLive_SDK", "surface created processed");
        return;
    }

    public void surfaceDestroyed()
    {
        GLThreadManager glthreadmanager = sGLThreadManager;
        glthreadmanager;
        JVM INSTR monitorenter ;
        mHasSurface = false;
        sGLThreadManager.notifyAll();
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
        sGLThreadManager.wait();
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
    static boolean access$302(GLThread glthread, boolean flag)
    {
        glthread.mExited = flag;
        return flag;
    }

*/
}
