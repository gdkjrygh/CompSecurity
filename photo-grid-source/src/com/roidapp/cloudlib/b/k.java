// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.h;
import com.roidapp.cloudlib.sns.z;

// Referenced classes of package com.roidapp.cloudlib.b:
//            j

final class k extends aa
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        super.b(i, exception);
        j.a(a);
        j j1 = a;
        boolean flag;
        if (!(exception instanceof z))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(j1, flag);
    }

    public final volatile void b(Object obj)
    {
        super.b((h)obj);
    }

    public final void c(Object obj)
    {
        obj = (h)obj;
        super.c(obj);
        j.a(a);
        j.a(a, ((h) (obj)));
    }
}
