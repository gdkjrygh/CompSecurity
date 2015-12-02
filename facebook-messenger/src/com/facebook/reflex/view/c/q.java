// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import com.facebook.reflex.view.b.r;

// Referenced classes of package com.facebook.reflex.view.c:
//            o, p

class q
    implements Runnable
{

    final o a;
    private int b;
    private r c;

    private q(o o1)
    {
        a = o1;
        super();
    }

    q(o o1, p p)
    {
        this(o1);
    }

    public void a(r r)
    {
        b = o.d(a);
        c = r;
    }

    public void run()
    {
        if (!o.e(a) && b == o.d(a) && c != null)
        {
            o.a(a, c, false);
            a.c(-1);
        }
        c = null;
    }
}
