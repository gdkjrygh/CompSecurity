// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import com.android.volley.w;
import com.kik.g.p;

final class o
    implements com.kik.cache.ad.d
{

    final p a;

    o(p p1)
    {
        a = p1;
        super();
    }

    public final void a(w w)
    {
        a.a(w);
    }

    public final void a(com.kik.cache.ad.c c, boolean flag)
    {
        if (c == null)
        {
            a.a(new IllegalArgumentException("null response"));
        } else
        if (c.b() != null || !flag)
        {
            a.a(c.b());
            return;
        }
    }
}
