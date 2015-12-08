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

final class bp extends aa
{

    final n a;
    final bc b;

    bp(bc bc1, n n)
    {
        b = bc1;
        a = n;
        super();
    }

    public final void a()
    {
        com.roidapp.cloudlib.sns.g.b.a().a(a, g.b);
    }

    public final void b(int i, Exception exception)
    {
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/UnLike/Failed");
        al.g().a(bc.a(b), "SNS", "click", "SNS/UnLike/Failed", Long.valueOf(1L));
        an.a(bc.a(b), bc.a(b).getString(at.J));
        com.roidapp.cloudlib.sns.g.b.a().a(a, g.b);
    }

    public final void c(Object obj)
    {
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/UnLike/Success");
        al.g().a(bc.a(b), "SNS", "click", "SNS/UnLike/Success", Long.valueOf(1L));
        com.roidapp.cloudlib.sns.g.b.a().d(a);
    }
}
