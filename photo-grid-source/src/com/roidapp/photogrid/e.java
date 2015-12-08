// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.os.Handler;
import android.view.View;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.sns.b.u;
import com.roidapp.photogrid.common.af;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid:
//            d, a, k

final class e
    implements android.view.View.OnClickListener
{

    final int a;
    final d b;

    e(d d1, int i)
    {
        b = d1;
        a = i;
        super();
    }

    public final void onClick(View view)
    {
        view = (new StringBuilder("Main/Banner/")).append(((u)d.a(b).get(a)).a).toString();
        long l = a;
        com.roidapp.baselib.c.b.a("SNS", "click", view);
        af.b(com.roidapp.photogrid.a.n(b.a), "SNS", "click", (new StringBuilder("Main/Banner/")).append(((u)d.a(b).get(a)).a).toString(), Long.valueOf(a));
        view = new com.roidapp.cloudlib.sns.topic.e();
        if (com.roidapp.photogrid.a.d(b.a) != null && com.roidapp.photogrid.a.c(b.a) != null)
        {
            com.roidapp.photogrid.a.c(b.a).removeCallbacks(com.roidapp.photogrid.a.d(b.a));
        }
        view.a(((u)d.a(b).get(a)).a, "Explore_Banner_%s_Page");
        if (com.roidapp.photogrid.a.j(b.a) != null)
        {
            com.roidapp.photogrid.a.j(b.a).a(view);
        }
    }
}
