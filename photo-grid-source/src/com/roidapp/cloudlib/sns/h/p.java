// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.e;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            h

final class p extends aa
{

    final h a;

    private p(h h1)
    {
        a = h1;
        super();
    }

    p(h h1, byte byte0)
    {
        this(h1);
    }

    public final void b(int i, Exception exception)
    {
        h.a(a, exception);
    }

    public final volatile void b(Object obj)
    {
        obj = (e)obj;
        h.b(a, ((e) (obj)));
    }

    public final void c(Object obj)
    {
        obj = (e)obj;
        h.a(a, ((e) (obj)));
    }
}
