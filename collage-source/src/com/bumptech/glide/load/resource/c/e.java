// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.bitmap.c;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            b, d

public class e
    implements g
{

    private final g a;
    private final com.bumptech.glide.load.engine.a.c b;

    public e(g g1, com.bumptech.glide.load.engine.a.c c1)
    {
        a = g1;
        b = c1;
    }

    public j a(j j1, int i, int k)
    {
        b b1 = (b)j1.b();
        Bitmap bitmap = ((b)j1.b()).b();
        Object obj = new c(bitmap, b);
        obj = (Bitmap)a.a(((j) (obj)), i, k).b();
        if (!obj.equals(bitmap))
        {
            j1 = new d(new b(b1, ((Bitmap) (obj)), a));
        }
        return j1;
    }

    public String a()
    {
        return a.a();
    }
}
