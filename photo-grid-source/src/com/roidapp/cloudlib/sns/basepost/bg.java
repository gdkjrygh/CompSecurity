// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bb, bc, u, bh

final class bg
    implements bb
{

    final int a;
    final bc b;

    bg(bc bc1, int i)
    {
        b = bc1;
        a = i;
        super();
    }

    public final void a()
    {
        bc.b(b).l();
        q.i(bc.c(b).a, bc.e(b).a, a, new bh(this)).a(this);
    }
}
