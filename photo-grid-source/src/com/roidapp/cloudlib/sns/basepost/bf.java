// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.baselib.c.b;
import com.roidapp.baselib.view.u;
import com.roidapp.cloudlib.al;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bc

final class bf
    implements u
{

    final bc a;

    bf(bc bc1)
    {
        a = bc1;
        super();
    }

    public final void b(int i, int j)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Post/Report/Click");
            break;
        }
        al.g().a(bc.a(a), "SNS", "click", "SNS/Post/Report/Click", Long.valueOf(1L));
        com.roidapp.cloudlib.sns.basepost.bc.b(a, j);
    }
}
