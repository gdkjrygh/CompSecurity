// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.e;

import com.bumptech.glide.i.g;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.resource.e:
//            e, c

public final class d
{

    private static final g a = new g();
    private final Map b = new HashMap();

    public d()
    {
    }

    public final c a(Class class1, Class class2)
    {
        if (!class1.equals(class2)) goto _L2; else goto _L1
_L1:
        obj = e.b();
_L4:
        return ((c) (obj));
_L2:
        c c1;
        synchronized (a)
        {
            a.a(class1, class2);
            c1 = (c)b.get(a);
        }
        obj = c1;
        if (c1 != null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder("No transcoder registered for ")).append(class1).append(" and ").append(class2).toString());
        class1;
        obj;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public final void a(Class class1, Class class2, c c1)
    {
        b.put(new g(class1, class2), c1);
    }

}
