// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.integration.volley;

import android.content.Context;
import com.android.volley.l;
import com.android.volley.toolbox.o;
import com.bumptech.glide.load.b.c;
import com.bumptech.glide.load.b.m;

// Referenced classes of package com.bumptech.glide.integration.volley:
//            d, c, a

public static class b
    implements m
{

    private static l a;
    private l b;
    private final a c;

    private static l a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/bumptech/glide/integration/volley/d$a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = o.a(context);
        }
        com/bumptech/glide/integration/volley/d$a;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/bumptech/glide/integration/volley/d$a;
        JVM INSTR monitorexit ;
        throw context;
    }

    public com.bumptech.glide.load.b.l a(Context context, c c1)
    {
        return new d(b, c);
    }

    public void a()
    {
    }

    public (Context context)
    {
        this(a(context));
    }

    public a(l l)
    {
        this(l, c.a);
    }

    public <init>(l l, a a1)
    {
        c = a1;
        b = l;
    }
}
