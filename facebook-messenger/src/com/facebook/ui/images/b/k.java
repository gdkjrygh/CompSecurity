// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.ui.images.b:
//            p, q, h, l, 
//            m, r

class k
    implements Callable
{

    final m a;
    final h b;

    k(h h1, m m)
    {
        b = h1;
        a = m;
        super();
    }

    public r a()
    {
        p p1 = p.a(a).c();
        return h.a(b).a(p1);
    }

    public Object call()
    {
        return a();
    }
}
