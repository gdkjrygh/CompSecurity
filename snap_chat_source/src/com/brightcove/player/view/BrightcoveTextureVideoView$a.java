// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.graphics.SurfaceTexture;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveTextureVideoView

final class <init>
    implements android.view.tener
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

    private (BrightcoveTextureVideoView brightcovetexturevideoview)
    {
        a = brightcovetexturevideoview;
        super();
    }

    a(BrightcoveTextureVideoView brightcovetexturevideoview, byte byte0)
    {
        this(brightcovetexturevideoview);
    }
}
