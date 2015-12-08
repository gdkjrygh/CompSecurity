// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import com.bumptech.glide.load.c.s;

// Referenced classes of package com.bumptech.glide:
//            s, p

public final class r
{

    final p a;
    private final s b;
    private final Class c;

    r(p p, s s1, Class class1)
    {
        a = p;
        super();
        b = s1;
        c = class1;
    }

    static s a(r r1)
    {
        return r1.b;
    }

    static Class b(r r1)
    {
        return r1.c;
    }

    public final com.bumptech.glide.s a(Object obj)
    {
        return new com.bumptech.glide.s(this, obj);
    }
}
