// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.c;

import com.facebook.common.executors.n;
import com.facebook.inject.d;
import com.facebook.ui.images.b.e;
import com.facebook.ui.images.b.h;
import com.facebook.ui.images.b.l;
import com.facebook.ui.images.cache.a;

// Referenced classes of package com.facebook.ui.images.c:
//            a, b

class f extends d
{

    final com.facebook.ui.images.c.a a;

    private f(com.facebook.ui.images.c.a a1)
    {
        a = a1;
        super();
    }

    f(com.facebook.ui.images.c.a a1, b b1)
    {
        this(a1);
    }

    public h a()
    {
        return new h((a)a(com/facebook/ui/images/cache/a), (n)a(com/facebook/common/executors/n), (l)a(com/facebook/ui/images/b/a), (e)a(com/facebook/ui/images/b/e));
    }

    public Object b()
    {
        return a();
    }
}
