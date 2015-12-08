// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.x;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            h

final class n extends aa
{

    final h a;

    n(h h1)
    {
        a = h1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        h.b(a, exception);
    }

    public final volatile void b(Object obj)
    {
        obj = (x)obj;
        h.b(a, ((x) (obj)));
    }

    public final void c(Object obj)
    {
        obj = (x)obj;
        h.a(a, ((x) (obj)));
    }
}
