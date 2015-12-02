// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;

import com.facebook.common.time.a;
import com.facebook.e.a.e;

// Referenced classes of package com.facebook.cache:
//            j, q, k, b, 
//            c

class d extends com.facebook.inject.d
{

    final b a;

    private d(b b1)
    {
        a = b1;
        super();
    }

    d(b b1, c c)
    {
        this(b1);
    }

    public j a()
    {
        return new j((e)a(com/facebook/e/a/e), (q)a(com/facebook/cache/q), (k)a(com/facebook/cache/k), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
