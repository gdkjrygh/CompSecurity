// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.gl;

import android.graphics.SurfaceTexture;
import android.util.Log;

// Referenced classes of package org.chromium.ui.gl:
//            SurfaceTextureListener

class SurfaceTexturePlatformWrapper
{

    static final boolean $assertionsDisabled;
    private static final String TAG = "SurfaceTexturePlatformWrapper";

    SurfaceTexturePlatformWrapper()
    {
    }

    private static void attachToGLContext(SurfaceTexture surfacetexture, int i)
    {
        if (!$assertionsDisabled && android.os.Build.VERSION.SDK_INT < 16)
        {
            throw new AssertionError();
        } else
        {
            surfacetexture.attachToGLContext(i);
            return;
        }
    }

    private static SurfaceTexture create(int i)
    {
        return new SurfaceTexture(i);
    }

    private static SurfaceTexture createSingleBuffered(int i)
    {
        if (!$assertionsDisabled && android.os.Build.VERSION.SDK_INT < 19)
        {
            throw new AssertionError();
        } else
        {
            return new SurfaceTexture(i, true);
        }
    }

    private static void destroy(SurfaceTexture surfacetexture)
    {
        surfacetexture.setOnFrameAvailableListener(null);
        surfacetexture.release();
    }

    private static void detachFromGLContext(SurfaceTexture surfacetexture)
    {
        if (!$assertionsDisabled && android.os.Build.VERSION.SDK_INT < 16)
        {
            throw new AssertionError();
        } else
        {
            surfacetexture.detachFromGLContext();
            return;
        }
    }

    private static void getTransformMatrix(SurfaceTexture surfacetexture, float af[])
    {
        surfacetexture.getTransformMatrix(af);
    }

    private static void releaseTexImage(SurfaceTexture surfacetexture)
    {
        if (!$assertionsDisabled && android.os.Build.VERSION.SDK_INT < 19)
        {
            throw new AssertionError();
        } else
        {
            surfacetexture.releaseTexImage();
            return;
        }
    }

    private static void setDefaultBufferSize(SurfaceTexture surfacetexture, int i, int j)
    {
        surfacetexture.setDefaultBufferSize(i, j);
    }

    private static void setFrameAvailableCallback(SurfaceTexture surfacetexture, long l)
    {
        surfacetexture.setOnFrameAvailableListener(new SurfaceTextureListener(l));
    }

    private static void updateTexImage(SurfaceTexture surfacetexture)
    {
        try
        {
            surfacetexture.updateTexImage();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceTexture surfacetexture)
        {
            Log.e("SurfaceTexturePlatformWrapper", "Error calling updateTexImage", surfacetexture);
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/ui/gl/SurfaceTexturePlatformWrapper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
