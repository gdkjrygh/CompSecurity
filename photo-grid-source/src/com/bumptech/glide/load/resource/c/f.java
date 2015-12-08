// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.bitmap.c;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            b, e

public final class f
    implements g
{

    private final g a;
    private final e b;

    public f(g g1, e e1)
    {
        a = g1;
        b = e1;
    }

    public final x a(x x1, int i, int j)
    {
        b b1 = (b)x1.b();
        Bitmap bitmap = ((b)x1.b()).b();
        Object obj = new c(bitmap, b);
        obj = (Bitmap)a.a(((x) (obj)), i, j).b();
        if (!obj.equals(bitmap))
        {
            x1 = new com.bumptech.glide.load.resource.c.e(new b(b1, ((Bitmap) (obj)), a));
        }
        return x1;
    }

    public final String a()
    {
        return a.a();
    }
}
