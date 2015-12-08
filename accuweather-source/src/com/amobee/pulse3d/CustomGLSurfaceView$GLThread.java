// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.amobee.pulse3d:
//            CustomGLSurfaceView

static class mGLSurfaceViewWeakRef extends Thread
{

    private  mEglHelper;
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
        mEglHelper = new (mGLSurfaceViewWeakRef);
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
        Object obj2 = CustomGLSurfaceView.access$800();
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
        synchronized (CustomGLSurfaceView.access$800())
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
            CustomGLSurfaceView.access$800().notifyAll();
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
        if (!CustomGLSurfaceView.access$800().shouldReleaseEGLContextWhenPausing()) goto _L5; else goto _L10
_L10:
        stopEglContextLocked();
_L5:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        if (CustomGLSurfaceView.access$800().shouldTerminateEGLWhenPausing())
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
            CustomGLSurfaceView.access$800().notifyAll();
        }
        if (mHasSurface && mWaitingForSurface)
        {
            mWaitingForSurface = false;
            CustomGLSurfaceView.access$800().notifyAll();
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
        CustomGLSurfaceView.access$800().notifyAll();
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
        CustomGLSurfaceView.access$800().notifyAll();
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
        synchronized (CustomGLSurfaceView.access$800())
        {
            stopEglSurfaceLocked();
            stopEglContextLocked();
        }
        throw obj1;
_L8:
        flag1 = CustomGLSurfaceView.access$900(((CustomGLSurfaceView) (obj1)));
          goto _L16
_L14:
        flag = CustomGLSurfaceView.access$800().tryAcquireEglContextLocked(this);
        j1 = k1;
        i1 = l;
        if (!flag) goto _L12; else goto _L17
_L17:
        mEglHelper.start();
        mHaveEglContext = true;
        i1 = 1;
        CustomGLSurfaceView.access$800().notifyAll();
        j1 = k1;
          goto _L12
        obj;
        CustomGLSurfaceView.access$800().releaseEglContextLocked(this);
        throw obj;
        CustomGLSurfaceView.access$800().wait();
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
        synchronized (CustomGLSurfaceView.access$800())
        {
            mFinishedCreatingEglSurface = true;
            CustomGLSurfaceView.access$800().notifyAll();
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
        CustomGLSurfaceView.access$800().checkGLDriver(((GL10) (obj2)));
        k3 = 0;
        l3 = i;
        if (i == 0) goto _L24; else goto _L23
_L23:
        obj = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
        if (obj == null) goto _L26; else goto _L25
_L25:
        CustomGLSurfaceView.access$1000(((CustomGLSurfaceView) (obj))).onSurfaceCreated(((GL10) (obj2)), mEglHelper.mEglConfig);
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
        CustomGLSurfaceView.access$1000(((CustomGLSurfaceView) (obj))).onSurfaceChanged(((GL10) (obj2)), l4, k4);
        break MISSING_BLOCK_LABEL_1326;
_L32:
        obj = (CustomGLSurfaceView)mGLSurfaceViewWeakRef.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1039;
        }
        CustomGLSurfaceView.access$1000(((CustomGLSurfaceView) (obj))).onDrawFrame(((GL10) (obj2)));
        j4 = k;
        if (!CustomGLSurfaceView.access$1100((CustomGLSurfaceView)mGLSurfaceViewWeakRef.get())) goto _L28; else goto _L27
_L27:
        i = mEglHelper.swap();
        j4 = k;
        i;
        JVM INSTR lookupswitch 2: default 1332
    //                   12288: 1132
    //                   12302: 1304;
           goto _L29 _L30 _L31
_L30:
        break; /* Loop/switch isn't completed */
_L29:
        .logEglErrorAsWarning("GLThread", "eglSwapBuffers", i);
        synchronized (CustomGLSurfaceView.access$800())
        {
            mSurfaceIsBad = true;
            CustomGLSurfaceView.access$800().notifyAll();
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
        synchronized (CustomGLSurfaceView.access$800())
        {
            mFinishedCreatingEglSurface = true;
            mSurfaceIsBad = true;
            CustomGLSurfaceView.access$800().notifyAll();
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
            CustomGLSurfaceView.access$800().releaseEglContextLocked(this);
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
        synchronized (CustomGLSurfaceView.access$800())
        {
            i = mRenderMode;
        }
        return i;
        exception;
        anager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onPause()
    {
        anager anager = CustomGLSurfaceView.access$800();
        anager;
        JVM INSTR monitorenter ;
        mRequestPaused = true;
        CustomGLSurfaceView.access$800().notifyAll();
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
        CustomGLSurfaceView.access$800().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        anager;
        JVM INSTR monitorexit ;
        throw obj;
        anager;
        JVM INSTR monitorexit ;
    }

    public void onResume()
    {
        anager anager = CustomGLSurfaceView.access$800();
        anager;
        JVM INSTR monitorenter ;
        mRequestPaused = false;
        mRequestRender = true;
        mRenderComplete = false;
        CustomGLSurfaceView.access$800().notifyAll();
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
        CustomGLSurfaceView.access$800().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        anager;
        JVM INSTR monitorexit ;
        throw obj;
        anager;
        JVM INSTR monitorexit ;
    }

    public void onWindowResize(int i, int j)
    {
        anager anager = CustomGLSurfaceView.access$800();
        anager;
        JVM INSTR monitorenter ;
        mWidth = i;
        mHeight = j;
        mSizeChanged = true;
        mRequestRender = true;
        mRenderComplete = false;
        CustomGLSurfaceView.access$800().notifyAll();
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
        CustomGLSurfaceView.access$800().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        anager;
        JVM INSTR monitorexit ;
        throw obj;
        anager;
        JVM INSTR monitorexit ;
    }

    public void queueEvent(Runnable runnable)
    {
        if (runnable == null)
        {
            throw new IllegalArgumentException("r must not be null");
        }
        synchronized (CustomGLSurfaceView.access$800())
        {
            mEventQueue.add(runnable);
            CustomGLSurfaceView.access$800().notifyAll();
        }
        return;
        runnable;
        anager;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public void requestExitAndWait()
    {
        anager anager = CustomGLSurfaceView.access$800();
        anager;
        JVM INSTR monitorenter ;
        mShouldExit = true;
        CustomGLSurfaceView.access$800().notifyAll();
_L1:
        boolean flag = mExited;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        CustomGLSurfaceView.access$800().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        anager;
        JVM INSTR monitorexit ;
        throw obj;
        anager;
        JVM INSTR monitorexit ;
    }

    public void requestReleaseEglContextLocked()
    {
        mShouldReleaseEglContext = true;
        CustomGLSurfaceView.access$800().notifyAll();
    }

    public void requestRender()
    {
        synchronized (CustomGLSurfaceView.access$800())
        {
            mRequestRender = true;
            CustomGLSurfaceView.access$800().notifyAll();
        }
        return;
        exception;
        anager;
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
            CustomGLSurfaceView.access$800().threadExiting(this);
            return;
        }
        finally
        {
            CustomGLSurfaceView.access$800().threadExiting(this);
        }
        CustomGLSurfaceView.access$800().threadExiting(this);
        return;
        throw exception;
    }

    public void setRenderMode(int i)
    {
        if (i < 0 || i > 1)
        {
            throw new IllegalArgumentException("renderMode");
        }
        synchronized (CustomGLSurfaceView.access$800())
        {
            mRenderMode = i;
            CustomGLSurfaceView.access$800().notifyAll();
        }
        return;
        exception;
        anager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void surfaceCreated()
    {
        anager anager = CustomGLSurfaceView.access$800();
        anager;
        JVM INSTR monitorenter ;
        mHasSurface = true;
        mFinishedCreatingEglSurface = false;
        CustomGLSurfaceView.access$800().notifyAll();
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
        CustomGLSurfaceView.access$800().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        anager;
        JVM INSTR monitorexit ;
        throw obj;
        anager;
        JVM INSTR monitorexit ;
    }

    public void surfaceDestroyed()
    {
        anager anager = CustomGLSurfaceView.access$800();
        anager;
        JVM INSTR monitorenter ;
        mHasSurface = false;
        CustomGLSurfaceView.access$800().notifyAll();
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
        CustomGLSurfaceView.access$800().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        anager;
        JVM INSTR monitorexit ;
        throw obj;
        anager;
        JVM INSTR monitorexit ;
    }


/*
    static boolean access$1202( , boolean flag)
    {
        .mExited = flag;
        return flag;
    }

*/


    mExited(WeakReference weakreference)
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
