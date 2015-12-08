// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.util.f;
import com.google.android.apps.gsa.speech.b.a;
import com.google.common.a.c;
import com.google.common.base.p;
import com.google.common.collect.ImmutableSet;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            d, l, AudioUtils, m, 
//            b, k, c, e

public final class j extends d
{

    public final int b;
    public final int c;
    public final int d;
    public boolean e;
    public final l f;
    public final a g;
    public b h;
    public final boolean i;
    public boolean j;
    public Set k;
    public k l;
    private final int m;
    private m n;

    public j(int i1, int j1, int k1, b b1, f f1, a a1)
    {
        this(i1, ((Set) (ImmutableSet.of(Integer.valueOf(i1)))), j1, k1, b1, f1, a1);
    }

    private j(int i1, Set set, int j1, int k1, b b1, f f1, a a1)
    {
        super(set);
        p.a(b1);
        m = i1;
        b = k1;
        c = j1;
        d = 0;
        boolean flag;
        if (c > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        h = b1;
        if (f1 == null)
        {
            set = null;
        } else
        {
            set = new l(f1);
        }
        f = set;
        g = a1;
        i = false;
        k = new HashSet(1);
    }

    private boolean c()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (c <= 1) goto _L2; else goto _L1
_L1:
        boolean flag1 = e;
        if (flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L3; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final com.google.android.apps.gsa.speech.audio.c a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            throw new GsaIOException("This audio source has already been shutdown", 0x60012);
        }
        break MISSING_BLOCK_LABEL_26;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        com.google.android.apps.gsa.speech.audio.c c1;
        if (i1 != m)
        {
            int j1 = m;
            throw new GsaIOException((new StringBuilder(57)).append("Unsupported sample rate: ").append(i1).append(", must be ").append(j1).toString(), 0x6001b);
        }
        i1 = com.google.android.apps.gsa.speech.audio.AudioUtils.a(b, i1, c);
        if (n == null)
        {
            n = new m(h.a(), i1, i);
            l = new k(n.b, i1, f, g, j);
            l.start();
        }
        if (!c())
        {
            break MISSING_BLOCK_LABEL_212;
        }
        c1 = n.a();
        c1 = new com.google.android.apps.gsa.speech.audio.c(new e(c1.a, c, d), c1.b);
_L1:
        this;
        JVM INSTR monitorexit ;
        return c1;
        c1 = n.a();
          goto _L1
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        h = null;
        n = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (l != null)
        {
            com.google.common.a.c.a(n.b);
            l.interrupt();
            l = null;
        }
        if (n == null)
        {
            h = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
