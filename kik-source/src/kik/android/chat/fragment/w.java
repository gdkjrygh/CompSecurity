// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kik.android.c.e;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class w extends e
{

    final CameraFragment f;

    w(CameraFragment camerafragment, TextureView textureview, kik.android.c.b.c c)
    {
        f = camerafragment;
        super(textureview, c);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        a(CameraFragment.q(f));
        super.onSurfaceTextureAvailable(surfacetexture, i, j);
    }
}
