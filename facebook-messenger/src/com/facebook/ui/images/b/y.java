// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.b;

import com.google.common.d.a.ab;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.ui.images.b:
//            w, r

class y
    implements h
{

    final w a;

    y(w w1)
    {
        a = w1;
        super();
    }

    public void a(r r1)
    {
        w.b(a);
        if (!w.a(a, r1, null))
        {
            w.c(a).a_(r1);
        }
    }

    public volatile void a(Object obj)
    {
        a((r)obj);
    }

    public void a(Throwable throwable)
    {
        w.b(a);
        if (!w.a(a, null, throwable))
        {
            w.c(a).a_(throwable);
        }
    }
}
