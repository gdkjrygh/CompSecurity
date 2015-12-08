// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.h;

import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.g.b;

// Referenced classes of package com.roidapp.cloudlib.sns.h:
//            h

final class l extends aa
{

    final p a;
    final h b;

    l(h h1, p p)
    {
        b = h1;
        a = p;
        super();
    }

    public final void a()
    {
        com.roidapp.cloudlib.sns.g.b.a().a(h.r(b), a, c.c);
    }

    public final void b(int i, Exception exception)
    {
        com.roidapp.cloudlib.sns.g.b.a().a(h.r(b), a, c.c);
        if (b.getActivity() == null)
        {
            return;
        } else
        {
            com.roidapp.cloudlib.sns.h.h.b(b, at.aG);
            return;
        }
    }

    public final void c(Object obj)
    {
        com.roidapp.cloudlib.sns.g.b.a().a(h.r(b), a);
    }
}
