// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.g;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            c

public abstract class d
    implements g
{

    private c a;

    public d(c c1)
    {
        a = c1;
    }

    protected abstract Bitmap a(c c1, Bitmap bitmap, int i, int k);

    public final j a(j j1, int i, int k)
    {
        if (!h.a(i, k))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot apply transformation on width: ").append(i).append(" or height: ").append(k).append(" less than or equal to zero and not Target.SIZE_ORIGINAL").toString());
        }
        Bitmap bitmap = (Bitmap)j1.b();
        int l = i;
        if (i == 0x80000000)
        {
            l = bitmap.getWidth();
        }
        i = k;
        if (k == 0x80000000)
        {
            i = bitmap.getHeight();
        }
        Bitmap bitmap1 = a(a, bitmap, l, i);
        if (bitmap.equals(bitmap1))
        {
            return j1;
        } else
        {
            return c.a(bitmap1, a);
        }
    }
}
