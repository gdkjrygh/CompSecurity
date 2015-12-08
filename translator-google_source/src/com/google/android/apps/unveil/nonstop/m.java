// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.c;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            o, n

public final class m
{

    private static final af i = new af("TimestampedFrame", "");
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    Boolean e;
    public final Size f;
    public final int g;
    public final o h;
    private int j;
    private byte k[];
    private Boolean l;
    private int m[];
    private int n[];
    private c o;
    private final n p;

    public m(byte abyte0[], Size size, int i1, long l1, int j1, n n1)
    {
        k = abyte0;
        a = i1;
        b = l1;
        f = size;
        c = size.width;
        d = size.height;
        g = j1;
        p = n1;
        j = 0;
        h = new o(l1);
    }

    private boolean k()
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte0[] = k;
        boolean flag;
        if (abyte0 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private byte[] l()
    {
        this;
        JVM INSTR monitorenter ;
        byte abyte0[];
        abyte0 = e();
        k = null;
        if (o != null)
        {
            o.b();
            o = null;
        }
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        Exception exception;
        exception;
        throw exception;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        if (n == null)
        {
            n = ImageUtils.getBucketDistributionNative(a().a, b(), c());
        }
        if (m == null)
        {
            m = ImageUtils.computeSignatureNative(a().a, b(), c(), null);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final int a(int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = ImageUtils.diffSignatureNative(ai, i());
        this;
        JVM INSTR monitorexit ;
        return i1;
        ai;
        throw ai;
    }

    public final c a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!k() && o == null)
        {
            int i1 = a;
            throw new IllegalStateException((new StringBuilder(56)).append("Frame data for frame ").append(i1).append(" is no longer available.").toString());
        }
        break MISSING_BLOCK_LABEL_60;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        c c1;
        if (o == null)
        {
            o = com.google.android.apps.unveil.env.c.a(e(), c, d, b);
            o.a();
        }
        c1 = o;
        this;
        JVM INSTR monitorexit ;
        return c1;
    }

    public final int b()
    {
        return com.google.android.apps.unveil.env.c.a(c, com.google.android.apps.unveil.env.c.c(c, d));
    }

    public final int c()
    {
        return com.google.android.apps.unveil.env.c.b(d, com.google.android.apps.unveil.env.c.c(c, d));
    }

    public final int d()
    {
        return com.google.android.apps.unveil.env.c.c(c, d);
    }

    public final byte[] e()
    {
        this;
        JVM INSTR monitorenter ;
        if (!k())
        {
            int i1 = a;
            throw new RuntimeException((new StringBuilder(56)).append("Frame data for frame ").append(i1).append(" is no longer available.").toString());
        }
        break MISSING_BLOCK_LABEL_53;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        byte abyte0[] = k;
        this;
        JVM INSTR monitorexit ;
        return abyte0;
    }

    public final boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (l == null)
        {
            l = Boolean.valueOf(ImageUtils.isBlurredNative(e(), c, d));
        }
        flag = l.booleanValue();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void g()
    {
        this;
        JVM INSTR monitorenter ;
        j = j + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void h()
    {
        this;
        JVM INSTR monitorenter ;
        j = j - 1;
        if (j != 0) goto _L2; else goto _L1
_L1:
        byte abyte0[] = l();
        if (p != null)
        {
            p.a(abyte0);
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j >= 0) goto _L4; else goto _L3
_L3:
        throw new AssertionError("Negative reference count.");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int[] i()
    {
        this;
        JVM INSTR monitorenter ;
        int ai[];
        m();
        ai = m;
        this;
        JVM INSTR monitorexit ;
        return ai;
        Exception exception;
        exception;
        throw exception;
    }

    protected final int[] j()
    {
        this;
        JVM INSTR monitorenter ;
        int ai[];
        m();
        ai = n;
        this;
        JVM INSTR monitorexit ;
        return ai;
        Exception exception;
        exception;
        throw exception;
    }

}
