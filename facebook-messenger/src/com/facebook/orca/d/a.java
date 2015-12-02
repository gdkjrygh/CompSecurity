// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.analytics.cache.h;
import com.facebook.cache.j;
import com.facebook.ui.c.d;
import com.facebook.ui.media.cache.g;
import com.facebook.ui.media.cache.m;

// Referenced classes of package com.facebook.orca.d:
//            b

public class a extends g
{

    public a(Context context, com.facebook.common.time.a a1, d d, h h1, com.facebook.analytics.j.a a2, com.facebook.common.e.h h2, av av, 
            j j, javax.inject.a a3)
    {
        super(context, a1, d, h1, a2, h2, h(), av, j, a3);
    }

    private static m h()
    {
        return (new m()).a("audio").b(".audio").c("audio").a(1).b(0x7fffffff).c(0x7fffffff).d(0).e(0).a(false).a(0xa00000L).b(0x500000L);
    }

    protected volatile int a(Object obj)
    {
        return a((byte[])obj);
    }

    protected int a(byte abyte0[])
    {
        return abyte0.length;
    }

    protected com.facebook.ui.media.cache.a a(Context context, com.facebook.common.e.h h1, d d, h h2, com.facebook.common.time.a a1, m m1)
    {
        return new b(this, context, h1, d, h2, a1, m1);
    }
}
