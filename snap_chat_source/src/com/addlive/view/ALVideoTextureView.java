// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.addlive.impl.Log;
import com.addlive.platform.ADL;
import com.addlive.service.AddLiveService;
import com.addlive.service.InvalidateCb;
import com.addlive.service.RenderRequest;

// Referenced classes of package com.addlive.view:
//            VideoViewType, VideoRenderer, GLThread

public class ALVideoTextureView extends TextureView
    implements android.view.TextureView.SurfaceTextureListener
{
    class InvalidateCallback
        implements InvalidateCb
    {

        final ALVideoTextureView this$0;

        public void invalidate()
        {
            glThread.requestRender();
        }

        private InvalidateCallback()
        {
            this$0 = ALVideoTextureView.this;
            super();
        }

    }


    protected static final String LOG_TAG = "AddLive_SDK";
    protected GLThread glThread;
    protected boolean mirror;
    protected VideoRenderer renderer;
    protected String sinkId;
    protected boolean started;
    protected VideoViewType type;

    public ALVideoTextureView(Context context)
    {
        super(context);
        sinkId = "";
        mirror = false;
        started = false;
        constructCommon();
    }

    public ALVideoTextureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        sinkId = "";
        mirror = false;
        started = false;
        constructCommon();
    }

    private boolean isStarted()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = started;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void setStarted(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        started = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void constructCommon()
    {
        if (isInEditMode())
        {
            return;
        }
        type = VideoViewType.RECTANGLE;
        renderer = new VideoRenderer();
        glThread = new GLThread(renderer, type);
        glThread.start();
        if (isAvailable())
        {
            onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
        }
        setSurfaceTextureListener(this);
    }

    public String getSinkId()
    {
        return sinkId;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        glThread.setSurface(surfacetexture);
        glThread.surfaceCreated();
        glThread.onWindowResize(i, j);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        glThread.surfaceDestroyed();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        if (isStarted())
        {
            glThread.onWindowResize(i, j);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public void resolutionChanged(final int width, final int height)
    {
        Log.d("AddLive_SDK", (new StringBuilder("resolutionChanged: ")).append(width).append("x").append(height).toString());
        glThread.queueEvent(new Runnable() {

            final ALVideoTextureView this$0;
            final int val$height;
            final int val$width;

            public void run()
            {
                renderer.onResolutionChanged(width, height);
            }

            
            {
                this$0 = ALVideoTextureView.this;
                width = i;
                height = j;
                super();
            }
        });
    }

    public void setSinkId(String s)
    {
        if (isStarted())
        {
            throw new IllegalStateException("Cannot update the sink Id as rendering is active. Stop first.");
        } else
        {
            sinkId = s;
            return;
        }
    }

    public void start()
    {
        Log.i("AddLive_SDK", "Starting ALVideoTextureView");
        RenderRequest renderrequest = new RenderRequest(sinkId, mirror, new InvalidateCallback());
        final int rendererId = ADL.getService().renderSink(renderrequest);
        setStarted(true);
        glThread.queueEvent(new Runnable() {

            final ALVideoTextureView this$0;
            final int val$rendererId;

            public void run()
            {
                renderer.onStartRendering(rendererId, mirror);
            }

            
            {
                this$0 = ALVideoTextureView.this;
                rendererId = i;
                super();
            }
        });
        glThread.onWindowResize(getWidth(), getHeight());
        glThread.onResume();
        forceLayout();
    }

    public void stop()
    {
        Log.i("AddLive_SDK", "Stopping ALVideoTextureView");
        ADL.getService().stopRender(renderer.getRendererId());
        setStarted(false);
        glThread.queueEvent(new Runnable() {

            final ALVideoTextureView this$0;

            public void run()
            {
                renderer.onStopRendering();
            }

            
            {
                this$0 = ALVideoTextureView.this;
                super();
            }
        });
        glThread.requestRender();
        glThread.onPause();
    }
}
