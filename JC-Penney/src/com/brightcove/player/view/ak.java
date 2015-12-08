// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.graphics.SurfaceTexture;
import android.util.Log;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveTextureVideoView, aj

class ak
    implements android.view.TextureView.SurfaceTextureListener
{

    final BrightcoveTextureVideoView a;

    private ak(BrightcoveTextureVideoView brightcovetexturevideoview)
    {
        a = brightcovetexturevideoview;
        super();
    }

    ak(BrightcoveTextureVideoView brightcovetexturevideoview, aj aj)
    {
        this(brightcovetexturevideoview);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        Log.d(BrightcoveTextureVideoView.h(), "Texture available");
        a.a.emit("readyToPlay");
        a.d.onSurfaceTextureAvailable(surfacetexture, i, j);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        Log.d(BrightcoveTextureVideoView.h(), "Texture destroyed");
        a.d.onSurfaceTextureDestroyed(surfacetexture);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        Log.d(BrightcoveTextureVideoView.h(), "Texture size changed");
        a.d.onSurfaceTextureSizeChanged(surfacetexture, i, j);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        a.d.onSurfaceTextureUpdated(surfacetexture);
    }
}
