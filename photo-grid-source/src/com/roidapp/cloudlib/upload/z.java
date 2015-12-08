// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.h;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            x, ab

final class z extends aa
{

    final x a;

    z(x x1)
    {
        a = x1;
        super();
    }

    private void a(h h1)
    {
        if (x.a(a) != null)
        {
            x.a(a).a();
        }
        if (h1 == null || h1.isEmpty())
        {
            x.b(a);
            return;
        } else
        {
            x.a(a, h1);
            return;
        }
    }

    public final void b(int i, Exception exception)
    {
        if (x.a(a) != null)
        {
            x.a(a).a();
        }
        x.c(a);
        if (!l.b(a.getActivity()))
        {
            x.d(a);
            return;
        } else
        {
            x.b(a);
            return;
        }
    }

    public final void b(Object obj)
    {
        obj = (h)obj;
        if (x.a(a) != null)
        {
            x.a(a).a();
        }
        a(((h) (obj)));
    }

    public final void c(Object obj)
    {
        a((h)obj);
    }
}
