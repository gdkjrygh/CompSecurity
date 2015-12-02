// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.inject.bb;
import com.facebook.inject.d;
import com.facebook.inject.u;
import com.facebook.inject.x;

// Referenced classes of package com.facebook.base.c:
//            a, b

class z extends d
{

    final a a;

    private z(a a1)
    {
        a = a1;
        super();
    }

    z(a a1, b b1)
    {
        this(a1);
    }

    public x a()
    {
        com.facebook.inject.t t = c();
        Object obj = t;
        if (t instanceof bb)
        {
            obj = ((bb)t).b();
        }
        return ((u)obj).b();
    }

    public Object b()
    {
        return a();
    }
}
