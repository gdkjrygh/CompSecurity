// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;

import android.view.SurfaceHolder;
import android.view.SurfaceView;

// Referenced classes of package com.moodstocks.android.camera:
//            Size

public class CameraPreview
    implements android.view.SurfaceHolder.Callback
{

    private SurfaceHolder holder;
    private Listener listener;
    private SurfaceView preview;

    protected CameraPreview(SurfaceView surfaceview, Listener listener1)
    {
        preview = surfaceview;
        listener = listener1;
        surfaceview.setVisibility(4);
        holder = surfaceview.getHolder();
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            holder.setType(3);
        }
    }

    protected void startAsync()
    {
        holder.addCallback(this);
        preview.setVisibility(0);
    }

    protected void stop()
    {
        preview.setVisibility(4);
        holder.removeCallback(this);
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        listener.onPreviewStarts(surfaceholder, new Size(j, k));
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }

    private class Listener
    {

        public abstract void onPreviewStarts(SurfaceHolder surfaceholder, Size size);
    }

}
