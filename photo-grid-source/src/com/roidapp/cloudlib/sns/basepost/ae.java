// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import com.roidapp.cloudlib.sns.b.a;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.modifiedrefresh.x;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad

final class ae
    implements x
{

    final ad a;

    ae(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void onRefresh()
    {
        if (!com.roidapp.cloudlib.sns.basepost.ad.a(a).isEmpty() && com.roidapp.cloudlib.sns.basepost.ad.a(a).size() < ad.b(a).a.i)
        {
            a a1 = (a)com.roidapp.cloudlib.sns.basepost.ad.a(a).get(com.roidapp.cloudlib.sns.basepost.ad.a(a).size() - 1);
            com.roidapp.cloudlib.sns.basepost.ad.a(a, a1);
            return;
        } else
        {
            ad.c(a).a(false);
            return;
        }
    }
}
