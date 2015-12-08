// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.widget.MediaController;

// Referenced classes of package me.lyft.android.controls:
//            TextureVideoView

class this._cls0
    implements android.view.TextureListener
{

    final TextureVideoView this$0;

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        TextureVideoView.access$1302(TextureVideoView.this, new Surface(surfacetexture));
        TextureVideoView.access$1400(TextureVideoView.this);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        TextureVideoView.access$1300(TextureVideoView.this).release();
        TextureVideoView.access$1302(TextureVideoView.this, null);
        if (TextureVideoView.access$500(TextureVideoView.this) != null)
        {
            TextureVideoView.access$500(TextureVideoView.this).hide();
        }
        release(true);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        boolean flag1 = true;
        TextureVideoView.access$602(TextureVideoView.this, getWidth());
        TextureVideoView.access$702(TextureVideoView.this, getHeight());
        boolean flag;
        if (TextureVideoView.access$800(TextureVideoView.this) == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (TextureVideoView.access$000(TextureVideoView.this) == i && TextureVideoView.access$100(TextureVideoView.this) == j)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (TextureVideoView.access$400(TextureVideoView.this) != null && flag && i != 0)
        {
            start();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    ner()
    {
        this$0 = TextureVideoView.this;
        super();
    }
}
