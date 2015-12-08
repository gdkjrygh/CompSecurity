// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.addlive.impl.Log;
import com.addlive.platform.ADL;
import com.addlive.service.AddLiveService;
import com.addlive.service.InvalidateCb;
import com.addlive.service.RenderRequest;

// Referenced classes of package com.addlive.view:
//            VideoViewType, VideoRenderer

public class VideoView extends GLSurfaceView
    implements InvalidateCb
{

    protected static final String LOG_TAG = "AddLive_SDK";
    protected boolean mirror;
    protected VideoRenderer renderer;
    protected String sinkId;
    protected boolean started;
    protected VideoViewType type;

    public VideoView(Context context)
    {
        super(context);
        renderer = null;
        sinkId = "";
        mirror = false;
        started = false;
        constructCommon();
    }

    public VideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        renderer = null;
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
        } else
        {
            setEGLContextClientVersion(2);
            type = VideoViewType.RECTANGLE;
            renderer = new VideoRenderer(type);
            setRenderer(renderer);
            setRenderMode(0);
            return;
        }
    }

    public String getSinkId()
    {
        return sinkId;
    }

    public void invalidate()
    {
        while (isInEditMode() || !isStarted()) 
        {
            return;
        }
        requestRender();
    }

    public void resolutionChanged(final int width, final int height)
    {
        Log.d("AddLive_SDK", (new StringBuilder("resolutionChanged: ")).append(width).append("x").append(height).toString());
        queueEvent(new Runnable() {

            final VideoView this$0;
            final int val$height;
            final int val$width;

            public void run()
            {
                renderer.onResolutionChanged(width, height);
            }

            
            {
                this$0 = VideoView.this;
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
        RenderRequest renderrequest = new RenderRequest(sinkId, mirror, this);
        final int rendererId = ADL.getService().renderSink(renderrequest);
        setStarted(true);
        queueEvent(new Runnable() {

            final VideoView this$0;
            final int val$rendererId;

            public void run()
            {
                renderer.onStartRendering(rendererId, mirror);
            }

            
            {
                this$0 = VideoView.this;
                rendererId = i;
                super();
            }
        });
    }

    public void stop()
    {
        ADL.getService().stopRender(renderer.getRendererId());
        setStarted(false);
        queueEvent(new Runnable() {

            final VideoView this$0;

            public void run()
            {
                renderer.onStopRendering();
                requestRender();
            }

            
            {
                this$0 = VideoView.this;
                super();
            }
        });
    }
}
