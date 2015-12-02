// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.cache;

import android.support.v4.c.c;
import com.facebook.analytics.cache.e;
import com.facebook.analytics.cache.g;
import com.facebook.common.e.h;

public class u extends c
{

    private final e a;
    private final h b;

    protected void a(int i)
    {
        a.a(i);
    }

    protected void b(int i)
    {
        a.b(i);
    }

    protected void c(int i)
    {
        a.a(g.CACHE_FULL, i, 0L);
    }

    protected void d(int i)
    {
        a.c(i);
        a.d(b());
        if (b() > 0)
        {
            b.c(a.a(com.facebook.analytics.cache.c.BYTES_COUNT), Integer.toString(i));
            b.c(a.a(com.facebook.analytics.cache.c.ENTRIES_COUNT), Integer.toString(b()));
            return;
        } else
        {
            b.a(a.a(com.facebook.analytics.cache.c.BYTES_COUNT));
            b.a(a.a(com.facebook.analytics.cache.c.ENTRIES_COUNT));
            return;
        }
    }
}
