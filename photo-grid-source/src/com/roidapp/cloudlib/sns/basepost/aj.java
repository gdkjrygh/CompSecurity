// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.a;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad, w

final class aj extends aa
{

    final ad a;

    aj(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        if (ad.K(a))
        {
            ad.J(a);
            if (ad.c(a).b())
            {
                ad.c(a).a(false);
            }
            ad.C(a);
            if (!l.b(a.getActivity()))
            {
                com.roidapp.cloudlib.sns.basepost.ad.a(a, at.aG);
                return;
            }
        }
    }

    public final void c(Object obj)
    {
        obj = (a)obj;
        if (ad.I(a))
        {
            if (obj != null)
            {
                ad.b(a).c.addAll(((java.util.Collection) (obj)));
                com.roidapp.cloudlib.sns.basepost.ad.a(a).clear();
                com.roidapp.cloudlib.sns.basepost.ad.a(a).addAll(ad.b(a).c);
                com.roidapp.cloudlib.sns.basepost.ad.l(a).a(com.roidapp.cloudlib.sns.basepost.ad.a(a));
                com.roidapp.cloudlib.sns.basepost.ad.l(a).notifyDataSetChanged();
            }
            ad.J(a);
            if (ad.c(a).b())
            {
                ad.c(a).a(false);
            }
            ad.C(a);
        }
    }
}
