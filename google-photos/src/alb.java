// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.os.ConditionVariable;
import androidx.media.filterpacks.image.SurfaceTextureTarget;

public final class alb
    implements android.view.TextureView.SurfaceTextureListener
{

    private SurfaceTextureTarget a;

    public alb(SurfaceTextureTarget surfacetexturetarget)
    {
        a = surfacetexturetarget;
        super();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        a.a(surfacetexture, i, j);
        SurfaceTextureTarget.a(a).open();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        SurfaceTextureTarget.b(a);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        a.a(i, j);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }
}
