// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.graphics.SurfaceTexture;
import android.widget.MediaController;

// Referenced classes of package com.snapchat.android.ui:
//            TextureVideoView

final class a
    implements android.view.TextureListener
{

    private TextureVideoView a;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        TextureVideoView.m(a);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        if (TextureVideoView.e(a) != null)
        {
            TextureVideoView.e(a).hide();
        }
        TextureVideoView.n(a);
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        boolean flag1 = true;
        boolean flag;
        if (TextureVideoView.g(a) == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.a == i && a.b == j)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (TextureVideoView.d(a) != null && flag && i != 0)
        {
            if (TextureVideoView.f(a) != 0)
            {
                a.seekTo(TextureVideoView.f(a));
            }
            a.start();
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    ener(TextureVideoView texturevideoview)
    {
        a = texturevideoview;
        super();
    }
}
