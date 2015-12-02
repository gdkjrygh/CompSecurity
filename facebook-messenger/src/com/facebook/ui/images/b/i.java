// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import com.google.common.d.a.ab;
import com.google.common.d.a.h;
import com.google.common.d.a.w;

// Referenced classes of package com.facebook.ui.images.b:
//            r, m, h, j

class i
    implements h
{

    final m a;
    final ab b;
    final com.facebook.ui.images.b.h c;

    i(com.facebook.ui.images.b.h h1, m m1, ab ab1)
    {
        c = h1;
        a = m1;
        b = ab1;
        super();
    }

    public void a(r r1)
    {
        if (r1.a() != null || a.f())
        {
            b.a_(r1);
            return;
        } else
        {
            com.google.common.d.a.i.a(h.a(c, a), new j(this), w.a());
            return;
        }
    }

    public volatile void a(Object obj)
    {
        a((r)obj);
    }

    public void a(Throwable throwable)
    {
        b.a_(throwable);
    }
}
