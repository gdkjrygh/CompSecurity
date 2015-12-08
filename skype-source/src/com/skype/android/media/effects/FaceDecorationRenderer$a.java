// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;

// Referenced classes of package com.skype.android.media.effects:
//            FaceDecorationRenderer, FaceDecoration

final class c
{

    final FaceDecorationRenderer a;
    private FaceDecoration b;
    private int c;
    private int d;
    private int e;

    static FaceDecoration a(c c1)
    {
        return c1.b;
    }

    public final int a()
    {
        if (c == -1)
        {
            int i = b.a();
            int ai[] = new int[1];
            GLES20.glGenTextures(1, ai, 0);
            GLES20.glBindTexture(3553, ai[0]);
            Bitmap bitmap = BitmapFactory.decodeStream(FaceDecorationRenderer.a(a).getResources().openRawResource(i));
            d = bitmap.getWidth();
            e = bitmap.getHeight();
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            bitmap.recycle();
            c = ai[0];
        }
        return c;
    }

    public final int b()
    {
        return d;
    }

    public final int c()
    {
        return e;
    }

    public final float d()
    {
        return b.b();
    }

    public final float e()
    {
        return b.c();
    }

    public final float f()
    {
        return b.d();
    }

    public (FaceDecorationRenderer facedecorationrenderer, FaceDecoration facedecoration)
    {
        a = facedecorationrenderer;
        super();
        b = facedecoration;
        c = -1;
    }
}
