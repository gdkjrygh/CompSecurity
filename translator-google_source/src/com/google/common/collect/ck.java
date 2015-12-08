// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

// Referenced classes of package com.google.common.collect:
//            cr, cj

final class ck extends SoftReference
    implements cr
{

    final cj a;

    ck(ReferenceQueue referencequeue, Object obj, cj cj)
    {
        super(obj, referencequeue);
        a = cj;
    }

    public final cj a()
    {
        return a;
    }

    public final cr a(ReferenceQueue referencequeue, Object obj, cj cj)
    {
        return new ck(referencequeue, obj, cj);
    }

    public final void a(cr cr1)
    {
        clear();
    }

    public final boolean b()
    {
        return false;
    }

    public final Object c()
    {
        return get();
    }
}
