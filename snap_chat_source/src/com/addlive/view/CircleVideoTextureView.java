// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.addlive.view:
//            ALVideoTextureView, VideoViewType, VideoRenderer, GLThread

public class CircleVideoTextureView extends ALVideoTextureView
    implements android.view.TextureView.SurfaceTextureListener
{

    public CircleVideoTextureView(Context context)
    {
        super(context);
    }

    public CircleVideoTextureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void constructCommon()
    {
        if (isInEditMode())
        {
            return;
        }
        type = VideoViewType.CIRCLE;
        renderer = new VideoRenderer(type);
        setOpaque(false);
        glThread = new GLThread(renderer, type);
        glThread.start();
        if (isAvailable())
        {
            onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
        }
        setSurfaceTextureListener(this);
    }

    public void setRadius(float f)
    {
        renderer.setRadius(f);
    }
}
