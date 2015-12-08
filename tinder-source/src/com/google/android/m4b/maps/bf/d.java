// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bf;

import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bq.f;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bw.a;
import com.google.android.m4b.maps.bw.g;
import com.google.android.m4b.maps.cc.q;
import com.google.android.m4b.maps.y.j;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bf:
//            c, a

public final class d extends c
{

    private final f o;
    private final com.google.android.m4b.maps.bd.d p = new com.google.android.m4b.maps.bd.d() {

        private d a;

        public final void a(ac ac1, int i, aa aa)
        {
            if (i == 1)
            {
                synchronized (com.google.android.m4b.maps.bf.d.a(a))
                {
                    com.google.android.m4b.maps.bf.d.a(a).remove(Integer.valueOf(ac1.hashCode()));
                }
                return;
            } else
            {
                return;
            }
            ac1;
            aa;
            JVM INSTR monitorexit ;
            throw ac1;
        }

            
            {
                a = d.this;
                super();
            }
    };
    private final Set q = new HashSet();

    public d(ah ah, f f1, com.google.android.m4b.maps.bh.a.d d1, com.google.android.m4b.maps.bf.a a1, a a2, e e, g g)
    {
        super(ah, d1, a1, a2, e, g);
        o = (f)j.a(f1, "Prefetcher should not be null");
    }

    static Set a(d d1)
    {
        return d1.q;
    }

    private void c(ac ac1)
    {
label0:
        {
            synchronized (q)
            {
                if (!q.contains(Integer.valueOf(ac1.hashCode())))
                {
                    break label0;
                }
            }
            return;
        }
        q.add(Integer.valueOf(ac1.hashCode()));
        set;
        JVM INSTR monitorexit ;
        o.a(ac1, p, com.google.android.m4b.maps.bq.a.b.e).a();
        return;
        ac1;
        set;
        JVM INSTR monitorexit ;
        throw ac1;
    }

    public final q a(ac ac1)
    {
        c(ac1);
        return super.a(ac1);
    }

    protected final q b(ac ac1)
    {
        c(ac1);
        return super.b(ac1);
    }
}
