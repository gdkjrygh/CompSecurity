// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import gkk;

// Referenced classes of package com.spotify.mobile.android.video:
//            VideoSurfaceView

final class a
    implements android.view.TextureListener
{

    private VideoSurfaceView a;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        a.g = new Surface(surfacetexture);
        if (VideoSurfaceView.b(a) != null)
        {
            VideoSurfaceView.b(a).onSurfaceTextureAvailable(surfacetexture, i, j);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        VideoSurfaceView videosurfaceview = a;
        if (videosurfaceview.d != null)
        {
            videosurfaceview.d.d();
        }
        boolean flag = true;
        if (VideoSurfaceView.b(a) != null)
        {
            flag = VideoSurfaceView.b(a).onSurfaceTextureDestroyed(surfacetexture);
        }
        if (a.g != null)
        {
            a.g.release();
        }
        return flag;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        if (VideoSurfaceView.b(a) != null)
        {
            VideoSurfaceView.b(a).onSurfaceTextureSizeChanged(surfacetexture, i, j);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        if (VideoSurfaceView.b(a) != null)
        {
            VideoSurfaceView.b(a).onSurfaceTextureUpdated(surfacetexture);
        }
    }

    _cls9(VideoSurfaceView videosurfaceview)
    {
        a = videosurfaceview;
        super();
    }
}
