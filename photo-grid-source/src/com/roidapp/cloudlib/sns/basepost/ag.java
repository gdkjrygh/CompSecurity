// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.widget.ProgressBar;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad, w

final class ag extends aa
{

    final long a;
    final ad b;

    ag(ad ad1, long l)
    {
        b = ad1;
        a = l;
        super();
    }

    public final void b(int i, Exception exception)
    {
        if (!ad.A(b))
        {
            return;
        } else
        {
            ad.c(b).setEnabled(true);
            ad.t(b).setVisibility(8);
            an.a(b.getActivity(), at.E);
            ad.z(b);
            return;
        }
    }

    public final void c(Object obj)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (!ad.y(b))
                    {
                        break label1;
                    }
                    if (com.roidapp.cloudlib.sns.basepost.ad.a(b) == null)
                    {
                        break label2;
                    }
                    obj = com.roidapp.cloudlib.sns.basepost.ad.a(b).iterator();
                    a a1;
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break label2;
                        }
                        a1 = (a)((Iterator) (obj)).next();
                    } while (a1.a != a);
                    ad.i(b).remove(Long.valueOf(a));
                    ad.j(b).remove(a1);
                    ((Iterator) (obj)).remove();
                    com.roidapp.cloudlib.sns.g.b.a().b(com.roidapp.cloudlib.sns.basepost.ad.b(b), a1);
                    ad.l(b).notifyDataSetChanged();
                }
                if (ad.j(b).size() != 0)
                {
                    break label0;
                }
                if (ad.f(b) != null)
                {
                    ad.g(b);
                }
                ad.t(b).setVisibility(8);
                an.a(b.getActivity(), at.G);
                ad.c(b).setEnabled(true);
                ad.z(b);
            }
            return;
        }
        ad.k(b);
        com.roidapp.cloudlib.sns.basepost.ad.a(b, ((a)ad.j(b).get(0)).a);
    }
}
