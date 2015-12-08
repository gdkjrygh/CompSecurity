// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.g;
import com.roidapp.cloudlib.sns.z;

// Referenced classes of package com.roidapp.cloudlib.b:
//            g

final class h extends aa
{

    final com.roidapp.cloudlib.b.g a;

    h(com.roidapp.cloudlib.b.g g1)
    {
        a = g1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        super.b(i, exception);
        g.a(a);
        com.roidapp.cloudlib.b.g g1 = a;
        boolean flag;
        if (!(exception instanceof z))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.a(g1, flag);
    }

    public final volatile void b(Object obj)
    {
        super.b((g)obj);
    }

    public final void c(Object obj)
    {
        obj = (g)obj;
        super.c(obj);
        g.a(a);
        g.a(a, ((g) (obj)));
    }
}
