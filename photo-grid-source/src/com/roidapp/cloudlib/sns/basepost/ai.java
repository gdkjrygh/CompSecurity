// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.widget.ListView;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad, w

final class ai extends aa
{

    final ad a;

    ai(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        if (ad.H(a))
        {
            ad.G(a);
            if (ad.c(a).c())
            {
                ad.c(a).a();
            }
            ad.C(a);
            if (!l.b(a.getActivity()))
            {
                ad.a(a, at.aG);
                return;
            }
        }
    }

    public final void c(Object obj)
    {
        obj = (n)obj;
        if (ad.E(a))
        {
            if (obj != null)
            {
                ad.b(a).a = ((n) (obj)).a;
                ad.b(a).b = ((n) (obj)).b;
                ad.b(a).c = ((n) (obj)).c;
                ad.b(a).d = ((n) (obj)).d;
                ad.b(a).e = ((n) (obj)).e;
                ad.b(a).f = ((n) (obj)).f;
                ad.a(a).clear();
                if (((n) (obj)).c != null)
                {
                    ad.a(a).addAll(((n) (obj)).c);
                    com.roidapp.cloudlib.sns.basepost.ad.l(a).a(ad.a(a));
                    com.roidapp.cloudlib.sns.basepost.ad.l(a).notifyDataSetChanged();
                    ad.F(a).setSelection(com.roidapp.cloudlib.sns.basepost.ad.l(a).getCount() - 1);
                } else
                {
                    com.roidapp.cloudlib.sns.basepost.ad.l(a).a(ad.a(a));
                    com.roidapp.cloudlib.sns.basepost.ad.l(a).notifyDataSetChanged();
                }
            }
            ad.G(a);
            if (ad.c(a).c())
            {
                ad.c(a).a();
            }
            ad.C(a);
        }
    }
}
