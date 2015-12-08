// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.d.i;
import com.bumptech.glide.d.p;
import com.bumptech.glide.f.e;
import com.bumptech.glide.load.c.h;
import com.bumptech.glide.load.c.j;
import com.bumptech.glide.load.c.s;
import com.bumptech.glide.load.resource.a.b;
import com.bumptech.glide.load.resource.d.a;

// Referenced classes of package com.bumptech.glide:
//            c, h, b, u

public final class d extends c
{

    private final s g;
    private final s h;
    private final u i;

    d(Class class1, s s, s s1, Context context, com.bumptech.glide.h h1, p p, i k, 
            u u)
    {
        Object obj;
        if (s == null && s1 == null)
        {
            obj = null;
        } else
        {
            obj = h1.a(com/bumptech/glide/load/resource/d/a, com/bumptech/glide/load/resource/a/b);
            com.bumptech.glide.f.b b1 = h1.b(com/bumptech/glide/load/c/j, com/bumptech/glide/load/resource/d/a);
            obj = new e(new h(s, s1), ((com.bumptech.glide.load.resource.e.c) (obj)), b1);
        }
        super(context, class1, ((com.bumptech.glide.f.f) (obj)), h1, p, k);
        g = s;
        h = s1;
        i = u;
    }

    public final com.bumptech.glide.b i()
    {
        return (com.bumptech.glide.b)new com.bumptech.glide.b(this, g, h, i);
    }
}
