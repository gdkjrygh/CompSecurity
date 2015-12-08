// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;

// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            DummyPreviewSurface

private static class a
    implements SurfaceHolder
{

    private final Surface a;

    public void addCallback(android.view.ace.DummySurfaceHolder dummysurfaceholder)
    {
        throw new UnsupportedOperationException();
    }

    public Surface getSurface()
    {
        return a;
    }

    public Rect getSurfaceFrame()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isCreating()
    {
        throw new UnsupportedOperationException();
    }

    public Canvas lockCanvas()
    {
        throw new UnsupportedOperationException();
    }

    public Canvas lockCanvas(Rect rect)
    {
        throw new UnsupportedOperationException();
    }

    public void removeCallback(android.view.ace.DummySurfaceHolder dummysurfaceholder)
    {
        throw new UnsupportedOperationException();
    }

    public void setFixedSize(int i, int j)
    {
        throw new UnsupportedOperationException();
    }

    public void setFormat(int i)
    {
        throw new UnsupportedOperationException();
    }

    public void setKeepScreenOn(boolean flag)
    {
        throw new UnsupportedOperationException();
    }

    public void setSizeFromLayout()
    {
        throw new UnsupportedOperationException();
    }

    public void setType(int i)
    {
        throw new UnsupportedOperationException();
    }

    public void unlockCanvasAndPost(Canvas canvas)
    {
        throw new UnsupportedOperationException();
    }

    public (SurfaceTexture surfacetexture)
    {
        a = new Surface(surfacetexture);
    }
}
