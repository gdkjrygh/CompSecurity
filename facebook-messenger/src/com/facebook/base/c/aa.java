// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.common.u.a;
import com.facebook.common.u.b;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class aa extends d
{

    final com.facebook.base.c.a a;

    private aa(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    aa(com.facebook.base.c.a a1, com.facebook.base.c.b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a(c(com/facebook/common/u/b));
    }

    public Object b()
    {
        return a();
    }
}
