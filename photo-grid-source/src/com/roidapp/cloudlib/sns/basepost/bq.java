// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bb, bc, u, br

final class bq
    implements bb
{

    final int a;
    final bc b;

    bq(bc bc1, int i)
    {
        b = bc1;
        a = i;
        super();
    }

    public final void a()
    {
        if (bc.d(b) == null)
        {
            return;
        } else
        {
            bc.a(b, true);
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Post/Delete/Confirm");
            al.g().a(bc.a(b), "SNS", "click", "SNS/Post/Delete/Confirm", Long.valueOf(1L));
            com.roidapp.cloudlib.sns.basepost.bc.b(b).l();
            q.e(bc.c(b).a, bc.e(b).a, a, new br(this)).a(this);
            return;
        }
    }
}
