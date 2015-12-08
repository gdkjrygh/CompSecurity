// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.graphics.Bitmap;
import com.bumptech.glide.f.e;
import com.bumptech.glide.load.c.h;
import com.bumptech.glide.load.c.j;
import com.bumptech.glide.load.c.s;

// Referenced classes of package com.bumptech.glide:
//            a, e, h, u

public final class b extends a
{

    private final s g;
    private final s h;
    private final com.bumptech.glide.h i;
    private final u j;

    b(com.bumptech.glide.e e1, s s, s s1, u u)
    {
        Object obj1 = e1.c;
        Object obj;
        if (s == null && s1 == null)
        {
            obj = null;
        } else
        {
            obj = ((com.bumptech.glide.h) (obj1)).a(android/graphics/Bitmap, android/graphics/Bitmap);
            obj1 = ((com.bumptech.glide.h) (obj1)).b(com/bumptech/glide/load/c/j, android/graphics/Bitmap);
            obj = new e(new h(s, s1), ((com.bumptech.glide.load.resource.e.c) (obj)), ((com.bumptech.glide.f.b) (obj1)));
        }
        super(((com.bumptech.glide.f.f) (obj)), android/graphics/Bitmap, e1);
        g = s;
        h = s1;
        i = e1.c;
        j = u;
    }
}
