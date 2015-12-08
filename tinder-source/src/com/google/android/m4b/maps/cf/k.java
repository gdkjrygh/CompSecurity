// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            g

public final class k
{

    private Bitmap a;
    private int b;
    private int c;

    public k(Bitmap bitmap)
    {
        a = null;
        b = 0;
        c = 0;
        a = bitmap;
        b = bitmap.getWidth();
        c = bitmap.getHeight();
    }

    final boolean a(f.a a1)
    {
        if (a1.d)
        {
            if (a != null)
            {
                GLUtils.texImage2D(3553, 0, a, 0);
            } else
            {
                GLES20.glTexImage2D(3553, 0, 6407, b, c, 0, 6407, 33635, null);
                g.a("ImageData", "glTexImage2D failed");
            }
        }
        return true;
    }
}
