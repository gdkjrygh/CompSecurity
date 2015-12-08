// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.gl;

import android.graphics.SurfaceTexture;

class SurfaceTextureListener
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    static final boolean $assertionsDisabled;
    private final long mNativeSurfaceTextureListener;

    SurfaceTextureListener(long l)
    {
        if (!$assertionsDisabled && l == 0L)
        {
            throw new AssertionError();
        } else
        {
            mNativeSurfaceTextureListener = l;
            return;
        }
    }

    private native void nativeDestroy(long l);

    private native void nativeFrameAvailable(long l);

    protected void finalize()
        throws Throwable
    {
        nativeDestroy(mNativeSurfaceTextureListener);
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        nativeFrameAvailable(mNativeSurfaceTextureListener);
    }

    static 
    {
        boolean flag;
        if (!org/chromium/ui/gl/SurfaceTextureListener.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
