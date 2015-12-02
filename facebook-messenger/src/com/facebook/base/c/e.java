// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.debug.a.a;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class e extends d
{

    final com.facebook.base.c.a a;

    private e(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    e(com.facebook.base.c.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a((com.facebook.common.executors.a)a(com/facebook/common/executors/a));
    }

    public Object b()
    {
        return a();
    }
}
