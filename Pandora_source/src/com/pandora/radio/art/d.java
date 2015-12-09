// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.art;

import android.content.Context;
import p.k.m;
import p.p.a;
import p.r.c;
import p.x.j;
import p.x.k;

// Referenced classes of package com.pandora.radio.art:
//            c

public class d
    implements j
{
    public static class a
        implements k
    {

        private static m a;
        private m b;

        private static m a(Context context)
        {
            if (a != null) goto _L2; else goto _L1
_L1:
            com/pandora/radio/art/d$a;
            JVM INSTR monitorenter ;
            if (a == null)
            {
                a = com.android.volley.toolbox.k.a(context);
            }
            com/pandora/radio/art/d$a;
            JVM INSTR monitorexit ;
_L2:
            return a;
            context;
            com/pandora/radio/art/d$a;
            JVM INSTR monitorexit ;
            throw context;
        }

        public j a(Context context, p.x.c c1)
        {
            return new d(b);
        }

        public void a()
        {
        }

        public a(Context context)
        {
            this(a(context));
        }

        public a(m m)
        {
            b = m;
        }
    }


    private final m a;

    public d(m m)
    {
        a = m;
    }

    public volatile c a(Object obj, int i, int k)
    {
        return a((p.x.d)obj, i, k);
    }

    public c a(p.x.d d1, int i, int k)
    {
        return new com.pandora.radio.art.c(a, d1, new p.p.a());
    }
}
