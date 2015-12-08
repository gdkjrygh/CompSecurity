// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad, w

final class ah extends aa
{

    final long a;
    final ad b;

    ah(ad ad1, long l)
    {
        b = ad1;
        a = l;
        super();
    }

    public final void b(int i, Exception exception)
    {
        if (!ad.D(b))
        {
            return;
        } else
        {
            b.getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Comment/Send/Failed");
            al.g().a(b.getActivity(), "SNS", "click", "SNS/Comment/Send/Failed", Long.valueOf(1L));
            ad.l(b).a(a);
            ad.l(b).notifyDataSetChanged();
            ad.C(b);
            return;
        }
    }

    public final void c(Object obj)
    {
        obj = (a)obj;
        if (!ad.B(b)) goto _L2; else goto _L1
_L1:
        b.getActivity();
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Comment/Send/Success");
        al.g().a(b.getActivity(), "SNS", "click", "SNS/Comment/Send/Success", Long.valueOf(1L));
        ad.l(b).a(a, ((a) (obj)));
        if (ad.i(b) == null || !ad.i(b).contains(Long.valueOf(a))) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        ad.i(b).remove(Long.valueOf(a));
        ad.i(b).add(Long.valueOf(((a) (obj)).a));
        j = ad.j(b).size();
        i = 0;
_L10:
        if (i >= j) goto _L6; else goto _L5
_L5:
        if (((a)ad.j(b).get(i)).a != a) goto _L8; else goto _L7
_L7:
        ad.j(b).set(i, obj);
_L6:
        ad.k(b);
_L4:
        ad.l(b).notifyDataSetChanged();
        com.roidapp.cloudlib.sns.g.b.a().a(com.roidapp.cloudlib.sns.basepost.ad.b(b), ((a) (obj)));
        ad.C(b);
_L2:
        return;
_L8:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
