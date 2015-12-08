// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import com.addlive.service.InvalidateCb;

// Referenced classes of package com.addlive.view:
//            VideoView, VideoViewType, VideoRenderer

public class CircleVideoView extends VideoView
    implements InvalidateCb
{

    public CircleVideoView(Context context)
    {
        super(context);
    }

    public CircleVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void constructCommon()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            setEGLContextClientVersion(2);
            type = VideoViewType.CIRCLE;
            setEGLConfigChooser(8, 8, 8, 8, 16, 0);
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
            renderer = new VideoRenderer(type);
            setRenderer(renderer);
            setRenderMode(0);
            return;
        }
    }

    public void setRadius(float f)
    {
        renderer.setRadius(f);
    }
}
