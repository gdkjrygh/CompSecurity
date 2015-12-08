// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.e.e;
import com.bumptech.glide.load.b.f;
import com.bumptech.glide.load.b.g;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.resource.a.b;
import com.bumptech.glide.load.resource.d.a;
import com.bumptech.glide.load.resource.e.c;

// Referenced classes of package com.bumptech.glide:
//            c, g, b

public class d extends com.bumptech.glide.c
{

    private final l g;
    private final l h;
    private final j.c i;

    d(Class class1, l l1, l l2, Context context, com.bumptech.glide.g g1, com.bumptech.glide.manager.l l3, com.bumptech.glide.manager.g g2, 
            j.c c1)
    {
        super(context, class1, a(g1, l1, l2, com/bumptech/glide/load/resource/d/a, com/bumptech/glide/load/resource/a/b, null), g1, l3, g2);
        g = l1;
        h = l2;
        i = c1;
    }

    private static e a(com.bumptech.glide.g g1, l l1, l l2, Class class1, Class class2, c c1)
    {
        if (l1 == null && l2 == null)
        {
            return null;
        }
        c c2 = c1;
        if (c1 == null)
        {
            c2 = g1.a(class1, class2);
        }
        g1 = g1.b(com/bumptech/glide/load/b/g, class1);
        return new e(new f(l1, l2), c2, g1);
    }

    public com.bumptech.glide.b l()
    {
        return (com.bumptech.glide.b)i.a(new com.bumptech.glide.b(this, g, h, i));
    }
}
