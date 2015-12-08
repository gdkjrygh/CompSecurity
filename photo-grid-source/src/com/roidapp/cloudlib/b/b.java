// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import com.roidapp.cloudlib.sns.ae;

// Referenced classes of package com.roidapp.cloudlib.b:
//            a, j, g

final class b
    implements ae
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void a()
    {
        if (com.roidapp.cloudlib.b.a.a(a) == 0)
        {
            if (!com.roidapp.cloudlib.b.a.b(a).e() && com.roidapp.cloudlib.b.a.c(a) != null && com.roidapp.cloudlib.b.a.c(a).length() > 0)
            {
                com.roidapp.cloudlib.b.a.b(a).d();
                a.a(0);
            }
        } else
        if (!com.roidapp.cloudlib.b.a.d(a).e() && com.roidapp.cloudlib.b.a.c(a) != null && com.roidapp.cloudlib.b.a.c(a).length() > 0)
        {
            com.roidapp.cloudlib.b.a.d(a).d();
            a.a(1);
            return;
        }
    }
}
