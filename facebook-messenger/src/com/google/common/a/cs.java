// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

// Referenced classes of package com.google.common.a:
//            dd, cm

final class cs extends SoftReference
    implements dd
{

    final cm a;

    cs(ReferenceQueue referencequeue, Object obj, cm cm)
    {
        super(obj, referencequeue);
        a = cm;
    }

    public cm a()
    {
        return a;
    }

    public dd a(ReferenceQueue referencequeue, cm cm)
    {
        return new cs(referencequeue, get(), cm);
    }

    public void a(dd dd1)
    {
        clear();
    }

    public boolean b()
    {
        return false;
    }

    public Object c()
    {
        return get();
    }
}
