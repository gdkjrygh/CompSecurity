// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.h;
import com.roidapp.cloudlib.sns.b.x;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            h

final class o extends aa
{

    final com.roidapp.cloudlib.sns.h.h a;

    o(com.roidapp.cloudlib.sns.h.h h1)
    {
        a = h1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        h.b(a, exception);
    }

    public final void b(Object obj)
    {
        h h1 = (h)obj;
        Object obj1 = null;
        obj = obj1;
        if (h1 != null)
        {
            obj = obj1;
            if (h1.size() > 0)
            {
                obj = (x)h1.get(0);
            }
        }
        h.b(a, ((x) (obj)));
    }

    public final void c(Object obj)
    {
        h h1 = (h)obj;
        Object obj1 = null;
        obj = obj1;
        if (h1 != null)
        {
            obj = obj1;
            if (h1.size() > 0)
            {
                obj = (x)h1.get(0);
            }
        }
        h.a(a, ((x) (obj)));
    }
}
