// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.integration.volley;

import android.content.Context;
import com.android.volley.toolbox.o;
import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.b.m;

// Referenced classes of package com.bumptech.glide.integration.volley:
//            c, b, a

public class d
    implements l
{
    public static class a
        implements m
    {

        private static com.android.volley.l a;
        private com.android.volley.l b;
        private final com.bumptech.glide.integration.volley.a c;

        private static com.android.volley.l a(Context context)
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

        public l a(Context context, com.bumptech.glide.load.b.c c1)
        {
            return new d(b, c);
        }

        public void a()
        {
        }

        public a(Context context)
        {
            this(a(context));
        }

        public a(com.android.volley.l l1)
        {
            this(l1, c.a);
        }

        public a(com.android.volley.l l1, com.bumptech.glide.integration.volley.a a1)
        {
            c = a1;
            b = l1;
        }
    }


    private final com.android.volley.l a;
    private final com.bumptech.glide.integration.volley.a b;

    public d(com.android.volley.l l1, com.bumptech.glide.integration.volley.a a1)
    {
        a = l1;
        b = a1;
    }

    public c a(com.bumptech.glide.load.b.d d1, int i, int j)
    {
        return new com.bumptech.glide.integration.volley.c(a, d1, new b(), b);
    }

    public volatile c a(Object obj, int i, int j)
    {
        return a((com.bumptech.glide.load.b.d)obj, i, j);
    }
}
