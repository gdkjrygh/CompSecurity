// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.microsoft.dl.utils.Log;
import java.io.Closeable;

public class DummyPreviewSurface
    implements Closeable
{
    private static class DummySurfaceHolder
        implements SurfaceHolder
    {

        private final Surface a;

        public void addCallback(android.view.SurfaceHolder.Callback callback)
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

        public void removeCallback(android.view.SurfaceHolder.Callback callback)
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

        public DummySurfaceHolder(SurfaceTexture surfacetexture)
        {
            a = new Surface(surfacetexture);
        }
    }

    private static class OnFrameAvailableListener
        implements android.graphics.SurfaceTexture.OnFrameAvailableListener
    {

        public void onFrameAvailable(SurfaceTexture surfacetexture)
        {
            if (Log.isLoggable("Capture", 3))
            {
                Log.d("Capture", "Preview frame skipped");
            }
        }

        private OnFrameAvailableListener()
        {
        }

        OnFrameAvailableListener(byte byte0)
        {
            this();
        }
    }


    private int a;
    private final SurfaceTexture b;
    private final DummySurfaceHolder c;

    public DummyPreviewSurface()
    {
        a = -1;
        int ai[];
        try
        {
            ai = new int[1];
        }
        catch (RuntimeException runtimeexception)
        {
            close();
            throw runtimeexception;
        }
        ai[0] = -1;
        GLES20.glGenTextures(1, ai, 0);
        a = ai[0];
        b = new SurfaceTexture(a);
        b.setOnFrameAvailableListener(new OnFrameAvailableListener((byte)0));
        c = new DummySurfaceHolder(b);
        return;
    }

    public final void close()
    {
        if (c != null)
        {
            c.getSurface().release();
        }
        if (b != null)
        {
            b.release();
        }
        if (a >= 0)
        {
            GLES20.glDeleteTextures(1, new int[] {
                a
            }, 0);
        }
    }

    public final SurfaceHolder getSurfaceHolder()
    {
        return c;
    }

    public final SurfaceTexture getSurfaceTexture()
    {
        return b;
    }
}
