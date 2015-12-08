// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.widget.ProgressBar;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;
import com.roidapp.cloudlib.sns.q;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            bb, ad, as

final class ar
    implements bb
{

    final long a;
    final String b;
    final ad c;

    ar(ad ad1, long l, String s)
    {
        c = ad1;
        a = l;
        b = s;
        super();
    }

    public final void a()
    {
        ad.t(c).setVisibility(0);
        ad.t(c).bringToFront();
        q.a(ad.u(c), ad.v(c), ad.b(c).a.a, a, b, new as(this)).a(this);
    }
}
