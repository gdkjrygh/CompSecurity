// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.support.v4.g.e;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.m;
import com.google.android.m4b.maps.a.n;
import com.google.android.m4b.maps.a.r;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            aa, p

static final class b extends aa
{

    private final e a;
    private final n b;

    public final void a(k k1, m m)
    {
        super.a(k1, m);
        if (k1.g)
        {
            a.put(k1.b, m);
        }
        b.a(k1, m);
    }

    public final void a(k k1, m m, Runnable runnable)
    {
        super.a(k1, m, runnable);
        if (k1.g)
        {
            a.put(k1.b, m);
        }
        b.a(k1, m, runnable);
    }

    public final void a(k k1, r r)
    {
        super.a(k1, r);
        b.a(k1, r);
    }

    public (e e1, n n1)
    {
        a = e1;
        b = n1;
    }
}
