// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.graphics.Bitmap;
import com.bumptech.glide.e.e;
import com.bumptech.glide.load.b.f;
import com.bumptech.glide.load.b.g;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.resource.e.c;

// Referenced classes of package com.bumptech.glide:
//            a, e, g

public class b extends a
{

    private final l g;
    private final l h;
    private final com.bumptech.glide.g i;
    private final j.c j;

    b(com.bumptech.glide.e e1, l l, l l1, j.c c)
    {
        super(a(e1.c, l, l1, android/graphics/Bitmap, null), android/graphics/Bitmap, e1);
        g = l;
        h = l1;
        i = e1.c;
        j = c;
    }

    private static e a(com.bumptech.glide.g g1, l l, l l1, Class class1, c c)
    {
        if (l == null && l1 == null)
        {
            return null;
        }
        c c1 = c;
        if (c == null)
        {
            c1 = g1.a(android/graphics/Bitmap, class1);
        }
        g1 = g1.b(com/bumptech/glide/load/b/g, android/graphics/Bitmap);
        return new e(new f(l, l1), c1, g1);
    }
}
