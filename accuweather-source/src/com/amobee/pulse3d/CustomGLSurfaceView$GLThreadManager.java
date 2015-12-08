// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.lang.ref.WeakReference;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.amobee.pulse3d:
//            CustomGLSurfaceView, SystemPropertiesProxy

private static class <init>
{

    private static String TAG = "GLThreadManager";
    private static final int kGLES_20 = 0x20000;
    private static final String kMSM7K_RENDERER_PREFIX = "Q3Dimension MSM7500 ";
    private ReleaseEglContextLocked mEglOwner;
    private boolean mGLESDriverCheckComplete;
    private int mGLESVersion;
    private boolean mGLESVersionCheckComplete;
    private boolean mLimitedGLESContexts;
    private boolean mMultipleGLESContextsAllowed;

    private void checkGLESVersion()
    {
        if (!mGLESVersionCheckComplete)
        {
            mGLESVersion = SystemPropertiesProxy.getInt(((CustomGLSurfaceView)_mth1300(mEglOwner).get()).getContext(), "ro.opengles.version", 0).intValue();
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

    public void releaseEglContextLocked(mGLESDriverCheckComplete mglesdrivercheckcomplete)
    {
        if (mEglOwner == mglesdrivercheckcomplete)
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

    public void threadExiting(mMultipleGLESContextsAllowed mmultipleglescontextsallowed)
    {
        this;
        JVM INSTR monitorenter ;
        _mth1202(mmultipleglescontextsallowed, true);
        if (mEglOwner == mmultipleglescontextsallowed)
        {
            mEglOwner = null;
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        mmultipleglescontextsallowed;
        throw mmultipleglescontextsallowed;
    }

    public boolean tryAcquireEglContextLocked(mEglOwner meglowner)
    {
        if (mEglOwner == meglowner || mEglOwner == null)
        {
            mEglOwner = meglowner;
            notifyAll();
        } else
        {
            checkGLESVersion();
            if (!mMultipleGLESContextsAllowed)
            {
                if (mEglOwner != null)
                {
                    mEglOwner.ReleaseEglContextLocked();
                }
                return false;
            }
        }
        return true;
    }


    private ()
    {
    }

    ( )
    {
        this();
    }
}
