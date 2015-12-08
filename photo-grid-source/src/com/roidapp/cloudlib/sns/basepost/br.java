// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bq, bc, u

final class br extends aa
{

    final bq a;

    br(bq bq1)
    {
        a = bq1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Post/Delete/Failed");
        al.g().a(bc.a(a.b), "SNS", "click", "SNS/Post/Delete/Failed", Long.valueOf(1L));
        com.roidapp.cloudlib.sns.basepost.bc.b(a.b).m();
        an.a(bc.a(a.b), at.E);
        bc.a(a.b, false);
    }

    public final void c(Object obj)
    {
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Post/Delete/Success");
        al.g().a(bc.a(a.b), "SNS", "click", "SNS/Post/Delete/Success", Long.valueOf(1L));
        an.a(bc.a(a.b), at.G);
        obj = bc.d(a.b).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            n n1 = (n)((Iterator) (obj)).next();
            if (n1.a.a != a.a)
            {
                continue;
            }
            com.roidapp.cloudlib.sns.g.b.a().e(n1);
            break;
        } while (true);
        com.roidapp.cloudlib.sns.basepost.bc.b(a.b).n();
        bc.a(a.b, false);
    }
}
