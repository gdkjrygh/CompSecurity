// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;

public final class oii
    implements android.view.TextureView.SurfaceTextureListener
{

    private TiledImageView a;

    public oii(TiledImageView tiledimageview)
    {
        a = tiledimageview;
        super();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        TiledImageView.a(a, true);
        TiledImageView.a(a).onSurfaceTextureAvailable(surfacetexture, i, j);
        if (!TiledImageView.b(a))
        {
            a.b();
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        return TiledImageView.a(a).onSurfaceTextureDestroyed(surfacetexture);
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        TiledImageView.a(a).onSurfaceTextureSizeChanged(surfacetexture, i, j);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
        TiledImageView.a(a).onSurfaceTextureUpdated(surfacetexture);
    }
}
