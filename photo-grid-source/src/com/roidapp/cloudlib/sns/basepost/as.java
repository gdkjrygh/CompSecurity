// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.widget.ProgressBar;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.aa;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ar, ad, aw

final class as extends aa
{

    final ar a;

    as(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void b(int i, Exception exception)
    {
        if (!ad.x(a.c))
        {
            return;
        } else
        {
            ad.t(a.c).setVisibility(8);
            an.a(a.c.getActivity(), at.aw);
            return;
        }
    }

    public final void c(Object obj)
    {
        if (ad.w(a.c))
        {
            if (ad.f(a.c) != null)
            {
                ad.g(a.c);
            }
            ad.t(a.c).setVisibility(8);
            (new aw(null)).a(a.c.getActivity(), at.ay, at.ax, at.f, -1);
        }
    }
}
