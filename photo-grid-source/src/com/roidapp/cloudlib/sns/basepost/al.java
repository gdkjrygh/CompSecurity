// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.sns.b.a;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.h.h;
import com.roidapp.cloudlib.sns.topic.e;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            at, ad

final class al
    implements at
{

    final ad a;

    al(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void a(long l)
    {
        a.getActivity();
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Comment/Send/Failed/Cancel");
        com.roidapp.cloudlib.al.g().a(a.getActivity(), "SNS", "click", "SNS/Comment/Send/Failed/Cancel", Long.valueOf(1L));
        if (ad.i(a) == null || !ad.i(a).contains(Long.valueOf(l))) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        ad.i(a).remove(Long.valueOf(l));
        j = ad.j(a).size();
        i = 0;
_L8:
        if (i >= j) goto _L4; else goto _L3
_L3:
        if (((a)ad.j(a).get(i)).a != l) goto _L6; else goto _L5
_L5:
        ad.j(a).remove(i);
_L4:
        ad.k(a);
_L2:
        return;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(long l, String s)
    {
        a.getActivity();
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Comment/Send/Failed/Retry");
        com.roidapp.cloudlib.al.g().a(a.getActivity(), "SNS", "click", "SNS/Comment/Send/Failed/Retry", Long.valueOf(1L));
        com.roidapp.cloudlib.sns.basepost.ad.a(a, l, s);
    }

    public final void a(x x1, String s)
    {
        com.roidapp.cloudlib.sns.basepost.ad.e(a);
        if (ad.f(a) != null)
        {
            ad.g(a);
        }
        if (x1 != null)
        {
            if (com.roidapp.cloudlib.sns.basepost.ad.h(a).a == x1.a)
            {
                x1 = h.a(x1.a, x1.b, x1.h);
                x1.C();
                a.a(x1);
                return;
            } else
            {
                x1 = h.a(x1.a, x1.b, x1.h);
                x1.C();
                a.a(x1);
                return;
            }
        } else
        {
            com.roidapp.cloudlib.sns.basepost.ad.h(a).b.equals(s);
            x1 = h.b(s);
            x1.C();
            a.a(x1);
            return;
        }
    }

    public final void a(String s)
    {
        com.roidapp.cloudlib.sns.basepost.ad.e(a);
        if (ad.f(a) != null)
        {
            ad.g(a);
        }
        e e1 = new e();
        e1.a(s, "Comment_[tag]_Page");
        a.a(e1);
    }

    public final boolean b(long l)
    {
        return ad.i(a) != null && ad.i(a).contains(Long.valueOf(l));
    }
}
