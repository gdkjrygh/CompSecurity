// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.google.common.b.d;
import java.io.FilterInputStream;
import java.io.InputStream;

// Referenced classes of package com.facebook.analytics:
//            ar, an, ck

final class as extends FilterInputStream
{

    final ar a;

    public as(ar ar1, InputStream inputstream)
    {
        a = ar1;
        super(new d(inputstream));
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        long l = ((d)in).a();
        if (l > ar.b(a))
        {
            an.c(a.a).a(ar.c(a), com.facebook.analytics.ar.d(a), l - ar.b(a));
            ar.a(a, l);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int read()
    {
        int i = in.read();
        a();
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        i = in.read(abyte0, i, j);
        a();
        return i;
    }

    public long skip(long l)
    {
        l = in.skip(l);
        a();
        return l;
    }
}
