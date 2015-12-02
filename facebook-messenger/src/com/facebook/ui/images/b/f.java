// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import com.facebook.debug.d.e;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.ui.images.b:
//            p, q, e, l, 
//            m, r

class f
    implements Callable
{

    final m a;
    final com.facebook.ui.images.b.e b;

    f(com.facebook.ui.images.b.e e1, m m)
    {
        b = e1;
        a = m;
        super();
    }

    public r a()
    {
        e.b(10L);
        Object obj = p.a(a).a(true).c();
        obj = e.a(b).a(((p) (obj)));
        e.c("ImageDecodingExecutor");
        return ((r) (obj));
    }

    public Object call()
    {
        return a();
    }
}
