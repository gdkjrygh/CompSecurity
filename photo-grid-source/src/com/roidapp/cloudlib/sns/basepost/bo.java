// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.Context;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.g;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.g.b;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bc

final class bo extends aa
{

    final n a;
    final bc b;

    bo(bc bc1, n n)
    {
        b = bc1;
        a = n;
        super();
    }

    public final void a()
    {
        com.roidapp.cloudlib.sns.g.b.a().a(a, g.c);
    }

    public final void b(int i, Exception exception)
    {
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Like/Failed");
        al.g().a(bc.a(b), "SNS", "click", "SNS/Like/Failed", Long.valueOf(1L));
        an.a(bc.a(b), bc.a(b).getString(at.H));
        com.roidapp.cloudlib.sns.g.b.a().a(a, g.c);
    }

    public final void c(Object obj)
    {
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Like/Success");
        al.g().a(bc.a(b), "SNS", "click", "SNS/Like/Success", Long.valueOf(1L));
        com.roidapp.cloudlib.sns.g.b.a().b(a);
    }
}
