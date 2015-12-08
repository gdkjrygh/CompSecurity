// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.resource.e.c;
import com.bumptech.glide.load.resource.e.e;
import com.bumptech.glide.manager.g;

// Referenced classes of package com.bumptech.glide:
//            e, g

public class f extends com.bumptech.glide.e
{

    private final l g;
    private final Class h;
    private final Class i;
    private final j.c j;

    f(Context context, com.bumptech.glide.g g1, Class class1, l l, Class class2, Class class3, com.bumptech.glide.manager.l l1, 
            g g2, j.c c)
    {
        super(context, class1, a(g1, l, class2, class3, e.b()), class3, g1, l1, g2);
        g = l;
        h = class2;
        i = class3;
        j = c;
    }

    private static com.bumptech.glide.e.f a(com.bumptech.glide.g g1, l l, Class class1, Class class2, c c)
    {
        return new com.bumptech.glide.e.e(l, c, g1.b(class1, class2));
    }
}
