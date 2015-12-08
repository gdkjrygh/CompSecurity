// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.a;

import com.nuance.a.a.a.c.b.c.c;

// Referenced classes of package com.nuance.a.a.a.c.b.a.a:
//            a, g

public final class b extends a
{

    protected c h;
    private String i;
    private int j;
    private String k;
    private int l;

    b(String s, String s1, String s2, int i1, g g, String s3)
    {
        super(s3, s2, null, null, g);
        i = null;
        j = 1;
        k = s1;
        l = i1;
        h = null;
        i = s;
        a = this;
    }

    protected final void c()
    {
        super.c();
    }

    protected final com.nuance.a.a.a.c.b.b.b d()
    {
        com.nuance.a.a.a.c.b.b.b b1 = super.d();
        a(b1, "Application", k);
        a(b1, "RetentionDays", new Integer(l));
        return b1;
    }

    public final String h()
    {
        return i;
    }

    public final int i()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        i1 = j;
        j = i1 + 1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }
}
