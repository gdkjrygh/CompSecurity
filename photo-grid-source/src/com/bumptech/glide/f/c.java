// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.f;

import com.bumptech.glide.i.g;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.f:
//            b, d

public final class c
{

    private static final g a = new g();
    private final Map b = new HashMap();

    public c()
    {
    }

    public final b a(Class class1, Class class2)
    {
        synchronized (a)
        {
            a.a(class1, class2);
            class2 = (b)b.get(a);
        }
        class1 = class2;
        if (class2 == null)
        {
            class1 = d.e();
        }
        return class1;
        class1;
        g1;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public final void a(Class class1, Class class2, b b1)
    {
        b.put(new g(class1, class2), b1);
    }

}
