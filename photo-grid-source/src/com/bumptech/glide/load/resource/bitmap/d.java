// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.i.h;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.g;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            c

public abstract class d
    implements g
{

    private e a;

    public d(e e)
    {
        a = e;
    }

    protected abstract Bitmap a(e e, Bitmap bitmap, int i, int j);

    public final x a(x x1, int i, int j)
    {
        if (!h.a(i, j))
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot apply transformation on width: ")).append(i).append(" or height: ").append(j).append(" less than or equal to zero and not Target.SIZE_ORIGINAL").toString());
        }
        Bitmap bitmap = (Bitmap)x1.b();
        int k = i;
        if (i == 0x80000000)
        {
            k = bitmap.getWidth();
        }
        i = j;
        if (j == 0x80000000)
        {
            i = bitmap.getHeight();
        }
        Bitmap bitmap1 = a(a, bitmap, k, i);
        if (!bitmap.equals(bitmap1))
        {
            x1 = c.a(bitmap1, a);
        }
        return x1;
    }
}
