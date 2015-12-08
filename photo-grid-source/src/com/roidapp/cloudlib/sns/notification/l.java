// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.content.Context;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.h;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.g.b;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            f

final class l extends aa
{

    final h a;
    final p b;
    final f c;

    l(f f1, h h1, p p)
    {
        c = f1;
        a = h1;
        b = p;
        super();
    }

    public final void a()
    {
        com.roidapp.cloudlib.sns.g.b.a().a(a.c, b, c.b);
    }

    public final void b(int i, Exception exception)
    {
        an.a(f.a(c), f.a(c).getString(at.l));
        com.roidapp.cloudlib.sns.g.b.a().a(a.c, b, c.b);
    }

    public final void c(Object obj)
    {
        com.roidapp.cloudlib.sns.g.b.a().c(a.c, b);
    }
}
