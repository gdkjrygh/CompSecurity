// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;

// Referenced classes of package com.facebook.video.view:
//            TextureViewImplementation

class <init>
    implements android.view.ceListener
{

    final TextureViewImplementation a;
    private final MediaPlayer b;

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        TextureViewImplementation.a(a, surfacetexture);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        TextureViewImplementation.b(a);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    private (TextureViewImplementation textureviewimplementation, MediaPlayer mediaplayer)
    {
        a = textureviewimplementation;
        super();
        b = mediaplayer;
    }

    b(TextureViewImplementation textureviewimplementation, MediaPlayer mediaplayer, byte byte0)
    {
        this(textureviewimplementation, mediaplayer);
    }
}
