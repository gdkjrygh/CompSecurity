// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;

import com.c.a.a.u;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.c.a.d:
//            f, a, c

public abstract class b
{

    private static final byte a[] = new byte[4096];

    protected b()
    {
    }

    public final long a(a a1)
    {
        f f1;
        u.a(a1);
        f1 = f.a();
        long l = c.a((InputStream)f1.a(a()), (OutputStream)f1.a(a1.a()));
        f1.close();
        return l;
        a1;
        throw f1.a(a1);
        a1;
        f1.close();
        throw a1;
    }

    public abstract InputStream a();

}
