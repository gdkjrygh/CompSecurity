// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, BrightcoveTextureView, RenderView

public class BrightcoveTextureVideoView extends BaseVideoView
{
    final class a
        implements android.view.TextureView.SurfaceTextureListener
    {

        private BrightcoveTextureVideoView a;

        public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
        {
            BrightcoveTextureVideoView.f();
            a.a.emit("readyToPlay");
            a.b.onSurfaceTextureAvailable(surfacetexture, i, j);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
        {
            BrightcoveTextureVideoView.f();
            a.b.onSurfaceTextureDestroyed(surfacetexture);
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
        {
            BrightcoveTextureVideoView.f();
            a.b.onSurfaceTextureSizeChanged(surfacetexture, i, j);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
        {
            a.b.onSurfaceTextureUpdated(surfacetexture);
        }

        private a()
        {
            a = BrightcoveTextureVideoView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final String f = com/brightcove/player/view/BrightcoveTextureVideoView.getSimpleName();
    private a g;
    private BrightcoveTextureView h;

    public BrightcoveTextureVideoView(Context context)
    {
        super(context);
    }

    public BrightcoveTextureVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BrightcoveTextureVideoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static String f()
    {
        return f;
    }

    protected final VideoDisplayComponent a(EventEmitter eventemitter)
    {
        return new VideoDisplayComponent(h, eventemitter);
    }

    protected final void a()
    {
        if (h != null)
        {
            h.setVideoSize(0, 0);
        }
        super.a();
    }

    protected final void a(Context context)
    {
        h = new BrightcoveTextureView(context);
        g = new a((byte)0);
        h.setSurfaceTextureListener(g);
        addView(h);
        super.a(context);
    }

    protected final void a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams.width, layoutparams.height);
        layoutparams1.gravity = 17;
        h.setLayoutParams(layoutparams1);
        super.a(layoutparams);
    }

    protected final boolean c()
    {
        return h.isShown();
    }

    public int getMeasuredVideoHeight()
    {
        return h.getMeasuredVideoHeight();
    }

    public int getMeasuredVideoWidth()
    {
        return h.getMeasuredVideoWidth();
    }

    public RenderView getRenderView()
    {
        return h;
    }

    public TextureView getTextureView()
    {
        return h;
    }

    public int getVideoHeight()
    {
        return h.getVideoHeight();
    }

    public int getVideoWidth()
    {
        return h.getVideoWidth();
    }

}
