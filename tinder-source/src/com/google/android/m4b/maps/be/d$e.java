// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import com.google.android.m4b.maps.au.a;

// Referenced classes of package com.google.android.m4b.maps.be:
//            d

static final class d
{

    private final byte a[];
    private int b;
    private final a c;
    private int d;

    final void a()
    {
        if (b == 0)
        {
            return;
        }
        synchronized (c)
        {
            c.a(d);
            c.a(a, 0, b);
            c.a();
        }
        d = d + b;
        b = 0;
        return;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void a(byte abyte0[])
    {
        if (abyte0.length + b > a.length)
        {
            a();
        }
        if (abyte0.length > a.length)
        {
            synchronized (c)
            {
                c.a(d);
                c.a(abyte0);
                c.a();
            }
            d = d + abyte0.length;
            return;
        } else
        {
            System.arraycopy(abyte0, 0, a, b, abyte0.length);
            b = b + abyte0.length;
            return;
        }
        abyte0;
        a1;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    (a a1, int i, byte abyte0[])
    {
        a = abyte0;
        b = 0;
        c = a1;
        d = i;
    }
}
